package Assesment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToActtime {

	public static void main(String[] args) {
		
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		driver.findElement(By.xpath("//div[text()='Logout ']")).click();
		System.out.println("Logged out succesfully");
		driver.close();
	}

}
