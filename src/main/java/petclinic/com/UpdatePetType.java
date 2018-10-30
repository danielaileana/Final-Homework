package petclinic.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdatePetType {
    private WebElement nameField;
    private WebElement updateButton;
    private WebDriver webDriver;

    public UpdatePetType(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void initElements(){
        nameField=webDriver.findElement(By.xpath("//input[@id='name']"));
        updateButton=webDriver.findElement(By.xpath("//button[@type='submit']"));
    }
    public void updateNewPet(){
        nameField.sendKeys("update pisicuta");
        updateButton.click();
    }
}
