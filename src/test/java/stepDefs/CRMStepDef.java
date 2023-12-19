package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDef {
	
//	@Before(order=2)
//	public void initDB() {
//		System.out.println("Init DB.....");
//	}
//	@Before(order=3)
//	public void readProperty() {
//		System.out.println("Read from property");
//	}
//	 
//	@Before(order=2)
//	public void initBrowser() {
//		System.out.println("Init Browser.....");
//	}
	@Before(value="@SmokeTest" ,order=1)
	public void readfromSmokeTestProperty() {
		System.out.println("Read from Smoke Test Property.....");
	}
	@Before(value="@SmokeTest",order=2)
	public void initChrome() {
		System.out.println("Init Chrome");
	}
	 
	@Before(value="@RegressionTest" ,order=1)
	public void readRegTestProperty() {
		System.out.println("Read from Regression Test Property.....");
	}
	@Before(value="@RegressionTest" ,order=2)
	public void initedge() {
		System.out.println("Init edge.....");
	}
	
	
	//@Before 
	//@Before Step
	//@BeforeAll
//	@Before("@SmokeTest")
//	public static void initChrome()
//	{
//	 System.out.println("Init Chrome.......");	
//	}
//	@Before("@RegressionTest")
//	public static void initEdge()
//	{
//	 System.out.println("Init Edge.......");	
//	}
	//@After
	//@AfterStep
	//@AfterAll
//	public static void closeDB() {
//		System.out.println("Close DB......");
//		
//	}
	@Given("User is on loginpage")
	public void user_is_on_loginpage() {
		System.out.println("User is on loginpage");
	}
	@When("User create a new contact")
	public void user_create_a_new_contact() {
		System.out.println("User create a new contact");
	}
	
	@When("User view contact details")
	public void user_view_contact_details() {
		System.out.println("User view contact details");
	}
	@When("User delete a contact")
	public void user_delete_a_contact() {
		System.out.println("User delete a contact");
	}
	@Given("User is logged in")
	public void user_is_logged_in() {
		  System.out.println("User is logged in");
	}
	@When("User create a new Deals")
	public void user_create_a_new_deals() {
	  System.out.println("User create a new Deals");  
	}
	
	@When("User view Deals details")
	public void user_view_deals_details() {
		System.out.println("User view Deals details");
	}
	@When("User delete a Deals")
	public void user_delete_a_deals() {
		System.out.println("User view Deals details");
	}
	@When("User create a new Tasks")
	public void user_create_a_new_tasks() {
	    System.out.println("User create a new Tasks");
	}
	@When("User view Tasks details")
	public void user_view_tasks_details() {
		System.out.println("User view Tasks details");
	}
	@When("User delete a Tasks")
	public void user_delete_a_tasks() {
		System.out.println("User delete a Tasks");
	}


	
}
