package org.selenide.upnest.mainhomepage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.conditions.Visible;
import com.codeborne.selenide.Selenide;

public class MainHomePage {
	@Test
	public void CheckLinksClickable() {
		//Open URL
		open("https://beta.upnest.com/re/");
		// click on "How It Works" link
		$(By.linkText("How It Works")).click();
		// Verify that "How It works" link is clickable
		$(By.className("section-title")).shouldHave(text("How our free service works"));
		// click on "Agent Signup" link
		$(By.linkText("Agent Signup")).click();
		// Verify that "Agent Signup" link is clickable
		$(By.className("section-title")).shouldHave(text("Why join UpNest’s partner network?"));
		// click on "Tips" link
		$(By.linkText("Tips")).click();
		// Verify that "Tips" link is clickable
		$(By.className("penci-page-header-title")).shouldHave(text("Tips and Resources"));
		// click on "More" dropdown
		boolean more_link_status = $(By.linkText("More")).isDisplayed();
		Assert.assertTrue(more_link_status);
		// Verify that "More" link options
		$(By.linkText("More")).hover();
		try {
			List<WebElement> sub_options = $(By.xpath("//ul[@class='sub-menu']")).findElements(By.tagName("a"));
			int sub_options_count = sub_options.size();
			System.out.println("More Options' sub options are: "+sub_options_count);
			Assert.assertSame(5, sub_options_count);
			for (WebElement pagelink : sub_options)
			{
				String linktext = pagelink.getText();
				String link = pagelink.getAttribute("href"); 
				System.out.print(linktext+" ->");
				System.out.println(link);
				
			}
		}catch (Exception e){
			System.out.println("error "+e);
		}

	}
}
