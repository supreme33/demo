package package1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail {
	
	
	@Test
	public void Testcases(){
		WebDriver d1=new FirefoxDriver();
		d1.get("http:\\www.google.com");
		d1.get("http:\\www.facebook.com");
		d1.findElement(By.id("email")).sendKeys("supreme@gmail.com");
		d1.findElement(By.id("pass")).sendKeys("123456");
		d1.quit();
		

	}

}
