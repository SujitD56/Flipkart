import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Flipkart_utilities.Commons;



public class FlipkartAutomation {
	Commons commons=new Commons();
	  WebDriver driver=commons.setUpDriver1();
	
  @Test
  public void launchAppliction() {
	 //Launching the application
	  commons.launchApplication(driver);
	 
  }
  

  @Test
  public void loginpage() {
	  //Entering the Email
	  WebElement email=driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div:nth-child(1) > input"));
		email.sendKeys("naveenbhog00@gmail.com");
	  //Entering the password
		WebElement password=driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div:nth-child(2) > input"));
		password.sendKeys("navi@8722");
	  //Clicking the login button
		WebElement button=driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div._1D1L_j > button"));
		button.click();
		System.out.println(driver.getTitle());
	  
  }
//  @Test
////  public void searching() throws InterruptedException {
////	  
// //Typing puma shoes in the searchbar
//		WebElement search=driver.findElement(By.className("_3704LK"));
//		search.sendKeys("puma shoes"+Keys.ENTER); 
//		Thread.sleep(1000);
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,250)", "");
// //clicking the first item in the list
//		WebElement firstproduct=  driver.findElement(By.className("_2r_T1I"));
//		firstproduct.click();
// //Switching to the second tab 
//		  ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
//		    
//		    driver.switchTo().window(newTab.get(1));
// //Selecting the size
//		   WebElement size= driver.findElement(By.id("swatch-0-size"));
//				   size.click();
// //Adding to the cart
//		   WebElement Addtocart= driver.findElement(By.cssSelector("#container > div > div._2c7YLP.UtUXW0._6t1WkM._3HqJxg > div._1YokD2._2GoDe3 > div._1YokD2._3Mn1Gg.col-5-12._78xt5Y > div:nth-child(2) > div > ul > li:nth-child(1)"));
//		   Addtocart.click();
// //Mousehovering on myaccount option
//		   Actions actions = new Actions(driver);
////		   WebElement womenTab = driver.findElement(By.xpath("//span[normalize-space()='My Account']"));
//		   WebElement womenTab = driver.findElement(By.className("exehdJ"));
//			commons.getHardwait();
//			actions.moveToElement(womenTab).perform();
// //Clicking logout option
//		WebElement logout=driver.findElement(By.linkText("Logout"));
//		actions.moveToElement(logout).click().build().perform();
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
//		  WebElement myaccount=  driver.findElement(By.className("exehdJ"));
//		  WebElement Logout=  driver.findElement(By.className("_3vhnxf"));
//				  Logout.click();

//		   //Instantiating Actions class
//		   Actions actions = new Actions(driver);
//		   
//		// Locating the Main Menu (Parent element)
//		   WebElement mainMenu = driver.findElement(By.linkText("My Account"));
//
//		   //Hovering on main menu
//		   actions.moveToElement(mainMenu).build().perform();
//
////		   // Locating the element from Sub Menu
////		   WebElement subMenu = driver.findElement(By.className("_3vhnxf"));
////
////		   //To mouseover on sub menu
////		   actions.moveToElement(subMenu);
////
////		   //build()- used to compile all the actions into a single step 
////		   actions.click().build().perform();

  }
  
//  @Test
//  public void AddtoCart() throws InterruptedException {
//	  
//	
//	  
//  }
  
  
  
//  driver.get("https://www.flipkart.com/puma-prowl-slip-wns-walking-shoes-women/p/itmc34dc81895d2a?pid=SHOFNUJSQ9FWVEH7&lid=LSTSHOFNUJSQ9FWVEH7TRRNLR&marketplace=FLIPKART&q=puma+shoes&store=osp&srno=s_1_1&otracker=search&otracker1=search&iid=en_wB6mRFWzlRCX9JIfYkcQdDFy7OHit%2FZZQV02gaIQCfI1RqcAG3%2FPDVVC%2BWKY%2Bo7udf5rD%2BVa7MzgeTmjCrKETg%3D%3D&ssid=x5we6xrb1s0000001657019956797&qH=12daa41359850f83");


//  driver.findElement(By.id("swatch-5-size")).click();
//  driver.findElement(By.cssSelector("#container > div > div._2c7YLP.UtUXW0._6t1WkM._3HqJxg > div._1YokD2._2GoDe3 > div._1YokD2._3Mn1Gg.col-5-12._78xt5Y > div:nth-child(2) > div > ul > li:nth-child(1)")).click();

  

