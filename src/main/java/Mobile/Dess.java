package Mobile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class Dess {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("automationName", "UiAutomator1");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("deviceName", "D1AGAD57C0320264");
		cap.setCapability("adbExecTimeout", 80000);
		cap.setCapability("appPackage", "com.dess.ddmdessmeetings");
		cap.setCapability("appActivity", "com.dess.dms.MainActivity");

		URL url;
        try {
            url = new URL("http://127.0.0.1:4723/wd/hub");
            AppiumDriver dr = new AndroidDriver(url, cap);
            dr.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);

            dr.findElement(MobileBy.xpath("//android.widget.Button[@text=\"Fetch\"]")).click();
            Thread.sleep(18000);
            //System.out.println("end");
        } catch (MalformedURLException e) {
            System.out.println("Failed to initialize Appium driver: " + e.getMessage());
            e.printStackTrace();
        }
        

	}

}
