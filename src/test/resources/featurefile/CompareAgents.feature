Feature: Compare Agents of the web page

  @chrome
  Scenario: Compare agent for buy option
  
		Given user at the home page
   	When user enter the location "california, MD, USA"
		And user click on "Compare Agents" button
		
		And user select "BUY" option
		And user select "$260K - $390K" option
		And user select "Single Family" option
		And user select "Ready to Bid" option
		And user select "Yes" option
		
		When user enter Full Name "Kalpesh Tank"
		When user enter valid email address "auto_kalpesh@dayrep.com"
		When user enter USA phone number "(800) 477-1477"
		When user select the checkbox "I want agents to ...."  option
		And user click on "Continue" button
		
		And user click on "Yes" in chat screen
		And user click on "Skip" button
		And user click on "Skip" button
		And user click on "Skip" button
#
#		
#		Then user validates first agent record "Sample Proposal"
#		Then user validates email address "auto_kalpesh@dayrep.com"
#		Then user validates USA phone number "(800) 477-1477"
#		And user click on agent name "john Smith"
#		Then user validates agent details
#		And user click on "logout" button