
Feature: Contact Us Form Automation
  As a QA Analyst
  I want to automate the Contact Us form on WebDriver University
  So that I can validate its functionality for different input fields

 Background:
 Given I navigate to the Contact Us page

  Scenario Outline: Submit form with valid input
    Given I enter "<FirstName>" in the First Name field
    Given I enter "<LastName>" in the Last Name field
    Given I enter "<EmailAddress>" in the EmailAddress field
    And I enter "<Comments>" in the Comments field
    Then I click the Submit button
   When I should see the success Comments "Thank You for your Message!"
    And Close browser

    Examples:
      | FirstName | LastName | EmailAddress                 | Comments                |
      | TestUser  | Mishra  | testuser.mishra@example.com   | This is a test Comments |

  Scenario Outline: Submit form with missing first name
    Given I enter "<FirstName>" in the First Name field
    And I enter "<LastName>" in the Last Name field
    And I enter "<EmailAddress>" in the EmailAddress field
    And I enter "<Comments>" in the Comments field
    When I click the Submit button
    Then I should see an error Comments "Error: all fields are required"
    And Close browser
    Examples:
      | FirstName | LastName | EmailAddress     | Comments                       |
      | ""        | Dwivedi  | test@example.com | This is a test Comments        |

  Scenario Outline: Submit form with missing last name
    Given I enter "<FirstName>" in the First Name field
    And I enter "<LastName>" in the Last Name field
    And I enter "<EmailAddress>" in the EmailAddress field
    And I enter "<Comments>" in the Comments field
    When I click the Submit button
    Then I should see an error Comments "Error: all fields are required"
    And Close browser
    Examples:
      | FirstName | LastName | EmailAddress      | Comments                      |
      | Sidhi     | ""       | sidhi@test.com    | Missing last name             |

  Scenario Outline: Submit form with invalid first name or last name
    Given I enter "<FirstName>" in the First Name field
    And I enter "<LastName>" in the Last Name field
    And I enter "test@example.com" in the EmailAddress field
    And I enter "This is a test Comments" in the Comments field
    When I click the Submit button
    Then I should see an error Comments "Error: all fields are required"
    And Close browser
    Examples:
      | FirstName                    | LastName                     |
      | J                            | Dwivedi                      |
      | TestUser                     | D                            |
      | TestUserTestUserTestUserTest | Dwivedi                      |
      | TestUser                     | DwivediDwivediDwivediDwivedi |
      | Raj                          | Jha                          |
      | Su                           | Jha                          |
      | As                           | Mishra                       |

  Scenario Outline: Submit form with missing EmailAddress
    Given I enter "<FirstName>" in the First Name field
    And I enter "<LastName>" in the Last Name field
    And I enter "<EmailAddress>" in the EmailAddress field
    And I enter "<Comments>" in the Comments field
    When I click the Submit button
    Then I should see an error Comments "Error: Invalid email address"
    And Close browser
    Examples:
      | FirstName | LastName | EmailAddress | Comments                     |
      | Puneet    | Singh    | ""           | More missing EmailAddresss   |


  Scenario Outline: Submit form with invalid EmailAddress
    Given I enter "<FirstName>" in the First Name field
    And I enter "<LastName>" in the Last Name field
    And I enter "<EmailAddress>" in the EmailAddress field
    And I enter "<Comments>" in the Comments field
    When I click the Submit button
    Then I should see an error Comments "Error: Invalid email address"
    And Close browser
    Examples:
      | FirstName | LastName | EmailAddress     | Comments                |
      | TestUser  | Dwivedi  | testuser@com     | This is a test Comments |
      | Rajneesh  | Jha      | rajneesh@        | Another test Comments   |
      | Sidhi     | Mishra   | sidhi@.com       | Yet another test        |
      | Puneet    | Singh    | puneet@@test.com | More invalid tests      |
      | Sufiya    | Jha      | sufiya@test.     | Another invalid test    |
      | Aswani    | Mishra   | aswani@domain    | Invalid domain test     |

  Scenario Outline: Submit form with valid EmailAddress format but invalid domain
    Given I enter "<FirstName>" in the First Name field
    And I enter "<LastName>" in the Last Name field
    And I enter "<EmailAddress>" in the EmailAddress field
    And I enter "<Comments>" in the Comments field
    When I click the Submit button
    Then I should see an error Comments "Error: Invalid email address"
    And Close browser
    Examples:
      | FirstName | LastName | EmailAddress                     | Comments                |
      | Rajneesh  | Jha      | rajneesh.jha@example.invalid     | Another test Comments   |