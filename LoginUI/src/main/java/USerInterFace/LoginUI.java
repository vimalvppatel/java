package USerInterFace;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions() ;
		op.addArguments("--remote-allow-origins=*");
		WebDriver wb = new ChromeDriver(op); 
	    wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wb.manage().window().maximize();
		
		wb.get("http://192.168.0.104:5173/");
		
		
	   

	}

}
