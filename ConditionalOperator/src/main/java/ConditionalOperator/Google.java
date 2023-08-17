package ConditionalOperator;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wb = new ChromeDriver();
      wb.manage().window().maximize(); // windows maximize line
      wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // thread line
	  wb.get("https://www.google.com/"); // Navigate into the chrome browser
		
	}

}
