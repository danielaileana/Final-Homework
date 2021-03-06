package petclinic.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditSpecialtyPage {
    private WebDriver webDriver;
    private WebElement nameField;
    private WebElement updateButton;

    public EditSpecialtyPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void initElements(){
        nameField=webDriver.findElement(By.id("name"));
        updateButton=webDriver.findElement((By.xpath("//button[@type='submit']")));
    }
    public void editSpecialty(){
        nameField.clear();
        nameField.sendKeys("update");
        updateButton.click();
    }
}
