import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {


    public void validRegisterTest(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.id("firstname")).sendKeys("qwer");
        driver.findElement(By.id("middlename")).sendKeys("irina");
        driver.findElement(By.id("lastname")).sendKeys("qwerty qwerty");
        driver.findElement(By.id("email_address")).sendKeys("testaresotfware1@gmail.com");
        driver.findElement(By.id("password")).sendKeys("qwerty");
        driver.findElement(By.id("confirmation")).sendKeys("qwerty");
        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();







        driver.quit();
    }
}
