import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginTests extends TestBase{


    @BeforeMethod
    public void precondition(){
        if(isLogged()){
            logout();
        }
    }


    @Test
    public void loginSuccess() {

        // open login form
        WebElement loginTab = wd.findElement(By.xpath("//a[@href='/login']"));
        loginTab.click();
        pause(3000);
        //fill email noa@gmail.com Nnoa12345$
        WebElement inputEmail = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("noa@gmail.com");
        pause(3000);


        WebElement inputPassword = wd.findElement(By.xpath("//input[@placeholder='Password']"));
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys("Nnoa12345$");
        pause(3000);

        // submit login
        WebElement loginButton = wd.findElement(By.xpath("//*[text()=' Login']"));
        loginButton.click();
        pause(3000);

        //Assert



    }


    @Test
    public void loginSuccessSecond() {

        // open login form
        WebElement loginTab = wd.findElement(By.xpath("//a[@href='/login']"));
        loginTab.click();
        pause(3000);
        //fill email noa@gmail.com Nnoa12345$
        WebElement inputEmail = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("noa@gmail.com");
        pause(3000);


        WebElement inputPassword = wd.findElement(By.xpath("//input[@placeholder='Password']"));
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys("Nnoa12345$");
        pause(3000);

        // submit login
        WebElement loginButton = wd.findElement(By.xpath("//*[text()=' Login']"));
        loginButton.click();
        pause(3000);


    }




//    @Test
//    public void loginNegativeWrongEmailFormat() {
//



//    }
//
//    @Test
//    public void loginNegativeWrongPasswordFormat() {
//
//
//    }


}
