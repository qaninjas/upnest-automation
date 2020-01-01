/**
 * @author krana
 *	
 */
package com.cucumber.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"classpath:featurefile/CompareAgents.feature"}, 
				glue = {"classpath:com.upnest.framework.stepdefinition",
		                "classpath:com.upnest.framework.helper" }, 
				plugin = { "pretty","json:target/CompareAgentsRunner.json" })
public class CompareAgentRunner extends AbstractTestNGCucumberTests {
}
