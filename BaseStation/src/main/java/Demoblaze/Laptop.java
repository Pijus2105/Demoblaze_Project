package Demoblaze;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Laptop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https:\\Demoblaze.com");	
		
		
		try {
			
			//Test Case - 03
			//Log In
			
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
		
		//Test Case - 05	
		//Product Choose
		Thread.sleep(3000);
		driver.findElement(By.linkText("Laptops")).click();
		System.out.println("Successfully click");
		
		//Test Case - 06
		//Scroll By & Scroll Down
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1000)","");
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, -1000)", "");
		
		Thread.sleep(3000);
		System.out.println("Please go to The next");
	    driver.findElement(By.xpath("//button[@id='next2']")).click();	
	    
	    //Test Case - 07
	    //Next & Previous
	    Thread.sleep(3000);
	    System.out.println("Please go to The previous");
	    driver.findElement(By.id("prev2")).click();
	    
	    Thread.sleep(3000);
		driver.findElement(By.linkText("Laptops")).click();
		
		//Test Case - 08
		//Product Select
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='contcont']/div[1]/div[2]/div[1]/div[6]/div[1]/a[1]/img[1]")).click();
	
		//Test Case - 09
		//Add To Cart
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Add to cart")).click();
	    System.out.println("Successfully Add To Cart");
	    
	    Thread.sleep(1000);
	    Alert alert = driver.switchTo().alert();
	    String alertMessage = driver.switchTo().alert().getText();
	    System.out.println(alertMessage);
	    Thread.sleep(1000);
	    alert.accept();
	    
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
		
		try {
			
			//Test Case - 10
			//Cart
			Thread.sleep(3000);
			driver.findElement(By.id("cartur")).click();
			System.out.println("Going to Cart");
			
			//Test Case - 11
			Thread.sleep(3000);
			driver.findElement(By.xpath("//tbody/tr[1]/td[4]/a[1]")).click();
			System.out.println("Delete The Extra Product");
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
			System.out.println("Place Order");
			
			//Test Case - 12
			//Address
			Thread.sleep(3000);
			System.out.println("Please enter the Name -TestAutomation");
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("TestAutomation");
			
			
			Thread.sleep(3000);
			System.out.println("Please enter the Country name - ********");
			driver.findElement(By.xpath("//input[@id='country']")).sendKeys("********");
			
			Thread.sleep(3000);
			System.out.println("Please enter the City -@@@@@@");
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys("@@@@@@");
			
			Thread.sleep(3000);
			System.out.println("Please enter the Credit Card Number - 0123456789");
			driver.findElement(By.xpath("//input[@id='card']")).sendKeys("0123456789");
			
			Thread.sleep(3000);
			System.out.println("Please enter the month - &&&&&&");
			driver.findElement(By.xpath("//input[@id='month']")).sendKeys("&&&&&&");
			
			Thread.sleep(3000);
			System.out.println("Please enter the Year - $$$$");
			driver.findElement(By.xpath("//input[@id='year']")).sendKeys("$$$$");
			
			//Test Case - 13
			//Purchase
			Thread.sleep(3000);
			System.out.println("Purchase The Product");
			driver.findElement(By.xpath("//button[contains(text(),'Purchase')]")).click();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,1000)","");
			
			//Test Case - 14
			//Confirm The Order
			Thread.sleep(3000);
			System.out.println("OK");
			driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
			
			//Test Case - 04
			//Log Out
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
		}
	
	
	}

