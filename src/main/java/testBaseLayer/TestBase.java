package testBaseLayer;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase
{

	
	public static void main(String[] args) 
	{
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		d.getTitle();
		
		d.close();
	}

}
