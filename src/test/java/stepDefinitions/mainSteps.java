package stepDefinitions;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainSteps {
	
	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		
		System.out.println("admin is on NetBanking landing page");
		Assert.assertTrue(false);
	}
	@When("^User login into application with (.+) and password (.+)$")
	public void user_login_into_application_with_and_password(String userame, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("User login into applicationwith" +userame+ "password"+password);

	}
	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Home Page is displayed");

	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("cards_are_displayed");
	}
	
	//// with multiple data fields in scenario
	@Given("User is on practice landing page")
	public void user_is_on_practice_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on practice landing page");
	}
	@When("User login into application")
	public void user_login_into_application(List<String> dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		System.out.println(dataTable.get(0));
		System.out.println(dataTable.get(1));
		System.out.println(dataTable.get(2));
		System.out.println(dataTable.get(3));
		//System.out.println(dataTable.get(4));



	}
	
	//background methods for applicable for all scenarios

@Given("clear the data")
public void cleardata()
{
		System.out.println("*****************");
		System.out.println("clear the data");

}
	@When("launch the broswer")
	public void launchthebroswer ()
	{
			System.out.println("launch the broswer ");

	}
	
	@When("hit the page url")
	public void hitthepageurl()
	{
			System.out.println("hit the page url");

	}
	

}
