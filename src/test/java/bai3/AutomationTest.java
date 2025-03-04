package bai3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AutomationTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize(); // Mở full màn hình
    }

//    @AfterEach
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//            System.out.println("Đã đóng trình duyệt.");
//        }
//    }

    @Test
    public void testDangKy() {
        driver.get("https://vitimex.com.vn/dang-ky.html");

        // Điền thông tin đăng ký
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("Tran Anh Duong");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone"))).sendKeys("0987699563");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("anhduongtran805@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass-regis"))).sendKeys("duong123");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass-confirm"))).sendKeys("duong123");

        // Click đăng ký
        wait.until(ExpectedConditions.elementToBeClickable(By.id("register-btn"))).click();
    }

    @Test
    public void testDangNhap() {
        driver.get("https://vitimex.com.vn/dang-ky.html");

        // Đợi trang tải xong
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete'"));

        // Click vào "Đăng nhập ngay"
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(text(),'Đăng nhập ngay')])[1]"))).click();

        // Nhập email và mật khẩu
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("account"))).sendKeys("anhduongtran805@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("duong123");

        // Click đăng nhập
        wait.until(ExpectedConditions.elementToBeClickable(By.id("signin-btn"))).click();
    }
}
