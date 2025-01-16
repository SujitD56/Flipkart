import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class log4j {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("https://www.google.co.in/");
	  driver.findElement(By.name("q")).sendKeys("amazon");
	  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[8]")).click();
	  JavascriptExecutor js=((JavascriptExecutor)driver);
	  js.executeScript("window.scrollBy(0,750)", "");
	  
	  driver.findElement(By.xpath("//*[@id=\"rso\"]/div[9]/div/div")).click();
	  
	  
	  
	  
  }
}
