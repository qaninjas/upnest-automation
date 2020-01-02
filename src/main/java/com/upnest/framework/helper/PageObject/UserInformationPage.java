package com.upnest.framework.helper.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.upnest.framework.helper.BasePageObject.PageBase;
import com.upnest.framework.helper.Button.ButtonHelper;
import com.upnest.framework.helper.Logger.LoggerHelper;
import com.upnest.framework.helper.Navigation.NavigationHelper;
import com.upnest.framework.helper.TextBox.TextBoxHelper;

public class UserInformationPage extends PageBase {

	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(UserInformationPage.class);

	public UserInformationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	/** Web Elements */

	@FindBy(how=How.XPATH,using="(//span[contains(text(),'Sample Proposal')])[2]")
	public WebElement user_info;

	@FindBy(how=How.ID,using="send-code-button")
	public WebElement buttonphone;

	@FindBy(how=How.ID,using="send-email-button")
	public WebElement email_button;

	@FindBy(how=How.XPATH,using="(//a[contains(text(),'Sample Proposal')])[2]")
	public WebElement proposal_button;

	@FindBy(how=How.CSS,using="span[class='name']")
	public WebElement agent_name;

	@FindBy(how=How.ID,using="user-name")
	public WebElement user_name;

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Logout')]")
	public WebElement logout;


	/** Default Methods **/


	/** Public Methods  **/

	public WebDriver getDriver() {
		return this.driver;
	}

	public String getFindAgentPageTitle(){
		return new NavigationHelper(driver).getTitle();
	}

	public String getUserName() {
		return new TextBoxHelper(driver).getText(user_info);
	}
	
	public void clickPhoneNumber(){
		new ButtonHelper(driver).click(buttonphone);
	}
	
	public void clickEmail(){
		new ButtonHelper(driver).click(email_button);
	}
	
	public void clickProposal(){
		new ButtonHelper(driver).click(proposal_button);
	}
	
	public void clickUserName(){
		new ButtonHelper(driver).click(user_name);
	}
	
	public void Clicklogout() {
		Actions actions = new Actions(driver);
		actions.moveToElement(user_name);
		new ButtonHelper(driver).click(logout);
	}
	
}
