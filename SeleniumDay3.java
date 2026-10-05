package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDay3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://selenium-prd.firebaseapp.com/");
		
		WebElement email = driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");
	
		
		WebElement password = driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[text () = 'Login to Account']"));
		loginbutton.click();

		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
		
		
		Thread.sleep(5000);
		home.click();
		
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Sample");
		
		WebElement lastname = driver.findElement(By.id("lname"));
		lastname.sendKeys("Lastname");
		
		WebElement postaladdr = driver.findElement(By.id("postaladdress"));
		postaladdr.sendKeys("48 Sample address1");
		
		WebElement personaladdr = driver.findElement(By.id("personaladdress"));
		personaladdr.sendKeys("48 Sample address2");
		
		WebElement gender = driver.findElement(By.xpath("//input[@value='female']"));
		gender.click();
		
		WebElement citydropdown = driver.findElement(By.id("city"));
		Select city = new Select(citydropdown);
		city.selectByVisibleText("NEW DELHI"); 
		
		WebElement coursedropdown = driver.findElement(By.name("course"));
		Select course = new Select(coursedropdown);
		course.selectByValue("mba");
		
		WebElement districtdropdown = driver.findElement(By.id("district"));
		Select district = new Select(districtdropdown);
		district.selectByIndex(1);
		
		WebElement statedropdown = driver.findElement(By.id("state"));
		Select state = new Select(statedropdown);
		state.selectByIndex(2);
		
		WebElement pincode = driver.findElement(By.id("pincode"));
		pincode.sendKeys("1234");
		
		WebElement emailid = driver.findElement(By.id("emailid"));
		emailid.sendKeys("admin123@gmail.com");
		
		
		Thread.sleep(6000);
		WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
		submit.click();
		

	}

}
