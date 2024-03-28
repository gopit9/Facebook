import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class InvokeChrome {

	public static void main(String[] args) throws InterruptedException {
		
		/* Blocking pop-up window in chrome by selenium */
		ChromeOptions options  = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		//Invoking chrome browser using Webdriver Interface
		WebDriver driver = new ChromeDriver(options);
		
		//Facebook Url
		driver.get("https://www.facebook.com/");
		//Declearing Facebook Credentials
		driver.findElement(By.id("email")).sendKeys("Sunnygurijala44@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("9");
		//Click on login button
		driver.findElement(By.name("login")).click();
		
		//Wait time
		Thread.sleep(5000);
		
		//Click on Account button
		driver.findElement(By.xpath("(//*[name()='image'])[1]")).click();
		//Click on logout button
		driver.findElement(By.xpath("//span[normalize-space()='Log out']")).click();
		
		//Prints the title of the page
		System.out.println(driver.getTitle());
		//prints the current page url
		System.out.println(driver.getCurrentUrl());
		//Closes the current window
		driver.close();
		
		
		/* 
		 * To perform Facebook login and logout using Selenium. 
		 * Language : Java , IDE: Eclipse 
		 
		 * Step1: Set up your Java project in Eclipse.
		     1.Open Eclipse IDE.
                     2.Create a new Java project.
                     3.Import Selenium to your project from MVN Repository @ pom.xml (page object model)
             
		 * Step2: Configure Selenium WebDriver in your project.
		 *Import necessary Selenium packages in your Java class
                 *Download the WebDriver for your preferred browser (e.g., ChromeDriver for Google Chrome).
                 *Add the WebDriver executable to your project.
          
		 * Step3: Write code to automate the login process.
		 * Step4: Write code to automate the logout process.
*/
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
