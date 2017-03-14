package appium;

import static org.junit.Assert.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Mobilegesture2 {

	@Test
	public void test() throws MalformedURLException {
		File appdir= new File("src");
		File app= new File(appdir,"ApiDemos-debug.apk");
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"100");
		cap.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		System.out.println(driver.isAppInstalled("ApiDemos-debug.apk"));
		List<WebElement> obj= driver.findElements(By.className("android.widget.TextView"));
		
		TouchAction t= new TouchAction(driver);
		t.tap(obj.get(3)).perform();
		System.out.println(driver.getContext());
	}

}
