package org.selenide.upnest.agentsignupflow;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codeborne.selenide.Condition;

public class AgentSignUpFlow_T301_1 {
	@Test
	public void newAgentSignUpFailedMessage() {
		//Open URL
		open("https://beta.upnest.com/re/");
		//Verify HomePage Text
		$(By.className("hero-title")).shouldHave(text("Compare Agents. Save Thousands."));
		//Click Login
		$(By.linkText("Login")).click();
		$(By.className("hero-title")).shouldHave(text("Welcome to UpNest."));
		//Click SignUp
		$(By.linkText("Sign up")).click();
		$(By.tagName("h4")).shouldHave(text("I am ..."));

		//Click on Agent
		$(By.xpath("//a[@data-client-type='agent']")).click();
		$(By.className("footnote")).shouldHave(text("your license and transactions"));

		//randomize agentname with auto prefix 
		String name = RandomStringUtils.randomAlphabetic(6);
		String auto_agent = "auto "+name;
		$(By.name("name")).sendKeys(auto_agent);
		//Enter agent License
		$(By.name("licenseDate")).sendKeys("2012");
		//Enter Zipcode
		$(By.name("city")).sendKeys("94203");
		//Enter transactions 
		$(By.name("pastTwelveMonthsTx")).sendKeys("12");
		//Press Next
		$(By.xpath("//input[@value='Next']")).click();

		$(By.className("clickable")).shouldHave(text(auto_agent));
		
		//Fill out registration form
		//Name is filled from previous step;enter email
		String emailID = "auto"+name+"@dayrep.com";
		$(By.id("email")).sendKeys(emailID);
		$(By.id("email")).sendKeys(Keys.TAB);
		$(By.id("password")).shouldBe(Condition.enabled).sendKeys("Passw0rd");
		$(By.id("password")).sendKeys(Keys.TAB);
		$(By.name("phone")).sendKeys("6464007658");
		//sample code will be recieved at https://receive-smss.com/sms/16464007658/
		$(By.className("send-code-button")).click();
		$(By.name("code")).sendKeys("696948");
		$(By.xpath("//input[@value='Create Account']")).click();
		$(By.id("customPopupDiv")).shouldHave(text("Sorry, the verification code that you've entered"));
		$(By.xpath("//a[@onclick='disablePopup()']")).click();


		

		



		


		
	}
}
