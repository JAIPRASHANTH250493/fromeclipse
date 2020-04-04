package Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Userrole1 {

	@FindBy(id="menu_admin_viewAdminModule")
	public static WebElement admim;
	
	@FindBy(id="menu_admin_UserManagement")
	public static WebElement admimuser;
	
	@FindBy(id="menu_admin_viewSystemUsers")
	public static WebElement systemuser;
	
	@FindBy(id="searchSystemUser_userType")
	public static WebElement userrole;
	
	@FindBy(id="searchSystemUser_status")
	public static WebElement status;
	
	@FindBy(id="searchBtn")
	public static WebElement buttonclick;
	
}


