<<<<<<< HEAD
# IMDb QA Cast Test Automation

This project automates the following regression scenario using Java 21, Selenide, TestNG, and Allure:

1. Open imdb.com
2. Search for "QA" using the search bar
3. Click on the first title from the results
4. Print out 5 members of the top cast section

## Technologies Used

- Java 21
- Maven
- Selenide
- TestNG
- Allure Report

## How to Run

1. Clone the repository
2. Run `mvn clean test`
3. To generate Allure report:
   ```bash
   allure serve allure-results
   ```

## Notes

Ensure you have:
- Java 21 installed and configured
- Maven installed
- Allure CLI installed (https://docs.qameta.io/allure/)
=======
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

Test steps and top 5 cast names are automatically logged into the Allure report for visibility and traceability.

To generate the report:

```bash
allure serve allure-results
>>>>>>> 469509f98484336ca88b3ade2c6248a4e7dd07cb
