package Assesment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		Select dropdown = new Select(driver.findElement(By.id("nav-search-scope nav-sprite")));
		
		dropdown.selectByVisibleText("Books");
		
		driver.findElement(By.id("searchDropdownDescription")).isSelected();
        driver.findElement(By.id("searchDropdownDescription")).isEnabled();
        driver.findElement(By.id("searchDropdownDescription")).isDisplayed();
        
        
        Thread.sleep(5000);
        
        driver.close();
		
		
		
		

	}

}
