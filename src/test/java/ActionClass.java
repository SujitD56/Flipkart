

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {
	
  @Test
  public void actions() throws InterruptedException, IOException {
//	  WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		  driver.manage().deleteAllCookies();
		  
		  
		  //Mousehovering on the elements
//	  driver.get("https://www.spicejet.com/"); 
//	  Actions action=new Actions(driver);
//	  Thread.sleep(5000);
//	  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div[1]/div[1]"))).build().perform();
// 
	  //drag and drop
//		  driver.get("https://jqueryui.com/droppable/");
//	      Actions action=new Actions(driver);
//	      driver.switchTo().frame(0);
//	      action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
//	      
		  
		  //navigation back and forward 
//		  driver.get("https:www.google.com");	
		  //for navigating the url
//		  driver.navigate().to("https://www.spicejet.com/");
//		  driver.navigate().back();
//		  driver.navigate().forward();
		  
		  //refresh the page
		  //driver.navigate().refresh();
		  
		  //naukari.com website
		 // driver.get("https:www.google.com");	
//		  Thread.sleep(1000);
//		 driver.findElement(By.name("q")).sendKeys("naukari.com");
//		 Thread.sleep(5000);
//		  driver.findElement(By.className("pcTkSc")).click();
//		  driver.findElement(By.linkText("Employer's Login")).click();
//			 Thread.sleep(5000);
//			Actions action = new Actions(driver);
//			action.moveToElement(driver.findElement(By.className("ulTxt"))).build().perform();
//			Thread.sleep(3000);
//			action.moveToElement(driver.findElement(By.linkText("Job Posting"))).click().build().perform();
//			JavascriptExecutor jse = (JavascriptExecutor)driver;
//			jse.executeScript("window.scrollBy(0,250)", ""); 
//			driver.findElement(By.className("jss113")).click();
			
			
			 //static or hard wait
			 // Thread.sleep(5000);
			
		  //dynamic waits
//		  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		  
		  
		//taking screenshot
//		  driver.get("https:www.google.com");
//		  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		  FileUtils.copyFile(src, new File("C:\\Users\\DELL\\eclipse-workspace\\Flipkart\\src\\test\\resources\\google.png"));
		  
//		  driver.get("https:facebook.com");
//		  Thread.sleep(5000);
//		  WebElement day=driver.findElement(By.id("day"));
//		  WebElement month=driver.findElement(By.id("month"));
//		  WebElement year=driver.findElement(By.id("year"));
//		  Select select=new Select(day);
//		  select.selectByVisibleText("10");
//		  Select select1=new Select(month);
//		  select.selectByVisibleText("10");
//		  Select select2=new Select(year);
//		  select.selectByVisibleText("2002");
		  
		  //for practice of frames and new tab 
//		  driver.get("https://phptravels.com/demo/");
//		  Thread.sleep(5000);
//		  driver.findElement(By.linkText("Login")).click();
		  //switch to next window
//		  ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());		    
//		    driver.switchTo().window(newTab.get(1));
//		    Thread.sleep(5000);		  
//		  driver.findElement(By.linkText("Account")).click();
//		  Thread.sleep(5000);
//		  driver.findElement(By.linkText("Forgot Password?")).click();
//		 Thread.sleep(2000);
//		 driver.switchTo().frame(0);
//		  driver.findElement(By.id("recaptcha-anchor")).click();
//		  Thread.sleep(2000);
//		  driver.findElement(By.xpath("//button[@text()='Submit']")).click();
		  
		//  driver.get("http://www.seleniumframework.com/Practiceform/");
//		  driver.findElement(By.id("alert")).click();
//		  Thread.sleep(5000); 
	  
		  //alert acception
//		  Alert alert=driver.switchTo().alert();
//		  alert.accept();
//		  Thread.sleep(5000);	  
		  //scrolling window
//		  Thread.sleep(5000);
//		  JavascriptExecutor jse = (JavascriptExecutor)driver;
//			jse.executeScript("window.scrollBy(0,500)", "");
		  //drag and drop
//		  Actions action=new Actions(driver);	  
//		  Thread.sleep(5000);
//		  action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draga\"]"))).moveToElement(driver.findElement(By.xpath("//*[@id=\"dragb\"]"))).release().build().perform();
		 
		  //practice of websites
//		  driver.get("https://www.way2automation.com/demo.html");
//		 JavascriptExecutor js=(JavascriptExecutor)driver;
//		 js.executeScript("window.scrollBy(0,800)", "");
//		  Thread.sleep(3000);
//		  driver.findElement(By.linkText("Selectable")).click();
//		  ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());		    
//	     driver.switchTo().window(newTab.get(1));
//		  Thread.sleep(2000);
//		  driver.findElement(By.name("name")).sendKeys("naveen");
//		  Thread.sleep(1000);
//		  Select select = new Select(driver.findElement(By.name("country")));
//		  select.selectByVisibleText("Algeria");
//		  Thread.sleep(5000);
//		  driver.switchTo().frame(0);
//		  driver.findElement(By.linkText("Signin")).click();
		  
		  
//		 driver.get("https://demoqa.com/elements");
		 //test box
//		 Thread.sleep(3000);
//		 driver.findElement(By.id("item-0")).click();
//		 driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("naveen");
//		 driver.findElement(By.id("userEmail")).sendKeys("naveen@gmail.com");
//		 driver.findElement(By.id("currentAddress")).sendKeys("ilkal");
//		 driver.findElement(By.id("permanentAddress")).sendKeys("ilkal");
//		 JavascriptExecutor js=(JavascriptExecutor)driver;
//		 js.executeScript("window.scrollBy(0,500)", "");
//		 Thread.sleep(3000);
//		 driver.findElement(By.id("submit")).click();
//	     WebElement output=	 driver.findElement(By.id("output"));
//	     System.out.println(output.getText());
		 
		 //check box
//		Thread.sleep(3000);
//		driver.findElement(By.id("item-1")).click();
//	    Thread.sleep(3000);
//	    driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[3]")).click();
//	   System.out.println(driver.findElement(By.id("result")).getText()); 
		  
		  //radio button
//		 Thread.sleep(3000);
//		 driver.findElement(By.id("item-2")).click();
//		 Thread.sleep(3000);
//		System.out.println( driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[1]")).getText());
//  	WebElement select=	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label"));
//	    select.click();
//	
//	    boolean selected=select.isEnabled();
//		 System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p")).getText());
//		 System.out.println(selected);
		 
		 
		 //clicking buttons
//		 Thread.sleep(3000);
//		 JavascriptExecutor js=(JavascriptExecutor)driver;
//		 js.executeScript("window.scrollBy(0,500)", "");
//		 driver.findElement(By.id("item-4")).click();
//		                       //double clicking on a element
//		 Actions action=new Actions(driver);
//		 action.doubleClick(driver.findElement(By.id("doubleClickBtn"))).build().perform();
//		 System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());
//		 Thread.sleep(3000);
//		                       //right clicking on element
//		 action.contextClick(driver.findElement(By.id("rightClickMessage"))).build().perform();
//		System.out.println(driver.findElement(By.id("rightClickMessage")).getText());
//		Thread.sleep(3000);
//		                       //one clicking on element
//		driver.findElement(By.id("80Ahc")).click();
//		System.out.println(driver.findElement(By.id("dynamicClickMessage")).getText());
		 
		  //slider
//		  driver.get("https://demoqa.com/widgets");
//		 Thread.sleep(3000);
//		 JavascriptExecutor js=(JavascriptExecutor)driver;
//		 js.executeScript("window.scrollBy(0,500)", "");
//		 driver.findElement(By.id("item-3")).click();
//		 Thread.sleep(3000);
//		 Actions action=new Actions(driver);
//		 action.clickAndHold(driver.findElement(By.id("sliderContainer"))).moveByOffset(100, 0).release().build().perform();
//		 
	  
	  
		 //Excel reader
	    //Create an object of File class to open xlsx file
		File src= new File("C:\\Users\\DELL\\Desktop\\excelsheel.xlsx");
		
		//Create an object of FileInputStream class to read excel file
		FileInputStream fis=new FileInputStream(src);  
		
		//create object of XSSFWorkbook class
		XSSFWorkbook xsf=new XSSFWorkbook(fis);
		
		//Read sheet inside the workbook by its index
		XSSFSheet sheet=xsf.getSheetAt(0);
		
		//get value from excel sheet
		System.out.println(sheet.getRow(1).getCell(0));
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
  }
}
