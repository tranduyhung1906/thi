import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class tudong {
   private WebDriver  driver;
   private WebDriverWait wait;
   @BeforeEach
    public void setup(){
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   }
   @Test
    public void dangky(){
       driver.get("https://vitimex.com.vn/dang-ky.html");
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("hiujj");
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone"))).sendKeys("0395551982");
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("lienquanvx123@gmail.com");
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass-regis"))).sendKeys("gauchovx123");
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass-confirm"))).sendKeys("gauchovx123");
       wait.until(ExpectedConditions.elementToBeClickable(By.id("register-btn"))).click();
   }
}
