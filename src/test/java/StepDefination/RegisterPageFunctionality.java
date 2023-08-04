package StepDefination;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageFunctionality extends BaseClass {

	@Given("User on Register Page of Facebook")
	public void user_on_register_page_of_facebook() {
		initialization();
	}

	@When("User Enter {string} and {string} and {string} and {string}")
	public void user_enter_and_and_and(String fname, String lname, String uname, String pass) {
		driver.findElement(By.name("firstname")).sendKeys(fname);
		driver.findElement(By.name("lastname")).sendKeys(lname);
		driver.findElement(By.name("reg_email__")).sendKeys(uname);
		driver.findElement(By.name("reg_passwd__")).sendKeys(pass);
		}

	@Then("User Clickon create button")
	public void user_clickon_create_button() {
		driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
	}

}
