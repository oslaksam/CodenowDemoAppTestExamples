// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class GetandcancelthereservationTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void getandcancelthereservation() {
    // Test name: Get and cancel the reservation
    // Step # | name | target | value
    // 1 | open | https://demo-app-fe.vercel.app/ | 
    // Open the website
    driver.get("https://demo-app-fe.vercel.app/");
    // 2 | click | css=.App-reservations-view > button | 
    // Click at the "Get Reservations" button
    driver.findElement(By.cssSelector(".App-reservations-view > button")).click();
    // 3 | assertAlert | Get reservations view is successful | 
    // Get reservations view is successful
    assertThat(driver.switchTo().alert().getText(), is("Get reservations view is successful"));
    // 4 | click | css=tr:nth-child(1) button | 
    // Click the "Cancel Reservation" button
    driver.findElement(By.cssSelector("tr:nth-child(1) button")).click();
    // 5 | assertAlert | Reservation canceled successfully. | 
    // Reservation canceled successfully.
    assertThat(driver.switchTo().alert().getText(), is("Reservation canceled successfully."));
    // 6 | click | css=.App-reservations-view > button | 
    // Click at the "Get Reservations" button
    driver.findElement(By.cssSelector(".App-reservations-view > button")).click();
    // 7 | assertAlert | Get reservations view is successful | 
    // Get reservations view is successful after canceling a reservation
    assertThat(driver.switchTo().alert().getText(), is("Get reservations view is successful"));
    // 8 | assertText | css=.App-reservations-view-table:nth-child(2) > tr:nth-child(1) > .App-reservations-view-table:nth-child(7) | CANCELED
    // Asert that the status changed to CANCELED
    assertThat(driver.findElement(By.cssSelector(".App-reservations-view-table:nth-child(2) > tr:nth-child(1) > .App-reservations-view-table:nth-child(7)")).getText(), is("CANCELED"));
  }
}
