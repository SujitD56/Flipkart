import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class website {
  @Test
  public void f() throws InterruptedException, IOException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	 
	  driver.get("http:www.google.com");
	  Thread.sleep(3000);
	  driver.findElement(By.name("q")).sendKeys("https://the-internet.herokuapp.com/");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[1]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("A/B Testing")).click();
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  System.out.println(driver.getCurrentUrl());
	 System.out.println( driver.findElement(By.id("content")).getText());
	 driver.navigate().back();
	 driver.findElement(By.linkText("Add/Remove Elements")).click();
	 System.out.println(driver.getCurrentUrl());
	 System.out.println( driver.findElement(By.id("content")).getText());
	 driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
	 driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).click();
	 File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(file, new File("C:\\Users\\DELL\\eclipse-workspace\\Flipkart\\src\\test\\resources\\elementbutton.png"));
	  driver.navigate().back();
	  driver.findElement(By.linkText("Basic Auth")).click();
	 driver.navigate().back();
	 driver.findElement(By.linkText("Broken Images")).click();
	driver.navigate().back();
	driver.findElement(By.linkText("Challenging DOM")).click();
	driver.navigate().back();
	driver.findElement(By.linkText("Checkboxes")).click();
	WebElement element=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
	element.click();
	System.out.println(element.isEnabled());
	WebElement element1=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
	element.click();
	System.out.println(element.isEnabled());
	driver.navigate().back();
	driver.findElement(By.linkText("Context Menu")).click();
	Actions action=new Actions(driver);
	action.contextClick(driver.findElement(By.id("hot-spot"))).build().perform();
	Alert alert=driver.switchTo().alert();
	alert.accept();
	driver.navigate().back();
	driver.findElement(By.linkText("Disappearing Elements")).click();
	WebElement disappearing=driver.findElement(By.className("example"));
    System.out.println(disappearing.getText());
	driver.findElement(By.linkText("Home")).click();
	driver.navigate().back();
	driver.findElement(By.linkText("About")).click();
	System.out.println(driver.findElement(By.xpath("/html/body/h1")).getText());
	driver.navigate().back();
	driver.findElement(By.linkText("Contact Us")).click();
	System.out.println(driver.findElement(By.xpath("/html/body/h1")).getText());
	driver.navigate().back();
	driver.findElement(By.linkText("Portfolio")).click();
	System.out.println(driver.findElement(By.xpath("/html/body/h1")).getText());
	driver.navigate().back();
	driver.navigate().back();
	driver.findElement(By.linkText("Drag and Drop")).click();
	action.clickAndHold(driver.findElement(By.id("column-a"))).moveToElement(driver.findElement(By.id("column-b"))).release().build().perform();
	driver.navigate().back();
	driver.findElement(By.linkText("Dropdown")).click();
WebElement select=	driver.findElement(By.id("dropdown"));
Select s=new Select(select);
    s.selectByVisibleText("Option 1");
    File file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(file1, new File("C:\\Users\\DELL\\eclipse-workspace\\Flipkart\\src\\test\\resources\\select.png"));
    driver.navigate().back();
   driver.findElement(By.linkText("Dynamic Controls")).click();
   driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
   String str="It's enabled!";
 
   
   WebElement expectedstr=driver.findElement(By.id("message"));
   if(expectedstr.equals(str)) {
	   driver.findElement(By.xpath("//*[@id=\"input-example\"]/input")).sendKeys("Naveen");
	System.out.println(driver.findElement(By.id("message")).getText()); 
	   
   }
   
   driver.navigate().back();
   driver.findElement(By.linkText("Dynamic Loading")).click();
   driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
   driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
   Thread.sleep(5000);
  System.out.println(driver.findElement(By.xpath("//*[@id=\"finish\"]/h4")).getText()); 
  driver.navigate().back();
  driver.navigate().back();
  driver.findElement(By.linkText("Entry Ad")).click();
  Thread.sleep(3000);
//  driver.switchTo().frame(0);
  driver.findElement(By.xpath("//*[@id=\"modal\"]/div[2]/div[3]/p")).click();
	Thread.sleep(5000);
	
	
	

	
	 
	  
	
	
	
	
	
	
	
	
	
	
	  
	  driver.close();
	  
  }
}
