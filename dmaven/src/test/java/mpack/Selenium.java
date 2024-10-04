package mpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.findElement(By.linkText("https://tutorialsninja.com/demo")).click();
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("satyadeopatel2810@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("FIBPP0158Q");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Boolean check=driver.findElement(By.xpath("//a[text()='Account']")).isDisplayed();
		System.out.println(check);
		driver.findElement(By.name("search")).sendKeys("mac");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		driver.findElement(By.linkText("MacBook Pro")).click();
		WebElement quantity=driver.findElement(By.id("input-quantity"));
		quantity.clear();
		quantity.sendKeys("3");
		driver.findElement(By.id("button-cart")).click();
		WebElement successMsg=driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']"));
		System.out.println(successMsg.getText());
		
		driver.findElement(By.id("cart-total")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']")).click();
		driver.findElement(By.xpath("//a[text()='Checkout']")).click();
		
		//driver.close();
		
		
		
	}

}
