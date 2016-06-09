package basicsClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Test1 {
	public static void main(String args[])
	{
		//FirefoxProfile profile = new FirefoxProfile();
		//FirefoxBinary binary = new FirefoxBinary();
		//WebDriver driver = new FirefoxDriver(binary,profile);     
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
	    FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		String title=driver.getTitle();
		System.out.println("Title of page is "+title);
	}

}
