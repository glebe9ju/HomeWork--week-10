package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser {
    public static void main(String[] args) {

            //store URL in String datatype
            String baseUrl = "https://opensource-demo.orangehrmlive.com/";
            //set the property from chrome brower
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            //creating object of webdriver interface
            WebDriver driver = new EdgeDriver();// Driver object
            //launch the URL
            driver.get(baseUrl);
            //to maximize URL window
            driver.manage().window().maximize();
            //give the implicitly time to the diver
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//decide the time when to launch
            //print the title of the page
            //  String title = driver.getTitle();
            System.out.println("Title : " + driver.getTitle());
            //print the current URL
            System.out.println("current URL = " + driver.getCurrentUrl());

            System.out.println("Page Source: "+driver.getPageSource());
            //enter the email to email field
            WebElement emailField = driver.findElement(By.id("txtUsername"));
            emailField.sendKeys("prime123@Ggmail.com");
            //enter the password to password field
            WebElement passwordField = driver.findElement(By.name("txtPassword"));
            passwordField.sendKeys("Prime123");
            driver.close();

    }
}
