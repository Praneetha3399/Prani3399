import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLcheck {
	public static void main(String[] args) {
		
	ChromeOptions options = new ChromeOptions();
	Proxy proxy = new Proxy();
	proxy.setHttpProxy("Address");
	options.setAcceptInsecureCerts(true);
	
	
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\drivers\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://expired.badssl.com/");
	System.out.println(driver.getTitle());
	
	
	}
}