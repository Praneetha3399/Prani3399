import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox1 {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
	}

}
