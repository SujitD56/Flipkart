import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Flipkart_utilities.Commons;

public class TcsAutomation {
	
	
  @Test
  public void Login() throws InterruptedException {
	  //input from users
	  Scanner scanner=new Scanner(System.in);
	  

	  System.out.println("Enter firstname:");
	  String firstname=scanner.nextLine();
	  
	  System.out.println("Enter lastname:");
	  String lastname=scanner.nextLine();
	  
	  System.out.println("Enter email:");
	  String email=scanner.nextLine();
	  
	  System.out.println("Enter mobilenumber:");
	  String mobilenumber=scanner.nextLine();
	  
	  System.out.println("Enter password:");
	  String password=scanner.nextLine();
	  
	  System.out.println("Enter passwordconfirm:");
	  String passwordconfirm=scanner.nextLine();
	  
	  System.out.println("Enter questionAnswer:");
	  String questionAns=scanner.nextLine();
	  
	  System.out.println("Enter birthday:");
	  int day=scanner.nextInt();
	  int Day=day-1;
	  String dayXpath="//*[@id=\"ui-select-choices-row-1-"+Day+"\"]/div/div";
	  
	  System.out.println("Enter birthmonth:");
	  int month=scanner.nextInt();
	  int Month=month-1;
	  String monthXpath="//*[@id=\"ui-select-choices-row-2-"+Month+"\"]/div/div";
	  
	  System.out.println("Enter birthyear:");
	  int year=scanner.nextInt();
	  int Year=2022-year;
	  String yearXpath="//*[@id=\"ui-select-choices-row-3-"+Year+"\"]/div/div";
	  
	  System.out.println("Select texttitle: 1: Mr      2:Ms        3:Dr");
	  int texttitle=scanner.nextInt();
	  int Texttitle=texttitle-1;
	  String texttitleXpath="//*[@id=\"ui-select-choices-row-0-"+Texttitle+"\"]/div/div";
	  
	  
	//*[@id="ui-select-choices-row-3-14"]/div/div
	  Commons commons=new Commons();
	  WebDriver driver=commons.setUpDriver1();
	  
	  //opening browser
	  driver.get("https://www.tcs.com/careers/TCSFresherHiringYoP2023?utm_source=Internal&utm_medium=Broadcast&utm_campaign=TCS+Fresher+Hiring&utm_id=TCS+Fresher+Hiring");
	  
	  //accepting cookies
	  driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	  
	  //clicking register today button
	  Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.linkText("REGISTER TODAY")).click();
		
		//switching to next tab
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(newTab.get(1));
	    
	    //clicking register now button
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[@id=\"mainDivision\"]/div/div/section[1]/div[2]/div[3]/button")).click();
	    driver.findElement(By.id("btnSlctIT")).click();
	    
	    //entering values
	    Thread.sleep(10000);
	    driver.findElement(By.id("txtTitle")).click();
	    driver.findElement(By.xpath(texttitleXpath)).click();
	    
	    driver.findElement(By.id("short_txtFirstName")).sendKeys(firstname);
	    
	    driver.findElement(By.id("short_txtLastName")).sendKeys(lastname);
	    
	    driver.findElement(By.xpath("//*[@id=\"dayInDOB\"]/span[1]")).click();  
	    driver.findElement(By.xpath(dayXpath)).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"monthInDOB\"]/span[1]")).click(); 
	    driver.findElement(By.xpath(monthXpath)).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"yearInDOB\"]/span[1]")).click();
	    driver.findElement(By.xpath(yearXpath)).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"short_cmbGender\"]/span[1]")).click();
	    driver.findElement(By.xpath("//*[@id=\"ui-select-choices-row-4-0\"]/div/div")).click();
	    
	    driver.findElement(By.name("short_txtEmail")).sendKeys(email);
	    
	    driver.findElement(By.id("txtMobNo")).sendKeys(mobilenumber);
	    
	    driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[23]/div/div/input")).sendKeys("Basaveshwara engineering college, Bagalkot");
	    
        driver.findElement(By.xpath("//*[@id=\"short_qualCategnameDT\"]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-select-choices-row-6-20\"]/div/div")).click();
        
        driver.findElement(By.xpath("//*[@id=\"short_qualHighQualYOP\"]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-select-choices-row-8-3\"]/div/div")).click();
        
        driver.findElement(By.xpath("//*[@id=\"short_nearestTestLocn\"]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-select-choices-row-10-1\"]/div/div")).click();
        
        driver.findElement(By.id("short_Password")).sendKeys(password);
        
        driver.findElement(By.id("short_PasswordCnfrm")).sendKeys(passwordconfirm);
        
        driver.findElement(By.xpath("//*[@id=\"short_secQuest\"]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-select-choices-row-11-0\"]/div/div")).click();
        
        driver.findElement(By.id("short_secQuesAns")).sendKeys(questionAns);
        
        //waiting for entering captcha 
        Thread.sleep(30000);
        JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0,500)", "");
        driver.findElement(By.id("btnRegSubmit")).click();
        driver.findElement(By.xpath("//*[@id=\"regInfoConfModal\"]/div/div[2]/button[2]")).click();
        
	 
  }
}
