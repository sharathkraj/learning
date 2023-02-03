package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_handling {
	 
	
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fbdev\\Downloads\\chromedriver_win32\\chromedriver(2).exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/window.xhtml");
        
		String oldwindow = driver.getWindowHandle();
		
		WebElement first = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/button/span"));
		first.click();
		
		Set<String> handles=driver.getWindowHandles();
		for (String newwindow : handles) {
			driver.switchTo().window(newwindow);
		}
		WebElement multi = driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[3]/i"));
		multi.click();
	
		
		driver.switchTo().window(oldwindow);
		
		WebElement open_multi = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']"));
		open_multi.click();
		
		int numOfWindows = driver.getWindowHandles().size();
		System.out.println("NO of windows opened:"+numOfWindows);
		
		WebElement dontCLoseMe = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']"));
		dontCLoseMe.click();
		
		Set<String> newWondowHandles= driver.getWindowHandles();
		
		for (String allwindows : newWondowHandles) {
			if(!allwindows.equals(newWondowHandles)) {
				driver.switchTo().window(allwindows);
				driver.close();
			}
			
		}
		
//		driver.quit();
	}

}
