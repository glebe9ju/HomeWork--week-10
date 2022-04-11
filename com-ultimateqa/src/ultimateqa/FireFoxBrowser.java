package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowser {
    public static void main(String[] args) {
        //Store URL in string data type
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        //set the property from chrome browser
        System.setProperty("webdriver.gecko.driver","divers/geckodriver.exe");
        //creating object of web driver interface
        WebDriver driver = new FirefoxDriver();
        // launch the URL
        driver.get(baseUrl);
        //maximize the window
        driver.manage().window().maximize();
        //give the implicitly time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //print the title of the page
        System.out.println("Title : " + driver.getTitle());


        System.out.println("Page Source: "+driver.getPageSource());
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("prime654@gmail.com");
        //Enter the password password field
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("prime324");
        driver.close();

    }

}
