Feature: Test PIM functionality of OrangeHRM application

  Background: 
    Given User is in OrangeHRM login page
    And logged in with valid credentional
    And click on PIM link

  Scenario Outline: Verify PIM creation
    When Click on "+Add" button
    And enter firstname as <firstName>, lastname as <lastName> and empId as <empId>
    And click on "Save button"
    And From the left panner click on PIM link
    And Enter created Employee ID in Employee Id input field
    And click on Search button
    Then Validate Employee Details are <firstName>,<lastName> and <empId>

    Examples: 
      | firstName | lastName | empId |
      | QA        | Tester   |  1003 |

  Scenario: Verify PIM modification

  Scenario: Verify PIM deletion
