package appium;

import static org.junit.Assert.*;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;


public class Automation_Invokingapp {

	@Test
	public void test() throws IOException, InterruptedException {
		//File appdir = new File("src");
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android device");
		//cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "300");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.bt.bms");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.bt.bms.activities.SplashActivity");
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		/*driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("com.bt.bms:id/btnLogin").click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("com.bt.bms:id/btnSignUp").click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> a=driver.findElementsByClassName("android.widget.EditText");
		a.get(0).sendKeys("appium");
		a.get(1).sendKeys("automation");
		a.get(2).sendKeys("appium.automate@gmail.com");
		a.get(3).sendKeys("Darmstadt123");
		Thread.sleep(1000);
		driver.findElementById("com.bt.bms:id/action_icon").click();
		*/
	
		
		
	}

}
