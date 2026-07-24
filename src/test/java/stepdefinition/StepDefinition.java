package stepdefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{

    
    
// @Given("launch the browser and load the url")
// public void launch_the_browser_and_load_the_url() {
//     driver=new ChromeDriver();
//         driver.get("https://leaftaps.com/opentaps/control/main");
//         driver.manage().window().maximize();
//         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

// }
@When("enter the username {string}")
public void enter_the_userName(String uName) {
   driver.findElement(By.id("username")).sendKeys(uName);
    
}
@When("enter the password {string}")
public void enter_the_password(String pWord) {
  driver.findElement(By.id("password")).sendKeys(pWord);
}
@When("click on the login button")
public void click_on_the_login_button() {
    driver.findElement(By.className("decorativeSubmit")).click();
}
@When("click crmsfa button")
public void click_crmsfa_button() {
   driver.findElement(By.linkText("CRM/SFA")).click();
}

@Then("dashboard is displayed")
public void dashboard_is_displayed() {
   WebElement header = driver.findElement(By.id("sectionHeaderTitle_myHome"));

   if (header.getText().contains("My Home")) {
    System.out.println("success");
   } else {
    System.out.println("failed");
   }
}

@When("click on myLead button")
public void click_on_my_lead_button() {
    driver.findElement(By.xpath("//a[text()='Leads']")).click();
}
@When("click on createLead button")
public void click_on_create_lead_button() {
   driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
}
@When("enter the company name (.*)$")
public void enter_the_company_name(String cName) {
   driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys(cName);
}
@When("enter the first name (.*)$")
public void enter_the_first_name(String fName) {
    driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(fName);
   
}
@When("enter the last name (.*)$")
public void enter_the_last_name_last_name(String lName) {
   driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys(lName);
}
@When("click on submit button")
public void click_on_submit_button() {
  driver.findElement(By.xpath("//input[@name='submitButton']")).click();
}
@Then("viewlead page displayed")
public void viewlead_page_displayed() {
   WebElement text = driver.findElement(By.xpath("//span[@id='viewLead_lastName_sp']"));

   if (text.getText().contains("das")) {
    System.out.println("lead created Successfully");
   } else {
    System.out.println("lead not created Successfully");
   }

}

}
