package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        //store URL in string datatype
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        //set the property from chrome brower
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        //creating object of web driver interface
        WebDriver driver = new ChromeDriver();
        //launch the URL
        driver.get(baseUrl);
        //maximize the window
        driver.manage().window().maximize();
        //give the implicitly time to the diver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //ptint the title of the page
        System.out.println("Title : " + driver.getTitle());
        //print the current URL
        System.out.println("current URL = " + driver.getCurrentUrl());

        System.out.println("Page Source: "+driver.getPageSource());
        //enter the email to email field
        WebElement emailField = driver.findElement(By.id("txtUsername"));
        emailField.sendKeys("Prime695@gmail.com");
        //enter the password to password field element
        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        passwordField.sendKeys("Prime123");
        driver.close();

    }

}
