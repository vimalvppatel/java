package eproc;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class tesser {

	WebDriver wb;

	public tesser(WebDriver wb) {
		this.wb = wb;
	}

	public void getCaptcha() {

		String url = wb.findElement(By.cssSelector("[name=\"captchaImage\"]")).getAttribute("src");
		wb.switchTo().newWindow(WindowType.TAB);

		wb.get(url);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

			tesseract.setDatapath(System.getProperty("user.dir") + "\\Tess4J\\tessdata");

			captchaText = tesseract.doOCR(screenshot);
			System.out.println("***Captured captcha text***------" + captchaText);

		} catch (TesseractException e) {
			e.printStackTrace();
		}
		Set<String> handle = wb.getWindowHandles();
		Iterator<String> handleit = handle.iterator();

		String main = handleit.next();
		String main1 = handleit.next();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wb.close();
		wb.switchTo().window(main);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("***Entering captured captcha***");

		wb.findElement(By.cssSelector("[id=\"captchaText\"]")).sendKeys(captchaText);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
