package actionClassDemo;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autosuggest {
	
	//public class Ajax_Handle {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new FirefoxDriver();
		
		//WebDriver driver = new ChromeDriver();
		
		 
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//driver.manage().window().maximize();
				
				driver.get("http://www.google.com");
				driver.findElement(By.id("lst-ib")).sendKeys("india vs pakistan");

				Thread.sleep(2000);
				
				List <WebElement> allitems = driver.findElements(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li"));
					
				System.out.println(allitems.size());
				
				for(int i=0;i<allitems.size();i++)
				{
					String temp=allitems.get(i).getText();

					System.out.println(temp);
					
					if(temp.equalsIgnoreCase("india vs pakistan match"))
					{
						allitems.get(i).click(); 
break;
						
					}
				}
	}
			}