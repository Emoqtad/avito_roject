package Test;

import Pages.Homepage;
import Pages.Loginpage;
import Pages.Signuppage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.Stepteardown;

public class Test_1 extends Stepteardown {

    String hometitle ="Annonces au Maroc | Avito.ma";
    String email = "souadlegdani98@gmail.com";
    String password = "passpass";
    String name = "Elmehdi";
    String phone = "0690237494";



   @Test
    public void scenarioverifytitle(){
       Homepage homepage = new Homepage(driver);
       System.out.println("test test");
       String actualhometitle = homepage.hometitlepage();
       Assert.assertEquals(actualhometitle,hometitle);
    }



    @Test(priority = 1)
    public void scenariologin() throws InterruptedException {
       Homepage homepage = new Homepage(driver);
       Loginpage loginpage = new Loginpage(driver);
       System.out.println("test test");
       String actualhometitle = homepage.hometitlepage();
       Assert.assertEquals(actualhometitle,hometitle);
       homepage.clickseconnecter();
       System.out.println("button clicked");
       Thread.sleep(5000);
       loginpage.saisilogin(email,password);
       System.out.println("email and password saisie");
       Thread.sleep(5000);
       loginpage.clickseconnecterlogin();

    }




   @Test(priority = 2)
    public void scenariosignup() throws InterruptedException{
       // Instanciation des objets
        Homepage homepage = new Homepage(driver);
        Loginpage loginpage = new Loginpage(driver);
        Signuppage signuppage = new Signuppage(driver);

        //Verify title page
        String actualhometitle = homepage.hometitlepage();
        Assert.assertEquals(actualhometitle,hometitle);

        //cliquer bouton se connecter
        homepage.clickseconnecter();
        System.out.println("button clicked");
        Thread.sleep(5000);

        //ciquer bouton singup
        signuppage.clicksignup();
        Thread.sleep(5000);

        //Click checkbox et remplire le formulaire
        signuppage.checkboxsingupclick();
        Thread.sleep(5000);
        signuppage.saisiesignup(name,phone,email,email,password,password);
        Thread.sleep(5000);

        //click create account
        signuppage.clickcreateaccount();

        //check phone error msg
        Thread.sleep(5000);
        signuppage.verifyphonemsgerror();

    }




}
