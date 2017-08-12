package demoScreenshot;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.List;

public class MultipleSelect2 {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		
		
			  driver.get("http://jqueryui.com/selectable/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.switchTo().frame(0);

		List<WebElement> selectOption = driver.findElements(By.xpath("html/body/ol/li"));

		Actions act = new Actions(driver);
			
		System.out.println(selectOption.size());
		
		
		act.keyDown(Keys.LEFT_CONTROL).perform();

		for (int i = 1; i < selectOption.size(); i++) {

			if (i % 2 == 0) {
				
				Thread.sleep(1000);
				
				act.click(selectOption.get(i-1)).perform();
				
				System.out.println(selectOption.get(i - 1).getText() + " is Selected");
			}
		}	// end of for loop
		
		act.keyUp(Keys.LEFT_CONTROL).perform();
		

		driver.close();

	}

}