package login001;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Admin {

	public static void main(String[] args) throws InterruptedException {

		String username = "Rajshree";
		String domain = RandomStringGenerator.generateRandomString(5);
		String email = domain+"@gmail.com";
		System.out.println(email);
		String mbno = "1234569871";                
		
		
//		WebDriverManager.chromedriver().setup();
	//	ChromeOptions op = new ChromeOptions();
	//	op.setHeadless(true); 
	//	op.addArguments("--remote-allow-origins=*");
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
	//	wb.get("https://www.netflix.com");
		wb.get("http://192.168.0.104:5173");
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement drop = wb.findElement(By.cssSelector("[name=\"user_type\"]"));
		drop.click();

		Select s = new Select(drop);

		s.selectByIndex(1);

		WebElement name = wb.findElement(By.cssSelector("[placeholder=\"Enter Email \"]"));
		name.sendKeys("superadmin@gmail.com");

		WebElement pass = wb.findElement(By.cssSelector("[placeholder=\"Enter password\"]"));
		pass.sendKeys("Admin@12345");

		WebElement icone = wb.findElement(By.cssSelector("[class=\"eye\"]"));
		icone.click();

		WebElement login = wb.findElement(By.cssSelector("[class=\"login-btn-mk mt-5\"]"));

		login.click();

		WebElement risk1 = wb.findElement(By.xpath("//span[text()=\"Admin\"]"));
		risk1.click();

		wb.findElement(By.cssSelector("[class=\"create-admi-btn btn btn-primary\"]")).click();
 
		wb.findElement(By.cssSelector("[id=\"first_name\"]")).sendKeys("Ankit");

		wb.findElement(By.cssSelector("[name=\"last_name\"]")).sendKeys("k");

		wb.findElement(By.cssSelector("[id=\"email\"]")).sendKeys(email);

		wb.findElement(By.cssSelector("[id=\"phone_number\"]")).sendKeys(mbno);

		wb.findElement(By.id("username")).sendKeys(username);

		wb.findElement(By.name("password")).sendKeys("Ankit@1234");

		wb.findElement(By.name("confirm_password")).sendKeys("Ankit@1234");

		wb.findElement(By.cssSelector("[class=\"btn create-admin-btn me-3 mt-3\"]")).click();

		 //WebElement risk2 = wb.findElement(By.xpath("[href=\"/dashboard/admin\"]]"));
		 //risk2.click();
		String actualname = null;
		String actualemail = null;
		String actualmbno = null;
		List<WebElement> usernamelist = wb.findElements(By.xpath("//td[@class=\"client-name\"]/../td[4]"));

		for (int x = 0; x < wb.findElements(By.xpath("//td[@class=\"client-name\"]/../td[4]")).size(); x++) {
           
			if (wb.findElements(By.xpath("//td[@class=\"client-name\"]/../td[4]")).get(x).getText().equalsIgnoreCase(email));

			{
				actualemail = wb.findElements(By.xpath( "//td[@class=\"client-name\"]/../td[4]")).get(x).getText();

				//actualemail = wb.findElements(By.xpath("//tr/th[4]")).get(x).getText();
				//actualmbno = wb.findElements(By.xpath("//tr//th[3]")).get(x).getText();

			}

		}
		
		System.out.println(email);
          
//		Assert.assertEquals(actualmbno, mbno);

	}
}

