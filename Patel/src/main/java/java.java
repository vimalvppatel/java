public class java 
   public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver",
      "C:\Users\ghs6kor\Desktop\Java\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      String url = "https://www.tutorialspoint.com/index.htm";
      driver.get(url);
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      // identify element and input text inside it
      WebElement l =driver.findElement(By.className("gsc-input"));
      l.sendKeys("Selenium");
      driver.quit();
   }
}