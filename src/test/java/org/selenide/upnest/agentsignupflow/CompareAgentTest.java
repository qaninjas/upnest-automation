package org.selenide.upnest.agentsignupflow;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class CompareAgentTest {
	@Test
	public void userCanSearchAnyKeyword() {
		open("https://beta.upnest.com/re/");
		$(By.className("hero-title")).shouldHave(text("Compare Agents. Save Thousands."));
		$(By.id("buysellHeroFormLocation")).setValue("california, MD, USA");
		$(By.xpath("//input[@type='submit'][@value='Compare Agents']")).click();

		$(By.xpath("//div[@class='flow-step-header-text']/strong")).shouldHave(text("Find a Top Agent in California"));
		$(By.xpath("//div[@class='buy-or-sell-button buy-button']")).click();
		$(By.xpath("//div[@class='flow-step-header-text']/strong")).shouldHave(text("What is your price range?"));
		$(By.xpath("//*[@id='price-ranges-div']/div[3]")).click();
		$(By.xpath("//div[@class='flow-step-header-text']/strong")).shouldHave(text("What kind of home are you looking to buy in California?"));
		$(By.cssSelector("div[class='choice-button buy-home-type-button']")).click();
	}
}
