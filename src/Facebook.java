import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Susmita\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("https://www.facebook.com/");
driver.findElement(By.name("pass")).sendKeys("123");
driver.findElement(By.linkText("Forgotten password?"));
driver.close();
	}

}
