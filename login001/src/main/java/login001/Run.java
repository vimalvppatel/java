package login001;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run {

	private static WebDriver wb;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		 driver.get("http://192.168.0.83:4500/login");
		 driver.findElement(By.cssSelector("[name=\"email\"]")).sendKeys("chandrakant.infograins@gmail.com");
		 driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys("123456");
		 driver.findElement(By.cssSelector("[value=\"supplier\"]")).click();
		 
		 driver.findElement(By.cssSelector("[id=\"g-captcha\"]")).click();
		 
		 driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		 
		 wb = null;
	  	 
		wb.switchTo().newWindow(WindowType.TAB);
	
		 driver.get("http://192.168.0.83:4500/login");
		 
         driver.findElement(By.cssSelector("[id=\"g-captcha\"]")).click();
		 
		 driver.findElement(By.cssSelector("[class=\"primary_btn\"]")).click();
		 
	}  
	
}

		
	
