package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbdev\\Downloads\\chromedriver_win32\\chromedriver(2).exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\'form:drag_content\']"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\'form:drop_content\']/p"));
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(from).moveToElement(to).release(to).build().perform();
		actions.dragAndDrop(from, to).build().perform();
		
		

	}

}
