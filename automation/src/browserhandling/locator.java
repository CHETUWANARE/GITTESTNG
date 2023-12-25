package browserhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
	
		Thread.sleep(3000);
		/*driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("chetan");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("pass123");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		driver.close();*/
		/*driver.get("https://qk.nirmalbang.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtclientcode")).sendKeys("mohit");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtpassword")).sendKeys("pass@123");
		Thread.sleep(2000);
		driver.findElement(By.name("btn_submit")).click();*/
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.close();
		
	}

}
