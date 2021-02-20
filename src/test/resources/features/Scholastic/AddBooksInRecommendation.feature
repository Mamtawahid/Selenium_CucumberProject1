Feature: Add books from recommendation

  Scenario: teacher can add books from recommendation list

    When I click on sign in button
    And I enter 'Wmw@gmail.com' as my email for signIn
    And  I click on continueButton
    And  I enter '12345ff' as my password for signIn
    And  I click on signIn button
    And  I minimize bar
    And  I minimize the message
    #And  I click on my list
    #And  I select recommendation for students
    And  I search by 'Harry'
    And  I click on searchbutton
    And  I click on quick look
    And  I click on recommend
    Then I verify that the item is added on student list unde My list
