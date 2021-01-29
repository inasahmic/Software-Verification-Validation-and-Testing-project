


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_WebDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = "C:\\Users\\User\\Desktop\\ChromeDriver\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
	}
}



