package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assingment4a {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("email")).sendKeys("india@abc");
		driver.findElement(By.id("email")).sendKeys(".com");
		driver.findElement(By.id("email")).sendKeys(Keys.TAB);
		String str1 = driver.findElement(By.xpath("(//input[@name='username'])[1]")).getDomAttribute("Value");
		System.out.println("String Value "+str1);
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		System.out.println(driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/input)[5]")).isEnabled());
		String title = driver.getTitle();
		System.out.println("Driver title is "+title);
	}

}
