import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.netty.util.internal.SystemPropertyUtil;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.id("menu_pim_viewPimModule"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
//		System.out.println(driver.findElement(By.id("menu_admin_viewAdminModule")).getText());
//		System.out.println(driver.findElement(By.id("menu_pim_viewPimModule")).getText());
//		System.out.println(driver.findElement(By.id("menu_leave_viewLeaveModule")).getText());
//		System.out.println(driver.findElement(By.id("menu_time_viewTimeModule")).getText());
//		System.out.println(driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).getText());
//		System.out.println(driver.findElement(By.id("menu__Performance")).getText());
//		System.out.println(driver.findElement(By.id("menu_dashboard_index")).getText());
//		System.out.println(driver.findElement(By.id("menu_directory_viewDirectory")).getText());
//		System.out.println(driver.findElement(By.id("menu_maintenance_purgeEmployee")).getText());
//		System.out.println(driver.findElement(By.id("menu_buzz_viewBuzz")).getText());
		//driver.findElement(By.xpath("//a[@id='welcome']")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		WebElement string;
		string = driver.findElement(By.id("mainMenuFirstLevelUnorderedList"));
		List<WebElement> stringCount = string.findElements(By.xpath("//a[@class='firstLevelMenu']"));
		System.out.println("List Size is.."+stringCount.size());
		
			
		}
		
	}


