package bai7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTest {
    ChromeDriver chromeDriver;

    @BeforeEach
    public void setup(){
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void test(){
        chromeDriver.get("https://www.google.com.vn/");
        WebElement searchBox = chromeDriver.findElement(By.xpath("(//textarea[@id='APjFqb'])[1]"));
        searchBox.sendKeys("Udemy");
        searchBox.sendKeys(Keys.ENTER);

        // Chờ một lúc để kết quả tải xong
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Kiểm tra xem có link "Udemy: Online Courses ..." không
        WebElement udemyLink = chromeDriver.findElement(By.partialLinkText("https://www.udemy.com/"));
        Assertions.assertTrue(udemyLink.isDisplayed());

        // Click vào link Udemy
        udemyLink.click();

    }

//    @AfterEach
//    public void tearDown() {
//        if (chromeDriver != null) {
//            chromeDriver.quit();
//        }
//        System.out.println("Test completed. Browser closed.");
//    }

}
