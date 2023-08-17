package eproc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class data {
	public static void main(String[] args) {

		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wb.get("https://etenders.gov.in/eprocure/app");
		System.out.println("***Launching eprocure web application");
		wb.findElement(By.cssSelector("[name=\"SearchDescription\"]")).sendKeys("pro");
		wb.findElement(By.cssSelector("[name=\"Go\"]")).click();
		System.out.println("***searching for tenders");
		wb.findElement(By.cssSelector("[id=\"DirectLink_0\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor) wb;
		js.executeScript("window.scrollBy(0,600)");

		wb.findElement(By.cssSelector("[id=\"DirectLink_8\"]")).click();
		System.out.println("***Fetching captca");

		//////////////////////////////////////////

		tesser t22 = new tesser(wb);
		try {

			t22.getCaptcha();
		} catch (Exception e) {

		}

		try {
			boolean pr = wb.findElement(By.xpath("//b[text()=\"Invalid Captcha! Please Enter Correct Captcha.\"]"))
					.isDisplayed();
			while (pr) {
				t22.getCaptcha();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JavascriptExecutor js1 = (JavascriptExecutor) wb;
		js1.executeScript("window.scrollBy(0,900)");
		wb.findElement(By.cssSelector("[title=\"Download the packet document as zipicon\"]")).click();

		wb.findElement(By.cssSelector("[title=\"Back\"]")).click();

		List<WebElement> tenderlist = wb
				.findElements(By.xpath("//tbody/tr//td//a[@title=\"View Tender Information\"]"));

		for (int i = 0; i < tenderlist.size() - 1; i++) {
			wb.findElements(By.xpath("//tbody/tr//td//a[@title=\"View Tender Information\"]")).get(i).click();
			JavascriptExecutor js2 = (JavascriptExecutor) wb;
			js2.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
			wb.findElement(By.cssSelector("[title=\"Download the packet document as zipicon\"]")).click();
			wb.findElement(By.cssSelector("[title=\"Back\"]")).click();

		}

	}
}
