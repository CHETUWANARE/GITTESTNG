package browserhandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script_print {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver() ;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		/*String page_title = driver.getTitle();
		System.out.println("page_title");
		System.out.println( page_title.length() );
		String str= driver.getCurrentUrl();
		System.out.println("str");
		System.out.println(str.length());
		driver.quit();*/
		
		String Expected="https://";
		String Actual = driver.getCurrentUrl();
		if(Actual.startsWith(Expected))
		{
			System.out.println("Url is secured::"+Expected+"..."+Actual);
		}
		
		driver.quit();
		
		
		
		

	}

}
