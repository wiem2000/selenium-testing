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
public class DemoblazetestTest {
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
  public void ajoutpanier() {
    driver.get("https://www.demoblaze.com/");
    driver.manage().window().setSize(new Dimension(1231, 744));
    driver.findElement(By.cssSelector(".col-lg-4:nth-child(1) .card-img-top")).click();
    driver.findElement(By.linkText("Add to cart")).click();
    assertThat(driver.switchTo().alert().getText(), is("Product added"));
  }
  @Test
  public void demoblazeparcoursproduit() {
    driver.get("https://www.demoblaze.com/");
    driver.manage().window().setSize(new Dimension(1231, 744));
    driver.findElement(By.linkText("Laptops")).click();
    driver.findElement(By.linkText("Monitors")).click();
    vars.put("CategoryNameLaptop", "Laptops");
    driver.findElement(By.xpath("//a[contains(text(),\'vars.get("CategoryNameLaptop").toString()\')]")).click();
  }
  @Test
  public void explorepages() {
    driver.get("https://www.demoblaze.com/");
    driver.manage().window().setSize(new Dimension(1231, 744));
    driver.findElement(By.cssSelector(".active > .nav-link")).click();
    driver.findElement(By.linkText("Contact")).click();
    driver.findElement(By.cssSelector("#exampleModal span")).click();
    driver.findElement(By.linkText("About us")).click();
    driver.findElement(By.cssSelector("#videoModal .btn")).click();
    driver.findElement(By.id("cartur")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("#nava > img"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.id("login2")).click();
    {
      WebElement element = driver.findElement(By.id("login2"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector("#logInModal .btn-secondary")).click();
    driver.findElement(By.id("signin2")).click();
    driver.findElement(By.cssSelector("#signInModal .btn-primary")).click();
  }
  @Test
  public void paiement() {
    driver.get("https://www.demoblaze.com/");
    driver.manage().window().setSize(new Dimension(1231, 744));
    driver.findElement(By.id("cartur")).click();
    driver.findElement(By.cssSelector(".btn-success")).click();
    driver.findElement(By.id("name")).click();
    driver.findElement(By.id("name")).sendKeys("wiem");
    driver.findElement(By.id("country")).click();
    driver.findElement(By.id("country")).sendKeys("tunis");
    driver.findElement(By.id("city")).click();
    driver.findElement(By.id("city")).sendKeys("marsa");
    driver.findElement(By.id("card")).click();
    driver.findElement(By.id("card")).click();
    driver.findElement(By.id("card")).sendKeys("123");
    driver.findElement(By.id("month")).click();
    driver.findElement(By.id("month")).sendKeys("5");
    driver.findElement(By.id("year")).click();
    driver.findElement(By.id("year")).sendKeys("2020");
    driver.findElement(By.cssSelector("#orderModal .btn-primary")).click();
    driver.findElement(By.cssSelector(".confirm")).click();
  }
  @Test
  public void verifierpanier() {
    driver.get("https://www.demoblaze.com/");
    driver.manage().window().setSize(new Dimension(1234, 744));
    driver.findElement(By.id("cartur")).click();
    driver.findElement(By.cssSelector(".success:nth-child(2) a")).click();
  }
}
