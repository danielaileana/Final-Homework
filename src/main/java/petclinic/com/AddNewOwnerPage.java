package petclinic.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNewOwnerPage {
    private WebElement firstName;
    private WebElement lastName;
    private WebElement address;
    private WebElement city;
    private WebElement telephone;
    private  WebElement messageErTelephone;
    private WebElement ownersSubmitButton;
    private WebElement messageErrorFirstName;
    private WebElement messageErrorLastName;
    private WebDriver webDriver;

    public AddNewOwnerPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void initElements(){
        firstName=webDriver.findElement(By.id("firstName"));
        lastName=webDriver.findElement(By.id("lastName"));
        address=webDriver.findElement(By.id("address"));
        city=webDriver.findElement(By.id("city"));
        telephone=webDriver.findElement(By.id("telephone"));
        ownersSubmitButton=webDriver.findElement(By.xpath("//button[contains(text(),'Add Owner')]"));

    }
    public void addNewOwner(){
        firstName.sendKeys("Daniela");
        lastName.sendKeys("Ileana");
        address.sendKeys("Bd Iuliu Maniu");
        city.sendKeys("Bucuresti");
        telephone.sendKeys("01234567");


    }

    public boolean error(WebDriver webDriver){
        firstName.sendKeys("Daniela");
        lastName.sendKeys("Ileana");
        address.sendKeys("Bd Iuliu Maniu");
        city.sendKeys("Bucuresti");
        telephone.sendKeys("ee");
        messageErTelephone =webDriver.findElement(By.xpath("//span[contains(text(),'Phone number only accept digits')]"));
        return messageErTelephone.isDisplayed();
    }
    public boolean errorFirstName(WebDriver webDriver){
        firstName.sendKeys("f");
        messageErrorFirstName=webDriver.findElement(By.xpath("//span[contains(text(),'First name must be at least 2 characters long')]"));
        return messageErrorFirstName.isDisplayed();

    }
    public boolean errorLastName(WebDriver webDriver){
        firstName.sendKeys("Daniela");
        lastName.sendKeys("I");
        messageErrorLastName=webDriver.findElement(By.xpath("//span[contains(text(),'Last name must be at least 2 characters long')]"));
        return messageErrorLastName.isDisplayed();
    }

    public void clickSubmitOwner(){
        ownersSubmitButton.click();
    }

    public void deleteTelephone(){
        telephone.clear();
        telephone.sendKeys("0999876");

    }

    public void doNotCompleteAnyField(){

    }


}
