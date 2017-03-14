package appium;

import static org.junit.Assert.*;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Mobilegesture1 {

	@Test
	public void test() throws MalformedURLException, InterruptedException {
		File appdir = new File("src");
		File app= new File(appdir,"com.bt.bms.apk");
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		//cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "300");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        Thread.sleep(2000);
		driver.findElementById("com.bt.bms:id/btnNoThanks").click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("com.bt.bms:id/dismiss").click();
		
		//using swipe and zoom
		
		MobileElement obj= (MobileElement)driver.findElementById("com.bt.bms:id/ctxv_region_name");
		obj.swipe(SwipeElementDirection.UP, 30000);
		obj.zoom();
	}

}
