package io.ctdev.login;


import io.ctdev.signup.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import static io.ctdev.framework.WebDriverSingleton.getDriver;
import static org.testng.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest extends BaseTest {
    WebDriver driver;



    @BeforeClass
    public void beforeClass(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-fullscreen");
        options.setHeadless(true);
        System.out.println("This is before class");
        driver = getDriver();

    }



    @Test
    public void shouldAnswerWithTrue() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\ChromeWebDriver\\chromedriver.exe");

        driver.get("https://google.com");
        String expectedTitel = "Google";
        String actualTitel = driver.getTitle();
        Thread.sleep(3000);
        Assert.assertEquals(actualTitel, expectedTitel);
        Thread.sleep(3000);


    }
}
