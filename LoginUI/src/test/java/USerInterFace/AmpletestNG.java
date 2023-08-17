package USerInterFace;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmpletestNG {
		
	
	private static final String Expectedtitle = null;

	@Test 
	
	 public void tittletest() {

	    String tittle = "Ample secure";
		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions() ;
		op.addArguments("--remote-allow-origins=*");
		WebDriver wb = new ChromeDriver(op); 
		
		wb.get("http://192.168.0.104:5173/");
		String actualtitle = wb.getTitle();
		
		assertequals(actualtitle, Expectedtitle);
	}

	private boolean assertequals(String actualtitle, String expectedtitle2) {
		// TODO Auto-generated method stub
		return false;
	}

}
