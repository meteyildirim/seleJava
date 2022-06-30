package sel_java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/esad/temp/chromedriver_linux64/chromedriver");
		
		System.out.println("*".repeat(70)+"\n");
		System.out.println("Welcome to Selenium Intro with Java\n");
		System.out.println("*".repeat(70));
		
		// import Chrome Driver
		// Chrome driver /home/esad/temp/chromedriver_linux64/chromedriver
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://login.salesforce.com/?locale=eu");
		System.out.println(driver.getCurrentUrl() + driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		
		driver.findElement(By.id("username")).sendKeys("mete");
		//driver.findElement(By.name("Login")).click();
		driver.findElement(By.cssSelector("#Login")).click();
			
		System.out.println(driver.findElement(By.id("error")).getText());
		
		
		
		// driver.close();
		//driver.quit();
		
	}

}
