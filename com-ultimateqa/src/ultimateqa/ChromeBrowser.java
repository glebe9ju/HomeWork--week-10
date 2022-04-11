package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        //story URL in String datatype
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        //set the property from chrome brower
        System.setProperty("webdriver.chrome.driver", "divers/chromedriver.exe");
        //creating object of web driver interface
        WebDriver driver = new ChromeDriver();
        //launch the URL
        driver.get(baseUrl);
        //to maximize URL window
        driver.manage().window().maximize();
        //give the implicitly time to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //print the title of the page
        System.out.println("Title : " + driver.getTitle());
        //print the current URL
        System.out.println("current URL = " + driver.getCurrentUrl());

        System.out.println("Page Source: "+driver.getPageSource());
                //enter the email to
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("prime123@gmail.com");
        //enter the password to password field
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("Prime123");
        driver.close();

    }
}
