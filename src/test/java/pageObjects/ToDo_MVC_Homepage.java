package pageObjects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ToDo_MVC_Homepage {
	
	WebDriver driver;
	//object locators
	By ToDoTextBox = By.xpath("//*[@class='new-todo']");
	By ToDoList = By.xpath("//*[@class='main']");
	By AllLinkText = By.linkText("All");
	By ActiveLinkText = By.linkText("Active");
	By CompletedLinkText = By.linkText("Completed");
	By RadioButton = By.className("toggle");
	
	
	String projectPath = System.getProperty("user.dir");
	String driverPath = projectPath+"/src/test/resources/drivers/chromedriver.exe";

	//Constructor that will be automatically called as soon as the object of the class is created
		public ToDo_MVC_Homepage(WebDriver driver) {
			this.driver=driver;
		}
		
		public void setup() {
			System.setProperty("webdriver.chrome.driver", driverPath);
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://todomvc.com/examples/vue/");
		}
		
		public void teardown() {
			driver.close();
		}
		
		//Method to click login button
		public void clickTextBox() {
			driver.findElement(ToDoTextBox).click();
		}
		
		//Method to click login button
		public void enterText(String valueToEnter) {
			driver.findElement(ToDoTextBox).sendKeys(valueToEnter);
		}

		public void enterTextKeys(Keys return1) {
			driver.findElement(ToDoTextBox).sendKeys(return1);
		}
		
		public void addNewToDo(String valueToEnter, Keys return1) {
			driver.findElement(ToDoTextBox).click();
			driver.findElement(ToDoTextBox).sendKeys(valueToEnter);
			driver.findElement(ToDoTextBox).sendKeys(return1);
			
		}

		public String getLoginTitle() {
			String actualTitle = driver.getTitle();
			return actualTitle;
		}
		
		public String verifyTodoIsListed() {
			String text = driver.findElement(ToDoList).getAttribute("innerHTML");
			return text;
		}
		
		public void clickToDoCategogy(String linkText) {
			String link = linkText;
			switch (link) {
			  case "All":
				driver.findElement(AllLinkText).click();
			    break;
			  case "Active":
				  driver.findElement(ActiveLinkText).click();
			    break;
			  case "Completed":
				  driver.findElement(CompletedLinkText).click();
			    break;		
			} 
		}
		
		public void completeToDo() {
			driver.findElement(RadioButton).click();
		}
		
		public void verifyToDoIsCompleted() {
			driver.findElement(RadioButton).click();
		}
		

}
