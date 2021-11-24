package AutomationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Reg_stepdef {
	WebDriver driver;

	@Given("^I open chrome$")
	public void I_open_chrome() {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver 2");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Then("^I navigate to url \"(.*?)\"$")
	public void i_navigate_to_url(String url){
		driver.get(url);
	
	}

	@Then("^I give First Name as \"(.*?)\"$")
	public void i_give_First_Name_as(String fname)  {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")).sendKeys(fname);
		
	}

	@Then("^I give Last Name as \"(.*?)\"$")
	public void i_give_Last_Name_as(String lname){
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")).sendKeys(lname);
		

	}
	@Then("^I give Address as \"(.*?)\"$")
	public void i_give_Address_as(String address)  {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea")).sendKeys(address);
	}

	@Then("^Give email_id as \"(.*?)\"$")
	public void give_email_id_as(String email)  {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input")).sendKeys(email);
	}
	@Then("^I click on submit$")
	public void I_click_on_submit()
	{
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[14]/div/button[1]")).click();
	}



}
