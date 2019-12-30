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
import com.upnest.framework.helper.Logger.LoggerHelper;
import com.upnest.framework.helper.Navigation.NavigationHelper;
import com.upnest.framework.helper.TextBox.TextBoxHelper;
import com.upnest.framework.settings.ObjectRepo;

public class BuyProcessPage extends PageBase {
	
	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(BuyProcessPage.class);

	public BuyProcessPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	/** Web Elements */
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Ready to Bid')]")
	public WebElement ready_to_bid_btn;
		
	
	/** Default Methods **/
	
	
	/** Public Methods  **/
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	public String getBuyProcessPageTitle(){
		return new NavigationHelper(driver).getTitle();
	}
	
	public void clickBidButton(){
		new ButtonHelper(driver).click(ready_to_bid_btn);
	}
	
	
}
