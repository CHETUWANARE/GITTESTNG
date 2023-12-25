package browserhandling;

import java.awt.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class framework {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Account']")).click();
		driver.findElement(By.xpath("(//li[@id='user_sign_in_sign_up'])")).click();
		WebElement login_frame = driver.findElement(By.xpath("(//li[@id='user_sign_in_sign_up'])[1]"));

		driver.findElement(By.xpath("//input[@id='mobileNoInp']")).sendKeys("8999086984");
		
		
		
		
	

	}

	
		
	}

