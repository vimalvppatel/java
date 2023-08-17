package eproc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class dataPagination {

	@Test(dataProvider = "myDataProvider", dataProviderClass = dataprovider.class)
	public void TenderDownloader(String keyword) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wb.get("https://etenders.gov.in/eprocure/app");
		System.out.println("***Launching eProcure web application***");
		System.out.println("***Navigating to " + wb.getCurrentUrl() + " ****");

		/*
		 * Properties p = new Properties(); File file = new
		 * File(System.getProperty("user.dir") +
		 * "//src\\test\\java\\config.properties"); FileReader reader = null; try {
		 * reader = new FileReader(file); } catch (FileNotFoundException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * try { p.load(reader); } catch (IOException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); } String searchkeyword =
		 * p.getProperty("Searchkeyword");
		 */

		String searchkeyword = keyword;

		int keyi = searchkeyword.split("").length;

		wb.findElement(By.cssSelector("[name=\"SearchDescription\"]")).sendKeys(searchkeyword);

		if (keyi < 3) {
			System.out.println("***Search keyword should be of min 3 characters***");
			System.out.println("***Re-run the script with min 3 character search keyword***");
			wb.quit();
			//System.exit(0);

		}
		System.out.println("***Searching for tenders***");
		wb.findElement(By.cssSelector("[name=\"Go\"]")).click();

		try {

			wb.findElement(By.cssSelector("[id=\"DirectLink_0\"]")).click();

		} catch (Exception e) {
			System.out.println("***No tender found with searched keyword***");
			System.out.println("***Re-run the script with another keyword***");
			wb.quit();
		//	System.exit(0);

		}

		JavascriptExecutor js = (JavascriptExecutor) wb;
		js.executeScript("window.scrollBy(0,600)");

		wb.findElement(By.cssSelector("[id=\"DirectLink_8\"]")).click();
		System.out.println("***Fetching captcha***");
		tesser t22 = new tesser(wb);
		try {
			t22.getCaptcha();
		} catch (Exception e) {

		}
		int runcount = 0;

		try {
			boolean pr = wb.findElement(By.xpath("//b[text()=\"Invalid Captcha! Please Enter Correct Captcha.\"]"))
					.isDisplayed();
			while (pr) {
				t22.getCaptcha();
				runcount++;
				if (runcount == 2) {
					System.out.println("***Restarting the script***");
					wb.quit();
					Thread.sleep(2000);
					TenderDownloader(searchkeyword);

				}
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
		System.out.println("***Bulk file download started***");
		wb.findElement(By.cssSelector("[title=\"Back\"]")).click();
		JavascriptExecutor js2 = (JavascriptExecutor) wb;
		js2.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

		int pages = wb
				.findElements(By.xpath("//td[@class=\"list_footer\"]//span/span//*[starts-with(@id,\"linkPage\")]"))
				.size();
		// System.out.println(pages);
		if (pages == 0) {

			List<WebElement> tenderlist = wb
					.findElements(By.xpath("//tbody/tr//td//a[@title=\"View Tender Information\"]"));

			for (int i = 0; i < tenderlist.size(); i++) {
				wb.findElements(By.xpath("//tbody/tr//td//a[@title=\"View Tender Information\"]")).get(i).click();
				JavascriptExecutor js3 = (JavascriptExecutor) wb;
				js3.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
				wb.findElement(By.cssSelector("[title=\"Download the packet document as zipicon\"]")).click();
				wb.findElement(By.cssSelector("[title=\"Back\"]")).click();
				System.out.println("***Downloading tender file***");

			}
		} else {

			List<WebElement> tenderlist = wb
					.findElements(By.xpath("//tbody/tr//td//a[@title=\"View Tender Information\"]"));

			for (int i = 0; i < tenderlist.size(); i++) {
				wb.findElements(By.xpath("//tbody/tr//td//a[@title=\"View Tender Information\"]")).get(i).click();
				JavascriptExecutor js3 = (JavascriptExecutor) wb;
				js3.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
				wb.findElement(By.cssSelector("[title=\"Download the packet document as zipicon\"]")).click();
				wb.findElement(By.cssSelector("[title=\"Back\"]")).click();
				System.out.println("***Downloading tender file***");

			}

			List<WebElement> nextpage = wb.findElements(
					By.xpath("//td[@class=\"list_footer\"]//span/span//*[starts-with(@id,\"linkPage\")]"));

			for (int i = 0; i < nextpage.size(); i++) {
				wb.findElements(By.xpath("//td[@class=\"list_footer\"]//span/span//*[starts-with(@id,\"linkPage\")]"))
						.get(i).click();

				List<WebElement> tenderlist1 = wb
						.findElements(By.xpath("//tbody/tr//td//a[@title=\"View Tender Information\"]"));

				for (int i2 = 0; i2 < tenderlist1.size(); i2++) {
					wb.findElements(By.xpath("//tbody/tr//td//a[@title=\"View Tender Information\"]")).get(i).click();
					JavascriptExecutor js3 = (JavascriptExecutor) wb;
					js3.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
					wb.findElement(By.cssSelector("[title=\"Download the packet document as zipicon\"]")).click();
					wb.findElement(By.cssSelector("[title=\"Back\"]")).click();
					System.out.println("***Downloading tender file***");

				}
			}
			System.out.println("***All the tender files downloaded for searched keyword***");
			wb.quit();
		}
	}

}
