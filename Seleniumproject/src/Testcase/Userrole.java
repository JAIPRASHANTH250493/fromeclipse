package Testcase;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Pageobject.Loginpage;
import Pageobject.Userrole1;
import commonfunctions.Commonfunction;

public class Userrole extends Commonfunction {
	
	@Test
	public void usermanagement() {
PageFactory.initElements(driver, Loginpage.class);
		
		Loginpage.username.sendKeys(pro.getProperty("usrname"));
		
	
		Loginpage.password.sendKeys(pro.getProperty("password"));
		
		Loginpage.loginbutton.click();
		PageFactory.initElements(driver,Userrole1.class);
		
		
		Actions act=new Actions(driver);
		act.moveToElement(Userrole1.admim);
		act.moveToElement(Userrole1.admimuser);
		act.moveToElement(Userrole1.systemuser).click().build().perform();
		
		Select sel=new Select(Userrole1.userrole);
		sel.selectByVisibleText("Admin");
		
		Select SEL2=new Select(Userrole1.status);
		
		SEL2.selectByVisibleText("Enabled");
		
		Userrole1.buttonclick.click();
		
	}

}
