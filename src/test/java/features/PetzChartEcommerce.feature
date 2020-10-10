Feature: Petz Chart E-commerce
  Adding some products to the chart and removing them through the automation

  Background:
    Given I access the Petz ecommerce
    Then I verify the log in or sign up link
    When I click on Login or Sign Up link
    And I select the Login option
    Then I can see the Login Page

  Scenario Outline: Add and remove products from the chart
    Given I fill out email field with 732.691.021-94
    And I fill out senha field with 1234qwer value
    And I sign into my Petz account
    Then I verify that I'm logged in 'Matheus' Petz account
    Given I search for <item> product
    When I select the <size> for the product
    And I verify it's available on the stock
    And I add the product to my chart
    Then I verify that I can see my chart and the <item> with <size> is added
    When I remove the product from my chart
    Then I verify that my chart is empty

    Examples:
    |item                                         | size    |
    |Ração Royal Canin Maxi - Cães Adultos - 15kg |15kg     |
    |Coleira Petz Azul para Cães                  |Tamanho G|
    |Brinquedo Mordedor Petgames para Cães Azul   |Tamanho G|