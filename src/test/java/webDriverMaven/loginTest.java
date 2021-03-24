package webDriverMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {

	public static WebDriver driver;
	
	
	@BeforeSuite
	public void setUp() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@Test
	public void doLogin() {
		
		driver.get("http://google.com/");
		
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/a")).click();;

		driver.findElement(By.id("identifierId")).sendKeys("skshitizgupta@gmail.com");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();

	}
	@AfterSuite
	public void tearDown() {

		driver.quit();
	}

}
