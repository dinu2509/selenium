package day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ddddd {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
       /* driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println(title);
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(4000);
        
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(4000);
        
        driver.navigate().back();
        Thread.sleep(4000);
        
        driver.navigate().forward();
        Thread.sleep(4000);
        
        driver.navigate().refresh();
        Thread.sleep(4000);
        
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("username");*/
        //driver.findElement(By.xpath("//div[@id='passContainer']/input")).sendKeys("password field");

		/*driver.get("https://demo.guru99.com/test/newtours/register.php");
		       // driver.findElement(By.name("email")).sendKeys("username");
		      //  driver.findElement(By.id("pass")).sendKeys("passwordd");
		        //driver.findElement(By.linkText("Create a Page")).click();
		     //   driver.findElement(By.partialLinkText("Forgotten ")).click();
		driver.findElement(By.xpath("//td[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']/input")).sendKeys("test");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("testtt");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("tyjk");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("dfghj");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("fdhj");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("kadapa");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Andhra Pradesh");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("516001");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dinnn");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("dfghjk");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("dfghjk");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		driver.close();
		
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("vdsfghjk");
       // System.out.println(tag);
        Thread.sleep(4000);
        driver.findElement(By.id("email")).clear();
        String message = driver.findElement(By.xpath("//*[contains(text(),'helps')]")).getText();
        System.out.println(message);
        boolean din = driver.findElement(By.id("email")).isDisplayed();
        System.out.println(din);
        */
        
        
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement din = driver.findElement(By.name("country"));
        Select obj = new Select(din);
        //obj.selectByVisibleText("INDIA");
        //obj.selectByIndex(20);
        obj.selectByValue("INDIA");
        Thread.sleep(5000);
        driver.quit();
        
        
		
				
	}

}
