package pro2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver wb = new ChromeDriver(op);
		wb.manage().window().maximize();
		
		wb.get("https://www.saucedemo.com");
		
		WebElement Username = wb.findElement(By.xpath("//*[@id=\"user-name\"]"));
		Username.sendKeys("problem_user");

		WebElement password = wb.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("secret_sauce");

		WebElement login = wb.findElement(By.xpath("//*[@id=\"login-button\"]"));
		login.click();

		WebElement Cart = wb.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
		Cart.click();

		Thread.sleep (1000);

		WebElement cart1 = wb.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		   cart1.click();
		   
		   Thread.sleep (1000);
		   
		   WebElement remove = wb.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bike-light\"]"));
		   remove.click();
		   
		   WebElement vimal = wb.findElement(By.xpath("//*[@id=\"continue-shopping\"]"));
		   vimal.click();
		   
		  Thread.sleep (1000);
		 
		  WebElement patel = wb.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]"));
		   patel.click();
		   
		   Thread.sleep(1000);
		   
		   WebElement about = wb.findElement(By.xpath("//*[@id=\"about_sidebar_link\"]"));
		   about.click();
		   
		   Thread.sleep(1000);
		   
		   wb.navigate().back();
		   
		   WebElement drower = wb.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]"));
		   drower.click();
		   
		   Thread.sleep(1000);
		   
		   WebElement logout2 = wb.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
		      logout2.click ();
		     
		   Thread.sleep(1000);

		 WebElement name2 = wb.findElement(By.xpath("//*[@id=\"user-name\"]"));
		    name2.sendKeys("standard_user");
		   
		    Thread.sleep (1000);
		   
		  WebElement password2 = wb.findElement(By.xpath("//*[@id=\"password\"]"));
		   password2.sendKeys("secret_sauce");
		   
		    Thread.sleep (1000);
		   
		    WebElement login2 = wb.findElement(By.xpath("//*[@id=\"login-button\"]"));
		    login2.click();
		   
		    Thread.sleep (1000);
		   
		   
		   
		   
		   //WebElement vimal1 = wb.findElememnt(By.xpath)("");
		   
		   
		   
		   //WebElement logout = wb.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
		   //logout.click ();
		   
		    //Thread.sleep(1000);
		   
		   
		   
		/*List<WebElement> prodname = wb.findElements(By.cssSelector("[class=\"inventory_item_name\"]"));

		for (int i = 0; i < prodname.size(); i++) {

		if (wb.findElements(By.cssSelector("[class=\"inventory_item_name\"]")).get(i).getText()
		.equalsIgnoreCase("Sauce Labs Onesie"))
		{   System.out.println("test");
		//wb.findElements(By.xpath("//button[text()=\"Add to cart\"]")).get(i).click(); */


		}
	}


		

