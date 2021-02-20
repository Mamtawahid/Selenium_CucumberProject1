Feature: Create a new Teacher Account in nonTaxable State

  Scenario: User can create a new teacher account in nontaxable state using zip code


    When I click on create an account
    And  I select Teacher/Administrator
    And  I click on next1 button
    And  I select Mr. as title
    And  I enter 'lk' as first name
    And  I enter 'chu' as last name
    And  I enter 'xk9po@gmail.com' as my email
    And  I enter 'ab12345' as my password
    And  I enter '776-515-6788' as mobile number
    And  I checked terms and conditions
    And  I click on next button
    And  I enter '99518' as zip code
    And  I click search button
    And  I select school 'ADAK SCHOOL'
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

