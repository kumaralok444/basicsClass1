package basicsClass1;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Test1 {
	public static void main(String args[])
	{
		File pathBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary Binary = new FirefoxBinary(pathBinary);
		FirefoxProfile firefoxPro = new FirefoxProfile();       
		WebDriver driver = new FirefoxDriver(Binary,firefoxPro);
		driver.get("https://www.google.co.in/");
		String title=driver.getTitle();
		System.out.println("Title of page is "+title);
		String url=driver.getCurrentUrl();
		System.out.println("URL of page is "+url);
		String wid=driver.getWindowHandle();
		System.out.println("Id of Window is "+wid);
	}

}
