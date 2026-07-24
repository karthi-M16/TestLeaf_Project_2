Feature: verify leads leafTaps Application

Scenario Outline: Create lead

When enter the username 'Democsr2'
When enter the password 'crmsfa'
And click on the login button
When click crmsfa button
Then dashboard is displayed
When click on myLead button
And click on createLead button
When enter the company name <companyName>
When enter the first name <firstName>
When enter the last name <lastName>
And click on submit button
Then viewlead page displayed

Examples:
|companyName|firstName|lastName|
|das&co|Antony|das|
|das&co|Harold|das|
|das&co|Leo|das|
