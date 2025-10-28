package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	@Before("@NetBanking")
	public void netbankinguser()
	{
		System.out.println("***************");
		
		System.out.println("mortgage user setup");}
	@After
     public void teardown()
	{
		System.out.println("close url");
    }
	@Before("@Mortgage")
	public void mortgageuser()
	{
       System.out.println("***************");
		System.out.println("netbanking user setup");
	}
	
}
