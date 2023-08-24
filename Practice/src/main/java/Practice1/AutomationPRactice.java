package Practice1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPRactice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String email="Test1212@mailinator.com";

		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wb.get("https://wazirx.com/");
		WebElement vimal = wb.findElement(By.cssSelector("[class=\"sc-gsTEea sc-cBNeex jOrdCp dAvegG\"]"));
		vimal.click();

		WebElement patel = wb.findElement(By.cssSelector("[type=\"email\"]"));
		patel.sendKeys(email);

		WebElement pass = wb.findElement(By.cssSelector("[type=\"password\"]"));
		pass.sendKeys("123456");

		WebElement con = wb.findElement(By.cssSelector("[placeholder=\"Re-enter password\"]"));
		con.sendKeys("123456");

		WebElement check = wb.findElement(By.cssSelector("[class=\"sc-bdfBQB VVUti\"]"));
		check.click();

		wb.findElement(By.xpath("//span[text()=\"Sign Up\"]")).click();
		
		String mailuser = email.split("@mailinator.com")[0];
		wb.switchTo().newWindow(WindowType.TAB);
		wb.get("https://www.mailinator.com/v4/public/inboxes.jsp?to="+mailuser);
		wb.findElement(By.xpath("//tr[@ng-repeat=\"email in emails\"][1]//td[3]")).click();
	String otp=	wb.findElement(By.xpath("//h4[text()=\"Your one time password (OTP)\"]/..//p//span//b")).getText();
	
	
	Set<String> handles = wb.getWindowHandles();
	Iterator<String> handlei = handles.iterator();
	String Parent = handlei.next();
	String child = handlei.next();
	
	wb.switchTo().window(child);
	

	}

}
