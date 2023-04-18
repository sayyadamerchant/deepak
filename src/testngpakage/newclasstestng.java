package testngpakage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class newclasstestng {

	public class Exp_Testng {
		@BeforeClass
		public void login() {
		System.out.println("Login completed");
		}
		@AfterClass
		public void logout() {
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

}
