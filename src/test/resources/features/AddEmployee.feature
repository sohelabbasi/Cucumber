Feature: Add employee

Background:
  When user enters valid login username and password
  And user clicks on login button
  When user click on PIM option
  And user clicks on add employee option

  @employee
  Scenario: Adding employee normally
    And user enters firstname middlename and lastname
    And user clicks on save button
    Then employee added successfully


  @test
  Scenario: Adding employee normally
    And user enters "mike" "ms" "molton" values
    And user clicks on save button
    Then employee added successfully

  @datadriven
  Scenario Outline: Adding employee normally
    And user enters "<firstname>" "<midddlename>" and "<lastName>" values
    And user clicks on save button
    Then employee added successfully
    Examples:
    |firstname|midddlename|lastName|
    |anny    |MS        |reston  |
    |eleni   |MS        |abc     |
    |sule    |MS        |ozdemir |

@excel
Scenario: Adding multiple employees from excel file
  When user add multiple employees from excel file using "EmployeeData" sheet

