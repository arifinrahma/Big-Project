@Cicle @Board
Feature: User want to add new board


  @PositiveBoard

  @Test21
  Scenario: add new list
    Given user already in home cicle app
    When user click sekolah qa17
    And user click board
    And user click add new board button
    And user type new name board
    And user click submit
    Then user can see new boar is made
  @PositiveBoard
  @Test22
  Scenario: add new card in Guidance board
    Given user already in home cicle app
    When user click sekolah qa17
    And user click board
    And user click add new card
    And user fill yorcard name by "testing"
    And user click checklist button
    Then user can see that new card is made
  @PositiveBoard
  @Test23
  Scenario: archive list
    Given user already in home cicle app
    When user click sekolah qa17
    And user click board
    And user click add new board button
    And user type new name board
    And user click submit
    And user click right button in list
    And user click archive list
    Then shown list been moved to archive list
  @PositiveBoard
  @Test24
  Scenario: set private
    Given user already in home cicle app
    When user click sekolah qa17
    And user click board
    And user click add new card
    And user fill yorcard name by "testing"
    And user switch private card button
    And user click checklist button
    Then user can see that new card is made
  @PositiveBoard
  @Test25
  Scenario: edit title card
    Given user already in home cicle app
    When user click sekolah qa17
    And user click board
    And user click add new card
    And user fill yorcard name by "testing"
    And user click checklist button
    And user click edit card
    And user click edit name card by adding "last"
    Then user see alert update "update title success"


    @NegativeBoard

    @Test26
    Scenario: add new list by symbol
      Given user already in home cicle app
      When user click sekolah qa17
      And user click board
      And user click add new board button
      And user type new name board with symbol "@#$%&+"
      And user click submit
      Then user can see new boar is made

      @Test27
    Scenario: add new card in Guidance board with symbol
      Given user already in home cicle app
      When user click sekolah qa17
      And user click board
      And user click add new card
      And user fill your card name by symbol "!@#$%"
      And user click checklist button
      Then user can see that new card is made

      @Test28
    Scenario: edit title card
      Given user already in home cicle app
      When user click sekolah qa17
      And user click board
      And user click add new card
      And user fill yorcard name by "testing"
      And user click checklist button
      And user click edit card
      And user click edit name card by adding "testing"
      Then alert will not update


#    Scenario: fill card comment by number page and space
#      Given user already in home cicle app
#      When user click sekolah qa17
#      And user click board
#      And user click add new card
#      And user fill your card name by symbol "testing"
#      And user click checklist button
#      And user click edit card
#      And user click comment card bar
#      And user fill click page number
#      And user fill card comment with "  "
#      And user click submit comment
#      Then user can see alert message "comments can't be empty"

  @Test29
  Scenario: empty card comment
    Given user already in home cicle app
    When user click sekolah qa17
    And user click board
    And user click add new card
    And user fill your card name by symbol "!@#$%"
    And user click checklist button
    And user click edit card
    And user click comment card bar
    And user fill card comment with "  "
    And user click submit comment
    Then user can see alert message "comments can't be empty"













