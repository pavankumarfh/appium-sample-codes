package appium;

import static org.junit.Assert.*;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;


public class Appium_desiredcapabilities {

	@Test
	public void test() throws IOException {
		File appdir = new File("src");
		File app= new File(appdir,"com.bt.bms.apk");
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "300");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		driver.findElementById("com.bt.bms:id/btnLogin").click();
		driver.findElementById("com.bt.bms:id/btnSignUp").click();
		
		List<WebElement> a=driver.findElementsByClassName("android.widget.EditText");
		a.get(0).sendKeys("appium");
		a.get(1).sendKeys("automation");
		a.get(2).sendKeys("appium.automate@gmail.com");
		a.get(3).sendKeys("Darmstadt123");
		
		driver.findElementById("com.bt.bms:id/action_icon").click();
		
	
		
		
	}

}
