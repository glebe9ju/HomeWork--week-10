package ultimateqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

public class MultiBrowser {
    static String browser = "Chrome";
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "divers/chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "divers/geckodriver.exe");
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "divers/msedgedriver.exe");
            driver = new InternetExplorerDriver();

        } else {
            System.out.println("wrong browser name");

        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Page Source: "+driver.getPageSource());


    }
}





