package com.upnest.framework.helper.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.upnest.framework.helper.BasePageObject.PageBase;
import com.upnest.framework.helper.DropDown.DropDownHelper;
import com.upnest.framework.helper.Logger.LoggerHelper;
import com.upnest.framework.helper.TextBox.TextBoxHelper;
import com.upnest.framework.settings.ObjectRepo;

public class FindAgentPage extends PageBase {
	
	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(FindAgentPage.class);

	public FindAgentPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	/** Web Elements */
	
	@FindBy(how=How.XPATH,using="//div[@class='buy-or-sell-button buy-button']")
	public WebElement buy_btn;
		
	
	/** Default Methods **/
	
	
	/** Public Methods  **/
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	
}
