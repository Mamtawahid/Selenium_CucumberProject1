@regression
Feature: Create a new acc using school search

  Scenario: User can create a new account in taxable state using school search

    When I click on create an account
    And  I select Teacher/Administrator
    And  I click on next1 button
    And  I select Mr. as title
    And  I enter 'xa' as first name
    And  I enter 'my' as last name
    And  I enter 'lkjjh@gmail.com' as my email
    And  I enter 'ab12345' as my password
    And  I enter '7183094323' as mobile number
    And  I checked terms and conditions
    And  I click on next button
    And  I select 'New York' as school state
    And  I select New York as school city
    And  I click on search button
    And  I select school 'Scholastic+book+clubs'
    And  I click on next button
    And  I select 'Teacher (by Grade)' as role
    And  I select 1st as Grade
    And  I select '10' as number of student
    And  I click on next button
    And  I select GRL as preferred reading level
    And  I click on continue to site button
    And  I minimize bar

    Then I verify class same class code is present on home page as well as on My account page
    Then I verify Teacher Name is displayed as expected
    Then I verify School address is selected as expected

