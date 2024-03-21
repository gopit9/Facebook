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
		driver.findElement(By.name("pass")).sendKeys("Gurijala@Chowdary9");
		
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
		driver.close();
		
		
		
		//driver.findElements(By.cssSelector("div[data-nocookies='true'] div[role='button'] div[class='x6s0dn4 x1q0q8m5 x1qhh985 xu3j5b3 xcfux6l x26u7qi xm0m39n x13fuv20 x972fbf x9f619 x78zum5 x1q0g3np x1iyjqo2 xs83m0k x1qughib xat24cr x11i5rnm x1mh8g0r xdj266r xeuugli x18d9i69 x1sxyh0 xurb0ha xexx8yu x1n2onr6 x1ja2u2z x1gg8mnh'] div[class='x6s0dn4 xkh2ocl x1q0q8m5 x1qhh985 xu3j5b3 xcfux6l x26u7qi xm0m39n x13fuv20 x972fbf x9f619 x78zum5 x1q0g3np x1iyjqo2 xs83m0k x1qughib xat24cr x11i5rnm x1mh8g0r xdj266r x2lwn1j xeuugli x18d9i69 x4uap5 xkhd6sd xexx8yu x1n2onr6 x1ja2u2z'] div[class='x1qjc9v5 x1q0q8m5 x1qhh985 xu3j5b3 xcfux6l x26u7qi xm0m39n x13fuv20 x972fbf x9f619 x78zum5 x1r8uery xdt5ytf x1iyjqo2 xs83m0k x1qughib xat24cr x11i5rnm x1mh8g0r xdj266r x2lwn1j xeuugli x4uap5 xkhd6sd xz9dl7a xsag5q8 x1n2onr6 x1ja2u2z'] div span[class='x193iq5w xeuugli x13faqbe x1vvkbs xlh3980 xvmahel x1n0sxbx x1lliihq x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x x4zkp8e x3x7a5m x6prxxf xvq8zen xk50ysn xzsf02u x1yc453h']"));
		//driver.findElements(By.id("userNavigationLable")).c
		//driver.findElement(By.xpath("//a[@class='_39g9']")).click();
		//driver.findElement(By.linkText("Forgot password?")).click();
		//driver.findElement(By.cssSelector("input[placeholder='Email or mobile number']")).sendKeys("gopi@gmail.com");
		//driver.findElement(By.id("did_submit")).click();
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.close();
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
