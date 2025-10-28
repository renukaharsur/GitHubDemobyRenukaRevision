Feature: Application Login

Background:
Given clear the data
When launch the broswer 
And hit the page url


@SmokeTest
Scenario: Admin Page default login

Given User is on NetBanking landing page
When User login into application with admin and password 1234
Then Home Page is displayed
And Cards are displayed

#Reusable
@SmokeTest  @RegressionTest
Scenario: user Page default login

Given User is on NetBanking landing page
When User login into application with user and password 4567
Then Home Page is displayed
And Cards are displayed

@MobileTest
Scenario Outline: mobileuser Page default login

Given User is on NetBanking landing page
When User login into application with <username> and password <password> 
Then Home Page is displayed
And Cards are displayed

Examples:
 |username  | password   |
 |debituser |hello       |
 |credituser|hello123    |
 
 @SmokeTest
 Scenario: user Page default signup

Given User is on practice landing page
When User login into application 
 |renuka  |
 |harsr |
 |renuka@gmail.com|
 |96790655|
Then Home Page is displayed
And Cards are displayed


@RegressionTest
Scenario: any user Page default login

Given User is on NetBanking landing page
When User login into application with anyuser and password 456789
Then Home Page is displayed
And Cards are displayed
 