package ConditionalOperator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wb = new ChromeDriver();
      wb.manage().window().maximize();
     // wb.manage().timeouts().implicitlyWait(DuractionOfSecond(10));
		wb.get("https://www.google.com/");
		
	}

}