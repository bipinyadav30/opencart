package org.opencart.webutils;

import java.time.Duration;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import lombok.Getter;
@Getter
public class Webutils1 {

	

	private static Webutils1 webutils;
	private WebDriver driver;
	private Webutils1() {

	}
	public static Webutils1 getInstance() {
		if(webutils==null) {
			webutils=new Webutils1();
		}
		return webutils;
	}
	
	
	public void launchBrowser(String url) {
		driver=new ChromeDriver();
		implicitWait();
		driver.manage().window().maximize();
		driver.navigate().to(url);
	}
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void holdOn(int timeSec) {
		try {
			Thread.sleep(timeSec*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void inputValue(WebElement we,String value) {
		try {
			we.sendKeys(value);
		}catch(ElementNotInteractableException e) {
			Actions act=new Actions(driver);
			act.sendKeys(we,value);
		}
		catch (Exception e) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].value='"+value+"'", we);
		}
		
	}

	public void click(WebElement we) {
		try {
			we.click();
		}
		
		catch(ElementNotInteractableException e) {
				Actions act=new Actions(driver);
				act.click(we);
			}
		catch (Exception e) {
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].click();",we);
		}catch (Throwable e) {
			e.printStackTrace();
		}
	}
		public void closeWindow() {
			driver.quit();
		
	}
	
		public void verifyPageTitle(WebElement we,String expectedTitle) {
			String actualTitle=driver.getTitle();
			if(actualTitle.equalsIgnoreCase(expectedTitle)) {
				
				System.out.println("Passed...actualTitle-"+actualTitle+" && expectedTitle-"+expectedTitle);
			}else {
				System.out.println("Failed...actualTitle-"+actualTitle+" && expectedTitle-"+expectedTitle);

			}
						Assert.assertEquals(actualTitle, expectedTitle);
		}

		public void verifyInnerText(WebElement we,String expectedText) {
			String actualText=we.getText();
			if(actualText.equalsIgnoreCase(expectedText)) {
				System.out.println( "Passed...actualText-"+actualText+" && expectedText "+expectedText);
			}else {
				System.out.println("Failed...actualText-"+actualText+" && expectedText"+expectedText);
			}
			Assert.assertEquals(we.getText(), expectedText);
		}

}
	