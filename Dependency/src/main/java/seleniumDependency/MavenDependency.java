package seleniumDependency;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MavenDependency {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg  = "Christmas is a well-known Christian holiday set in December, celebrated the world over and famed for its decorations and Santa Clause. The Christmas means  “Feast day of Christ”.It is a yearly celebration marking Jesus Christ’s birth; it is observed on the 25th of December as a cultural and religious celebration among a lot of people all over the world. Christmas is celebrated in all Christian countries but there are differences in the way each nation celebrates this date.";
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		WebDriver wb = new ChromeDriver(options);
		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wb.get("https://www.google.com");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// wb.findElement(By.cssSelector("[jslog=\"71121; track:click;\"]")).click();
		wb.findElement(By.cssSelector("[class=\"SDkEP\"]")).click();

		wb.findElement(By.cssSelector("[title=\"Search\"]")).sendKeys("google transalate");

		Actions c = new Actions(wb);
		c.keyDown(Keys.ENTER).build().perform();

		wb.findElement(By.cssSelector("[class=\"source-language\"]")).click();

		wb.findElement(By.cssSelector("[placeholder=\"Translate from\"]")).sendKeys("English");

		Actions c1 = new Actions(wb);
		c1.keyDown(Keys.ENTER).build().perform();
		wb.findElement(By.cssSelector("[class=\"target-language\"]")).click();

		wb.findElement(By.cssSelector("[placeholder=\"Translate to\"]")).sendKeys("Hindi");
		c1.keyDown(Keys.ENTER).build().perform();

		wb.findElement(By.cssSelector("[placeholder=\"Enter text\"]")).sendKeys(msg);

		System.out.println(wb.findElement(By.xpath("(//span[@lang=\"hi\"])[1]")).getText());
		// class="target-language"

	}

}
