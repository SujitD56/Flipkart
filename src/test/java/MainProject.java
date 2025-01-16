import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Flipkart_utilities.Commons;

public class MainProject {
	
	Commons commons=new Commons();
	  WebDriver driver=commons.setUpDriver1();
  @Test
  public void login() throws InterruptedException {
	  driver.get("https://be.cognizant.com/");
	Thread.sleep(20000);
	driver.findElement(By.id("idSIButton9")).click();
	Thread.sleep(20000);
	driver.findElement(By.id("idSIButton9")).click();	
    driver.findElement(By.xpath("//*[@id=\"idDiv_SAOTCS_Proofs\"]/div[1]/div/div/div[2]")).click();
    Thread.sleep(20000);
    driver.findElement(By.id("idSubmit_SAOTCC_Continue")).click();
    driver.findElement(By.id("idSIButton9")).click();
    WebElement username=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
	System.out.println(username.getText());
	WebElement designation=driver.findElement(By.xpath("//*[@id=\"userProfileToggleBtn\"]/div/div[2]/span"));
	System.out.println(designation.getText());
	
    Thread.sleep(1000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,2000)", "");
	Thread.sleep(2000);
	
	WebElement slider = driver.findElement(By.xpath("//div[@class='slider-handle min-slider-handle round'] "));
	Actions action = new Actions(driver);
	action.clickAndHold(slider).moveByOffset(100, 0).release().build().perform();
	String place11="NJ";
	String date111 = driver.findElement(By.xpath("//span[text()=' Teaneck, NJ (ET)  ']/preceding-sibling::span[@class='date ng-binding']")).getText();
	String time111 = driver.findElement(By.xpath("//span[text()=' Teaneck, NJ (ET)  ']/preceding-sibling::span[@class='time flex align-items-baseline justify-content-center ng-binding']")).getText();
	String country111 = driver.findElement(By.xpath("//span[text()=' Teaneck, NJ (ET)  ']")).getText();

	String timeformat111 = date111 + " " + time111.replace("\n", " ");

	System.out
			.println("*****************************Date time for " + place11 + "**********************************");
	System.out.println("Date and Time in World Clock Section of " + country111 + " was " + timeformat111);

	String place21="london";
	String date1111 = driver.findElement(By.xpath("//span[text()=' London, UK (BST) ']/preceding-sibling::span[@class='date ng-binding']")).getText();
	String time1111 = driver.findElement(By.xpath("//span[text()=' London, UK (BST) ']/preceding-sibling::span[@class='time flex align-items-baseline justify-content-center ng-binding'] ")).getText();
	String country1111 = driver.findElement(By.xpath("//span[text()=' London, UK (BST) ']")).getText();

	String timeformat1111 = date1111 + " " + time1111.replace("\n", " ");

	System.out
			.println("*****************************Date time for " + place11 + "**********************************");
	System.out.println("Date and Time in World Clock Section of " + country1111 + " was " + timeformat1111);
	
	
	String place31="India";
	String date11111 = driver.findElement(By.xpath("//span[text()=' India (IST) ']/preceding-sibling::span[@class='date ng-binding'] ")).getText();
	String time11111 = driver.findElement(By.xpath("//span[text()=' India (IST) ']/preceding-sibling::span[@class='time flex align-items-baseline justify-content-center ng-binding'] ")).getText();
	String country11111 = driver.findElement(By.xpath("//span[text()=' India (IST) ']")).getText();

	String timeformat11111 = date11111 + " " + time11111.replace("\n", " ");

	System.out
			.println("*****************************Date time for " + place11 + "**********************************");
	System.out.println("Date and Time in World Clock Section of " + country11111 + " was " + timeformat11111);
	
	

	
	
//	String place1="NJ";
//	String date = driver.findElement(By.xpath("//span[text()=' Teaneck, NJ (ET)  ']/preceding-sibling::span[@class='date ng-binding']")).getText();
//	String time = driver.findElement(By.xpath("//span[text()=' Teaneck, NJ (ET)  ']/preceding-sibling::span[@class='time flex align-items-baseline justify-content-center ng-binding']")).getText();
//	String country = driver.findElement(By.xpath("//span[text()=' Teaneck, NJ (ET)  ']")).getText();
//
//	String timeformat = date + " " + time.replace("\n", " ");
//
//	System.out
//			.println("*****************************Date time for " + place1 + "**********************************");
//	System.out.println("Date and Time in World Clock Section of " + country + " was " + timeformat);
//
//	String place2="london";
//	String date1 = driver.findElement(By.xpath("//span[text()=' London, UK (BST) ']/preceding-sibling::span[@class='date ng-binding']")).getText();
//	String time1 = driver.findElement(By.xpath("//span[text()=' London, UK (BST) ']/preceding-sibling::span[@class='time flex align-items-baseline justify-content-center ng-binding'] ")).getText();
//	String country1 = driver.findElement(By.xpath("//span[text()=' London, UK (BST) ']")).getText();
//
//	String timeformat1 = date1 + " " + time1.replace("\n", " ");
//
//	System.out
//			.println("*****************************Date time for " + place1 + "**********************************");
//	System.out.println("Date and Time in World Clock Section of " + country1 + " was " + timeformat1);
//	
//	
//	String place3="India";
//	String date11 = driver.findElement(By.xpath("//span[text()=' India (IST) ']/preceding-sibling::span[@class='date ng-binding'] ")).getText();
//	String time11 = driver.findElement(By.xpath("//span[text()=' India (IST) ']/preceding-sibling::span[@class='time flex align-items-baseline justify-content-center ng-binding'] ")).getText();
//	String country11 = driver.findElement(By.xpath("//span[text()=' India (IST) ']")).getText();
//
//	String timeformat11 = date11 + " " + time11.replace("\n", " ");
//
//	System.out
//			.println("*****************************Date time for " + place1 + "**********************************");
//	System.out.println("Date and Time in World Clock Section of " + country11 + " was " + timeformat11);
	
	
	
	
//	WebElement slider = driver.findElement(By.cssSelector("#\\35 772 > div.slider-handle.min-slider-handle.round"));
//	Thread.sleep(2000);
//    Actions move = new Actions(driver);
//    Action action = (Action) move.dragAndDropBy(slider, 676, 664).build();
//    ((Actions) action).perform();

    
    
  }
}
