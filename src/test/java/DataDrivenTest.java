import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTest {
	
	WebDriver driver;
	
@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
	}
	
	@Test(dataProvider="LoginData")
	public void loginTest(String email, String pwd, String rst) {
		
	    	driver.get("https://www.flipkart.com");
		
		
		    WebElement mail=driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div:nth-child(1) > input"));
			mail.sendKeys(email);
			
			
			
			WebElement password=driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div:nth-child(2) > input"));
			password.sendKeys("pwd");
			
			
			WebElement button=driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div._1D1L_j > button"));
			button.click();
			
			String exp_title="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
			String act_title=driver.getTitle();
			
		if(rst.equals("valid")) {
			if(exp_title.equals(act_title)) {
				System.out.println(driver.getTitle());
				Assert.assertTrue(true);
				
			}
			else {
				Assert.assertFalse(false);
			}
		}
		else if(rst.equals("Invalid")) {
			if(exp_title.equals(act_title)) {
				Assert.assertFalse(false);
			}
			else {
				Assert.assertTrue(true);
			}
		}
	
			
	}
	
	@DataProvider(name="LoginData")
	public String [] [] getData() {
		String logindata[][]= {
				{"naveenbhog00@gmail.com","navi@8722","Valid"},
				{"naveenbhog00@gmail.com","navi%8722","Invalid"},
				{"naveenbhog00@gmail.com","navi@9722","Invalid"},
		                      };
	 return logindata;
	}
	
	
	
	
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
}