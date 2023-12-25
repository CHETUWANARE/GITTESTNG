package browserhandling;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class inspectGooglepage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		List<WebElement> ref =driver.findElements(By.tagName("a"));
		int x = ref.size();
		System.out.println(".............");
		for(int a= 0; a<ref.size(); a++) {
			WebElement rv= ref.get(a);
			String txt= rv.getText();
			System.out.println(txt);
		}
		System.out.println("...............");
		int invisible_link=0;
		int visible_link=0;
		for(int a=0; a<ref.size(); a++) {
			WebElement link= ref.get(a);
			if(link.isDisplayed()) {
				visible_link++;
				
			}else {
			     invisible_link++;
			}
			System.out.println("total links" +visible_link);
			System.out.println("total links" +invisible_link);
		}
		System.out.println("..........");
		for(int a=0; a<ref.size(); a++) {
			String str= ref.get(a).getAttribute("href");
			System.out.println(str);
		}
driver.close();
	}

}
