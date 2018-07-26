import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition 
{
	
	WebDriver dr=new FirefoxDriver();
	@Given("^i enter facebook$")
	public void i_enter_facebook() throws Throwable {
	    dr.get("https://www.facebook.com");
	}

	@When("^i enter email\"([^\"]*)\"$")
	public void i_enter_email(String arg1) throws Throwable {
		dr.findElement(By.id("email")).sendKeys(arg1);
	    
	}

	@When("^i enter password\"([^\"]*)\"$")
	public void i_enter_password(String arg1) throws Throwable {
	    dr.findElement(By.id("pass")).sendKeys(arg1);
	}

	@When("^i click login$")
	public void i_click_login() throws Throwable {
	dr.findElement(By.id("u_0_y")).click();
	}

	@Then("^i should see login page$")
	public void i_should_see_login_page() throws Throwable {
	   System.out.println("login Validated");
	   dr.quit();
	}
}
