import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		
		
		
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot"};
		 addItems(driver,itemsNeeded);
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		 driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		 driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		 
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		 
		 driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		 driver.findElement(By.cssSelector("button.promoBtn")).click();
		 
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		 
		 System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	
	}
	public static void addItems(WebDriver driver, String[] itemsNeeded)
	{
		int j=0;
	
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i = 0; i < products.size(); i++) {
			
			//splitting the product to match the element
			String[] name = products.get(i).getText().split("-");
			
			//format it to get actual vegetable name
			String formattedName = name[0].trim();
			

			// convert array into arraylist for easy search
			List itemsNeededList = Arrays.asList(itemsNeeded);

			// check whether name you extracted is present in arraylist or not
			
			
			if (itemsNeededList.contains(formattedName)) {
				
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
			if(j==itemsNeeded.length)
			
				break;
			}
		}
	}
}
