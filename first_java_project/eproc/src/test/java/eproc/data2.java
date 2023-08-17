package eproc;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class data2 {
	public static void main(String[] args) {

		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wb.get("https://etenders.gov.in/eprocure/app");
		wb.findElement(By.cssSelector("[name=\"SearchDescription\"]")).sendKeys("pro");
		wb.findElement(By.cssSelector("[name=\"Go\"]")).click();
		List<WebElement> tenderlist = wb.findElements(By.xpath("//table[@class=\"list_table\"]/tbody/tr"));

		for (int i = 1; i < tenderlist.size(); i++) {

			wb.findElements(By.xpath("//table[@class=\"list_table\"]/tbody/tr/td[5]")).get(i).click();
			JavascriptExecutor js = (JavascriptExecutor) wb;
			js.executeScript("window.scrollBy(0,600)");

			wb.findElement(By.cssSelector("[id=\"DirectLink_8\"]")).click();

			String url = wb.findElement(By.cssSelector("[name=\"captchaImage\"]")).getAttribute("src");
			wb.switchTo().newWindow(WindowType.TAB);

			// tesser.getCaptca();

			wb.get(url);

			// Take a screenshot of the CAPTCHA image
			TakesScreenshot t = (TakesScreenshot) wb;
			File screenshot = t.getScreenshotAs(OutputType.FILE);

			// Preprocess the image (if needed)

			// Use Tesseract to extract text from the image
			Tesseract tesseract = new Tesseract();
			String captchaText = null;

			try {
				// Specify the path to the Tesseract data folder (change this according to your
				// system)
				tesseract.setDatapath("E:\\automation\\eproc\\Tess4J\\tessdata");
				captchaText = tesseract.doOCR(screenshot);
				System.out.println(captchaText);
			} catch (TesseractException e) {
				e.printStackTrace();
			}
			Set<String> handle = wb.getWindowHandles();
			Iterator<String> handleit = handle.iterator();

			String main = handleit.next();
			String main1 = handleit.next();

			wb.switchTo().window(main);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			wb.findElement(By.cssSelector("[id=\"captchaText\"]")).sendKeys(captchaText);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			JavascriptExecutor js1 = (JavascriptExecutor) wb;

			js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			try {
				wb.findElement(By.cssSelector("[title=\"Download the packet document as zipicon\"]")).click();

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				wb.findElement(By.cssSelector("[title=\"Back\"]")).click();
			} catch (Exception e) {
				wb.findElement(By.cssSelector("[title=\"Back\"]")).click();
			}

		}

	}

}
