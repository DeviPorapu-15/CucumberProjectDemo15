Feature: User Login feature
#Scenario: Valid Login
#Given User is on Login Page
#When User enters credentials
#Then Should display Success Msg

#Scenario: Valid Login
#Given User is on Login Page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then Should display Success Msg

#Scenario: Valid Login
#Given User is on Login Page
#When User enters "<username>" and "<password>"
#Then Should display Success Msg
#
#Examples:
  #| username | password |
  #| tomsmith | SuperSecretPassword! |
  #| testuser1 | welcome123 |
  #| testuser2 | welcome123 |

Scenario: Valid Login
Given User is on Login Page
When User enters credentials
   | tomsmith | SuperSecretPassword! |
   | testuser1 | welcome123 |
   
Then Should display Success Msg

  
  
