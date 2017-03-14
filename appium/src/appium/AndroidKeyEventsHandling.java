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
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AndroidKeyEventsHandling {

	@Test
	public void test() throws MalformedURLException {
		File appdir= new File("src");
		File app= new File(appdir,"ApiDemos-debug.apk");
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"100");
		cap.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		List<WebElement> count=driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)");
		System.out.println(count.size());
		System.out.println(count.get(3).getText());
		count.get(3).click();
		
		driver.pressKeyCode(AndroidKeyCode.HOME);
		//driver.findElementByAndroidUIAutomator("new UiSelector().text(\"NFC\")").click();
	}

}
