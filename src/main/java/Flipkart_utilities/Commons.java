package Flipkart_utilities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Flipkart_readers.PropertyReaders;



public class Commons {
	PropertyReaders propertyReader;
	WebDriverWait wait;

	//To get hardwait
	public void getHardwait() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//Webdriver Setup
	public WebDriver setUpDriver1() {
		WebDriver driver = null;
		try {
			propertyReader = new PropertyReaders();
			BrowserSetup browserSetup = new BrowserSetup();
			driver = browserSetup.getDriver(propertyReader.getBrowserName());
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(propertyReader.getImplicitWait(), TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;

	}
	
	
	
	
	

	//To launch Application
	public void launchApplication(WebDriver driver) {
		try {
			propertyReader = new PropertyReaders();
			driver.get(propertyReader.getApplicationUrl());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//To get searchbarText
	 public void getsearchbartext(WebDriver driver,WebElement element) {
		
		 try {
			 element.sendKeys(propertyReader.getsearchbartext());
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		
	 }
	//To get searchbarText
		 public void getsearchbartextforflipkart(WebDriver driver,WebElement element) {
			
			 try {
				 element.sendKeys(propertyReader.getsearchbartextforflipkart());
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
			
		 }
	 
	 
	 
	//To get "From" date
	public void getfromDate(WebDriver driver, WebElement element) {
		 try {
			 element.sendKeys(propertyReader.getfromDate());;
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	}
	
	
	//To get "To" date
	public void getToDate(WebDriver driver, WebElement element) {
		 try {
			 element.sendKeys(propertyReader.getToDate());
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	}
	
	public void getwait(WebDriver driver, WebElement element) {
		 try {
			 element.sendKeys(propertyReader.getwait());
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	}
	
	
	
	
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	public void checkElementsVisibility(WebDriver driver , WebElement element) {
		try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(getExplicitWait()));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	public void clickOnWebElement(WebDriver driver, WebElement element) {
		try {
			
			int time = getExplicitWait();
			wait = new WebDriverWait(driver,Duration.ofSeconds(time));
			if(wait.until(ExpectedConditions.elementToBeClickable(element)) != null) {
				element.click();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	/**
	 * close the browser
	 * 
	 * @param driver
	 */
	public void teardown(WebDriver driver) {
		driver.quit();
	}

	/**
	 * close the current browser window
	 * 
	 * @param driver
	 */
	public void closeWindow(WebDriver driver) {
		driver.close();
	}
	
	private int getExplicitWait() {
		try {
			propertyReader = new PropertyReaders();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return propertyReader.getExplicitWait();
		
	}

	public WebDriver setUpDriver() {
		// TODO Auto-generated method stub
		return null;
	}

}
