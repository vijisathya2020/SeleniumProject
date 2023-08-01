package saucePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sauceLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome", "C:\\Program Files\\Google\\Chrome\\Application");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
	
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//*[@id = 'user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id = 'password']")).sendKeys("secret_sauce");
		
		
		
		driver.findElement(By.name("login-button")).click();
		
		
		
		
	//	driver.close();
	}

}
