package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegiPatientBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Yuvraj/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "Login";
		if(expectedTitle.equals(actualTitle)) {
			
			System.out.println("open correct URL");
		}
		else {
			
			System.out.println("incorrect URL");
		}
		
		
		WebElement username = driver.findElement(By.id("username"));
		if(username.isDisplayed() && username.isEnabled())
		{
		username.sendKeys("admin");
		
		}
		else {
			
			System.out.println("field is not clickable");
		}
		WebElement password = driver.findElement(By.id("password"));
		if(password.isDisplayed() && password.isEnabled())
		{
			password.sendKeys("Admin123");
		
		}
		else 
		{
			System.out.println("field is not clickable");
		}
		driver.findElement(By.id("Pharmacy")).click();
		System.out.println("location selected");
		
		
		driver.findElement(By.id("loginButton")).click();
		
        String actualTitle1 = driver.getTitle();
		
		String expectedTitle1 = "Home";
		
		if(expectedTitle1.equals(actualTitle1)) {
			
			System.out.println("open Home page");
		}
		else {
			
			System.out.println("incorrect page");
		}
		
		
		WebElement patientLink = driver.findElement(By.linkText("Register a patient"));
		if(patientLink.isEnabled()) {
			
			patientLink.click();
		}
		else
		{
			System.out.println("patient link is disabled");
		}

	}

}
