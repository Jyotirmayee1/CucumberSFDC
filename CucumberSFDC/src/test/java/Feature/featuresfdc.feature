Feature: Test Sfdc Application

 Background: lunch the browser and login the sfdc
    Given : lunch of browser and enter the sfdc url
    When : enter the valid name and password
    Then : sfdc application homepage display

     Scenario: login with invalid credential
    Given :username and password given
    When : enter the invalid name and password
    Then : sfdc application does not open homepage
    
      Scenario: check forgot password
    Given : only username given
    When : enter the valid name 
    Then :click on the forgot password 
    Then : neviagate to forgot password page