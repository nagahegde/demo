import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.ExitCode;

public class HelloWorld {

	public static void main(String[] args) {
		
		
	    //Load the properties file 
		Properties prop = new Properties();
		InputStream fileInput =  null;
		try {
			fileInput = new FileInputStream("./config/test.properties");
			prop.load(fileInput);
		}catch(IOException io) {
			System.out.println("Exception occurred while reading  test.properties..."+io.getMessage());
		}
	       System.out.println();
	      
	       
		
		// TODO Auto-generated method stub
		WebDriver webDriver = null;
		String url = prop.getProperty("url");
		String currentUrl = null;
		String anotherUrl = prop.getProperty("anotherurl");
		String exePath = prop.getProperty("webdriver_path");
		System.setProperty("webdriver.chrome.driver", exePath);
		String previousUrl = null;
		String backupUrl = null;
		String userName = prop.getProperty("username");
		String password = prop.getProperty("password");
		try {
				
				System.out.println("Hello World");
				webDriver = new ChromeDriver();
				/*webDriver.get(url);
				//Load the url in the browser
			    currentUrl = webDriver.getCurrentUrl();
			    backupUrl = currentUrl;
				System.out.println("Url shown in the browser:"+currentUrl);
				if(currentUrl.equals(url)) {
					System.out.println("Observed and expected urls ae same.");
				}else {
					System.out.println("URL shown in the browser is different");
				}
		        //Get the page title for the current url
				System.out.println("Page Title:"+webDriver.getTitle());
		        
		        
				//Navigate to diffrent url on the same page
				webDriver.navigate().to(anotherUrl);
				previousUrl = webDriver.getCurrentUrl();
				System.out.println("Page title:"+webDriver.getTitle());
				if(!webDriver.getCurrentUrl().equals(currentUrl)) {
					System.out.println("Next page is successfully loaded");
				}
				System.out.println("Size of the current page:"+webDriver.getPageSource().length());
				
				
				// Moving forward in the browser
				webDriver.navigate().forward();
				if(webDriver.getCurrentUrl().equals(previousUrl)) {
					System.out.println("Can't move forward");
				}else {
					System.out.println("Something went wrong...");
				}
				
			    //Moving backward in the browser
				webDriver.navigate().back();
				System.out.println("Current url:"+webDriver.getCurrentUrl());
				if(webDriver.getCurrentUrl().equals(backupUrl)) {
					System.out.println("Succesfully re-directed to previous page.");
				}	
				backupUrl = webDriver.getCurrentUrl();
				
				
				//Refresh the page
				webDriver.navigate().refresh();
				if(webDriver.getCurrentUrl().equals(backupUrl)) {
					System.out.println("Page got refreshed succeasfully");
				}
				*/
				//navigate back to gmail sign in page
				webDriver.get(url);
			    webDriver.findElement(By.id("identifierId")).clear();
			    webDriver.findElement(By.id("identifierId")).sendKeys(userName);
			    webDriver.findElement(By.id("identifierNext")).click();
			    Thread.sleep(10*1000);
			    System.out.println(webDriver.getCurrentUrl());
			    webDriver.findElement(By.className("whsOnd")).clear();
			    webDriver.findElement(By.className("whsOnd")).sendKeys(password);
			    webDriver.findElement(By.className("RveJvd")).click();
			    System.out.println(webDriver.getCurrentUrl());
			    Thread.sleep(10*1000);
			    System.out.println(webDriver.getPageSource().length());
			    
		}catch(WebDriverException w) {
				System.out.println("Couldn't find web driver"+w.getMessage());
		}catch(NullPointerException n) {
				System.out.println("Null Pointer Exception occurred");	
		}catch(Exception e) {
				System.out.println("Exception occured while performing operation"+e.getMessage());
		}
		finally {
        //System.out.println(webDriver.getPageSource());
        webDriver.close();
        webDriver.quit();
		}
	}

}
