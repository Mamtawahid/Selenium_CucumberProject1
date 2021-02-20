Feature: Adding Credit Cards

  Scenario: User can add up to three credit cards

    When I click on sign in button
    And I enter 'Wmw@gmail.com' as my email for signIn
    And  I click on continueButton
    And  I enter '12345ff' as my password for signIn
    And  I click on signIn button
    And  I minimize bar
    And  I minimize the message
    And  I click on My account
    And I click on add a card
    And I enter '3456547654435432' as card 1
    And  I select '03' as month
    And  I select year '2023' as year
    And  I enter '111' as security code
    And  I enter 'mmm' as first name
    And  I enter 'www' as ;ast name
    And  I enter '2278 Holland Ave' as address1
    And  I enter 'Apt#179' as address2
    And  I enter '10467' as zip code
    And  I enter '3333333333' as cell no
    And  I click save
         And I click on add a card
         And I enter '4455565555666666' as card 1
        And  I select '05' as month
         And  I select year '2023' as year
         And  I enter '111' as security code
         And  I enter 'mmm' as first name
         And  I enter 'www' as ;ast name
        And  I enter '2278 Holland Ave' as address1
        And  I enter 'Apt#179' as address2
       And  I enter '10467' as zip code
       And  I enter '3333333333' as cell no
         And  I click save
    And I click on add a card
    And I enter '432456789078646' as card 1
    And  I select '09' as month
    And  I select year '2023' as year
    And  I enter '111' as security code
    And  I enter 'mmm' as first name
    And  I enter 'www' as ;ast name
    And  I enter '2278 Holland Ave' as address1
    And  I enter 'Apt#179' as address2
    And  I enter '10467' as zip code
    And  I enter '3333333333' as cell no
    And  I click save