package com.ims.testsuite;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdminLogin {
	    @Test
	    public void testOne() throws InterruptedException{
	    	 WebDriver driver; 	    		 
	    		 System.setProperty("webdriver.chrome.driver","/home/srushti/chromedriver");
	    		 driver=new ChromeDriver();
	    		 driver.get("http://localhost:3000/");
	    		 driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	    		 Scanner sc=new Scanner(System.in);
	    		 String name,pass;
//	    		 System.out.println("--------------ADMIN LOGIN--------------------");
//	    		 System.out.println("Enter username:");
//	    		 name=sc.nextLine();
//	    		 System.out.println("Enter password:");
//	    		 pass=sc.nextLine();
	    		 driver.findElement(By.name("username")).sendKeys("admin");
	    		 driver.findElement(By.name("password")).sendKeys("123");
	    		 Select type=new Select( driver.findElement(By.name("User_type")));
	    		 type.selectByValue("3");
	    		 Thread.sleep(5000);
	    		 driver.findElement(By.name("loginBtn")).click();
//	    		 List<WebElement> popUpElement = driver.findElements(By.id("err"));
//	    		 if(popUpElement.size() != 0){
//	    		   System.out.println("Error occured : "+popUpElement.get(0).getText());
//	    		   driver.close();
//	    		 }			    		 
	    		 System.out.println("--------------UPDATE ADMIN PROFILE--------------------");
	    		 String first,last,department,email;
//	    		 System.out.println("Enter FirstName:");
//	    		 first=sc.nextLine();
//	    		 System.out.println("Enter LastName:");
//	    		 last=sc.nextLine();
//	    		 System.out.println("Enter Department:");
//	    		 department=sc.nextLine();
//	    		 System.out.println("Enter Email:");
//	    		 email=sc.nextLine();
	    		 Thread.sleep(5000);
	    		 driver.findElement(By.id("editButton")).click();
	    		 driver.findElement(By.name("firstname")).sendKeys("Srushti");
	    		 driver.findElement(By.name("lastname")).sendKeys("Raybhoge");
//	    		 Select designation=new Select( driver.findElement(By.name("designation")));
//	    		 designation.selectByValue("Principal");
	    		 driver.findElement(By.name("department")).sendKeys("ENTC");
	    		 driver.findElement(By.name("emailId")).sendKeys("srushti.raybhoge612@gmail.com");
	    		 driver.findElement(By.id("updateBtn")).click();	    		 
	    		 Thread.sleep(10000);

	    		 System.out.println("--------------FIND A FACULTY MEMBER--------------------");
	    		 driver.findElement(By.className("facultyList")).click();
	    		 Thread.sleep(6000);
	    		 String txt;
//	    		 System.out.println("Enter to find:");
//	    		 txt=sc.nextLine();
	    		 driver.findElement(By.name("filter")).sendKeys("Samruddhi");
	    		 Thread.sleep(6000);
	    		 

//	    		 System.out.println("--------------VIEW STUDENT LIST--------------------");
//	    		 driver.findElement(By.className("studentList")).click();
//	    		 Thread.sleep(6000);
	    		 
//	    		 String year,div;
//	    		 System.out.println("--------------ADD NEW FACULTY MEMBER--------------------");
//	    		 driver.findElement(By.className("addFaculty")).click();
//	    		 Thread.sleep(2000);
//	    		 System.out.println("Enter FirstName:");
//	    		 first=sc.nextLine();
//	    		 System.out.println("Enter LastName:");
//	    		 last=sc.nextLine();
//	    		 System.out.println("Enter Department:");
//	    		 department=sc.nextLine();
//	    		 System.out.println("Enter year:");
//	    		 year=sc.nextLine();
//	    		 System.out.println("Enter division:");
//	    		 div=sc.nextLine();
//	    		 System.out.println("Enter username:");
//	    		 name=sc.nextLine();
//	    		 System.out.println("Enter password:");
//	    		 pass=sc.nextLine();
//	    		 System.out.println("Enter Email:");
//	    		 email=sc.nextLine();
	    		
//	    		 driver.findElement(By.name("firstname")).sendKeys("Suresh");
//	    		 driver.findElement(By.name("lastname")).sendKeys("Patil");
//	    		 Select designa=new Select( driver.findElement(By.name("designation")));
//	    		 designa.selectByValue("Admin");
//	    		 driver.findElement(By.name("department")).sendKeys("IT");
//	    		 driver.findElement(By.name("year")).sendKeys("BE");
//	    		 driver.findElement(By.name("div")).sendKeys("4");
//	    		 driver.findElement(By.name("username")).sendKeys("sureshP");
//	    		 driver.findElement(By.name("password")).sendKeys("789");
//	    		 driver.findElement(By.name("emailId")).sendKeys("suresh@gmail.com");
//	    		 driver.findElement(By.name("add")).click();	    		 
//	    		 Thread.sleep(20000);
//	    		
	    		 System.out.println("--------------DELETE FACULTY MEMBER--------------------");
	    		 driver.findElement(By.className("deleteFaculty")).click();
	    		 Thread.sleep(2000);
	    		 System.out.println("Enter username:");
	    		 name=sc.nextLine();
	    		 driver.findElement(By.name("username")).sendKeys(name);
	    		 driver.findElement(By.name("getinfo")).click();
	    		 Thread.sleep(6000);
//	    		 
//	    		 System.out.println("--------------VIEW STATISTICS--------------------");
//	    		 driver.findElement(By.className("stats")).click();	    		 
//	    		 Thread.sleep(10000);
//	    		 
//	    		 System.out.println("--------------STUDENT REPORT--------------------");
//	    		 driver.findElement(By.className("studentReport")).click();	    		 
//	    		 Thread.sleep(10000);
//	    		 
//	    		 System.out.println("--------------AICTE REPORT--------------------");
//	    		 driver.findElement(By.className("report")).click();	    		 
//	    		 Thread.sleep(10000);
//	    		 
//	    		 System.out.println("--------------SETTINGS--------------------");
//	    		 driver.findElement(By.className("setting")).click();	    		 
//	    		 Thread.sleep(10000);
//	    		 
//	    		 System.out.println("--------------LOGOUT--------------------");
//	    		 driver.findElement(By.className("logout")).click();	    		 
	    		 Thread.sleep(5000);

	    		 driver.findElement(By.className("facultyList")).click();
	    		 Thread.sleep(6000);
	    		 List  col = driver.findElements(By.name("facultyCard"));
	    	        System.out.println("Number of faculty members : " +col.size()); 
	    		 
	    	        Thread.sleep(5000);

		    		 System.out.println("--------------VIEW STUDENT LIST--------------------");
		    		 driver.findElement(By.className("facultyList")).click();
		    		 List<WebElement>  col1 = driver.findElements(By.name("facultyCard"));
		    	        System.out.println("Number of Faculty Member : " +col1.size()); 
//		    		 
		    	        for(WebElement w:col1) {
		    	        	System.out.println(w.getText());
		    	        }
		    	     Thread.sleep(6000);
	    	        
	    		 driver.close();
	    		 
	    		
	    	 }
}
