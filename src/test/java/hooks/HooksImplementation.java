package hooks;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepdefinition.BaseClass;

public class HooksImplementation extends BaseClass {

    @Before(order = 1)
    public void preConditions(){

        ChromeOptions options = new ChromeOptions();

options.addArguments("--headless=new");   // or "--headless"
options.addArguments("--no-sandbox");
options.addArguments("--disable-dev-shm-usage");
options.addArguments("--window-size=1920,1080");

driver = new ChromeDriver(options);
         driver.get("https://leaftaps.com/opentaps/control/main");
       
    }

    @Before(order = 2)
     public void preConditionsTwo(){
             driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         }

    @After
    public void postConditions(){
        driver.close();
    }

}
