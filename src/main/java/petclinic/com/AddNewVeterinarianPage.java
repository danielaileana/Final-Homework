package petclinic.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddNewVeterinarianPage {
    private WebElement firstName;
    private  WebElement lastName;
    private Select type;
    private  WebElement saveVetButton;
    private WebDriver webDriver;
    private WebElement errorMessageFirstNameVeterinarian;
    private WebElement errorMessageLastNameVeterinarian;

    public AddNewVeterinarianPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void initElements(){
        firstName=webDriver.findElement(By.id("firstName"));
        lastName=webDriver.findElement(By.id("lastName"));
        type= new Select(webDriver.findElement(By.id("specialties")));
        saveVetButton=webDriver.findElement(By.xpath("//button[@type='submit']"));
    }
    public void addNewVeterinarian(){
        firstName.sendKeys("Daniela");
        lastName.sendKeys("Ileana");
        type.selectByVisibleText("neurology");

    }

    public void addNewVeterinarianWithoutSpecialties(){
        firstName.sendKeys("Daniela");
        lastName.sendKeys("Danielaa");
    }

    public boolean errorAddFirstNameVeterinarian(WebDriver webDriver){
        firstName.sendKeys("D");
        errorMessageFirstNameVeterinarian=webDriver.findElement(By.xpath("//span[@class='help-block']"));
        return errorMessageFirstNameVeterinarian.isDisplayed();

    }

    public boolean errorAddLastNameVeterinarian(WebDriver webDriver){
        firstName.sendKeys("Daniela");
        lastName.sendKeys("I");
        errorMessageLastNameVeterinarian=webDriver.findElement(By.xpath("//span[@class='help-block']"));
        return errorMessageLastNameVeterinarian.isDisplayed();
    }

    public void selectNewType(){
        firstName.sendKeys("Daniela");
        lastName.sendKeys("Ileana");
        type.selectByVisibleText("anotherType");

    }




    public void clickSaveVetButton(){
        saveVetButton.click();
    }




}
