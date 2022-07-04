package selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class java_locators {

	public static void main(String[] args) throws InterruptedException {
		String x="C:\\Users\\Dell\\eclipse-workspace\\BATCH_10A_PROJECT\\SELENIUM_JAVA\\abc\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", x);
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/");  
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    WebElement text_email=driver.findElement(By.id("email"));
	    text_email.sendKeys("8800674");
	    WebElement Text_pass=driver.findElement(By.name("pass"));
	    Text_pass.sendKeys("nitin@@");
	    Thread.sleep(2000);
	    WebElement btn_login= driver.findElement(By.name("login"));
	    btn_login.click();
	   Thread.sleep(2000);
	   driver.close();
	  
	    
	    
	    
	    
	}

}
//step 
/*1.make string variable and provide path 
 2.system.setproperty("webdriver.browername.driver",string name)
 3.make object of that browser like( WebDriver driver=new browsernameDriver(); )
 4.call get method with d help of object and provide input link
 5.maximize window
 6.if there is login page then right click on login page>>inspect>>arrow>>select field
   >>select attribute value>>copy
 7.go on eclips make a object for find element like
    WebElement ref variable=driver.findElement(By.locator("value"));
 8.to provide value in that field then use sendkeys method with d help of ref variable
 9.whatever field is there just follow step no 6
 10.if there is any button then use click method 
 11.last used close method for exit window
    
 
 */
