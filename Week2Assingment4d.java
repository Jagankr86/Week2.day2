package Week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assingment4d {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement element = driver.findElement(By.id("dropdown1"));
		Select select = new Select(element);
		select.selectByIndex(2);
		
		WebElement element1 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select select1 = new Select(element1);
		select1.selectByVisibleText("UFT/QTP");
		
		WebElement element2 = driver.findElement(By.id("dropdown3"));
		Select select2 = new Select(element2);
		select2.selectByValue("3");
		
		WebElement element3 = driver.findElement(By.id("dropdown3"));
		Select select3 = new Select(element3);
		List<WebElement> options = select3.getOptions();
		System.out.println("Number of Drop down option "+options.size());
		
		driver.findElement(By.xpath("(//div[@class = 'example']/select)[5]")).sendKeys("Selenium");
		
		WebElement element4 = driver.findElement(By.xpath("(//div[@class = 'example']/select)[6]"));
		Select select4 = new Select(element4);
		if(select4.isMultiple())
		{
			select4.selectByIndex(1);
			select4.selectByValue("4");
		}
		String title = driver.getTitle();
		System.out.println("Driver title is "+title);
	}
}
