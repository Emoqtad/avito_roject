package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Stepteardown;

import java.lang.invoke.StringConcatFactory;

public class Homepage{

    WebDriver driver;

   /* @FindBy(xpath = "//meta[@name='apple-mobile-web-app-title']")
    WebElement expectedtitle;*/
    @FindBy(xpath = "//span[text()='Se connecter']")
    WebElement buttonseconnecter;


    @FindBy(xpath = "//input[@name='Mot de passe']")
    WebElement passwordelement;

    @FindBy(xpath = "//input[@name='E-mail']")
    WebElement emailelement;




    public Homepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String hometitlepage(){
        String expectedtitle = driver.getTitle();
        System.out.println(expectedtitle);
        return expectedtitle;
    }

    public void clickseconnecter(){
        buttonseconnecter.click();
        System.out.println("Button clicked");

    }

}
