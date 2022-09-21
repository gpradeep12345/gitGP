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
public class RegisterTest {
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
  public void register() {
    driver.get("http://automationpractice.com/index.php");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.cssSelector(".form_content > p:nth-child(1)")).click();
    driver.findElement(By.id("create-account_form")).click();
    driver.findElement(By.cssSelector(".form_content > p:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".form_content > p:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".form_content > p:nth-child(1)")).click();
    driver.findElement(By.id("create-account_form")).click();
    driver.findElement(By.id("create-account_form")).click();
    {
      WebElement element = driver.findElement(By.id("create-account_form"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector("#create-account_form .form-group")).click();
    driver.findElement(By.id("email_create")).click();
    driver.findElement(By.id("email_create")).sendKeys("pradeepprithvi@gmail.com");
    driver.findElement(By.id("email_create")).click();
    driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
    driver.findElement(By.id("id_gender1")).click();
    driver.findElement(By.id("customer_firstname")).click();
    driver.findElement(By.id("customer_firstname")).sendKeys("g");
    driver.findElement(By.id("customer_lastname")).click();
    driver.findElement(By.id("customer_lastname")).sendKeys("pradeep");
    driver.findElement(By.id("passwd")).click();
    driver.findElement(By.id("passwd")).sendKeys("123456");
    driver.findElement(By.id("days")).click();
    {
      WebElement dropdown = driver.findElement(By.id("days"));
      dropdown.findElement(By.xpath("//option[. = 'regexp:20\\s+']")).click();
    }
    driver.findElement(By.id("months")).click();
    {
      WebElement dropdown = driver.findElement(By.id("months"));
      dropdown.findElement(By.xpath("//option[. = 'regexp:February\\s']")).click();
    }
    driver.findElement(By.id("years")).click();
    {
      WebElement dropdown = driver.findElement(By.id("years"));
      dropdown.findElement(By.xpath("//option[. = 'regexp:2004\\s+']")).click();
    }
    driver.findElement(By.id("address1")).click();
    driver.findElement(By.id("address1")).sendKeys("asdf");
    driver.findElement(By.id("address2")).click();
    driver.findElement(By.id("address2")).sendKeys("ghjk");
    driver.findElement(By.id("city")).click();
    driver.findElement(By.id("postcode")).click();
    driver.findElement(By.id("postcode")).click();
    driver.findElement(By.id("postcode")).sendKeys("00000");
    driver.findElement(By.id("phone")).click();
    driver.findElement(By.id("phone")).sendKeys("0000000");
    driver.findElement(By.cssSelector(".required:nth-child(14)")).click();
    driver.findElement(By.id("phone_mobile")).click();
    driver.findElement(By.id("phone_mobile")).sendKeys("0000000000");
    driver.findElement(By.cssSelector("#submitAccount > span")).click();
    driver.findElement(By.linkText("Sign out")).click();
    driver.findElement(By.id("city")).click();
    driver.findElement(By.id("city")).sendKeys("chennai");
    driver.findElement(By.id("id_state")).click();
    {
      WebElement dropdown = driver.findElement(By.id("id_state"));
      dropdown.findElement(By.xpath("//option[. = 'Idaho']")).click();
    }
    driver.findElement(By.cssSelector(".postcode > label")).click();
    driver.findElement(By.id("postcode")).click();
  }
}