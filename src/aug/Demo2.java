package aug;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		//WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new ChromeDriver();
		
		
		//driver.get("https://www.facebook.com");
		
		Point var2 = new Point(-2000,0);
		
		
		System.out.println( var2 );
		
		
		driver.manage().window().setPosition(var2);
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		//driver.manage().window().setPosition(new Point(150,500));
	}

}
