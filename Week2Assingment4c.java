package Week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assingment4c {

	public static void main(String[] args) {
		int number=0;
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Go to Home Page"));
		System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		String Str1 = driver.findElement(By.linkText("Verify am I broken?")).getAttribute("Href");
		if(Str1.isEmpty());
		{
			System.out.println("link is empty");
		}
		List<WebElement> links = driver.findElements(By.tagName("a"));
	    System.out.println("The number of links is " + links.size());
		//System.out.println("number of link ="+i);
		driver.findElement(By.linkText("Go to Home Page"));
		String title = driver.getTitle();
		System.out.println("Driver title is "+title);
	}
}
