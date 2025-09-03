package day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		
		
		LoginPage_new login = new LoginPage_new(driver);
		login.enterEmail("diptirc5655@gmail.com");
		login.enterPassword("123456789");
		login.clickLogin();
		
		
		System.out.println("Login successfully Done ");
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
	}

}
