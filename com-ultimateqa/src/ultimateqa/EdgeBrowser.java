package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser {
    public static void main(String[] args) {
        //store URL in string daata type
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        //set the property from chrome brower
        System.setProperty("webdriver.edge.driver", "divers/msedgedriver.exe");
        //creating object of web driver interface
        WebDriver driver = new EdgeDriver();
        //launch the URL
        driver.get(baseUrl);
        //maximize the window
        driver.manage().window().maximize();
        //give the implicitly time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //print the title of the page
        System.out.println("Title :" + driver.getTitle());
        //print the current URL
        System.out.println("Page Source: "+driver.getPageSource());
        //Enter the email to email field
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("prime159@gmail.com");
        //Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("prime123");
        driver.close();


        //


    }
}
