package Mobile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class App1 
{
    public static AppiumDriver main12() throws MalformedURLException, InterruptedException
    {
    	DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("automationName", "UiAutomator1");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("deviceName", "D1AGAD57C0320264");
		cap.setCapability("adbExecTimeout", 80000);
		cap.setCapability("appPackage", "com.dess.ddmdessmeetings");
		cap.setCapability("appActivity", "com.dess.dms.MainActivity");

		URL url;
        
            url = new URL("http://127.0.0.1:4723/wd/hub");
            AppiumDriver dr = new AndroidDriver(url, cap);
            //dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println("end1");

            Thread.sleep(8000);
            System.out.println("end2");
            //dr.findElement(MobileBy.xpath("//android.widget.Button[@text=\"Fetch\"]")).click();
            System.out.println("end3");
            
        System.out.println("develop branch changes1");
        System.out.println("develop branch changes2");
        System.out.println("develop branch changes3");
        System.out.println("develop branch changes4");
        System.out.println("develop branch changes5");
        
        
        
        
        return dr;
    }
}
