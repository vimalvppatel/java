import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		 driver.get("http://192.168.0.83:4500/login");
		 driver.findElement(By.cssSelector("[name=\"email\"]")).sendKeys("chandrakant.infograins@gmail.com");
		 driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys("123456");
		 driver.findElement(By.cssSelector("[value=\"supplier\"]")).click();
	//	 driver.findElement(By.cssSelector("[id=\"g-captcha\"]")).click();
	//	 driver.findElement(By.cssSelector("[type=\"submit\"]")).click();	
		 
		 TakesScreenshot tk = (TakesScreenshot)driver;
		 
		File file = tk.getScreenshotAs(OutputType.FILE);
		File	filedest = new File("D:\\image.jpeg");
		
		try {
			FileUtils.copyFile(file, filedest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		 
		 
		 
	}

}
