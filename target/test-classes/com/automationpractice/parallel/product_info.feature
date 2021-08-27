Feature: Verify product information

  Scenario: Verify product name
    Given I am on homepage
    When I click on Blouse
    Then The product name should be Blouse in the product page

  Scenario: Verify product name using parametrization
    Given I am on homepage
    When I click on "Printed Dress"
    Then The product name should be correct

  Scenario: Verify product quantity
    Given I am on homepage
    When I click on "Faded Short Sleeve T-shirts"
    Then The product quantity should be 1
    And The product price should be 16.51

  
  Scenario: Verify plus minus button
    Given I am on homepage
    When I click on 'Faded Short Sleeve T-shirts'
    And I click on plus button 5 times
    Then The quantity should be correct
    When I click on minus button 2 times
    Then The quantity should be correct

  Scenario: Verify product details
    Given I am on homepage
    When I click on 'Faded Short Sleeve T-shirts'
    Then The product details should be the following
      | Product name                | Model  | Condition | Price | Quantity | Size |
      | Faded Short Sleeve T-shirts | demo_1 | New       | 16.51 |        1 | S    |

  Scenario: Verify product details using cucumber custom type
    Given I am on homepage
    When I click on 'Faded Short Sleeve T-shirts'
    Then The product details should be the following using custom type
      | Product name                | Model  | Condition | Price | Quantity | Size |
      | Faded Short Sleeve T-shirts | demo_1 | New       | 16.51 |        1 | S    |


  Scenario Outline: Verify multiple produc info
    Given I am on homepage
    When I click on "<name>"
    Then product name should be "<name>"
    And product price should be <price>

    Examples: 
      | name                        | price |
      | Faded Short Sleeve T-shirts | 16.51 |
      | Blouse                      | 27.00 |
      | Printed Dress               | 26.00 |
      | Printed Summer Dress        | 28.98 |
      | Printed Chiffon Dress       | 16.40 |
