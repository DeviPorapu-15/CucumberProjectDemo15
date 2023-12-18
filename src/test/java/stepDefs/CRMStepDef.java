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
	//@Before 
	//@Before Step
	//@BeforeAll
	@Before("@SmokeTest")
	public static void initChrome()
	{
	 System.out.println("Init Chrome.......");	
	}
	@Before("@RegressionTest")
	public static void initEdge()
	{
	 System.out.println("Init Edge.......");	
	}
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
