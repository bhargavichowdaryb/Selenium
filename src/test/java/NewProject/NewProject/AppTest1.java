package NewProject.NewProject;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest1 {
	
	@Test
	public void test()
	{
		//System.setProperty("webdriver.chrome.driver", "/Users/bhargavichowdary/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.practo.com/");		
		driver.quit();
	}
	
	@Test
	public void test1()
	{
		//System.setProperty("webdriver.chrome.driver", "/Users/bhargavichowdary/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.practo.com/");		
		driver.findElement(By.id("askdfjaskldjf"));
		driver.quit();
	}


}