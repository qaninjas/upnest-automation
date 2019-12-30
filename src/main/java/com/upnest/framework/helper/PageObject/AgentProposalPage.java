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
import com.upnest.framework.helper.Navigation.NavigationHelper;
import com.upnest.framework.helper.TextBox.TextBoxHelper;
import com.upnest.framework.settings.ObjectRepo;

public class AgentProposalPage extends PageBase {
	
	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(AgentProposalPage.class);

	public AgentProposalPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	/** Web Elements */
	
	@FindBy(how=How.ID,using="name")
	public WebElement full_name_txtbox;
	
	@FindBy(how=How.ID,using="email")
	public WebElement email_address_txtbox;
	
	@FindBy(how=How.ID,using="phone")
	public WebElement phone_txtbox;
	
	@FindBy(how=How.NAME,using="talkNow")
	public WebElement talknow_checkbox;
		
	@FindBy(how=How.CSS,using="button[class=\"continue-button\"]")
	public WebElement continue_btn;
	
	/** Default Methods **/
	
	
	/** Public Methods  **/
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	public String getAgentProposalPageTitle(){
		return new NavigationHelper(driver).getTitle();
	}
	
	public void enter_agent_proposal(String FullName,String Email,String Number) {		
		full_name_txtbox.sendKeys(FullName);
		email_address_txtbox.sendKeys(Email);
		talknow_checkbox.click();
		log.info(FullName);
		log.info(Email);
		waitForElement(phone_txtbox, ObjectRepo.reader.getExplicitWait());
		email_address_txtbox.sendKeys(Number);
		continue_btn.click();
	}
}
