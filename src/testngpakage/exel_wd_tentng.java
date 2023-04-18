package testngpakage;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;



public class exel_wd_tentng {
	 WebDriver driver;
		@BeforeClass
		public void startUp() {
		System.setProperty("webdriver.gecko.driver", "F:\\new floder selenium\\new floder geckodriver path\\geckodriver-v0.33.0-win64 (1)\\geckodriver.exe");
		 driver = new FirefoxDriver();
		}
		@AfterClass
		public void tearDown() {
		driver.close();
		}
		@Test
		public void tc001() throws Exception{
		        //Excel Read
			FileInputStream file = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Test2.xls");
			Workbook wb = Workbook.getWorkbook(file);
			Sheet st = wb.getSheet(0);
		String username = st.getCell(0,1).getContents();
		String password = st.getCell(1,1).getContents();
		Reporter.log(username);
		Reporter.log(password);

		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application Opened"); //-Console
		Reporter.log("Application Opened"); //-html report
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		Reporter.log(driver.getTitle());
		Reporter.log("Login Completed");
		driver.findElement(By.linkText("Logout")).click();
		Reporter.log("Logout completed");

	


	}

}
