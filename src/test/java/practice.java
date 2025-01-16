import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {
	
	
  @Test
  public void f() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("http://newtours.demoaut.com");
Thread.sleep(3000);



  }
 
  
	 
		
	 
  
  
  

 
  
}