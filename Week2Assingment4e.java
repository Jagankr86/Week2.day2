package Week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assingment4e {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String Str1 = driver.findElement(By.xpath("(//div[@class = 'large-6 small-12 columns']/img)[2]")).getAttribute("Src");
		//String Str1 = driver.findElement(By.linkText("Verify am I broken?")).getAttribute("Href");
		if(Str1.isEmpty());
		{
			System.out.println("link is empty");
		}
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("http://leafground.com/pages/Image.html");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		driver1.findElement(By.xpath("(//div[@class = 'large-6 small-12 columns']/img)[1]")).click();
		
		ChromeDriver driver2 = new ChromeDriver();
		driver2.get("http://leafground.com/pages/Image.html");
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		driver2.findElement(By.xpath("(//div[@class = 'large-6 small-12 columns']/img)[3]")).click();
		
		
		String title = driver.getTitle();
		System.out.println("Driver title is "+title);
		
		String title1 = driver1.getTitle();
		System.out.println("Driver title is "+title1);
		
		String title2 = driver2.getTitle();
		System.out.println("Driver title is "+title2);
	}
}
