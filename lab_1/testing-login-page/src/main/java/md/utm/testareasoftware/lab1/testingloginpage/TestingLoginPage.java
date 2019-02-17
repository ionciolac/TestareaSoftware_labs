package md.utm.testareasoftware.lab1.testingloginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestingLoginPage {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().fullscreen();
        driver.get("http://localhost:8090/login");

        ((ChromeDriver) driver).findElementById("username").sendKeys("ionciolac");
        ((ChromeDriver) driver).findElementById("password").sendKeys("qwerty");

        ((ChromeDriver) driver).findElementById("login-button").click();

    }
}
