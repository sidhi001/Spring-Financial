package StepDefinition;


import PageObjects.UCS_PO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class UCS_SF {
    public WebDriver Idriver;

    public UCS_PO UCP;


    @Given("I navigate to the Contact Us page")
    public void iNavigateToTheContactUsPage() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
        Idriver = new ChromeDriver();
        Idriver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
        UCP = new UCS_PO(Idriver);
        Idriver.manage().window().maximize();
    }

    @Given("I enter {string} in the First Name field")
    public void iEnterInTheFirstNameField(String FirstName) {
        UCP.enterFirstName(FirstName);

    }

    @Given("I enter {string} in the Last Name field")
    public void iEnterInTheLastNameField(String LastName) {
        UCP.enterLastName(LastName);
    }

    @Given("I enter {string} in the EmailAddress field")
    public void iEnterInTheEmailAddressField(String EmailAddress) {
        UCP.enterEmailAddress(EmailAddress);
    }

    @And("I enter {string} in the Comments field")
    public void iEnterInTheCommentsField(String Comments) {
        UCP.enterComments(Comments);
    }

        @Then("I click the Submit button")
        public void iClickTheSubmitButton() {
        UCP.clickSubmit();

        }


    @Given("I enter {string}{string} in the First Name field")
    public void i_enter_in_the_first_name_field(String FirstName , String string2 ) {
        UCP.enterFirstName(FirstName);
    }
    @Then("I should see an error Comments {string}")
    public void i_should_see_an_error_comments(String errorComment) {

        By errorCommentLocator = By.xpath("/html[1]/body[1]");

        WebElement errorCommentElement = Idriver.findElement(errorCommentLocator);
        String actualComment_E = errorCommentElement.getText();
        System.out.println("Actual Comment: " + actualComment_E);
        assertEquals("Error message does not match!", errorComment ,actualComment_E);


    }


    @Given("I enter {string}{string} in the Last Name field")
    public void i_enter_in_the_last_name_field(String LastName, String string2) {
        UCP.enterLastName(LastName);
    }



    @Given("I enter {string}{string} in the EmailAddress field")
    public void i_enter_in_the_email_address_field(String EmailAddress, String string2) {
        UCP.enterEmailAddress(EmailAddress);
    }


    @And("Close browser")
    public void close_browser() {
        Idriver.quit();
    }



        @When("I should see the success Comments {string}")
        public void i_should_see_the_success_comments(String successComments){

            By successCommentLocator = By.xpath("//h1[normalize-space()='Thank You for your Message!']");
            WebElement successCommentElement = Idriver.findElement(successCommentLocator);
            String actualComment = successCommentElement.getText();

            System.out.println("Actual Comment: " + actualComment);
            assertEquals("Error message does not match!", successComments ,actualComment);

        }
}

