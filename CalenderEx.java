import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class CalenderEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.path2usa.com/travel-companions");
		//may 3
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		
		//while loop keep on executing until it becomes false
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("June"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		//List<WebElement> dates =driver.findElements(By.className(".day"));
		
		//grab the common attribute //put into list and iterate
		int count =driver.findElements(By.className("day")).size();
		for(int i =0;i<count;i++)
		{
			String text =driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("19"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
	}

}
