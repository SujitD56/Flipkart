import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.service.DriverService;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {
	
	
	
  @Test
  public void f() throws IOException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
			  
	  driver.get("http:www.amazon.com");
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  Select select=new Select(driver.findElement(By.name("url")));
	  select.selectByVisibleText("Books");
	  driver.findElement(By.id("nav-hamburger-menu")).click();
	  driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[11]/a[1]/div")).click();
	  JavascriptExecutor j= (JavascriptExecutor)driver;
	  j.executeScript("window.scrollBy(0,250)", "");
	  driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/ul[1]/li[6]/a/div")).click();
	  driver.findElement(By.linkText("Watches")).click();
	  driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]/span[2]")).click();
	  driver.findElement(By.linkText("Price: Low to High")).click();
	  System.out.println(driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div[3]")).getText());  
	 driver.navigate().back();
	 driver.navigate().back();
	 Actions action=new Actions(driver);
	  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"))).build().perform();
	  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[9]/span"))).build().perform();
	  driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[9]/span")).click();
	  driver.navigate().back();
	 action.moveToElement(driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]"))).build().perform();
	 action.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[4]/span/span[1]"))).build().perform();
	 driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[4]/span/span[1]")).click();
	 File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(file, new File("C:\\Users\\DELL\\eclipse-workspace\\Flipkart\\src\\test\\resources\\amazon.png"));
	  JavascriptExecutor js=((JavascriptExecutor)driver);
	  js.executeScript("window.scrollBy(0,750)", "");
	  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"6fd2a825-c2ea-4f3a-af0d-0ca994f486d5\"]/div[2]/div/ul/li[4]"))).build().perform();
	
	
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
