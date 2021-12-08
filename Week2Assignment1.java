package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assignment1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text() = 'Create New Account']")).click();
		driver.findElement(By.xpath("(//input[@class = 'inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("Jagannathan");
		driver.findElement(By.xpath("(//input[@class = 'inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("Rajamani");
		driver.findElement(By.xpath("(//input[@class = 'inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("9898989898");
		driver.findElement(By.id("password_step_input")).sendKeys("Jagankr@30");
		
		WebElement element = driver.findElement(By.id("day"));
		Select select = new Select(element);
		select.selectByVisibleText("2");
		
		WebElement element1 = driver.findElement(By.id("month"));
		Select select1 = new Select(element1);
		select1.selectByVisibleText("Oct");
		
		WebElement element2 = driver.findElement(By.id("year"));
		Select select2 = new Select(element2);
		select2.selectByValue("1986");
				
		driver.findElement(By.xpath("//label[text() = 'Female']")).click();
		String title = driver.getTitle();
		System.out.println("Title is "+title);
		//driver.close();

	}

}
