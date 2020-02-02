#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  Background: User is Logged In
    Given I navigate to the login page
    When I submit username and password
    Then I should be logged in

  @login
  Scenario Outline: Title of your scenario
    Given ope Discover login page
    When invalid "<username>" and "<password>"
    Then display error message

    Examples: 
      | username | password |
      | tesfdsf  | tester   |
      | branfggas  | tester   |
      
        @checksomething
  Scenario Outline: check something
    Given search text "<searchText>"
    When click entered
    Then display search results
    Examples: 
      | searchText | 
      | iPhone11  | 
      
 @Clicksomthing
  Scenario Outline: click something
    Given search resuls "<phone>"
    When click somehyperlink
    Then see wats happening
   Examples:
   |phone|
   |Samsung|
      