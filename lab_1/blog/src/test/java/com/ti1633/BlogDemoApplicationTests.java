package com.ti1633;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogDemoApplicationTests {

    @Test
    public void contextLoads() {
        System.setProperty("webdriver.chrome.driver" ,  "/Applications/chromedriver");

        WebDriver browser = new ChromeDriver();

    }


}
