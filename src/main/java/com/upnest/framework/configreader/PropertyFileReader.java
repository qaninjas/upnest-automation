package com.upnest.framework.configreader;

import java.util.Properties;

import org.apache.log4j.Level;

import com.upnest.framework.configuration.browser.BrowserType;
import com.upnest.framework.interfaces.IconfigReader;
import com.upnest.framework.utility.ResourceHelper;


/**
 * @author krana
 */
public class PropertyFileReader implements IconfigReader {
	
	private Properties prop = null;

	public PropertyFileReader() {
		prop = new Properties();
		try {
			prop.load(ResourceHelper
					.getResourcePathInputStream("configfile/"
							+ "config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*public PropertyFileReader(String fileName) {

		prop = new Properties();
		try {
			prop.load(ResourceHelper
					.getResourcePathInputStream("configfile/"
							+ fileName));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	public String getUserName() {
		return prop.getProperty("Username");
	}

	public String getPassword() {
		return prop.getProperty("Password");
	}

	public String getWebsite() {
		return prop.getProperty("Website");
	}

	public int getPageLoadTimeOut() {
		return Integer.parseInt(prop.getProperty("PageLoadTimeOut"));
	}

	public int getImplicitWait() {
		return Integer.parseInt(prop.getProperty("ImplcitWait"));
	}

	public int getExplicitWait() {
		return Integer.parseInt(prop.getProperty("ExplicitWait"));
	}
	
	public String getDbType() {
		return prop.getProperty("DataBase.Type");
	}
	
	public String getHomePageTitle() {
		return prop.getProperty("HomePageTitle");
	}
	
	 
	public String getFindAgentTitle() {		 
		return prop.getProperty("FindAgentTitle");
	}

	 
	public String getHomeSelectionTitle() {
		return prop.getProperty("HomeSelectionTitle");
	}

	 
	public String getFaqPageTitle() {
		return prop.getProperty("FaqPageTitle");
	}

	 
	public String getAgentProposalTitle() {
		return prop.getProperty("AgentProposalTitle");
	}

 
	public String getBuyProcessTitle() {
		return prop.getProperty("BuyProcessTitle");
	}

	 
	public String getLoanApprovalTitle() {
		return prop.getProperty("LoanApprovalTitle");
	}

	 
	public String getPriceRangeTitle() {
		return prop.getProperty("PriceRangeTitle");
	}
	

	public String getDbConnStr() {
		return prop.getProperty("DtaBase.ConnectionStr");
	}

	public BrowserType getBrowser() {
		return BrowserType.valueOf(prop.getProperty("Browser"));
	}
	
	public Level getLoggerLevel() {
		
		switch (prop.getProperty("Logger.Level")) {
		
		case "DEBUG":
			return Level.DEBUG;
		case "INFO":
			return Level.INFO;
		case "WARN":
			return Level.WARN;
		case "ERROR":
			return Level.ERROR;
		case "FATAL":
			return Level.FATAL;
		}
		return Level.ALL;
	}

}
