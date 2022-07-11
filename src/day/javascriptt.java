package day;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //open my browser
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		
		String url = js.executeScript("return document.URL;").toString();
		System.out.println(url);
		
		WebElement username = driver.findElement(By.xpath("//*[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//*[@id='pass']"));
		
		//js.executeScript("document.getElementById('email').value='hello world';");
		
		js.executeScript("arguments[0].value='hello world';arguments[1].value='password';",username,password);

		js.executeScript("alert('hello ibm');");
		Alert obj = driver.switchTo().alert();
		obj.accept();
		Thread.sleep(5000);
		
		js.executeScript("history.go(0);arguments[0].value='hello world';history.go(1)",username);
		
		
		
		 //js.executeScript("window.scrollBy(0,1000);");

	}

}
