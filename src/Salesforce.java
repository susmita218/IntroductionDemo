import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Susmita\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://login.salesforce.com/?locale=in");
driver.findElement(By.id("username")).sendKeys("abc");
driver.findElement(By.id("password")).sendKeys("123");
driver.findElement(By.id("Login")).click();


	}

}
