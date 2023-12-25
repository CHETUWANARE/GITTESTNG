package browserhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class collectionlistbox {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Select dropdown= new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> all_items =dropdown.getOptions();
		System.out.println(all_items.size());
		for(WebElement each : all_items) {
			System.out.println(each.getText());
			
		}
		driver.quit();

	}

}
