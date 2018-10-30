package petclinic.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditVeterinarianPage {
    private WebElement specialties;
    private WebElement saveVetEditButton;
    WebDriver webDriver;

    public EditVeterinarianPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void initElements(){
        specialties= webDriver.findElement(By.xpath("//div[@class='mat-select-value']"));
        saveVetEditButton=webDriver.findElement(By.xpath("//button[@type='submit']"));
    }
    public void addNewSpecialties(){

        specialties.click();
        WebElement option=webDriver.findElement(By.xpath("//mat-option[1]"));
        option.click();
        option.sendKeys(Keys.ESCAPE);
        saveVetEditButton.click();




    }
}
