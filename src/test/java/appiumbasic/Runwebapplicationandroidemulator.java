package appiumbasic;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Runwebapplicationandroidemulator {
@Test
public static void main(String[] args) throws InterruptedException, MalformedURLException


{
	BasicConfigurator.configure();

		System.out.println("automation testing");
		
		DesiredCapabilities caps = new DesiredCapabilities ();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3_XL_API_32");
	
		WebDriverManager.chromedriver().setup();
		caps.setCapability("chromedriverExecutable",WebDriverManager.chromedriver().getBinaryPath());

		AndroidDriver driver = new AndroidDriver(new URL("http://localhost/wd/hub"),caps);
		driver.get("http://www.google.com");
		  
}}
