package CommonMethods;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BrowsersBase.BrowsersInvoked;
import BrowsersBase.DataInterface;

public class WebDriverWaits extends BrowsersInvoked {
	@SuppressWarnings("deprecation")
	static WebDriverWait wait = new WebDriverWait(driver, 10);
	@SuppressWarnings("deprecation")
	static WebDriverWait wait20 = new WebDriverWait(driver, 20);

	public static void WaitUntilPresent(By element) {
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
	}

	public static void WaitUntilVisible(By element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	
	
	public static boolean ElementIsDisplayed(By path) {
		try {
		WebElement ele = driver.findElement(path);
		return ele.isDisplayed();
		}
		catch(Exception e) {
			return false;
		}
	}
	

	public static void WaitUntilInvisible(By element) {
		wait.until(ExpectedConditions.invisibilityOf((WebElement) element));
	}

	public static WebElement WaitUntilVisibleWE(By element) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

	public static WebElement WaitUntilVisibleWE20(By element) {
		return wait20.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

	public static List<WebElement> WaitUntilVisibleList(By element) {
		return (List<WebElement>) wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
	}

	public static void ClickOn(By element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		WebElement ele = driver.findElement(element);
		ele.click();
	}

	public static void SendKeys(By element, String value) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		WebElement ele = driver.findElement(element);
		ele.sendKeys(value);
	}
	
	public static void VisibilityOfElementLocated(By element , int tries) {
		
		for(int i = 1 ; i <= tries ; i++) {
			try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(element));
			}
			catch(Exception e) {
				
			}
		}
		
		
	}

	public static void Clear(By element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		WebElement ele = driver.findElement(element);
		ele.clear();
	}
	public static void ClickOnWE(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public static void ClickOnWE20(WebElement element) {
		wait20.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public static String GetText(By element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		WebElement ele = driver.findElement(element);
		String text = ele.getText();
		return text;
	}
	
	public static void WaitForElementInteractable(By locator , int tries) {
		try {
			for(int i = 0;i < tries ; i++) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		}
		}
		catch(Exception e) {
			
		}
	}
	
	public static void CloseOtherTabs() throws InterruptedException {
		String originalHandle = driver.getWindowHandle();
		Set<String> tabs = driver.getWindowHandles();

			    for(String handle : tabs) {
			        if (!handle.equals(originalHandle)) {
			        	driver.switchTo().window(handle);
			        	driver.close();
			        }
			    }

			    driver.switchTo().window(originalHandle);
			    System.out.print(driver.getCurrentUrl());
			    Thread.sleep(3000);
	}
	
	public static void ScrollIntoView(By element) {
		   JavascriptExecutor jse = (JavascriptExecutor) driver;
		   WebElement ele = driver.findElement(element);
		   jse.executeScript("arguments[0].scrollIntoView(true);", ele);
		   //extentTest.log(LogStatus.PASS, "Scrolled for element : " + element);


		}
	
	public static String GetValueAttribute(By element) {
		   wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		   WebElement ele = driver.findElement(element);
		   String text = ele.getAttribute("value");
		   return text;
		}
	
	public static void ClickByJsExecuter(By element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(element);
		jse.executeScript("arguments[0].click();", ele);
	}
	
	public static void scrollToRight() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(6000,0)");
	}
	
	public static void scrolltoUp() {
	
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-400)");
	}
	
	
	public static void scrolltoUpCustom(int x , int y) {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+x+",-"+y+")");
	}
	
	public static WebElement FindElementByXPath(String selector) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selector)));
		WebElement ele = driver.findElement(By.xpath(selector));
		return ele;
	}
	
	public static WebElement FindElementByCssSelector(String selector) {
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(selector)));
		WebElement ele = driver.findElement(By.cssSelector(selector));
		return ele;
	}
	
	public static WebElement FindElementById(String selector) {
		wait.until(ExpectedConditions.elementToBeClickable(By.id(selector)));
		WebElement ele = driver.findElement(By.id(selector));
		return ele;
	}
	
	
	public static WebElement FindElementByPartialLinkTxt(String selector) {
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(selector)));
		WebElement ele = driver.findElement(By.partialLinkText(selector));
		return ele;
	}
	
	
	public static WebElement FindElementByName(String selector) {
		wait.until(ExpectedConditions.elementToBeClickable(By.name(selector)));
		WebElement ele = driver.findElement(By.name(selector));
		return ele;
	}
	
	
	
	
}
