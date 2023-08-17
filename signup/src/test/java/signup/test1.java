package signup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v112.page.model.ScreencastFrame;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	ChromeOptions o = new ChromeOptions();
	o.addArguments("--remote-allow-origins=*");
	WebDriver wb = new ChromeDriver(o);
	wb.manage().window().maximize();

	wb.get("http://192.168.0.104:5173/");
	wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
 WebElement Sel = wb.findElement(By.cssSelector("[name=\"user_type\"]"));
     Select s = new Select(Sel);
       s.selectByVisibleText("Super Admin");
   
    WebElement Username = wb.findElement(By.cssSelector("[name=\"email\"]"));
       Username.sendKeys("superadmin@gmail.com");
     
    WebElement pass = wb.findElement(By.cssSelector("[type=\"password\"]"));
       pass.sendKeys("Admin@12345");
     
    WebElement Login = wb.findElement(By.cssSelector("[class=\"login-btn-mk mt-5\"]"));
         Login.click();
         
         
   WebElement admin = wb.findElement(By.cssSelector("[href=\"/dashboard/admin\"]"));
     admin.click();
     
     
     
   
   
   // Dummy data
     
   /*WebElement selec = wb.findElement(By.xpath("//*[@id=\"sidebar\"]/div[2]/div/ul/li[1]/div[2]/ul/li/a/span"));
       selec.click();
   
    WebElement dash = wb.findElement(By.xpath("(//a[@href=\"/dashboard\"])[2]"));
        dash.click();
        
        
    WebElement Case = wb.findElement(By.xpath("//*[@id=\"sidebar\"]/div[2]/div/ul/li[2]/div[1]/div/div[1]/span"));
        Case.click();
        
    WebElement Total = wb.findElement(By.xpath("//*[@id=\"sidebar\"]/div[2]/div/ul/li[2]/div[2]/ul/li[1]/a/span"));
       Total.click();
    
    WebElement home = wb.findElement(By.xpath("(//a[@href=\"/dashboard\"])[2]"));
       home.click();*/
       
 

       
    
       
       
      
       
                                


	
	
   }
}
