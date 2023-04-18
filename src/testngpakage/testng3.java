package testngpakage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng3 {
	@BeforeMethod
	public void login() 
	{
	System.out.println("Login completed");
	}
	@AfterMethod
	public void logout() 
	{
	System.out.println("Logout completed");
	}
	@Test(priority=2)
	public void addemp() {
	System.out.println("add emp");
	}
	@Test(priority=1)
	public void delemp() {
	System.out.println("del emp");
	}
}
