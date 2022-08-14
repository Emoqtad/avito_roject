package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
    WebDriver driver;

    @FindBy(name = "Mot de passe")
    WebElement passwordelement;

    @FindBy(name = "E-mail")
    WebElement emailelement;

    @FindBy(xpath = "//button[text()='Se connecter']")
    WebElement seconnecterloginelement;


    public Loginpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public void saisilogin(String email,String password){
        System.out.println("email saisie");
       // emailelement.sendKeys(email);
        System.out.println("password saisie");
        emailelement.sendKeys(email);
        passwordelement.sendKeys(password);
    }
    public void clickseconnecterlogin(){
        seconnecterloginelement.click();
        System.out.println("Button login clicked");

    }
}
