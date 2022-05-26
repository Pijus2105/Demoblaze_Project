package Demoblaze;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn extends SignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https:\\Demoblaze.com");	
		
		try {
			
			//Test Case - 02
			
			//LogIn
			
			if ("SignUp is Not Done".startsWith("signin2")) {
				System.out.println(false);
			}else {
				System.out.println("Log in : Please enter the Username & Password");			
			}
			
			 driver.findElement(By.id("login2")).click();
			 
			 
			 
			 if ("Not sign up".startsWith("sign-username")) {
				 System.out.println(false);
			 }else {
				 System.out.println("Log-in : Please Enter The Email-id");
				 System.out.println("Password : Please enter the Password");
				 
			 }
			 
			driver.findElement(By.id("loginusername")).sendKeys("pijusg448@gmail.com");
			System.out.println("Log-in : Email-id is successfully received");
			
			driver.findElement(By.id("loginpassword")).sendKeys("Pijus123@");
			System.out.println("Log-in : Password is successfully received");
			
			
			driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
			
			
			//Test Case - 03
			//LogOut
			Thread.sleep(3000);
			WebElement Logout = driver.findElement(By.linkText("Log out"));
			
			if ("Not Log out".endsWith("Logout")) {
			System.out.println(false);
			}else {
				System.out.println("Log-Out");
			}
			Thread.sleep(3000);			
			Logout.click();			
		  
		}
		catch (NoSuchElementException e) {
			System.out.println("Yes! I can say where is the Exception.");
			System.out.println(e);
		}
			catch (StaleElementReferenceException h) {
				System.out.println("No");
				System.out.println(h);
			}
		
		
		 finally {
		System.out.println("All Are Done");
		}
		
		
		
		//All Methods Are In Try And Catch Block For Safety
		
		

	}

}
