//package b1;
//
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class tudongdangnhau {
//    private WebDriver driver;
//    private WebDriverWait wait;
//    @BeforeEach
//    public  void setup(){
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        driver.manage().window().fullscreen();
//    }
//    @Test
//    public void dangnhap(){
//        driver.get("https://vitimex.com.vn/dang-ky.html");
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("account"))).sendKeys("lienquanvx123@gmail.com");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("gauchovx123");
//      wait.until(ExpectedConditions.elementToBeClickable(By.id("signin-btn"))).click();
//
//    }
//}
////    WebElement loginButton =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Đăng nhập ngay')]")));
////       ((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginButton);