package STEPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition {
	
	WebDriver driver;
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	} 
	
	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	    driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
	
	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String uname, String pword) {
		driver.findElement(By.name("username")).sendKeys(uname);
		  driver.findElement(By.name("password")).sendKeys(pword);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
	
	@Then("Navigate to skills Page")
	public void navigate_to_skills_page() {
		 driver.findElement(By.xpath("//span[text()='Admin']")).click();
         driver.findElement(By.xpath("//span[contains(.,'Qualifications')]")).click();
         driver.findElement(By.xpath("//a[text()='Skills']")).click();
         driver.findElement(By.xpath("//button[text()=' Add ']")).click();
	}
	
	@When("Add skills Records with sname as {string} and sdescr as {string}")
	public void add_skills_records_with_sname_as_and_sdescr_as(String sname, String sdescr) {
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(sname);
        driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys(sdescr);
        driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	}
	
	@When("Click on logout button")
	public void click_on_logout_button() {
	    //welcome
		//logout
	}
	
	@Then("Close Browser")
	public void close_browser() {
	    driver.quit();
	}


}
