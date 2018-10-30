package petclinic.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetClinicMenuPage  {

    private WebElement homeButton;
    private WebElement ownersButton;
    private WebElement veterinariansButton;
    private WebElement petTypesButton;
    private WebElement specialitiesButton;
    private WebElement ownersAllButton;
    private WebElement ownersAddButton;
    private WebElement veterinarianAddNewButton;
    private WebElement veterinariansAllButton;
    private WebDriver webDriver;

    public PetClinicMenuPage(WebDriver webDriver) {
        this.webDriver=webDriver;

    }

    public void initElements(){
        homeButton=webDriver.findElement(By.xpath("//a[@href='/petclinic/welcome']"));
        ownersButton=webDriver.findElement(By.xpath("//a[text()='Owners']"));
        veterinariansButton=webDriver.findElement(By.xpath("//a[text()='Veterinarians']"));
        petTypesButton=webDriver.findElement(By.linkText("PET TYPES"));
        specialitiesButton=webDriver.findElement(By.xpath("//a[@href='/petclinic/specialties']"));
        ownersAllButton=webDriver.findElement(By.xpath("//a[@href='/petclinic/owners']"));
        ownersAddButton=webDriver.findElement(By.xpath("//a[@href='/petclinic/owners/add']"));
    }
    public void clickHome(){
        homeButton.click();
    }

    public void clickOwners(){
        ownersButton.click();
    }

    public void clickVeterinarians(){
        veterinariansButton.click();
    }
    public void clickPet(){
        petTypesButton.click();
    }
    public void clickSpecial(){
        specialitiesButton.click();
    }


    public void clickAll(){
        ownersAllButton.click();
    }
    public void clickAddNewOwner(){
        ownersAddButton.click();
    }

    public void clickAddNewVeteranians(){
        veterinarianAddNewButton=webDriver.findElement(By.xpath("//a[@routerlink='/vets/add']"));
        veterinarianAddNewButton.click();
    }
    public void clickAllVeterinarians(){
        veterinariansAllButton=webDriver.findElement(By.xpath("//a[@routerlink='/vets']"));
        veterinariansAllButton.click();
    }


}
