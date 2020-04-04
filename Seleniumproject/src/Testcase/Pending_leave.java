package Testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pageobject.Dashboard;
import Pageobject.Loginpage;
import commonfunctions.Commonfunction;

public class Pending_leave extends Commonfunction{
	
	
	@Test
	public void verifypendingleaverequest() {
		
		PageFactory.initElements(driver, Loginpage.class);
		
		Loginpage.username.sendKeys(pro.getProperty("usrname"));
		
	
		Loginpage.password.sendKeys(pro.getProperty("password"));
		
		Loginpage.loginbutton.click();
		
		
		/*
		 * PageFactory.initElements(driver, Dashboard.class);
		 * 
		 * String msg= Dashboard.pendingleave.getText();
		 * 
		 * Assert.assertEquals(msg, "No Records are Available");
		 */
		
	}

}
