package browserhandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class newwindowhandeling {
public static void main(String[] args) throws Throwable {
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.switchTo().newWindow(WindowType.TAB);

	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.flipkart.com/");
	
	
	
}

}
