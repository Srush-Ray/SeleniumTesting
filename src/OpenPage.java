import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.BeforeClass;
import org.junit.Test;


class Page{
	 WebDriver driver; 
	 
	 public void Page1() throws InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver","/home/srushti/chromedriver");
		 driver=new ChromeDriver();
		 driver.get("http://localhost:3000/");
		 driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("password")).sendKeys("123");
		 Select type=new Select( driver.findElement(By.name("User_type")));
		 type.selectByValue("3");
		 Thread.sleep(2000);
		 driver.findElement(By.name("loginBtn")).click();
		 Thread.sleep(2000);
		 
//		 String at=driver.getTitle();
//		 System.out.println(at);
		 
		 List<WebElement> popUpElement = driver.findElements(By.id("err"));
		 if(popUpElement.size() != 0){
		   System.out.println("Error occured : "+popUpElement.get(0).getText());
		 }		 
		 
		 driver.close();
	 }
}
class admin{
	 WebDriver driver; 
	 public admin() throws InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver","/home/srushti/chromedriver");
		 driver=new ChromeDriver();
		 driver.get("http://localhost:3000/");
		 driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("password")).sendKeys("123");
		 Select type=new Select( driver.findElement(By.name("User_type")));
		 type.selectByValue("3");
		 Thread.sleep(2000);
		 driver.findElement(By.name("loginBtn")).click();
		 Thread.sleep(2000);
		 
//		 String at=driver.getTitle();
//		 System.out.println(at);
		 
		 List<WebElement> popUpElement = driver.findElements(By.id("err"));
		 if(popUpElement.size() != 0){
		   System.out.println("Error occured : "+popUpElement.get(0).getText());
		 }		 
		 
		 driver.close();
	 }
}
public class OpenPage {

 
 public static void main(String[] args) throws InterruptedException {
		
	 Page p=new Page();
	 p.Page1();
	}

}
