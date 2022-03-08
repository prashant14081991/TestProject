package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchBackToMainPageFromIframe {
	
public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		d.switchTo().frame("iframeResult");  //iframe int input
		
		WebElement framelement = d.findElement(By.xpath("//button[contains(text(),'Click')]"));
		framelement.click();
		
		//d.switchTo().parentFrame();
		d.switchTo().defaultContent();
		
		WebElement homeElement = d.findElement(By.xpath("//a[@id='tryhome']"));
		
		homeElement.click();
}
}