package browserhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebookloginpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569870%7Cb%7Cfacebook%20create%20account%7C&placement=&creative=589460569870&keyword=facebook%20create%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-12091220328%26loc_physical_ms%3D9062111%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiA98WrBhAYEiwA2WvhOm3HDN0mKQo5quhEWiRA0U_zFowTI0vP8YiE6um_-d2mVuKqCxrKIRoChU8QAvD_BwE");
		driver.findElement(By.xpath("(.//input[@data-type='text'])[1]")).sendKeys("chetan");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("(.//input[@data-type='text'])[2]")).sendKeys("wanare");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(.//input[@data-type='text'])[3]")).sendKeys("chetuwanare@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//input[@type='password']")).sendKeys("admin@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("10");
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Nov");
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("2010");
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		driver.findElement(By.xpath("//button[@id='u_0_s_/k']")).click();
		driver.close();

	}

}