//import java.util.*;
//import static java.lang.Math.pow;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import junit.framework.Assert;
public class AyushXpath {

	//public static void main(String[] args) {
           
	@BeforeSuite(alwaysRun = true)
	public void Setup()
	{
		
		 //TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
	}
	
	 @Test()
	 
	 public void mainFunction()
	 {
		WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	     
	     // open GlobalSqa Web site
	     
	     driver.navigate().to("http://www.globalsqa.com/angularjs-protractor-practice-site/");
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
         
	     // Click on Multiform at basic form components
	     driver.findElement(By.xpath("//a[contains(@href,'angularJs-protractor/Multiform') and @class='button tiny_button button_pale regular_text']")).click();
	     try {
	     
	     //Provive name and Email and click on next section
	     driver.findElement(By.xpath(" //*[@name='name']")).sendKeys("Ayush Sharma");   
	     driver.findElement(By.xpath(" //*[@name='email']")).sendKeys("shamaayushlnct@gmail.com"); 
	     driver.findElement(By.xpath("//*[@class='btn btn-block btn-info']")).click();
	     
	    //Radio button object are not visible to click at radio button
	    
	    Thread.sleep(3000);
	     //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@value='xbox']")));
	     driver.findElement(By.xpath("//*[@value='xbox']")).click();
	    
	    
	     
			Thread.sleep(3000);
		 
        driver.findElement(By.xpath("//*[@class='btn btn-block btn-info']")).click();
        
            Thread.sleep(2000);
       // driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
        driver.findElement(By.xpath("//*[@type='submit']")).click();
	    
        driver.close();
	     
        WebDriver driver1= new ChromeDriver();
	   driver1.navigate().to("http://www.globalsqa.com/angularjs-protractor-practice-site/");
	   driver1.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
	   driver1.manage().window().maximize();
	   
	   
	   driver1.findElement(By.xpath("//a[contains(@href,'angularJs-protractor/WebTable') and @class='button tiny_button button_pale regular_text']")).click();
	     driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	   
	     // Click on WebTable at basic form components
	     driver1.findElement(By.xpath("/html/body/div[1]/table/thead/tr[2]/th[1]/input")).sendKeys("Robert");
	     //driver1.findElement(By.xpath("/html/body/div[1]/table/thead/tr[2]/th[2]/input")).sendKeys("2585.5190927908575");
	     
	     driver1.close();
	     
		 
			 //Open Url for Search filter
	     WebDriver driver2= new ChromeDriver();
		   driver2.navigate().to("http://www.globalsqa.com/angularJs-protractor/SearchFilter/");
		   driver2.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		   driver2.manage().window().maximize();
		   
		  // Select item from drop down list
		  
		   Select oSelect = new Select(driver2.findElement(By.id("input2")));
		   oSelect.selectByIndex(0);
		   Select oSelect1 = new Select(driver2.findElement(By.id("input3")));
		   oSelect1.selectByIndex(2);
		   String Account, Type,Payee,Amount;
		   
		   //Verify the value of table
		   Account= driver2.findElement(By.xpath("//td[text()=\"Bank Savings\"]")).getText();
		   //System.out.println(Account);
		   assertEquals("Bank Savings",Account);
		   Type=driver2.findElement(By.xpath("//td[text()=\"INCOME\"]")).getText();
		   assertEquals("INCOME",Type);
		   Payee=driver2.findElement(By.xpath("//td[text()=\"Salary\"]")).getText();
		   assertEquals("Salary",Payee);
		   Amount=driver2.findElement(By.xpath("//td[text()=\"5000\"]")).getText();
		   assertEquals("5000",Amount);
		   
		    
	     }
	        catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
}
}
