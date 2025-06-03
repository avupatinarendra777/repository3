Feature: Create skills Record Automation in orange HRM

Background: Common Steps
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"


Scenario: TC01 Add skills Record
		And User enters username as "Admin" and password as "admin123"
    Then Navigate to skills Page
    When Add skills Records with sname as "life" and sdescr as "life2" 
    When Click on logout button
    Then Close Browser
