package tesrScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipKart_Test {
	@Test
	public void flipKart_Test() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products')]")).clear();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products')]")).sendKeys("Fastrack watch",Keys.ENTER);
		driver.quit();
	}
}
