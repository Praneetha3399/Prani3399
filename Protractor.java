import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Protractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		String name= "Praneetha";
		driver.findElement(By.name("name")).sendKeys(name);
		
		driver.findElement(By.name("email")).sendKeys("dreamstalker.gmail.com");
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345");
		
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByIndex(1);
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.name("bday")).sendKeys("03/02/1991");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//System.out.println(driver.findElement(By.xpath("//body/app-root[1]/form-comp[1]/div[1]/div[2]/div[1]")).getText());
		
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
	}

}
