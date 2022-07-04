package selenium_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firebox.driver", "C:\\Users\\Dell\\eclipse-workspace\\BATCH_10A_PROJECT\\SELENIUM_JAVA\\abc\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://bugspotter.in/contact.html"); //provide link for browser throgh GET method
	
	driver.manage().window().maximize();  //used to maximise window
	
	System.out.println(driver.getTitle()); //
	
	System.out.println(driver.getCurrentUrl()); //
	
	Thread.sleep(2000); // 2 sec
	
	driver.close();  //for close page

	}

}
