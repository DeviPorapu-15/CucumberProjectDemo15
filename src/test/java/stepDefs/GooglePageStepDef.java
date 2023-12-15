package stepDefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.After;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglePageStepDef {
	WebDriver driver;
	@Given("User is on Google Home Page")
	public void user_is_on_google_home_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	@When("user search Java Tutorial")
	public void user_search_java_tutorial() {
		WebElement searchbox = driver.findElement(By.className("gLFyf"));
		searchbox.sendKeys("JavaTutorial");
		searchbox.submit();
	}
    @Then("Should Display Java Result Page")
    public void should_display_java_result_page() {
    	Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
    } 	
    @When("User search Selenium Tutorial")
    public void user_search_selenium_tutorial() {
    	WebElement searchbox = driver.findElement(By.className("gLFyf"));
		searchbox.sendKeys("SeleniumTutorial");
		searchbox.submit();
    }
    @Then("Should display Selenium Result Page")
    public void should_display_selenium_result_page() {
    	Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");
    }
   
//    @After
//    public void attachScreenshot(Scenario scenario) {
//    	if(scenario.isFailed()) {
//    		TakesScreenshot screen = (TakesScreenShot)driver;
//    		byte[] img = screen.getScreenshotAs(OutputType.BYTES);
//    		scenario.attach(img,"img/png","ScreenshotImage");
//    	}
    	
    }
    	
    	
    
	

