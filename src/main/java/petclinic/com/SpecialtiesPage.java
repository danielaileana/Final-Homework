package petclinic.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SpecialtiesPage {
    private WebDriver webDriver;
    private WebElement homeButton;
    private WebElement addSpecialtiesButton;
    private List<WebElement> specialtiesNameList;
    private List<WebElement>editButtonList;
    private List<WebElement>deleteButtonList;

    public SpecialtiesPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void initElements(){
        homeButton=webDriver.findElement(By.xpath("//button[contains(text(),'Home')]"));
        addSpecialtiesButton=webDriver.findElement(By.xpath("//button[contains(text(),'Add')]"));
        specialtiesNameList=webDriver.findElements(By.xpath("//input[@id]"));
        editButtonList=webDriver.findElements(By.xpath("//tbody//tr//td[2]//button[1]"));
        deleteButtonList=webDriver.findElements(By.xpath("//tbody//tr//td[2]//button[2]"));
    }


    public void addNewSpecialties(){
        addSpecialtiesButton.click();
        WebElement nameField=webDriver.findElement(By.xpath("//input[@id='name']"));
        nameField.sendKeys("generalist");
        WebElement saveSpecialtiesButton=webDriver.findElement(By.xpath("//button[@type='submit']"));
        saveSpecialtiesButton.click();
    }
    public boolean checkIfTheSpExists(String spExist){
        for(WebElement we:specialtiesNameList){
            if(we.getAttribute("value").equals(spExist)){
                return true;
            }
        }
        return false;
    }



    public void editNewSpecialty(String nameSpecialties) {

        for(int i = 0; i <specialtiesNameList.size(); i++) {

            String nameS = specialtiesNameList.get(i).findElement(By.id(String.valueOf(i))).getAttribute("value");

            if(nameSpecialties.equals(nameS)) {

                System.out.println("test");
                editButtonList.get(i).click();
                break;
            }
        }

    }

    public void deleteNewSpecialty(String nameSpecialties){
        for(int i = 0; i <specialtiesNameList.size(); i++) {

            String nameS = specialtiesNameList.get(i).findElement(By.id(String.valueOf(i))).getAttribute("value");

            if(nameSpecialties.equals(nameS)) {

                deleteButtonList.get(i).click();
                break;
            }

        }


    }


}
