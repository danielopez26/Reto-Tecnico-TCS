#EN
@Tag
Feature: The user registers and adds to the shopping cart
  @CreatedUser
  Scenario Outline: Register user in Advantage
    Given The user enters to the page
    When create new account
      |<userName>|<email>|<password>|<firstName>|<lastName>|<phoneNumber>|<country>|<city>|<address>|<state>|<postalCode>|
    Then verify account
    Examples:
      |userName|email|password|firstName|lastName|phoneNumber|country|city|address|state|postalCode|
      |Daniel21|daniel.26@yopmail.com|1234ABCd|Daniel|Lopez|12345678|Argentina|Buenos aires|Calle 32|Budge|661020|


  @SignIn
  Scenario Outline: Sign in Advantage
    Given The user enters to the page
    When sing in
      |<userName>|<password>|
    And see my account
    Then verify account
    Examples:
      |userName|password|
      |Daniel21|1234ABCd|

  @RegisterFormContact
  Scenario Outline: Fill up contact form
    Given The user enters to the page
    When sing in
      |<userName>|<password>|
    And see my account
    And edit account details
      |<firstName>|<lastName>|<phoneNumber>|<country>|<city>|<address>|<state>|<postalCode>|
    Then account details verify <address>
    Examples:
      |userName|password|firstName|lastName|phoneNumber|country|city|address|state|postalCode|
      |Daniel21|1234ABCd|Daniel|Lop|2343454|United Kingdom|La plata|Obelisco|De mar|661015|

  @AddProduct
  Scenario Outline: Add product
    Given The user enters to the page
    When sing in
      |<userName>|<password>|
    And add product of speaker of shopping cart
    Then check out product
      |<product>|
    Examples:
      |userName|password|product|
      |Daniel21|1234ABCd|BOSE SOUNDLINK BLUETOOTH SPEAKER III|
