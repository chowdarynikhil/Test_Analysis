package Task.Task;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class RunGoogle {

	 
	
   public static void main(String[] args) throws InterruptedException {
		
	
	 System.setProperty("webdriver.gecko.driver" ,"\\D:\\Users\\diness\\Music\\geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 driver.get("https://www.google.com");
     GoogleSearch gl = new GoogleSearch(driver);
	 gl.keys("Test Automation");
	 gl.text_count();
}
}
