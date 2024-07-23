package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class UCS_PO {
        private WebDriver driver;

        // Locator for the First Name field
        @FindBy(xpath = "//input[@placeholder='First Name']")
        private WebElement firstNameField;

        // Locator for the Last Name field
        @FindBy(xpath = "//input[@placeholder='Last Name']")
        private WebElement lastNameField;

        // Locator for the Email Address field
        @FindBy(xpath = "//input[@placeholder='Email Address']")
        private WebElement emailAddressField;

        // Locator for the Comments field
        @FindBy(xpath = "//textarea[@placeholder='Comments']")
        private WebElement commentsField;

        // Locator for the Submit button
        @FindBy(xpath = "//input[@value='SUBMIT']")
        private WebElement submitButton;



        // Constructor to initialize the elements
        public UCS_PO(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        // Method to enter text in the First Name field
        public void enterFirstName(String FirstName) {
            firstNameField.sendKeys(FirstName);
        }

        // Method to enter text in the Last Name field
        public void enterLastName(String LastName) {
            lastNameField.sendKeys(LastName);
        }

        // Method to enter text in the Email Address field
        public void enterEmailAddress(String EmailAddress) {
            emailAddressField.sendKeys(EmailAddress);
        }

        // Method to enter text in the Comments field
        public void enterComments(String Comments) {
            commentsField.sendKeys(Comments);
        }

        // Method to click the Submit button
        public void clickSubmit() {
            submitButton.click();
        }
}





