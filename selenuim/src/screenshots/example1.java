package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class example1 {
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		File file = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		 
		String str = RandomString.make(3);
		
		File fd=new File("C:\\Program Files\\eclipse-dsl-2020-06-R-win32-x86_64\\eclipse\\screenshot\\abc"+str+".jpg");
		
		FileHandler.copy(file, fd);

}
}