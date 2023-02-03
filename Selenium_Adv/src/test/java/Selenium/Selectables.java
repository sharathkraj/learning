package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbdev\\Downloads\\chromedriver_win32\\chromedriver(2).exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Selectable.html");
		
		List<WebElement> selectable = driver.findElements(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/ul/li"));
		
		int listSize=selectable.size();
		System.out.println(listSize);
		
//		Actions actions = new Actions(driver);
//		actions.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).build().perform();
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(selectable.get(0)).clickAndHold(selectable.get(1)).clickAndHold(selectable.get(2)).build().perform();
		
		

	}

}
