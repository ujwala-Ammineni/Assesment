package Assesment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverAction {

	public static void main(String[] args) {
		
		
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.className("nav-line-2"));
		
		//driver.findElement(By.id("nav-link-accountList"));
		//WebElement act = driver.findElement(By.id("nav-link-accountList"));
		
		WebElement act = driver.findElement(By.className("nav-line-2"));

		Actions a = new Actions(driver);
		a.moveToElement(act).perform();


		driver.close();	
	}
}
		

	


