Feature: Sign Up and Login E-commerce account
  Signing up for a new account and logging into some existent accounts

    Scenario Outline: Create an account to sign in and then sign out
      Given I access the Petz ecommerce
      Then I verify the log in or sign up link
      When I click on Login or Sign Up link
      And I select the Cadastre-se option
      Then I can see the new customer page
      When I fill out Nome field with <Name> value
      And I fill out Email field with <Email> value
      And I fill out DDD and Phone with <DDD> and <Cellphone> values
      And I select the <Gender> gender option
      And I fill out dataNascimento field with <BirthDate> value
      And I fill out CPF-CNPJ field with <CPF-CNPJ> value
      And I fill out Senha field with <Senha> value
      And I fill out confirmasenha field with <Senha> value
      And I create the account
      Then I verify that the account is created
      When I click on Entendi
      Then I verify that I'm logged in '<userName>' Petz account

      Examples:
      |Name                      |Email                               |DDD|Cellphone |Gender   |BirthDate |CPF-CNPJ       |Senha   |userName|
      |Nicolash Barbosa Rodrigues|nicolashBarbosaRodrigues@armyspy.com|19 |97674-4249|Masculino|30/06/1982|715.655.836-63 |pswd1234|Nicolash|
      |Carolina Dias Melo        |carolinaDiasMelo@rhyta.com          |14 |3328-7787 |Feminino |22/12/1962|576.205.002-51 |pswd1234|Carolina|
      |Emilly Dias Sousa         |emillyDiasSousa@rhyta.com           |81 |98028-6339|Feminino |08/07/1994|740.495.114-36 |pswd1234|Emilly  |

    Scenario Outline: Log in with an existent account
      Given I access the Petz ecommerce
      Then I verify the log in or sign up link
      When I click on Login or Sign Up link
      And I select the Login option
      Then I can see the Login Page
      When I fill out email field with <emailOrCPF>
      And I fill out senha field with <senha> value
      And I sign into my Petz account
      Then I verify that I'm logged in '<userName>' Petz account

      Examples:
      |emailOrCPF    |senha   |userName|
      |732.691.021-94|1234qwer|Matheus |
      |362.660.693-77|1234qwer|Felipe  |


