package browserhandling;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.firefox.FirefoxDriver;

public class program1 {

	public static void main(String[] args) throws Throwable {
		
		FirefoxDriver rv =new FirefoxDriver();
		//rv.get("https://www.google.com/");
		//Thread.sleep(3000);
		//rv.navigate().to("https://www.facebook.com/");
		//Thread.sleep(3000);
		//rv.navigate().back();
		//Thread.sleep(3000);
		//rv.navigate().refresh();
		//Thread.sleep(3000);
		//rv.navigate().forward();
		//Thread.sleep(3000);
		//rv.manage().window().fullscreen();
		//Thread.sleep(3000);
		//rv.manage().window().minimize();
		//Thread.sleep(3000);
		/*String url=rv.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(3000);
	
		rv.navigate().to("https://www.youtube.com/");
		Thread.sleep(3000);
		rv.navigate().to("https://www.facebook.com/");
		Thread.sleep(300);
		rv.navigate().to("https://www.amazon.in");
		rv.navigate().back();
		rv.close();*/
		
		rv.get("https://www.facebook.com");
		String title= rv.getTitle();
		System.out.println(title);
		rv.manage().window().maximize();
		Thread.sleep(3000);
		rv.get("https://www.google.com/");
	/*	Dimension d = new Dimension(400,600);
		rv.manage().window().setSize(d);*/
		rv.navigate().back();
		/*String exp_page="facebook";
		String display_page= rv.getTitle();
		if(String (display_page.contains("facebook"))) {
			
		
			 System.out.println("facebook page displayed");
		 }
		 else
		 {
			 System.out.println("facebook page not displayed");
		 }
		 }*/
		
		
				
		
		

		
	
	
		
		
		

	}

}
