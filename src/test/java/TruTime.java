import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TruTime {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://onecognizant.cognizant.com/");	

		

      // enter username manually	
	//    WebElement nameinput1=driver.findElement(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[3]/div/div/div/div[2]/div[2]"));
	//	nameinput1.sendKeys("2173447@cognizant.com");
		Thread.sleep(15000);
		WebElement usernamebtn= driver.findElement(By.id("idSIButton9"));
		usernamebtn.click();
	
		
		
	//  enter password manually
		Thread.sleep(15000);
		WebElement passwordbtn= driver.findElement(By.id("idSIButton9"));
		passwordbtn.click();
		
	//  using textmsg authentication	
		WebElement textmsg= driver.findElement(By.className("table"));
		textmsg.click();
		
	//	Entering otp manually
		Thread.sleep(20000);
		WebElement enter_otp=driver.findElement(By.id("idTxtBx_SAOTCC_OTC"));
		enter_otp.click();
		
	//	clicking_verify_btn
		WebElement verifybtn=driver.findElement(By.id("idSubmit_SAOTCC_Continue"));
		verifybtn.click();
//		
	//	stay4evr
	    Thread.sleep(3000);
		WebElement stay=driver.findElement(By.xpath("//input[@id='idBtn_Back']"));
		stay.click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
	
	WebElement element=	driver.findElement(By.className("oneCSearchTopBar"));
	element.sendKeys("trutime");
		

	
	}

	}


