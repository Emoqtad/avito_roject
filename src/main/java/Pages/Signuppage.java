package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signuppage {

    WebDriver driver;

    @FindBy(xpath = "//a[@href='/fr/signup']")
    WebElement buttonsignup;

    @FindBy(xpath = "//input[@id='name']")
    WebElement signupname_path;

    @FindBy(xpath = "//input[@id='phone']")
    WebElement signupphone_path;

    @FindBy(xpath = "//label/child::input")
    WebElement signupcheckbox;

    @FindBy(xpath = "//input[@name='signup-email']")
    WebElement signupemail_path;

    @FindBy(xpath = "//input[@name='signup-email-confirm']")
    WebElement signupemailconfirm_path;

    @FindBy(xpath = "//input[@name='signup-pass']")
    WebElement signuppassword_path;

    @FindBy (xpath = "//input[@name='signup-pass-confirm']")
    WebElement signuppasswordconfirm_path;

    @FindBy(xpath = "//button[text()='Créer un compte']")
    WebElement createaccountbutton_path;

    @FindBy(xpath = "//span[text()='Veuillez Sélectionner une ville']")
    WebElement phonemsg_error;




    public Signuppage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clicksignup(){
        buttonsignup.click();
        System.out.println("Button signup clicked ");

    }

    public void saisiesignup(String signuname,String signupphone,String signupemail,String signupemailconfirmation,String singuppassword, String singuppasswordconfirmation){
       //Remplissage du formulaire
        signupname_path.sendKeys(signuname);
        System.out.println("name saisie");
        signupphone_path.sendKeys(signupphone);
        System.out.println("phone saisie");
        signupemail_path.sendKeys(signupemail);
        System.out.println("email saisie");
        signupemailconfirm_path.sendKeys(signupemailconfirmation);
        System.out.println("email confirmed");
        signuppassword_path.sendKeys(singuppassword);
        System.out.println("password saisie");
        signuppasswordconfirm_path.sendKeys(singuppassword);
        System.out.println("password confirmed");
    }

    public void checkboxsingupclick(){
        signupcheckbox.click();
        System.out.println("checkbox clicked");
    }

    public void clickcreateaccount(){
        createaccountbutton_path.click();
        System.out.println("Boutton create account clicked");
    }

    public Boolean verifyphonemsgerror(){
        if (phonemsg_error.isDisplayed()) {
            System.out.println("message displayed");
            return true;
        }else return false;

    }



}
