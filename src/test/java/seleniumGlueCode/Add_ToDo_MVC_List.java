package seleniumGlueCode;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ToDo_MVC_Homepage;

public class Add_ToDo_MVC_List {
	
	
	
	WebDriver driver;
	ToDo_MVC_Homepage home;
	
	@Given("^user is on ToDo MVC homepage$")
	public void user_is_on_ToDo_MVC_homepage() throws Throwable {
		//verify user is on ToDo MVC Homepage
		home = new ToDo_MVC_Homepage(driver);
		home.setup();
        String ToDoMVCHomePageTitle = home.getLoginTitle();
        Assert.assertTrue(ToDoMVCHomePageTitle.contains("TodoMVC"));
	}

	@When("^user adds a new ToDo in textbox$")
	public void user_adds_a_new_ToDo_in_textbox() throws Throwable {
		//user adds a new todo
		home.clickTextBox();
		home.enterText("First Active ToDo");
	}

	@When("^user clicks Enter in keyboard$")
	public void user_clicks_Enter_in_keyboard() throws Throwable {
		//click Enter in keyboard to add the new todo
		home.enterTextKeys(Keys.RETURN);
	}

	@Then("^new ToDo is displayed$")
	public void new_ToDo_is_displayed() throws Throwable {
		//verify that the added ToDo is displayed in the list
		String listOfTodo = home.verifyTodoIsListed();
	    Assert.assertTrue(listOfTodo.contains("First Active ToDo"));
	    Thread.sleep(3000);
	    home.teardown();

	}
	
	@When("^user clicks 'Active'$")
	public void user_clicks_Active() throws Throwable {
		home = new ToDo_MVC_Homepage(driver);
		home.setup();
		home.addNewToDo("First Active ToDo",Keys.RETURN);
		home.addNewToDo("Second Active ToDo",Keys.RETURN);
		home.addNewToDo("Third Active ToDo",Keys.RETURN);
		home.clickToDoCategogy("Active");
		Thread.sleep(3000);
		
	    
	}
	
	@Then("^list of 'Active' ToDo is/are displayed$")
	public void list_of_Active_ToDo_is_are_displayed() throws Throwable {
		String listOfTodo = home.verifyTodoIsListed();
	    Assert.assertFalse(listOfTodo.contains("todo completed"));
		home.teardown();
	   
	}
	
	@When("^there is/are 'Active' ToDo$")
	public void there_is_are_Active_ToDo() throws Throwable {
		home = new ToDo_MVC_Homepage(driver);
		home.setup();
		home.addNewToDo("First Active ToDo",Keys.RETURN);
	}

	@When("^user clicks radio button beside the 'Active' Todo$")
	public void user_clicks_radio_button_beside_the_Active_Todo() throws Throwable {
		home.completeToDo();
	  
	}

	@Then("^the active 'Active' ToDo becomes 'Completed' ToDo$")
	public void the_active_Active_ToDo_becomes_Completed_ToDo() throws Throwable {
		String listOfTodo = home.verifyTodoIsListed();
	    Assert.assertTrue(listOfTodo.contains("todo completed"));
	    Thread.sleep(3000);
	    home.teardown();
	}
	
	
	
	
	

}
