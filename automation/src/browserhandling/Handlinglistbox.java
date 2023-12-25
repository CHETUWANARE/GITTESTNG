package browserhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlinglistbox {
public static void main(String[] args) {
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	WebElement tgt = driver.findElement(By.id("day"));
	Select s = new Select(tgt);
	List<WebElement> ref=s.getOptions();
	System.out.println(ref.size());
	for (WebElement webElement : ref) {
		
		String txt =webElement.getText();
		System.out.println(txt);
		
	}
	
	
	
	
}
}
