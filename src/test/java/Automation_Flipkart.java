import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_Flipkart {
  @Test
  public void login() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 
	  
	  driver.get("https://www.flipkart.com/");
	  
	  Actions action=new Actions(driver);
	 
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("naveenbhog00@gmail.com");
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("navi@8722");
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
//	 action.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[1]/div/img"))).build().perform(); 
//	action.moveToElement(driver.findElement(By.xpath("//A[@class='_6WOcW9 _2-k99T']"))).build().perform();
	WebElement element= driver.findElement(By.name("q"));
	element.sendKeys("mens tshirt");
	element.sendKeys(Keys.ENTER);
//	JavascriptExecutor js=((JavascriptExecutor)driver);
//	js.executeScript("window.scrollBy(0,1250)", "");
	action.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[6]"))).build().perform();
	action.moveToElement(driver.findElement(By.linkText("Bulbs"))).build().perform();
	driver.findElement(By.linkText("Bulbs")).click();
	System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[2]")).getText());
	driver.findElement(By.linkText("Pick Ur Needs 28 W Decorative B22 LED Bulb")).click();
	ArrayList<String> array=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(array.get(1));
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]")).click();
	
//	driver.quit();
	  }
}
