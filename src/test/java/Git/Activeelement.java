package Git;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activeelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriverManager.chromedriver().setup();
 RemoteWebDriver driver=new ChromeDriver();
 /*driver.get("https://www.google.com");
 driver.switchTo().activeElement().sendKeys("virat",Keys.ENTER);
 
 driver.switchTo().newWindow(WindowType.WINDOW);*/
 
 driver.get("https://www.w3schools.com/jsref/met_win_alert.asp");
 

 
 //driver.switchTo().frame("cnftComm");
 driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]")).click();
 Thread.sleep(5000);
 driver.switchTo().frame(1);

 driver.findElement(By.xpath("//button[text()='Try it']")).click();
 
 
 
	}

}
