package md.utm.testareasoftware.lab1.testing.gmail.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestingGmailLoginPage {
    public static void main(String[] args) {

        WebDriver browser;
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        browser = new ChromeDriver();

        browser.manage().window().fullscreen();
        browser.get("https://gmail.com");
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ((ChromeDriver) browser).findElementByName("identifier").sendKeys("testselenium1002@gmail.com");
        ((ChromeDriver) browser).findElementById("identifierNext").click();
        WebElement password = ((ChromeDriver) browser).findElementByName("password");
        WebDriverWait wait = new WebDriverWait(browser,20);
        wait.until(ExpectedConditions.elementToBeClickable(password));
        password.sendKeys("utmti163");
        ((ChromeDriver) browser).findElementById("passwordNext").click();

        //browser.quit();

    }
}
