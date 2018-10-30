package petclinic.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetClinicHomePage {

    private WebElement headerTitle;
    private WebElement headerText;
    private WebElement imagine;
    private WebDriver webDriver;

    public PetClinicHomePage(WebDriver webDriver)  {
        this.webDriver = webDriver;
    }

    public void initElements(){
        headerTitle=webDriver.findElement(By.xpath("//h1[contains(text(),\"Welcome to Petclinic\")]") );
        headerText=webDriver.findElement(By.xpath("//h2[contains(text(),\"Welcome\")]"));
        imagine=webDriver.findElement(By.className("img-responsive"));
    }

    public String checkHomePage(){
        String actualResult=headerTitle.getText();
        return actualResult;
    }
    public String checkTitile(){
        String actualResult=headerText.getText();
        return actualResult;
    }
    public boolean checkImagine(){

        return imagine.isDisplayed();
    }

}
