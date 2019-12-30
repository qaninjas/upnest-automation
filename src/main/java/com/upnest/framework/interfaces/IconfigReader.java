
package com.upnest.framework.interfaces;

import com.upnest.framework.configuration.browser.BrowserType;

/**
 * @author krana
 *
 */
public interface IconfigReader {
	public String getUserName();
	public String getPassword();
	public String getWebsite();
	public int getPageLoadTimeOut();
	public int getImplicitWait();
	public int getExplicitWait();
	public BrowserType getBrowser();
}
