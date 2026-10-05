package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDay2 {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\prabh\\Documents\\JAVA-PRABHA\\Selenium\\selenium.html");
		
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("prabha.test");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("testpass");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("1234");
		driver.findElement(By.xpath("//button[text () = 'Login to Account']"));
	

	}

}
