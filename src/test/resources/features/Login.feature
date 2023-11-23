Feature: Verify HomePage
 
 
@Regression   @abc  @TC_01
Scenario: Verify LoginPage with Valid Credentials
 Given Open url and start application
 When User enters UserName and Password
 And  Message displayed Login Successfully
 Then User LogOut from the Application
 Then Message displayed LogOut Successfully