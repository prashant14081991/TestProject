package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getDataInAColm_staticTable {
public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Program%20Files/eclipse-dsl-2020-06-R-win32-x86_64/eclipse/webtable.html");
		
		for (int i = 1; i <=5; i++) 
		{
			if(i==1) {
			String text = driver.findElement(By.xpath("//table[@class='abc']/tbody/tr[ "+i+"]/th[2]")).getText();
			System.out.println(text);
		}
			else {
				String text = driver.findElement(By.xpath("//table[@class='abc']/tbody/tr[ "+i+"]/td[2]")).getText();
				System.out.println(text);
			}
		}
}
}