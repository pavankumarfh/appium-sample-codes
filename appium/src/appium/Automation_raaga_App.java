package appium;

import static org.junit.Assert.*;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;


public class Automation_raaga_App {

	@Test
	public void test() throws IOException, InterruptedException {
		//File appdir = new File("src");
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android device");
		//cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "300");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.raaga.android");
		
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.raaga.android.SplashScreen");
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//List<WebElement> ele = driver.findElementsById("com.raaga.android:id/music_grid_category_name");
		
		MobileElement ele= (MobileElement)driver.findElementById("com.raaga.android:id/music_grid_category_name");
		ele.swipe(SwipeElementDirection.UP, 1750);
		//ele.get(8).click();
		/*MobileElement ele= (MobileElement)driver.findElementById("com.raaga.android:id/music_grid_category_name");
		//System.out.println(ele.size());
		//.swipe(SwipeElementDirection.UP,90000);
        MobileElement ele1= (MobileElement)driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Folk\")");
		TouchAction t= new TouchAction(driver);
		//t.tap(ele.get(10)).perform();
		int startY = ele.getLocation().getY() + (ele.getSize().getHeight() / 2);
        int startX = ele.getLocation().getX() + (ele.getSize().getWidth() / 2);

        int endX = ele1.getLocation().getX() + (ele1.getSize().getWidth() / 2);
        int endY = ele1.getLocation().getY() + (ele1.getSize().getHeight() / 2);

        t.press(startX, startY).waitAction(2000).moveTo(endX, endY).release().perform();*/
	}
	
	
	

}
