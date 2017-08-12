package aug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) {
		
		
		//WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com");
		
	
		driver.findElement(By.xpath("//*[@id='email']")).getSize();
		
		
		System.out.println(driver.findElement(By.xpath("//*[@id='email']")).getSize());
		
		System.out.println(driver.findElement(By.xpath("//*[@id='email']")).getSize().height);
		
		System.out.println(driver.findElement(By.xpath("//*[@id='email']")).getSize().width);
		
		System.out.println(driver.findElement(By.xpath("//*[@id='email']")).getSize().getHeight());
		
		System.out.println(driver.findElement(By.xpath("//*[@id='email']")).getSize().getWidth());
	}

}
