# Spring-Financial
Spring Financial Assignment
# BDD Framework for Contact Us Form Automation

## Overview
This project uses the Behavior-Driven Development (BDD) framework to automate the testing of the "Contact Us" form on the [WebDriver University Contact Us page](http://webdriveruniversity.com/Contact-Us/contactus.html).

### Form Validation Rules
- First Name: Mandatory, must have at least two characters and a maximum of 25 characters.
- Last Name: Mandatory, must have at least two characters and a maximum of 25 characters.
- Email: Mandatory, must follow international validation rules.

## Project Structure
- Feature File: Contains the scenarios to be tested.
  - Location: `Features/UCS.feature`
- Step Definitions: Implements the steps defined in the feature file.
  - Location: `StepDefinition/UCS_SF.java`
- Test Runner: Configures and runs the test suite.
  - Location: `src/test/java/TestRunner/java/TestRunner.java`
- Reports: Generated test reports.
  - Location: `target/generated-test-sources/test-output.html`

## Setup and Usage

### Prerequisites
- Java (JDK 11 or later)
- Maven
- ChromeDriver (Ensure that the ChromeDriver executable is in your system's PATH)

### Installation
1. Clone the repository
    ```bash
    git clone <repository-url>
    cd <repository-directory>
    ```

2. Install dependencies
    ```bash
    mvn clean install
    ```

### Running the Tests
To run the test suite, use the following command:
```bash
mvn test

## After running the tests, an HTML report will be generated at:
target/generated-test-sources/test-output.html
