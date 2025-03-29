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
