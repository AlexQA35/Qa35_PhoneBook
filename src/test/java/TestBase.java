import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

public class TestBase {
    WebDriver wd;

    @BeforeSuite
    public void init() {
        wd = new ChromeDriver();
        wd.manage().window().maximize(); /// open full screen
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
    }


    @AfterSuite
    public void tearDown(){
        wd.quit();
    }

    /// ********************************************************
    public void  pause(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isLogged(){
        // //button[text()='Sign Out']
        List<WebElement> list =  wd.findElements(By.xpath("//button[text()='Sign Out']"));
        return list.size()>0;

    }
    public void logout(){
//       WebElement element = wd.findElement(By.xpath("//button[text()='Sign Out']"));
//       element.click();
        wd.findElement(By.xpath("//button[text()='Sign Out']")).click();
    }


}