package FrameworkBuildTestNgMain.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameworkBuildTestNgMain.AbstractComponents.AbstractComponent;

public class ConfirmationPage extends AbstractComponent {

	WebDriver driver;
	
	@FindBy(css = ".hero-primary")
	WebElement confirmationMessage;
	
	public ConfirmationPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getConfirmationMessage()
	{
		waitForElementToAppearByWebElement(confirmationMessage);
		return confirmationMessage.getText().trim().toLowerCase();
	}
}
