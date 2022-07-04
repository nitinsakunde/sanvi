package selenium_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_03 {

	public static void main(String[] args) throws InterruptedException {
		
		String xyz="C:\\Users\\Dell\\eclipse-workspace\\BATCH_10A_PROJECT\\SELENIUM_JAVA\\abc\\chromedriver_win32\\chromedriver.exe";
		
	System.setProperty("webdriver.chrome.driver",xyz); //set browser here like chrome ,firefox,edge
	
	WebDriver driver=new ChromeDriver();  //create object
	
	driver.get("https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_a43C7D274479A251BA4BAE8954&mfadid=adm");
	//provide url with d help of get method
	
	driver.manage().window().maximize(); //maximize window 
	Thread.sleep(3000); //delay time to proceed next step
	
	System.out.println(driver.getTitle()); //print tittle
	
	System.out.println(driver.getCurrentUrl());//print current url through this method
	
	driver.navigate().to("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
	//nevigate method used for navigate next page
	
	driver.manage().window().maximize(); //maximize that next page
	Thread.sleep(4000);      //hold page for 4 sec
	driver.navigate().back();     //navigate to previous page
	Thread.sleep(2000);      //hold that page for 2 sec
	driver.navigate().forward();//page forward navigate
	Thread.sleep(2000); //hold for 2 sec
	driver.close(); //close window
	
	}

}
