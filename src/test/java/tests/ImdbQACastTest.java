package tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class ImdbQACastTest {

    @BeforeClass
    public void setup() {
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.timeout = 10000;
    }

    @Test
    @Description("Search for 'QA' on IMDb and print top 5 cast members of the first result")
    public void getTopCastForQA() {
        open("https://www.imdb.com");

        if ($("[data-testid='accept-button']").should(exist, Duration.ofSeconds(5)).exists()) {
            $("[data-testid='accept-button']").click();
        }

        $("[name='q']").setValue("QA").pressEnter();

        $$("a.ipc-metadata-list-summary-item__t")
                .first()
                .should(appear)
                .click();

        $("section[data-testid='title-cast']").scrollIntoView(true);
        sleep(3000);
        List<String> uniqueNames = $$("a[aria-label]").asFixedIterable().stream()
                .filter(el -> {
                    String href = el.getAttribute("href");
                    return href != null && href.contains("/name/");
                })
                .map(el -> {
                    String label = el.getAttribute("aria-label");
                    return label != null ? label.trim() : "";
                })
                .filter(name -> !name.isEmpty())
                .distinct()
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("\n==============================");
        System.out.println("       Top 5 Cast Members       ");
        System.out.println("==============================");

        Allure.step("Top 5 Cast Members:");

        for (int i = 0; i < uniqueNames.size(); i++) {
            String name = uniqueNames.get(i);
            String line = String.format("%d. %s", i + 1, name);

            System.out.println(" " + line);
            Reporter.log(line + "<br>");
            Allure.step(line);
        }

        System.out.println("================================\n");
    }
}
