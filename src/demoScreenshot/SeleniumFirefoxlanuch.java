package demoScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class SeleniumFirefoxlanuch {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
		// for giving the browser's driver path
		
				
				
			WebDriver driver= new FirefoxDriver();			// for launching the browser
			
			driver.get("http://www.facebook.com");			// for open a specific url
			
			System.out.println(driver.getTitle());			// this is to print the title on the console
			
			
			}

}
