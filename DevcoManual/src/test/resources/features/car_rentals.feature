#author: Sara Victoria Padilla

Feature: Car rentals
  As a user, I need to rent a car

  @manual-result:passed
    @RentACar
  Scenario Outline: rent a car  successful
    Given the user is in the main page
    And  he select the <option>
    When he select the <pickup> location
    And  he select the <date>
    And  he select the <return>
    And  he click in the <button>
    Then You can see the different options to choose from
    Examples:
      | option      | pickup   | date          | return        | button |
      | Car rentals | Medellin | Agust 24 2021 | Agust 31 2021 | search |


  @manual-result:passed
    @CRentAcardWithoutPikup
  Scenario Outline: rent a car without a pickup locqation
    Given the user is in the main page
    And  he select the <option>
    When   he select the <date>
    And  he select the <return>
    And  he click in the <button>
    Then You can see the <message>
    Examples:
      | option      | date          | return        | button | message                 |
      | Car rentals | Agust 24 2021 | Agust 31 2021 | search | Enter a pickup location |


  @manual-result:passed
    @RentACarDriver
  Scenario Outline: rent a car by selecting the age of the driver
    Given the user is in the main page
    And  he select the <option>
    When he select the <pickup> location
    And  he select the <date>
    And  he select the <return>
    And  he select the <driverEge>

    And  he click in the <button>
    Then You can see the different options to choose from
    Examples:
      | option      | date          | return        | button | driverEge |
      | Car rentals | Agust 24 2021 | Agust 31 2021 | search | 25        |
