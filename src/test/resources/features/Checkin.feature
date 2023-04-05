@Cicle @Checkin
Feature: Ckehin Feature
  As User I want send

  @PositiveCheckIn

  @Test31
  Scenario: add a new checkin
    Given user already in home cicle app
    When user click sekolah qa17
    And user click Checkin
    And user click plus button
    And user fill type question here bar "testing"
    And click monday button
    And click set time
    And User click OK in select time
    And user click start collecting answer bar
    Then user see that checkin is made

  @Test32 @PositiveCheckIn
  Scenario: add a new checkin private
    Given user already in home cicle app
    When user click sekolah qa17
    And user click Checkin
    And user click plus button
    And user fill type question here bar "testing"
    And click monday button
    And click set time
    And User click OK in select time
    And user click private
    And user click start collecting answer bar
    Then user see that checkin is made

  @Test33 @PositiveCheckIn
  Scenario: comment checkin
    Given user already in home cicle app
    When user click sekolah qa17
    And user click Checkin
    And user click plus button
    And user fill type question here bar "testing"
    And click monday button
    And click set time
    And User click OK in select time
    And user click start collecting answer bar
    And user click "testing" check in
    And user click add new comment
    And user fill add new comment bar "testing"
    And user click submit comment
    Then user can see that comment "tetsing" is made

  @Test34 @PositiveCheckIn
  Scenario: add member in comment
    Given user already in home cicle app
    When user click sekolah qa17
    And user click Checkin
    And user click plus button
    And user fill type question here bar "testing"
    And click monday button
    And click set time
    And User click OK in select time
    And user click start collecting answer bar
    And user click "testing" check in
    And user click add new comment
    And user click add member button in check in
    And user click karunia
    And user click submit comment
    Then user can see that comment is made with "Karunia" tag

#  @Test35
#  Scenario: add all member in comment
#    Given user already in home cicle app
#    When user click sekolah qa17
#    And user click Checkin
#    And user click plus button
#    And user fill type question here bar "testing"
#    And click monday button
#    And click set time
#    And User click OK in select time
#    And user click start collecting answer bar
#    And user click "testing" check in
#    And user click add new comment
#    And user click add member button
#    And user click mention all button
#    And user click OK in alert
#    And user click submit comment
##    Then user can see that comment is made with all member tag

  @Test35 @PositiveCheckIn
  Scenario: type  bold type in comment
    Given user already in home cicle app
    When user click sekolah qa17
    And user click Checkin
    And user click plus button
    And user fill type question here bar "testing"
    And click monday button
    And click set time
    And User click OK in select time
    And user click start collecting answer bar
    And user click "testing" check in
    And user click add new comment
    And user click bold button
    And user fill "testing" bold comment
    And user click submit comment
    Then user can see that comment is made with "karunia" tag



  @NegativeCheckIn
    @Test37
  Scenario: add a new checkin witout type question
    Given user already in home cicle app
    When user click sekolah qa17
    And user click Checkin
    And user click plus button
    And user click start collecting answer bar
    Then user see alert need to fill question


  @Test38 @NegativeCheckIn
  Scenario: add a new checkin without date
    Given user already in home cicle app
    When user click sekolah qa17
    And user click Checkin
    And user click plus button
    And user fill type question here bar "testing"
    And user click screen
    And user click start collecting answer bar
    Then user see alert need to fill

  @Test39 @NegativeCheckIn
  Scenario: add a new checkin without time
    Given user already in home cicle app
    When user click sekolah qa17
    And user click Checkin
    And user click plus button
    And  user fill type question here bar "testing"
    And click monday button
    And user click screen
    And user click start collecting answer bar
    Then  user see aler need to fill time

    @Test40 @NegativeCheckIn
    Scenario: comment checkin empty
      Given user already in home cicle app
      When user click sekolah qa17
      And user click Checkin
      And user click plus button
      And user fill type question here bar "testing"
      And click monday button
      And click set time
      And User click OK in select time
      And user click start collecting answer bar
      And user click "testing" check in
      And user click add new comment
      And user click submit comment
      Then user see alert "comments can't be empty"




