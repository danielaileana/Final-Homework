package petclinic.com;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
   private WebDriver webDriver;


    public WebDriver init(){
        webDriver=new ChromeDriver();

        webDriver.get("http://bhdtest.endava.com/petclinic/welcome");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return webDriver;


    }

    public void exit(){
        webDriver.quit();
    }
}
