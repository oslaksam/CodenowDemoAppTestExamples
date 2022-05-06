package io.testproject.generated.tests.demoget;

import io.testproject.addon.WebExtensions;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.web.RemoteWebDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * This class was automatically generated by TestProject
 * Project: My first Project
 * Test: DemoAppGetReservations
 * Generated by: Bou Rat (pizdik25@gmail.com)
 * Generated on Fri May 06 10:06:10 GMT 2022.
 */
@DisplayName("DemoAppGetReservations")
public class Demoappgetreservations implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("ey2IXEi3cF1BNXeNL5EknZWPgfdmn0W4v1SH8mpCe8k1", new ChromeOptions(), "Bou Rat");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("DemoAppGetReservations")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String output, String statusText) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    String string;
    WebExtensions.WaitForAlertPresence waitForAlertPresence;
    WebExtensions.AcceptAlert acceptAlert;
    WebExtensions.GetAlertText getAlertText;

    // 1. Navigate to '{{ApplicationURL}}'
    //    Navigates the specified URL (Auto-generated)
    GeneratedUtils.sleep(500);
    driver.navigate().to(ApplicationURL);

    // 2. Click 'Get Reservations'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Get Reservations']");
    driver.findElement(by).click();

    // 3. Is alert displayed?
    //    wait for succ
    GeneratedUtils.sleep(500);
    waitForAlertPresence = WebExtensions.waitForAlertPresence(2000);
    waitForAlertPresence = (WebExtensions.WaitForAlertPresence)((ReportingDriver)driver).addons().execute(waitForAlertPresence);

    // 4. Get alert text
    GeneratedUtils.sleep(500);
    getAlertText = WebExtensions.getGetAlertText();
    getAlertText = (WebExtensions.GetAlertText)((ReportingDriver)driver).addons().execute(getAlertText);
    output = String.valueOf(getAlertText.text);

    // 5. Accept alert
    GeneratedUtils.sleep(500);
    acceptAlert = WebExtensions.acceptAlert(0);
    acceptAlert = (WebExtensions.AcceptAlert)((ReportingDriver)driver).addons().execute(acceptAlert);

    // 6. Click 'Cancel Reservation'
    GeneratedUtils.sleep(500);
    by = By.xpath("//tr[1]//button[. = ' Cancel Reservation']");
    driver.findElement(by).click();

    // 7. Is alert displayed?
    //    wait for succ cancel
    GeneratedUtils.sleep(500);
    waitForAlertPresence = WebExtensions.waitForAlertPresence(2000);
    waitForAlertPresence = (WebExtensions.WaitForAlertPresence)((ReportingDriver)driver).addons().execute(waitForAlertPresence);

    // 8. Get alert text
    GeneratedUtils.sleep(500);
    getAlertText = WebExtensions.getGetAlertText();
    getAlertText = (WebExtensions.GetAlertText)((ReportingDriver)driver).addons().execute(getAlertText);
    output = String.valueOf(getAlertText.text);

    // 9. Accept alert
    GeneratedUtils.sleep(500);
    acceptAlert = WebExtensions.acceptAlert(0);
    acceptAlert = (WebExtensions.AcceptAlert)((ReportingDriver)driver).addons().execute(acceptAlert);

    // 10. Is alert displayed?
    //    wait for succ
    GeneratedUtils.sleep(500);
    waitForAlertPresence = WebExtensions.waitForAlertPresence(2000);
    waitForAlertPresence = (WebExtensions.WaitForAlertPresence)((ReportingDriver)driver).addons().execute(waitForAlertPresence);

    // 11. Get alert text
    GeneratedUtils.sleep(500);
    getAlertText = WebExtensions.getGetAlertText();
    getAlertText = (WebExtensions.GetAlertText)((ReportingDriver)driver).addons().execute(getAlertText);
    output = String.valueOf(getAlertText.text);

    // 12. Accept alert
    GeneratedUtils.sleep(500);
    acceptAlert = WebExtensions.acceptAlert(0);
    acceptAlert = (WebExtensions.AcceptAlert)((ReportingDriver)driver).addons().execute(acceptAlert);

    // 13. Get text from 'CANCELED'
    GeneratedUtils.sleep(500);
    by = By.xpath("//tr[1]/td[7]");
    string = driver.findElement(by).getAttribute("value");
    statusText = String.valueOf(string);
    Assertions.assertEquals("CANCELED", string);

  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }

  @AfterAll
  static void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  private static Stream provideParameters() throws Exception {
    return Stream.of(Arguments.of("https://demo-app-fe.vercel.app/","",""));
  }
}
