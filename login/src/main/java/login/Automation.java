package login;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Automation {

	private static final String URL = null;

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver wb = new ChromeDriver(op);
		wb.manage().window().maximize();
		wb.get("https://infograinsdevelopment.com/sahaltexi/index.html");
		
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
		WebElement about = wb.findElement(By.xpath("//*[@id=\"navbarNav\"]/div/ul/li[2]/a"));
	    about.click();
	    
	    
      Set<String> handles = wb.getWindowHandles();
		
		Iterator<String> handleiterator = handles.iterator();
		
		String tab1 = handleiterator.next();				
		
	    
	       //wb.navigate().back();
	        //WebElement contact = wb.findElement(By.xpath("(//a[@href=\"contact_us.php\"])[1]"));
	         //contact.click();  
         
	//    WebElement Home = wb.findElement(By.xpath("//a[text()=\"Home\"]"));
	//	Home.click();
		
	String	url=wb.getCurrentUrl();
     System.out.println(url);
     
    String title=  wb.getTitle();
    System.out.println(title);
    
    
  //  wb.navigate().refresh();
    
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    wb.navigate().back();
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
     wb.navigate().forward();
    
    WebElement contact = wb.findElement(By.xpath("(//a[@href=\"contact_us.php\"])[1]"));
     contact.click();
          
     WebElement name = wb.findElement(By.cssSelector("[placeholder=\"Your name..\"]"));
      name.sendKeys("vimal patel");
      
     WebElement mail = wb.findElement(By.cssSelector("[placeholder=\"Your Email..\"]"));
      mail.sendKeys("Vimalpatel35458@gmal.com");

     WebElement phone = wb.findElement(By.cssSelector("[placeholder=\"Your Mobile Number..\"]"));
        phone.sendKeys("9876543456");
        
      WebElement Subject = wb.findElement(By.cssSelector("[id=\"subject\"]"));  
       Subject.sendKeys("Vimal Patel");
      
     WebElement message = wb.findElement(By.cssSelector("[id=\"Message\"]"));
        message.sendKeys("I am vimal patel");
       
        Thread.sleep(1000);
       
        
      //WebElement submit = wb.findElement(By.cssSelector("type=\"submit\""));
      //submit.click();
                 
     WebElement home = wb.findElement(By.xpath("(//a[@href=\"index.html\"])[2]"));
      
      home.click();
      
      JavascriptExecutor js = (JavascriptExecutor)wb;
      
     Object executeScript = js.executeScript("window.scrollBy(0,1000)", args);
      
      WebElement more = wb.findElement(By.xpath("(//a[@href=\"https://play.google.com/\"])[5]"));
      more.click();
         wb.switchTo().window(tab1);	
		
		           //wb.getCurrentUrl();
		          //wb.getTitle();
                 //wb.getPageSource();  

      JavascriptExecutor js1 = (JavascriptExecutor)wb;
        
      Object executeScript1 = js.executeScript("window.scrollBy(0,-100000)",args);
      
               // jse.executeScript("window.scrollBy(0,-250)");
              // OR,
             //jse.executeScript("scroll(0, -250);");
  
      WebElement home2 = wb.findElement(By.xpath("(//a[@class=\"nav-link\"])[4]"));
         home2.click();
              
       wb.switchTo().window(tab1);    
       
       Thread.sleep(1000);
      
               /* WebElement back = wb.findElement(By.cssSelector("[class=\"carousel-control-prev-icon\"]"));
                 back.click();
                    
              WebElement next = wb.findElement(By.xpath("[class=\"carousel-control-next-icon\"]"));
                 next.click();*/
    
         
      JavascriptExecutor  js3 = (JavascriptExecutor)wb; 
      
       Object executeScript2 = js3.executeScript("window.scrollBy(0,10000)");       
       
      WebElement privacy = wb.findElement(By.xpath("(//a[@href=\"policy.php\"])[1]"));
      
       privacy.click();
      
      
      WebElement ho = wb.findElement(By.xpath("(//a[@href=\"index.html\"])[2]"));
          ho.click();
          
          
      WebElement con =wb.findElement(By.xpath("(//a[@href=\"contact_us.php\"])[1]"));
         con.click();       
         
       WebElement na = wb.findElement(By.cssSelector("[id=\"name\"]"));
       na.sendKeys("vimaluitgewerwerwetwet");  
       
      WebElement email = wb.findElement(By.cssSelector("[id=\"email\"]"));
       email.sendKeys("vimwqw.com");
        
      WebElement mobile = wb.findElement(By.cssSelector("[id=\"number\"]"));
       mobile.sendKeys("asfafasf");
                
      WebElement sub =wb.findElement(By.cssSelector("[id=\"subject\"]"));
      sub.sendKeys("87988878977897");
         
      WebElement mess =wb.findElement(By.cssSelector("[id=\"Message\"]"));
       mess.sendKeys("!@#$%^&*(");
      
     Thread.sleep(10000);
       
      WebElement click = wb.findElement(By.cssSelector("[class=\"cont_submit\"]"));
          click.click();
          
       Thread.sleep(1000);

      WebElement subj = wb.findElement(By.cssSelector("[type=\"submit\"]"));
     
       subj.click();    		  
        

       
    
          
          
          
          
	}

}
