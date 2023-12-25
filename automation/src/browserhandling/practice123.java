package browserhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class practice123 {
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//a[@class='_97w5']")).click();
		driver.findElement(By.name("firstname")).sendKeys("chetan");
		driver.findElement(By.name("lastname")).sendKeys("wanare");
		driver.findElement(By.name("reg_email__")).sendKeys("9765034306");
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345");
		Select daylist=new Select(driver.findElement(By.name("birthday_day")));
		Select monthlist=new Select(driver.findElement(By.name("birthday_month")));
		Select yearlist=new Select(driver.findElement(By.name("birthday_year")));
		daylist.selectByIndex(2);
		monthlist.selectByIndex(3);
		yearlist.selectByIndex(3);
		Select gender=new Select(driver.findElement(By.xpath("//label[@for='u_0_5_99']")));
		gender.selectByValue("male");
		
		
		
		
		
		
	
		
		
		
	

	}}
