package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser {
    public static void main(String[] args) {
        //store URL in string datatype
        String baseUrl = "http://the-internet.herokuapp.com/login";
        //set the property from chrome brower
        System.setProperty("webdriver.edge.driver","divers/msedgedriver.exe");
        //creating object of web driver interface
        WebDriver driver = new EdgeDriver();
        //launch the URL
        driver.get(baseUrl);
        //maximize the window
        driver.manage().window().maximize();
        //give the implicitly time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //String title = driver.getTitle();
        //print the title of the page
        System.out.println("Title :" + driver.getTitle());
        //print the current URL
        System.out.println("current URL =" +driver.getCurrentUrl());
        System.out.println("Page Source: "+driver.getPageSource());
        //Enter the email to emil field
        WebElement emailField = driver.findElement((By.id("username")));
        emailField.sendKeys("prime456@gmail.com");
        //Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("1234");
        driver.close();



    }
}
