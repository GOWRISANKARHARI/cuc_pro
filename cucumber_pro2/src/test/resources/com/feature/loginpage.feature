Feature: Login Feature for SauceDemo
  I want to use this feature to test the Login feature for SauceDemo Web application  

  @ValidCredentials
  Scenario Outline: To test Login feature using valid credentials
    Given I am in the SauceDemo login page
    When user provides username as "<username>" and password as "<password>"
    And user clicks the login button
    Then user will see the DashboardText in the page

    Examples:
    | username       | password    |
    |standard_user  |secret_sauce |

  @InValidCredentials
  Scenario Outline: To test Login feature using invalid credentials
    Given I am in the SauceDemo login page
    When user provides username as "<username>" and password as "<password>"
    And user clicks the login button
    Then user will see an "<errorMessage>"

    Examples:
    | username        | password     | errorMessage                                           |
    | standard_user   |              | Password is required                                   |
    |                | secret_sauce  | Username is required                                   |
    | demoUser        | DemoPass     | Username and password do not match any user in this service |