package login001;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {

	private static final String JavasctiptExecutor = null;
	private static final String Tab1 = null;

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions() ;
		op.addArguments("--remote-allow-origins=*");
		WebDriver wb = new ChromeDriver(op); 
	    wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wb.manage().window().maximize();
	
        wb.get("https://admin.mahakalcoolingfrpfans.com/admin");
        
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		String domain=RandomStringGenerator.generateRandomString(5);
		
	wb.findElement(By.id("exampleInputEmail")).sendKeys("admin@gmail.com");
	wb.findElement(By.id("exampleInputPassword")).sendKeys("123456");
	
	wb.findElement(By.cssSelector("[type=\"submit\"]")).click();
		 
	  Thread.sleep(10);
	     
	wb.findElement(By.xpath("(//a[@href=\"./contactus-page\"])[1]")).click();
	  
	 JavascriptExecutor js = (JavascriptExecutor)wb;

	 Object executeScript = js.executeScript("window.scrollBy(0,1000)", args);
	 
	 wb.navigate().back();
	    		
	wb.findElement(By.cssSelector("[href=\"./project-page\"]")).click();
    
	  wb.findElement(By.cssSelector("[href=\"./add-project-page\"]")).click();
	 
	   wb.findElement(By.cssSelector("[placeholder=\"Enter details\"]")).sendKeys("Vimal Patel");
	 
	    wb.findElement(By.cssSelector("[placeholder=\"Post any information\"]")).sendKeys("“Just one small positive thought in the morning can change your whole day.”");
	  
           //wb.findElement(By.cssSelector("[type=\"file\"]")).sendKeys("C:\\Users\\LENOVO\\Pictures\\Screenshot 2023-07-14 162326.png");
	  
	  	 wb.findElement(By.cssSelector("[type=\"file\"]")).sendKeys("C:\\Users\\LENOVO\\Pictures\\wave Icon.png");
	  	 
	  	 wb.findElement(By.cssSelector("[type=\"submit\"]")).click();
	  	 
	  	 wb.switchTo().newWindow(WindowType.TAB);
	  	   // wb.switchTo().newWindow(WindowType.WINDOW);
	  
	  wb.get("https://mahakalcoolingfrpfans.com/");
	  
	     wb.findElement(By.cssSelector("[href=\"/project\"]")).click();
	      
	         // wb.navigate().back();
	     
        wb.get("https://admin.mahakalcoolingfrpfans.com/admin");
       
        wb.findElement(By.cssSelector("[href=\"./enquiry-page\"]")).click();
        
        wb.navigate().back();
        
        wb.findElement(By.cssSelector("[href=\"./Blogdetails-page\"]")).click();
        
        wb.findElement(By.cssSelector("[href=\"./add-page\"]")).click();
        
        wb.findElement(By.cssSelector("[placeholder=\"Enter details\"]")).sendKeys("Vimalpatel");
        
        wb.findElement(By.cssSelector("[type=\"file\"]")).sendKeys("C:\\Users\\LENOVO\\Pictures\\Cannt get.png");
        
        wb.findElement(By.cssSelector("[placeholder=\"Post any information\"]")).sendKeys("Positive thinking is an attitude which helps to highlight a brighter side of a person. Positive thinking is very important to lead a healthy & happy life. Positive thinking always bring in satisfaction. A person with positive thinking follows a healthy mind set");
        
        wb.findElement(By.cssSelector("[type=\"submit\"]")).click();
        
         
        wb.get("https://mahakalcoolingfrpfans.com/");
         
          wb.findElement(By.xpath("(//a[@href=\"/Blog\"])[1]")).click();
          
          
	    wb.findElement(By.xpath("(//a[@href=\"/Contact\"])[1]")).click();
	       
		JavascriptExecutor js1 = (JavascriptExecutor)wb;

		js1.executeScript("window.scrollBy(0,1000)");
  	//	
	        
		
		wb.findElement(By.cssSelector("[class=\"form-control w-100 mb-3 p-2\"]")).sendKeys("Vimalpatel");
		  wb.findElement(By.cssSelector("[name=\"email\"]")).sendKeys("vimalpatel35458@gmail.com");
		    wb.findElement(By.cssSelector("[name=\"mobileno\"]")).sendKeys("9977596636");
		      wb.findElement(By.cssSelector("[name=\"companyname\"]")).sendKeys("INfograins");
			    wb.findElement(By.cssSelector("[name=\"subject\"]")).sendKeys("Testing");
			      wb.findElement(By.cssSelector("[placeholder=\"Message\"]")).sendKeys("XYZ");
			      
			      WebElement element = wb.findElement(By.xpath("//div/form/button[text()=\"send Message\"]"));
			      JavascriptExecutor js2 = (JavascriptExecutor)wb;
			      js2.executeScript("arguments[0].scrollIntoView(true);", element);
                    wb.findElement(By.xpath("//div/form/button[text()=\"send Message\"]")).click();
		      
         
		  
		  
   } 

}
