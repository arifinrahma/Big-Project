@Cicle @Chat
Feature: Chat Feature
  As User I want send a message

  @PositiveChat
  @Test1
  Scenario: Send message in group chat
    Given user already in home cicle app
    When user click sekolah qa17
    And user click group chat
    When User send "halo"
    And  user click send
    Then Last message is "halo"
  @PositiveChat
  @Test2
  Scenario: delete message in group chat
    Given user already in home cicle app
    When user click sekolah qa17
    And user click group chat
    When User send "halo"
    And  user click send
    And User click last message
    And User click delate button
    And User click OK
    Then user can see alert hapus
  @PositiveChat
  @Test3
  Scenario: Copy message in group chat
    Given user already in home cicle app
    When user click sekolah qa17
    And user click group chat
    When User send "halo"
    And  user click send
    And User click last message
    And user click copy button
    Then user can see alert "copy text to clipboard"
  @PositiveChat
  @Test4
  Scenario: Send Photo in Group chat
    Given user already in home cicle app
    When user click sekolah qa17
    And user click group chat
    And Click attach file
    And User Click Image from Galery
    And User choose file
    Then image is show and sent

  @PositiveChat
  @Test5
  Scenario: Send private message
    Given user already in home cicle app
    When user click sekolah qa17
    And user click menu button
    And user click inbox button
    And user click add new message button
    And user type "lulu" in search name bar
    And User click lulu name
    And User send "halo"
    And  user click send
    Then Last message is "halo"

    @NegativeChat
    @Test6
    Scenario: space message send
      Given user already in home cicle app
      When user click sekolah qa17
      And user click group chat
      When User send " "
      And  user click send
      Then Last message is " "
  @NegativeChat
  @Test7
    Scenario: input member email
      Given user already in home cicle app
      When user click sekolah qa17
      And user click group chat
      When User send "workbusiness5858@gmail.com"
      And  user click send
      Then last message is member id
  @NegativeChat
  @Test8
  Scenario: add message and member without space
    Given user already in home cicle app
    When user click sekolah qa17
    And user click group chat
    When User send "halo"
    And user click add member button
    And user click karunia
    And  user click send
    Then Last message is "haloworkbusiness5858@gmail.com"
  @NegativeChat
  @Test9
  Scenario: double send add member user
    Given user already in home cicle app
    When user click sekolah qa17
    And user click group chat
    And user click type message bar
    And user click add member button
    And user click karunia
    And user click add member button
    And user click karunia
    And click send message button
    Then member is not added message show email "workbusiness5858@gmail.comworkbusiness5858@gmail.com"
  @NegativeChat
  @Test10
  Scenario: input wrong mamber name
    Given user already in home cicle app
    When user click sekolah qa17
    And user click menu button
    And user click inbox button
    And user click add new message button
    And user type wrong member name "lululululu" in search name bar
    Then use see message "Company Members member not found"







