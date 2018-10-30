Feature:
  Scenario: Check if Welcome to Petclinic title exists
    Given I have access to go homepage
    When I click Home button
    Then Validate if Welcome to Petclinic title exists

    Scenario: User wants to add a new Owner
      Given I have access to go homepage
      When I click addNewOwnerButton
      Then Create a new owner

      Scenario: User adds an invalid phone number
        Given I have access to go homepage
        When I click addNewOwnerButton
        Then An error message is displayed


      Scenario: User wants to delete the invalid phone number and adds a correct number
         Given I have access to go homepage
         When I click addNewOwnerButton
         Then Complete correct number and create a valid owner

      Scenario: User wants to complete the first name field with just a character
        Given I have access to go homepage
        When I click addNewOwnerButton
        Then Complete the first name field wrong

      Scenario: User wants to complete the last name field with just a character
        Given I have access to go homepage
        When I click addNewOwnerButton
        Then Complete the last name field wrong

      Scenario: User wants add a new owner but he does not complete any field
        Given I have access to go homepage
        When I click addNewOwnerButton
        Then Don't complete any field

      Scenario: User wants to check if the owner he created exists
        Given I have access to go homepage
        When I click allOwnersButton
        Then Display the list with all owners and check if the owner created exists

      Scenario: User wants to add a new veterinarian
        Given I have access to go homepage
        When I click addNewVeterinarianButton
        Then Create a new veterinarian

      Scenario: User wants to add an invalid firstName: completes only a character
        Given I have access to go homepage
        When I click addNewVeterinarianButton
        Then An error message about firstName is displayed

      Scenario: User wants to add an invalid lastName: completes only a character
         Given I have access to go homepage
         When I click addNewVeterinarianButton
         Then An error message about lastName is displayed

      Scenario: User wants to check if the veterinarian created exists
        Given I have access to go homepage
        When I click allVeterinariansButton
        Then Display the list with all veterinarians and check if the veterinarian created exists

      Scenario: User wants to edit the new veterinarian
        Given I have access to go homepage
        When I click allVeterinariansButton
        Then I edit my new veterinarian

      Scenario: User wants to add a new veterinarian without speciality
        Given I have access to go homepage
        When I click addNewVeterinarianButton
        Then Create a new veterinarian without speciality

      Scenario: User wants to add speciality to the veterinarian without speciality
        Given I have access to go homepage
        When I click allVeterinariansButton
        Then I edit my new veterinarian without speciality

      Scenario: User wants to add new pet types
        Given I have access to go homepage
        When I click petTypesButton
        Then Create a new petTypes


      Scenario: User wants to check if the pet created exists
        Given I have access to go homepage
        When I click petTypesButton
        Then Display the list with all pets and check if the pet created exists


      Scenario: User wants to edit the new pet created
        Given I have access to go homepage
        When I click petTypesButton
        Then I click on editButton

      Scenario: User wants to delete the new pet created
        Given I have access to go homepage
        When I click petTypesButton
        Then The new pet type is deleted

      Scenario: User wants to add a new speciality
        Given I have access to go homepage
        When I click specialtiesButton
        Then A new speciality is added

      Scenario: User wants to check if the speciality added exits
        Given I have access to go homepage
        When I click specialtiesButton
        Then Display the list with all specialties and check if the speciality added exists



      Scenario: User wants to delete the new speciality
        Given I have access to go homepage
        When I click specialtiesButton
        Then The new speciality is deleted

