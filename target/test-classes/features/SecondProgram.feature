Feature: Application Login

Background:
When launch the broswer 
And hit the page url


#Reusable
@SmokeTest  @NetBanking
Scenario: user Page default login

Given User is on NetBanking landing page
When User login into application with user and password 4567
Then Home Page is displayed
And Cards are displayed

@SmokeTest  @RegressionTest @Mortgage
Scenario Outline: mortgagae user Page default login

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
 