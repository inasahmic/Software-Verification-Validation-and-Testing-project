import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class First_WebDriverClassTest {
	
	@Test
	void testTitle() throws InterruptedException{
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rezultati.com/");
		 assertTrue(driver.getTitle().startsWith("Rezultati"));
		 Thread.sleep(2000);
		 driver.quit();
	}
	
	
	@Test
	void testRegistration() throws InterruptedException{
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rezultati.com/");
		 driver.findElement(By.id("registration")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("email")).clear();
		 driver.findElement(By.id("email")).sendKeys("popa@gmail.com");
		 driver.findElement(By.id("passwd")).click();
		 driver.findElement(By.id("passwd")).clear();
		 driver.findElement(By.id("passwd")).sendKeys("abcdefghijkl");
		 Thread.sleep(2000);	    
		 driver.findElement(By.id("registration")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("lsid-window-close")).click();
		 Thread.sleep(2000);
		 driver.quit();
	}
	@Test
	void testSearch () throws InterruptedException {
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rezultati.com/");
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nogomet rezultati uživo - live rezultati & livescore'])[1]/following::div[16]")).click();
	     driver.findElement(By.id("search-form-query")).clear();
	     driver.findElement(By.id("search-form-query")).sendKeys("real madrid");
	     driver.findElement(By.id("search-form-submit-button")).click();
		 Thread.sleep(2000);
		 driver.quit();
	}
	@Test
	void testSettings () throws InterruptedException {
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rezultati.com/");
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nogomet rezultati uživo - live rezultati & livescore'])[1]/following::div[18]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='vrijeme početka utakmice'])[1]/input[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("sortby")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("mggroups")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ne'])[1]/input[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("mgnotifications")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ne'])[2]/input[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Da, bez zvučnih obavijesti'])[1]/input[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("lsid-window-close")).click();
		 Thread.sleep(2000);
		 driver.quit();
	}
	@Test
	void testLogin () throws InterruptedException {
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rezultati.com/");
		 driver.findElement(By.id("signIn")).click();
		 driver.findElement(By.id("email")).clear();
		 driver.findElement(By.id("email")).sendKeys("harispopovac@gmail.com");
		 driver.findElement(By.id("passwd")).click();
		 driver.findElement(By.id("passwd")).clear();
		 driver.findElement(By.id("passwd")).sendKeys("abcdeefgh");
		 Thread.sleep(2000);
		 driver.findElement(By.id("login")).click();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 driver.quit();
	}
	@Test
	void testSportovi () throws InterruptedException {
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rezultati.com/");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nogomet'])[1]/following::div[2]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Košarka'])[1]/following::div[2]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Tenis'])[1]/following::div[2]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Hokej'])[1]/following::div[2]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Rukomet'])[1]/following::div[2]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Odbojka'])[1]/following::div[2]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Bejzbol'])[1]/following::div[2]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Američki nogomet - rezultati uživo & livescores'])[1]/following::img[1]")).click();  
		 Thread.sleep(2000);
		 driver.quit();
	}
	@Test
	void testLiga () throws InterruptedException {
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rezultati.com/");
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("Premier League")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("Rezultati")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("Raspored")).click();
		 Thread.sleep(1000);
	     driver.findElement(By.linkText("Tablica")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.linkText("Momčadi")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.linkText("Arhiva")).click();
		 Thread.sleep(2000);
		 driver.quit();
	}
	@Test
	void scrollTest () throws InterruptedException {
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rezultati.com/");
		// driver.manage().window().maximize();
		 JavascriptExecutor j = (JavascriptExecutor)driver;
		 j.executeScript("window.scrollBy(0,600)", "");
		 Thread.sleep(3000);
		 j.executeScript("window.scrollBy(0,400)", "");
		 Thread.sleep(3000);
		 driver.quit();
	}
	@Test
	void testMatchSection () throws InterruptedException {
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rezultati.com/");
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("UŽIVO")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("Gotovo")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("Raspored")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("Tečajevi")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("Moje utakmice (0)")).click();
		 Thread.sleep(1000);
		 driver.quit();
	}
	@Test
	void testDate () throws InterruptedException {
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rezultati.com/");
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(0)'])[1]/following::span[5]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(0)'])[1]/following::span[5]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("09/01 Sr")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(0)'])[1]/following::span[10]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(0)'])[1]/following::span[1]")).click();
		 Thread.sleep(1000);
		 driver.quit();
	}
	@Test
	void testGame () throws InterruptedException {
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rezultati.com/");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Kraj'])[1]/following::span[1]")).click();
		 Thread.sleep(3000);
		 driver.quit();
	}
	@Test
	void testPravilaKoristenja () throws InterruptedException {
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rezultati.com/");
		 driver.findElement(By.linkText("Pravila korištenja")).click();
		 Thread.sleep(3000);
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 driver.quit();
	}
	@Test
	void testReklamniOglasi () throws InterruptedException {
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rezultati.com/");
		 driver.findElement(By.linkText("Reklamni oglasi")).click();
		 Thread.sleep(4000);
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 driver.quit();
	}
	@Test
	void testKontakt () throws InterruptedException {
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rezultati.com/");
		 driver.findElement(By.linkText("Kontakt")).click();
		 Thread.sleep(4000);
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 driver.quit();
	}
	@Test
	void testMobilna () throws InterruptedException {
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rezultati.com/");
		 driver.findElement(By.linkText("Mobilna")).click();
		 Thread.sleep(4000);
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 driver.quit();
	}
	@Test
	void testLiveScore () throws InterruptedException {
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rezultati.com/");
		 driver.findElement(By.linkText("Livescore")).click();
		 Thread.sleep(4000);
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 driver.quit();
	}
	@Test
	void testNajboljeStranice () throws InterruptedException {
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rezultati.com/");
		 driver.findElement(By.linkText("Najbolje stranice")).click();
		 Thread.sleep(4000);
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 driver.quit();
	}
	@Test
	void testFB () throws InterruptedException {
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rezultati.com/");
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Pratite nas'])[1]/following::div[3]")).click();
		 Thread.sleep(4000);
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 driver.quit();
	}
	@Test
	void testTwitter () throws InterruptedException {
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rezultati.com/");
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Facebook'])[1]/following::div[2]")).click();		 Thread.sleep(4000);
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 driver.quit();
	}
	@Test
	void testAppStore () throws InterruptedException {
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rezultati.com/");
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Naša mobilna aplikacija je optimizirana za tvoj telefon. Preuzmi ju besplatno!'])[1]/following::div[2]")).click();
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 driver.quit();
	}
	@Test
	void testAndroid () throws InterruptedException {
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rezultati.com/");
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Naša mobilna aplikacija je optimizirana za tvoj telefon. Preuzmi ju besplatno!'])[1]/following::div[3]")).click();
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 driver.quit();
	}
	@Test
	void testJosSportova () throws InterruptedException {
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rezultati.com/snooker/");
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Am. nogomet'])[1]/following::div[5]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Rukomet'])[2]/following::a[1]")).click();
		 Thread.sleep(2000);
		 driver.quit();
	}
}
