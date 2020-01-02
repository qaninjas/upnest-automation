package com.upnest.framework.helper.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.upnest.framework.helper.BasePageObject.PageBase;
import com.upnest.framework.helper.Button.ButtonHelper;
import com.upnest.framework.helper.DropDown.DropDownHelper;
import com.upnest.framework.helper.Javascript.JavaScriptHelper;
import com.upnest.framework.helper.Logger.LoggerHelper;
import com.upnest.framework.helper.Navigation.NavigationHelper;
import com.upnest.framework.helper.TextBox.TextBoxHelper;
import com.upnest.framework.settings.ObjectRepo;

public class FaqPage extends PageBase {
	
	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(FaqPage.class);

	public FaqPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	/** Web Elements */
		
	@FindBy(how=How.CSS,using="div[class='chat-reply-button']")
	public WebElement yes_btn;
	
	@FindBy(how=How.CSS,using="div[class='skip-dt']")
	public WebElement skip_btn;
	
	/** Default Methods **/
	
	
	/** Public Methods  **/
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	public String getFAQPageTitle(){
		return new NavigationHelper(driver).getTitle();
	}
	
	public void clickYesButton(){
		waitForElement(yes_btn, ObjectRepo.reader.getExplicitWait());
		new ButtonHelper(driver).click(yes_btn);
	}
	
	public void clickSkipButton(){
		new ButtonHelper(driver).click(skip_btn);
	}
}
