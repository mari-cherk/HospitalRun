
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestClass{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","D:/marina/Automatization/PageObjectwithFactories/HospitalRun/src/main/resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("disable-popup-blocking");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver driver = new ChromeDriver(capabilities);
        driver.get("http://demo.hospitalrun.io");
        driver.manage().window().maximize();
        //driver.quit();
    }
}