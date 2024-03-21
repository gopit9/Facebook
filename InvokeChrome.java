import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class InvokeChrome {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("bharathgopi@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("bharathgopi");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//a[@class='_39g9']")).click();
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.cssSelector("input[placeholder='Email or mobile number']")).sendKeys("gopi@gmail.com");
		driver.findElement(By.id("did_submit")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
