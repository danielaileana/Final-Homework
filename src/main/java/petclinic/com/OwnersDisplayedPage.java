package petclinic.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class OwnersDisplayedPage {

    private List<WebElement> owners;
    private WebElement buttonAddNew;
    private WebDriver webDriver;
    WebDriverWait wait;

    public OwnersDisplayedPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void initElements(){
        wait=new WebDriverWait(webDriver,10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ownerFullName")));
        buttonAddNew=webDriver.findElement(By.xpath("//button[@class='btn btn-default']"));
        owners=  webDriver.findElements(By.className("ownerFullName"));
    }

    public boolean checkIfTheOwnerExists(String vetExist){
        for(WebElement we:owners){
            if(we.getText().equals(vetExist)){
                return true;
            }
        }
        return false;

    }

}
