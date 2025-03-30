# IMDb QA Cast Test

This project automates a functional test case using **Java 21**, **Selenide**, **TestNG**, and **Allure Report**.

### Test Scenario 

1. Open [IMDb](https://www.imdb.com)
2. Search for `"QA"` using the search bar
3. Click on the **first title** from the search results
4. Scroll to the **Top Cast** section
5. Print the **top 5 cast member names**

---

### Tech Stack 

- **Java 21**
- **Selenide** (Selenium-based UI testing framework)
- **TestNG** (test execution & reporting)
- **Allure Report** (beautiful test reporting)
- **Maven** (project & dependency management)

---

### Allure Report Integration 

Test steps and the top 5 cast member names are automatically logged into the Allure report using `Allure.step(...)`.

To generate the report:

1. Make sure you have Allure installed:
   - **Windows (Scoop):** `scoop install allure`
   - **macOS (Homebrew):** `brew install allure`
   - Or download manually: [https://github.com/allure-framework/allure2](https://github.com/allure-framework/allure2)

2. Run the tests and serve the Allure report locally

```bash
mvn clean test
---
allure serve allure-results

