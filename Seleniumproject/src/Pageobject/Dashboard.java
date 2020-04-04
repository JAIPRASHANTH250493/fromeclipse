package Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard {

	@FindBy(xpath="//*[@id=\"task-list-group-panel-menu_holder\"]/table/tbody/tr/t")
	public static WebElement pendingleave;
	
}
