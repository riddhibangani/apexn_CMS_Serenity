@login
Feature: Ability to check the CMS login by Admin user

 

  #@negative
  #Scenario: Login unsuccessfully to CMS
    #Given user is on CMS login page at "https://qa.apexcms.waracle.dev/login"
    #When user enters username as "webmaster@waracle.com" and password as "onw53oUbwb1Ol1"
    #And clicks on login button
    #Then user is navigated to home page with page title as "APEX - Login"
    #And close the browser
#
    #Examples: 
      #| email                 | password       |
      #| webmaster@waracle.com | onw53oUbwb1Ol3 |
      #| webmaster@waracle.com | onw53oUbwb1Ol2 |

      
      #@config
  #Scenario: Login successfully to CMS
    #Given user is on CMS login page
    #When user enters username as and password
    #And clicks on login button
    #Then user is navigated to home page with page title as "APEX - Login"
    #And close the browser
    #
   
   
    Scenario: Login successfully to CMS
   	Given user is on CMS login page
    When user enters username as and password
    And clicks on login button
    Then user is navigated to home page with page title