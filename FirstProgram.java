import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) {
		
		//   chromedriver.exe  -> Chrome Browser
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\drivers\\chromedriver\\chromedriver.exe");
		//   webdriver.chrome.driver  -> value of the path
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
