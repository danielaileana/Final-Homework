package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import petclinic.com.*;

public class MyStepdefs {
   private WebDriver webDriver;
    private BaseClass baseClass;

    @Given("^I have access to go homepage$")
    public void iHaveAccessToGoHomepage() throws Throwable {
         baseClass= new BaseClass();
        webDriver=baseClass.init();
    }

    @When("^I click Home button$")
    public void iClickHomeButton() throws Throwable {
        PetClinicMenuPage petClinicMenuPage=new PetClinicMenuPage(webDriver);
        petClinicMenuPage.initElements();
        petClinicMenuPage.clickHome();

    }

    @Then("^Validate if Welcome to Petclinic title exists$")
    public void validateIfWelcomeToPetclinicTitleExists() throws Throwable {
      PetClinicHomePage petClinicHomePage =new PetClinicHomePage(webDriver);
      petClinicHomePage.initElements();
     //petClinicHomePage.checkHomePage();
        Assert.assertEquals("Welcome to Petclinic", petClinicHomePage.checkHomePage());

      baseClass.exit();

    }

    @When("^I click addNewOwnerButton$")
    public void iClickAddNewOwnerButton() throws Throwable {
        PetClinicMenuPage petClinicMenuPage=new PetClinicMenuPage(webDriver);
        petClinicMenuPage.initElements();
        petClinicMenuPage.clickOwners();
        petClinicMenuPage.clickAddNewOwner();

    }

    @Then("^Create a new owner$")
    public void createANewOwner() throws Throwable {
        AddNewOwnerPage addNewOwnerPage =new AddNewOwnerPage(webDriver);
        OwnersDisplayedPage ownersDisplayedPage=new OwnersDisplayedPage(webDriver);
        addNewOwnerPage.initElements();
        addNewOwnerPage.addNewOwner();
        addNewOwnerPage.clickSubmitOwner();
        ownersDisplayedPage.initElements();
        Assert.assertTrue(ownersDisplayedPage.checkIfTheOwnerExists("Daniela Ileana"));

        baseClass.exit();
    }

    @Then("^An error message is displayed$")
    public void anErrorMessageIsDisplayed() throws Throwable {
        AddNewOwnerPage addNewOwnerPage =new AddNewOwnerPage(webDriver);

        addNewOwnerPage.initElements();
        addNewOwnerPage.error(webDriver);
        baseClass.exit();
    }

    @Then("^Complete correct number and create a valid owner$")
    public void completeCorrectNumberAndCreateAValidOwner() throws Throwable {
        AddNewOwnerPage addNewOwnerPage =new AddNewOwnerPage(webDriver);
        addNewOwnerPage.initElements();
        addNewOwnerPage.error(webDriver);
        addNewOwnerPage.deleteTelephone();
        addNewOwnerPage.clickSubmitOwner();
        baseClass.exit();

    }

    @Then("^Complete the first name field wrong$")
    public void completeTheFirstNameFieldWrong() throws Throwable {
        AddNewOwnerPage addNewOwnerPage = new AddNewOwnerPage(webDriver);
        addNewOwnerPage.initElements();
        addNewOwnerPage.errorFirstName(webDriver);
        baseClass.exit();
    }

    @Then("^Complete the last name field wrong$")
    public void completeTheLastNameFieldWrong() throws Throwable {
        AddNewOwnerPage addNewOwnerPage = new AddNewOwnerPage(webDriver);
        addNewOwnerPage.initElements();
        addNewOwnerPage.errorLastName(webDriver);
        baseClass.exit();
    }

    @Then("^Don't complete any field$")
    public void donTCompleteAnyField() throws Throwable {
        AddNewOwnerPage addNewOwnerPage = new AddNewOwnerPage(webDriver);
        addNewOwnerPage.initElements();
        addNewOwnerPage.doNotCompleteAnyField();
        baseClass.exit();
    }

    @When("^I click allOwnersButton$")
    public void iClickAllOwnersButton() throws Throwable {
        PetClinicMenuPage petClinicMenuPage=new PetClinicMenuPage(webDriver);
        petClinicMenuPage.initElements();
        petClinicMenuPage.clickOwners();
        petClinicMenuPage.clickAll();
    }


    @Then("^Display the list with all owners and check if the owner created exists$")
    public void displayTheListWithAllOwnersAndCheckIfTheOwnerCreatedExists() throws Throwable {
        OwnersDisplayedPage ownersDisplayedPage =new OwnersDisplayedPage(webDriver);
        ownersDisplayedPage.initElements();
        Assert.assertTrue( ownersDisplayedPage.checkIfTheOwnerExists("Daniela Ileana"));
        baseClass.exit();;
    }

    @When("^I click addNewVeterinarianButton$")
    public void iClickAddNewVeterinarianButton() throws Throwable {
        PetClinicMenuPage petClinicMenuPage=new PetClinicMenuPage(webDriver);
        petClinicMenuPage.initElements();
        petClinicMenuPage.clickVeterinarians();
        petClinicMenuPage.clickAddNewVeteranians();
    }

    @Then("^Create a new veterinarian$")
    public void createANewVeterinarian() throws Throwable {
       AddNewVeterinarianPage addNewVeterinarianPage =new AddNewVeterinarianPage(webDriver);
       VeterinariansDisplayedPage veterinariansDisplayedPage=new VeterinariansDisplayedPage(webDriver);
       addNewVeterinarianPage.initElements();
       addNewVeterinarianPage.addNewVeterinarian();
       addNewVeterinarianPage.clickSaveVetButton();
        veterinariansDisplayedPage.initElements();
       Assert.assertTrue(veterinariansDisplayedPage.checkIfTheVetExists("Daniela Ileana"));
       baseClass.exit();
    }

    @Then("^An error message about firstName is displayed$")
    public void anErrorMessageAboutFirstNameIsDisplayed() throws Throwable {
        AddNewVeterinarianPage addNewVeterinarianPage=new AddNewVeterinarianPage(webDriver);
        addNewVeterinarianPage.initElements();
        addNewVeterinarianPage.errorAddFirstNameVeterinarian(webDriver);
        baseClass.exit();
    }

    @Then("^An error message about lastName is displayed$")
    public void anErrorMessageAboutLastNameIsDisplayed() throws Throwable {
        AddNewVeterinarianPage addNewVeterinarianPage=new AddNewVeterinarianPage(webDriver);
        addNewVeterinarianPage.initElements();
        addNewVeterinarianPage.errorAddLastNameVeterinarian(webDriver);

        baseClass.exit();
    }

    @When("^I click allVeterinariansButton$")
    public void iClickAllVeterinariansButton() throws Throwable {
        PetClinicMenuPage petClinicMenuPage=new PetClinicMenuPage(webDriver);
        petClinicMenuPage.initElements();
        petClinicMenuPage.clickVeterinarians();
        petClinicMenuPage.clickAllVeterinarians();
    }

    @Then("^Display the list with all veterinarians and check if the veterinarian created exists$")
    public void displayTheListWithAllVeterinariansAndCheckIfTheVeterinarianCreatedExists() throws Throwable {
      VeterinariansDisplayedPage veterinariansDisplayedPage=new VeterinariansDisplayedPage(webDriver);
      veterinariansDisplayedPage.initElements();
      veterinariansDisplayedPage.checkIfTheVetExists("Daniela Ileana");
        Assert.assertTrue(veterinariansDisplayedPage.checkIfTheVetExists("Daniela Ileana"));

      baseClass.exit();
    }

    @Then("^I edit my new veterinarian$")
    public void iEditMyNewVeterinarian() throws Throwable {
        VeterinariansDisplayedPage veterinariansDisplayedPage=new VeterinariansDisplayedPage(webDriver);
        EditVeterinarianPage editVeterinarianPage =new EditVeterinarianPage(webDriver);
        veterinariansDisplayedPage.initElements();
        veterinariansDisplayedPage.editNewVeterinarians("Daniela Ileana");
        editVeterinarianPage.initElements();
        editVeterinarianPage.addNewSpecialties();
 //       Assert.assertTrue(veterinariansDisplayedPage.checkIfTheVetExists("Daniela Ileana"));
        baseClass.exit();

    }

    @Then("^Create a new veterinarian without speciality$")
    public void createANewVeterinarianWithoutSpeciality() throws Throwable {
        AddNewVeterinarianPage addNewVeterinarianPage =new AddNewVeterinarianPage(webDriver);
        VeterinariansDisplayedPage veterinariansDisplayedPage=new VeterinariansDisplayedPage(webDriver);
        addNewVeterinarianPage.initElements();
        addNewVeterinarianPage.addNewVeterinarianWithoutSpecialties();
        addNewVeterinarianPage.clickSaveVetButton();
        veterinariansDisplayedPage.initElements();
        Assert.assertTrue(veterinariansDisplayedPage.checkIfTheVetExists("Daniela Ileana"));
        baseClass.exit();
    }

    @Then("^I edit my new veterinarian without speciality$")
    public void iEditMyNewVeterinarianWithoutSpeciality() throws Throwable {
        VeterinariansDisplayedPage veterinariansDisplayedPage=new VeterinariansDisplayedPage(webDriver);
        EditVeterinarianPage editVeterinarianPage=new EditVeterinarianPage(webDriver);
        veterinariansDisplayedPage.initElements();
        veterinariansDisplayedPage.editNewVeterinarians("Daniela Danielaa");
        editVeterinarianPage.initElements();
        editVeterinarianPage.addNewSpecialties();
        //Assert.assertTrue(veterinariansDisplayedPage.checkIfTheVetExists("Daniela Danielaa"));
        baseClass.exit();



    }

    @When("^I click petTypesButton$")
    public void iClickPetTypesButton() throws Throwable {
        PetClinicMenuPage petClinicMenuPage=new PetClinicMenuPage(webDriver);
        petClinicMenuPage.initElements();
        petClinicMenuPage.clickPet();


    }

    @Then("^Create a new petTypes$")
    public void createANewPetTypes() throws Throwable {
        PetTypesPage petTypesPage=new PetTypesPage(webDriver);
        petTypesPage.initElements();
        petTypesPage.addNewPetType();
        Assert.assertTrue(petTypesPage.checkIfThePeExists("pisicuta"));
        baseClass.exit();
    }

    @Then("^Display the list with all pets and check if the pet created exists$")
    public void displayTheListWithAllPetsAndCheckIfThePetCreatedExists() throws Throwable {
      PetTypesPage petTypesPage=new PetTypesPage(webDriver);
      petTypesPage.initElements();
      petTypesPage.checkIfThePeExists("pisicuta");
        Assert.assertTrue(petTypesPage.checkIfThePeExists("pisicuta"));
        baseClass.exit();


    }

    @Then("^I click on editButton$")
    public void iClickOnEditButton() throws Throwable {
       PetTypesPage petTypesPage=new PetTypesPage(webDriver);
       EditPetTypesPage editPetTypesPage=new EditPetTypesPage(webDriver);
       petTypesPage.initElements();
       petTypesPage.editNew("pisicuta");
       editPetTypesPage.initElements();
       editPetTypesPage.editPetType();
        //Assert.assertTrue(petTypesPage.checkIfThePeExists("update pisicuta"));
       baseClass.exit();


    }

    @Then("^The new pet type is deleted$")
    public void theNewPetTypeIsDeleted() throws Throwable {
        PetTypesPage petTypesPage=new PetTypesPage(webDriver);
        petTypesPage.initElements();
        petTypesPage.deleteNewPetType("pisicuta");
//        Assert.assertFalse(petTypesPage.checkIfThePeExists("pisicuta"));
        baseClass.exit();
    }

    @When("^I click specialtiesButton$")
    public void iClickSpecialtiesButton() throws Throwable {
        PetClinicMenuPage petClinicMenuPage=new PetClinicMenuPage(webDriver);
        petClinicMenuPage.initElements();
        petClinicMenuPage.clickSpecial();
    }

    @Then("^A new speciality is added$")
    public void aNewSpecialityIsAdded() throws Throwable {
        SpecialtiesPage specialtiesPage=new SpecialtiesPage(webDriver);
        specialtiesPage.initElements();
        specialtiesPage.addNewSpecialties();
        Assert.assertTrue(specialtiesPage.checkIfTheSpExists("generalist"));
        baseClass.exit();
    }

    @Then("^Display the list with all specialties and check if the speciality added exists$")
    public void displayTheListWithAllSpecialtiesAndCheckIfTheSpecialityAddedExists() throws Throwable {
        SpecialtiesPage specialtiesPage=new SpecialtiesPage(webDriver);
        specialtiesPage.initElements();
        Assert.assertTrue(specialtiesPage.checkIfTheSpExists("generalist"));
        baseClass.exit();
    }

    @Then("^The new speciality is deleted$")
    public void theNewSpecialityIsDeleted() throws Throwable {
        SpecialtiesPage specialtiesPage=new SpecialtiesPage(webDriver);
        specialtiesPage.initElements();
        specialtiesPage.deleteNewSpecialty("generalist");
        Assert.assertTrue(specialtiesPage.checkIfTheSpExists("generalist"));
        baseClass.exit();

    }
}
