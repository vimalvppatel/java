 
       public class test {
	
		   public static void main(String[] args) {
		      System.setProperty("webdriver.chrome.driver",
		      "C:\Users\ghs6kor\Desktop\Java\chromedriver.exe");
		      WebDriver driver = new ChromeDriver();
		      String url = "https://www.google.com/search?q=google.translate&oq=goggle.&aqs=chrome.2.69i57j0i10i131i433i512j0i10i512j0i433i650j0i10i131i433i512l2j69i60j69i65.10782j0j7&sourceid=chrome&ie=UTF-8";
		      driver.get(url);
		      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		      // identify element and input text inside it
		      WebElement l =driver.findElement(By.className("gsc-input"));
		      l.sendKeys("Selenium");
		      driver.quit();
		   }
		}
}
