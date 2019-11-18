package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BDD.Cucumber.Base;

@RunWith(Cucumber.class)
public class veggies_search {
	 public WebDriver driver;

	@Given("^user is on greencart page$")
	public void user_is_on_greencart_page() throws Throwable {
		driver=Base.getdriver();
		
	}

	@When("^user searches for \"([^\"]*)\" vegetable$")
	public void user_searches_for_something_vegetable(String strArg1) throws Throwable {
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(strArg1);
		Thread.sleep(5000);
	}

	@Then("^\"([^\"]*)\" results appears$")
	public void something_results_appears(String strArg1) throws Throwable {
		String text = driver.findElement(By.xpath("//h4[@class='product-name']")).getText();
		System.out.println(text);
	Assert.assertTrue(driver.findElement(By.xpath("//h4[@class='product-name']")).getText().contains(strArg1));
	}

}
