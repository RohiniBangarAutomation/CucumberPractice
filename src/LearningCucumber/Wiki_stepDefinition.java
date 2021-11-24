package LearningCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Wiki_stepDefinition {

	WebDriver driver;

	@Given("^I open Chrome$")
	public void I_open_Chrome() {
		System.setProperty("webdriver.chrome.driver", "/Users/Mithun/Documents/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@And("^I navigate to Wikipedia$")
	public void I_navigate_to_Wikipedia() {
		driver.get("https://www.wikipedia.org/");
	}

	@Then("^I click on English Lang$")
	public void I_click_on_English_Lang() {

		WebElement lang = driver.findElement(By.xpath("//strong[text()='English']"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(lang)).click();
	}

	@Then("^I click on Polski Lang$")
	public void I_click_on_Polski_Lang() {
		WebElement lang = driver.findElement(By.xpath("//strong[text()='Polski']"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(lang)).click();
		;
	}

	@Then("^I click on Hindi$")
	public void I_click_on_Hindi() {
		driver.findElement(By.xpath("//span[text()='Read Wikipedia in your language ']")).click();
		WebElement language = driver.findElement(By.xpath("//a[text()='हिन्दी']"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(language)).click();

	}

	@Then("^I click on Watch History$")
	public void I_click_on_Watch_History() {
		driver.findElement(By.xpath("//a[text()='इतिहास देखें']")).click();

	}

	@And("^I navigate to Youtube$")
	public void I_navigate_to_Youtube() {
		driver.get("https://www.youtube.com/");
	}
	/*
	 * Scenario: Watch Selenium with java video on Youtube Given I open Chrome And I
	 * navigate to Youtube Then I Searched Selenium with java Video And I Click on
	 * search button Then I click on Selenium with java Video
	 * 
	 * Scenario: See whats Trending in youtube Given I open Chrome And I navigate to
	 * Youtube Then I Click on Explore Then I click on Trending
	 * 
	 * Scenario: view men fashion in myntra Given I open Chrome And I navigate to
	 * myntra Then I Click on Men
	 * 
	 * Scenario: Search sunglasses in myntra Given I open Chrome And I navigate to
	 * myntra Then I type sunglasses in search Then i click on search
	 */

	@Then("^I Searched Selenium with java Video$")
	public void I_Searched_Selenium_with_java_Video() {
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("selenium with java");

	}

	@And("^I Click on search button$")
	public void I_Click_on_search_button() {
		WebElement ele = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
	}

	@Then("^I click on Selenium with java Video$")
	public void I_click_on_Selenium_with_java_Video() {
		// WebElement ele1 = driver.findElement(By.xpath(
		// "/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[1]/div[3]/ytd-promoted-sparkles-text-search-renderer/div/div[1]/h3"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[2]/div[3]/ytd-promoted-sparkles-text-search-renderer/div/div[1]/h3")))
				.click();

	}

	@Then("^I Click on Explore$")
	public void I_Click_on_Explore() {
		// WebElement ele2=driver.findElement(
		// By.xpath("/html/body/ytd-app/div/ytd-mini-guide-renderer/div/ytd-mini-guide-entry-renderer[2]/a/yt-icon"));

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/ytd-app/div/ytd-mini-guide-renderer/div/ytd-mini-guide-entry-renderer[2]/a/yt-icon")))
				.click();

	}

	@Then("^I click on Trending$")
	public void I_click_on_Trending() {
		// driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-browse[1]/ytd-two-column-browse-results-renderer/div[1]/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[1]/div[3]/ytd-destination-shelf-renderer/div/ytd-destination-button-renderer[1]/a")).click();
		// WebElement trend=driver.findElement(By.xpath(
		// "/html/body/ytd-app/div/ytd-page-manager/ytd-browse[2]/ytd-two-column-browse-results-renderer/div[1]/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[1]/div[3]/ytd-destination-shelf-renderer/div/ytd-destination-button-renderer[1]/a"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/ytd-app/div/ytd-page-manager/ytd-browse[2]/ytd-two-column-browse-results-renderer/div[1]/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[1]/div[3]/ytd-destination-shelf-renderer/div/ytd-destination-button-renderer[1]/a")))
				.click();
	}

	@And("^I navigate to myntra$")
	public void I_navigate_to_myntra() {
		driver.get("https://www.myntra.com/");
	}

	@Then("^I Click on Men$")
	public void I_Click_on_Men() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/nav/div/div[1]/div/a")).click();
	}

	@Then("^I type sunglasses in search$")
	public void I_type_sunglasses_in_search() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div[3]/input")).sendKeys("sunglasses");
	}

	@Then("^i click on search$")
	public void i_click_on_search() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div[3]/a/span")).click();
	}

	@Given("^I navigate to URL \"(.*?)\"$")
	public void i_navigate_to_URL(String URL) throws Throwable {
		System.out.println(URL);
		driver.get(URL);
	}

	@Then("^I give username as \"(.*?)\"$")
	public void i_give_username_as(String username) throws Throwable {

		driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"))
				.sendKeys(username);
		System.out.println(username);
	}

	@Then("^I give password as \"(.*?)\"$")
	public void i_give_password_as(String password) throws Throwable {

		driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"))
				.sendKeys(password);

		System.out.println(password);
	}

	@Then("^click on login$")
	public void click_on_login() {

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"))
				.click();
	}
	
	

}
