package stepDefinations;

import BDD.Cucumber.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base {
	
	@Before("@smoketest")
	public void beforeValidation()
	{
		System.out.println("before smoke test");
	}
	
	@After("@smoketest")
	public void afterValidation()
	{
		System.out.println("after smoke test");
	}
	@Before("@regTest")
	public void beforeregValidation()
	{
		System.out.println("before reg test");
	}
	
	@After("@regTest")
	public void afterregValidation()
	{
		System.out.println("after reg test");
	}
	
	@After("@seleniumTest")
	public void afterSeleniummTest()
	{
		driver.close();
	}
	

}

/*
 * Background: Given browser to be launched When browser is triggered Then
 * validate the browser opening
 */
