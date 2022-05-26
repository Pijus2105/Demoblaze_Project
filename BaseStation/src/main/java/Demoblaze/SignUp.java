package Demoblaze;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.Alert;



public class SignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https:\\Demoblaze.com");	

		//Test Case - 01
		try {
			//Sign Up
			if ("Sign Up is not click properly".startsWith("signin2")) {
				System.out.println("Sign Up : Please Check The Button");
			}else {
				System.out.println("Sign Up : Sign Up Button is click");
				
			}
			
			
			WebElement EL = driver.findElement(By.id("signin2"));
		        System.out.println(true);
				System.out.println("Sign Up : Sign up page is open");
						
			
		 EL.click();
		  
		 //User Name
		    WebElement SL = driver.findElement(By.id("sign-username"));
		        System.out.println(true);
		        System.out.println("Email : Email is Taken");
		    SL.sendKeys("pijusg448@gmail.com");
		
		 //Password   
		    WebElement PL = driver.findElement(By.id("sign-password"));
		        System.out.println(true);
		        System.out.println("Password : Password is Taken");
		    PL.sendKeys("Pijus123@");
		    
		 //Sign Up & Alert   
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//button[@onclick='register()']")).click();
		    Thread.sleep(1000);
		    Alert alert = driver.switchTo().alert();
		    String alertMessage = driver.switchTo().alert().getText();
		    System.out.println(alertMessage);
		    Thread.sleep(1000);
		    alert.accept();
		    System.out.println(true);
		    System.out.println("SignUp : Registered Successful");
			
		   if ("This user already exist.".equals(alertMessage)) {
			   System.out.println(true);
		   }else{
			   System.out.println(false);
		   }
		    
		  //Close  
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//body/div[@id='signInModal']/div[1]/div[1]/div[3]/button[1]")).click();
		    System.out.println("Close : It is close");
		    
		  //Registration Is Not Allowed  
		    if (SL.equals(driver.findElement(By.id("sign-username")))) {
		    	if ("pijusg448@gmail.com".equals("pijusg448@gmail.com")) {
		    	System.out.println("Re-registered : Email is already exist");
		    }else {
		    	System.out.println("Re-registerd : Welcome To Demoblaze");
		    }
		    }
			if (PL.equals(driver.findElement(By.id("sign-password")))) {
				if ("Pijus123@".equals("Pijus123@")) {
				System.out.println("Re-registerd : Password is Already Exist ");
				}else {
					System.out.println("Re-registered : Welcome To Demoblaze");
				}
			}
			
		}
		
		catch (NoSuchElementException e) {
			System.out.println("Yes! I can say where is the Exception.");
			System.out.println(e);
		} finally {
		System.out.println("All Are Done");
		}
		
		//All Methods Are In Try And Catch Block For Safety
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
