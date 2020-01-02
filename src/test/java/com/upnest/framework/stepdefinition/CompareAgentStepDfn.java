package com.upnest.framework.stepdefinition;

import org.testng.Assert;

import com.upnest.framework.helper.PageObject.AgentProposalPage;
import com.upnest.framework.helper.PageObject.BuyProcessPage;
import com.upnest.framework.helper.PageObject.FaqPage;
import com.upnest.framework.helper.PageObject.FindAgentPage;
import com.upnest.framework.helper.PageObject.HomePage;
import com.upnest.framework.helper.PageObject.HomeSelectionPage;
import com.upnest.framework.helper.PageObject.LoanApprovalPage;
import com.upnest.framework.helper.PageObject.PriceRangePage;
import com.upnest.framework.settings.ObjectRepo;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CompareAgentStepDfn {
	HomePage hPage;
	FindAgentPage faPage;
	PriceRangePage prPage;
	HomeSelectionPage hsPage;
	BuyProcessPage bpPage;
	LoanApprovalPage laPage;
	AgentProposalPage apPage;
	FaqPage fqPage;

	@Given("^user at the home page$")
	public void user_open_the_URL() throws Throwable {
		ObjectRepo.driver.get(ObjectRepo.reader.getWebsite());
		hPage = new HomePage(ObjectRepo.driver);
		String htitle = hPage.getHomePageTitle();
		Assert.assertEquals(ObjectRepo.reader.getHomePageTitle(), htitle);
	}

	@When("^user enter the location \"([^\\\"]*)\"$")
	public void user_enter_the_location(String searchAgent) throws Throwable {
		hPage.search_agent(searchAgent);	   
	}

	@And("^user select \"([^\"]*)\" option$")
	public void user_select_option(String option_btn) throws Throwable {
		if(option_btn.equalsIgnoreCase("BUY"))
		{
			faPage = new FindAgentPage(ObjectRepo.driver);
			String fatitle = faPage.getFindAgentPageTitle();
			Assert.assertEquals(ObjectRepo.reader.getFindAgentTitle(),fatitle);
			faPage.clickBuyButton();
		}
		if(option_btn.equalsIgnoreCase("$260K - $390K"))
		{
			prPage = new PriceRangePage(ObjectRepo.driver);
			prPage.clickPriceRangeButton();
		}
		else if(option_btn.equalsIgnoreCase("Single Family"))
		{
			hsPage = new HomeSelectionPage(ObjectRepo.driver);
			hsPage.clickFamilyOptionButton();
		}
		else if(option_btn.equalsIgnoreCase("Ready to Bid"))
		{
			bpPage = new BuyProcessPage(ObjectRepo.driver);
			bpPage.clickBidButton();
		}
		else if(option_btn.equalsIgnoreCase("Yes"))
		{
			laPage = new LoanApprovalPage(ObjectRepo.driver);
			laPage.clickYesButton();
		}
	}

	@When("^user enter Full Name \"([^\"]*)\"$")
	public void user_enter_Full_Name(String fname) throws Throwable {
		apPage = new AgentProposalPage(ObjectRepo.driver);
		apPage.setname(fname);
	}

	@When("^user enter valid email address \"([^\"]*)\"$")
	public void user_enter_valid_email(String email) throws Throwable {
		apPage = new AgentProposalPage(ObjectRepo.driver);
		apPage.setemail(email);
	}

	@Then("^user validates email address \"([^\"]*)\"$")
	public void user_validates_email(String arg1,String arg2) throws Throwable {


	}

	@When("^user enter USA phone number \"([^\"]*)\"$")
	public void user_enter_phone_no(String phno) throws Throwable {
		apPage = new AgentProposalPage(ObjectRepo.driver);
		apPage.setphonenumber(phno);
	}

	@Then("^user validates USA phone number \"([^\"]*)\"$")
	public void user_validates_phone_no(String arg1) throws Throwable {


	}

	@When("^user select the checkbox \"([^\"]*)\"  option$")
	public void user_select_checkbox_option(String check_option) throws Throwable {
		if(check_option.contains("I want"))
		{
			apPage = new AgentProposalPage(ObjectRepo.driver);
			apPage.setcheckbox();
		}
	}

	@When("^user click on \"([^\"]*)\" button$")
	public void user_click_on_button(String button) throws Throwable {
		if(button.equalsIgnoreCase("Compare Agents"))
		{
			hPage = new HomePage(ObjectRepo.driver);
			hPage.clickCompareButton();
		}
		else if(button.equalsIgnoreCase("Continue"))
		{
			apPage = new AgentProposalPage(ObjectRepo.driver);
			apPage.clickContinue();
		}
		else if(button.equalsIgnoreCase("Skip"))
		{
			fqPage = new FaqPage(ObjectRepo.driver);
			fqPage.clickSkipButton();
		}
	}

	@Then("^user validates first agent record \"([^\"]*)\"$")
	public void user_validates_agent_record(String arg1) throws Throwable {


	}

	@Then("^user confirm Phone Number$")
	public void user_confirm_phone_no() throws Throwable {


	}

	@Then("^user confirm Email Address$")
	public void user_confirm_email() throws Throwable {


	}

	@When("^user click on agent name \"([^\"]*)\"$")
	public void user_click_on_agent_name(String arg1) throws Throwable {


	}

	@Then("^user validates agent details$")
	public void user_validates_agent_details() throws Throwable {


	}

	@Then("^user Logout from the account$")
	public void user_Logout_from_the_account() throws Throwable {


	}

}
