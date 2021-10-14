package handlingmultiselectDropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndexMethod {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Desktop/htmldocswcsm5a/multiSelectDropdown.html");
		Thread.sleep(8000);
		WebElement dropdownElement = driver.findElement(By.id("menu"));
		
		Select sel = new Select(dropdownElement);
		sel.selectByIndex(4);
		Thread.sleep(5000);
		sel.deselectByIndex(4);
	}

}
