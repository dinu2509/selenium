package day;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouseexample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //open my browser
		
		/*
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Actions obj = new Actions(driver);
		WebElement din = driver.findElement(By.name("firstName"));
		obj.keyDown(din,Keys.SHIFT).sendKeys("Dinesh").sendKeys(Keys.BACK_SPACE).sendKeys(Keys.chord("h k")).keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(4000);
		driver.quit();
		*/
		
		
		/*
		driver.get("https://jqueryui.com/selectable/");
		Actions obj = new Actions(driver);
        WebElement frameexam = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frameexam);
        WebElement elem = driver.findElement(By.xpath("//li[text()='Item 2']"));
        //WebElement objfordrop = driver.findElement(By.id("droppable"));
        Thread.sleep(5000);
        
        obj.click(elem).build().perform();;
		
		*/

		
		
		driver.get("https://jqueryui.com/droppable/");
		
        Actions obj = new Actions(driver);
        WebElement frameexam = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frameexam);
        
        WebElement elem = driver.findElement(By.id("draggable"));
        WebElement objfordrop = driver.findElement(By.id("droppable"));
        
        //obj.clickAndHold(elem).moveToElement(objfordrop).release().build().perform();
        obj.dragAndDrop(elem, objfordrop).build().perform();
        driver.switchTo().defaultContent();  // will again switch back to parent body from frame
	}

}
