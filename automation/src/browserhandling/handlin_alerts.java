package browserhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handlin_alerts {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		String alert_message =driver.switchTo().alert().getText();
		System.out.println("alert_message");
		driver.switchTo().alert().accept();
		driver.quit();

	}

}
