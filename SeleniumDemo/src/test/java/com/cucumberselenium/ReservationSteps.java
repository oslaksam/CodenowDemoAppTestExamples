package com.cucumberselenium;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.*;

public class ReservationSteps {
    WebDriver driver;
    Faker faker;
    JavascriptExecutor js;
    Alert alert;
    WebElement cancelBtn;
    final String URL = "https://demo-app-fe.vercel.app/";

    @When("the user enters the demo application")
    public void theUserEntersTheDemoApplication() {
        driver.get(URL);
    }

    @When("the user creates a new reservation")
    public void theUserCreatesANewReservation() {

    }

    @Then("the user should see the reservation details")
    public void theUserShouldSeeTheReservationDetails() {
    }

    @Given("the user sees the reservation details")
    public void theUserSeesTheReservationDetails() {
        // 3 | click | css=.rs-picker-toggle-value |
        // Click on date selector
        assert (driver.findElement(By.cssSelector(".rs-picker-toggle-value")).isDisplayed());
        // 5 | click | linkText=Select |
        // Click on a train selector
        assert (driver.findElement(By.linkText("Select")).isDisplayed());

        assert (driver.findElement(By.name("firstName")).isDisplayed());

        // 11 | click | name=lastName |
        // Click on the surname input field
        assert (driver.findElement(By.name("lastName")).isDisplayed());

        // 13 | click | name=email |
        // Click on the surname email field
        assert (driver.findElement(By.name("email")).isDisplayed());

        assert (driver.findElement(By.name("file")).isDisplayed());
    }

    @When("the user enters all of the necessary information")
    public void theUserEntersAllOfTheNecessaryInformation() {
        // 2 | setWindowSize | max |
        // Resolution
        driver.manage().window().maximize();
        // 3 | click | css=.rs-picker-toggle-value |
        // Click on date selector
        driver.findElement(By.cssSelector(".rs-picker-toggle-value")).click();
        // 4 | click | xpath=//span[contains(.,'Today')] |
        // Choose today
        driver.findElement(By.xpath("//span[contains(.,'Today')]")).click();
        // 5 | click | linkText=Select |
        // Click on a train selector
        driver.findElement(By.linkText("Select")).click();
        // 6 | click | linkText=Sp 9301 |
        // Choose a train
        int randomValue = (int) Math.floor(Math.random() * (4 - 1 + 1) + 1);
        driver.findElement(By.cssSelector("div:nth-child(" + randomValue + ") > .rs-picker-select-menu-item")).click();
        // 7 | click | linkText=Select |
        // Click on a seat selector
        driver.findElement(By.linkText("Select")).click();
        // 8 | click | linkText=Coach 1 / Seat 21 |
        // Choose a seat
        randomValue = (int) Math.floor(Math.random() * (7 - 1 + 1) + 1);
        driver.findElement(By.linkText("Coach 1 / Seat 10")).click();
        // 9 | click | name=firstName |
        // Click on the name input field
        driver.findElement(By.name("firstName")).click();
        // 10 | type | name=firstName | Sony
        // Type in the name
        driver.findElement(By.name("firstName")).sendKeys(faker.name().firstName());
        // 11 | click | name=lastName |
        // Click on the surname input field
        driver.findElement(By.name("lastName")).click();
        // 12 | type | name=lastName | Pony
        // Type in the surname
        driver.findElement(By.name("lastName")).sendKeys(faker.name().lastName());
        // 13 | click | name=email |
        // Click on the surname email field
        driver.findElement(By.name("email")).click();
        // 14 | type | name=email | sony.pony@gmail.com
        // Type in the email
        driver.findElement(By.name("email")).sendKeys(faker.internet().safeEmailAddress());
        // 15 | type | name=file | C:\fakepath\Experiences_of_Test_Automation.bibtex
        // Type in the path to the selected file
        driver.findElement(By.name("file")).sendKeys("C:\\Users\\oslaksam\\Documents\\CODENOW\\SeleniumDemo\\randomFile.bibtex");
    }

    @And("clicks the Submit button")
    public void clicksTheSubmitButton() {
        // 16 | click | xpath=//button[contains(.,'Submit')] |
        // Click on the submit button
        driver.findElement(By.xpath("//button[contains(.,'Submit')]")).click();
    }

    @Then("the user should see an alert with a message: Reservation created successfully")
    public void theUserShouldSeeAnAlertWithAMessageReservationCreatedSuccessfully() {
        // 17 | assertAlert | Reservation created successfully |
        // Wait for an alert and assert that the reservation was created successfully
        alert = new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(driver -> driver.switchTo().alert());
        assertEquals(alert.getText(), "Reservation created successfully");
    }

    @And("the user already created a reservation")
    public void theUserAlreadyCreatedAReservation() {
        System.out.println("The user already created a reservation");
    }

    @When("the user clicks the Get Reservations button")
    public void theUserClicksTheGetReservationsButton() {
        // 2 | click | css=.App-reservations-view > button |
        // Click at the "Get Reservations" button
        driver.findElement(By.cssSelector(".App-reservations-view > button")).click();
    }

    @Then("the user should see an alert with a message: Get reservations view is successful")
    public void theUserShouldSeeAnAlertWithAMessageGetReservationsViewIsSuccessful() {
        // 3 | assertAlert | Get reservations view is successful |
        // Get reservations view is successful
        alert = new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(driver -> driver.switchTo().alert());
        assertEquals(alert.getText(), "Get reservations view is successful");
    }

    @When("the user clicks the OK button in the alert view")
    public void theUserClicksTheOKButtonInTheAlertView() {
        alert.accept();
    }

    @Then("the user should see the table with the latest {int} reservations")
    public void theUserShouldSeeTheTableWithTheLatestReservations(int arg0) {
        cancelBtn = new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(driver -> driver.findElement(By.cssSelector("tr:nth-child(1) button")));
    }

    @When("the user clicks the Cancel Reservation button located in the first row of the reservation table")
    public void theUserClicksTheCancelReservationButtonLocatedInTheFirstRowOfTheReservationTable() {
        // 4 | click | css=tr:nth-child(1) button |
        // Click the "Cancel Reservation" button
        cancelBtn.click();
    }

    @Then("the user should see an alert with a message: Reservation canceled successfully.")
    public void theUserShouldSeeAnAlertWithAMessageReservationCanceledSuccessfully() {
        // 5 | assertAlert | Reservation canceled successfully. |
        // Reservation canceled successfully.
        alert = new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(driver -> driver.switchTo().alert());
        assertEquals(alert.getText(), "Reservation canceled successfully.");
    }

    @When("the user clicks the OK button in the in the alert view")
    public void theUserClicksTheOKButtonInTheInTheAlertView() {
        alert.accept();
    }

    @Then("the status of the first reservation in the reservation table should be CANCELED")
    public void theStatusOfTheFirstReservationInTheReservationTableShouldBeCANCELED() {
        // 6 | click | css=.App-reservations-view > button |
        // Click at the "Get Reservations" button
        driver.findElement(By.cssSelector(".App-reservations-view > button")).click();
        // 7 | assertAlert | Get reservations view is successful |
        // Get reservations view is successful after canceling a reservation
        alert = new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(driver -> driver.switchTo().alert());
        assertEquals(alert.getText(), "Get reservations view is successful");
        alert.accept();
        // 8 | assertText | css=.App-reservations-view-table:nth-child(2) > tr:nth-child(1) > .App-reservations-view-table:nth-child(7) | CANCELED
        // Asert that the status changed to CANCELED
        assertEquals(driver.findElement(By.cssSelector(".App-reservations-view-table:nth-child(2) > tr:nth-child(1) > .App-reservations-view-table:nth-child(7)")).getText(), "CANCELED");
    }

    @When("enters the email address without the @ symbol")
    public void entersTheEmailAddressWithoutTheSymbol() {
        // 2 | setWindowSize | max |
        // Resolution
        driver.manage().window().maximize();
        // 3 | click | css=.rs-picker-toggle-value |
        // Click on date selector
        driver.findElement(By.cssSelector(".rs-picker-toggle-value")).click();
        // 4 | click | xpath=//span[contains(.,'Today')] |
        // Choose today
        driver.findElement(By.xpath("//span[contains(.,'Today')]")).click();
        // 5 | click | linkText=Select |
        // Click on a train selector
        driver.findElement(By.linkText("Select")).click();
        // 6 | click | linkText=Sp 9301 |
        // Choose a train
        int randomValue = (int) Math.floor(Math.random() * (4 - 1 + 1) + 1);
        driver.findElement(By.cssSelector("div:nth-child(" + randomValue + ") > .rs-picker-select-menu-item")).click();
        // 7 | click | linkText=Select |
        // Click on a seat selector
        driver.findElement(By.linkText("Select")).click();
        // 8 | click | linkText=Coach 1 / Seat 21 |
        // Choose a seat
        driver.findElement(By.linkText("Coach 1 / Seat 21")).click();
        // 9 | click | name=firstName |
        // Click on the name input field
        driver.findElement(By.name("firstName")).click();
        // 10 | type | name=firstName | Sony
        // Type in the name
        driver.findElement(By.name("firstName")).sendKeys(faker.name().firstName());
        // 11 | click | name=lastName |
        // Click on the surname input field
        driver.findElement(By.name("lastName")).click();
        // 12 | type | name=lastName | Pony
        // Type in the surname
        driver.findElement(By.name("lastName")).sendKeys(faker.name().lastName());
        // 13 | click | name=email |
        // Click on the surname email field
        driver.findElement(By.name("email")).click();
        // 14 | type | name=email | sony.pony@gmail.com
        // Type in the email
        driver.findElement(By.name("email")).sendKeys("wrongEmail");
        // 15 | type | name=file | C:\fakepath\Experiences_of_Test_Automation.bibtex
        // Type in the path to the selected file
        driver.findElement(By.name("file")).sendKeys("C:\\Users\\oslaksam\\Documents\\CODENOW\\SeleniumDemo\\randomFile.bibtex");
    }

    @Then("the user should see not see an alert with a message: Reservation created successfully")
    public void theUserShouldSeeNotSeeAnAlertWithAMessageReservationCreatedSuccessfully() {
        try {
            alert = new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(driver -> driver.switchTo().alert());
            assertEquals(alert.getText(), "Reservation created successfully");
            fail();
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @And("the user closes the browser")
    public void theUserClosesTheBrowser() {
        driver.quit();
    }

    @Given("the user opens a browser")
    public void theUserOpensABrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        faker = new Faker();
        js = (JavascriptExecutor) driver;
    }
}
