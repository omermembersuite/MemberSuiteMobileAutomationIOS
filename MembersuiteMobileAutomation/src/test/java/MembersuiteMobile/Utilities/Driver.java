package MembersuiteMobile.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
    private static AppiumDriver driver;

    public static AppiumDriver get() {
        if (driver == null) {
            String platform = ConfigurationReader.get("platform");
            switch (platform) {

                case "iOS-iPhone12ProMax":
                    DesiredCapabilities iPhone12ProMax = new DesiredCapabilities();
                    iPhone12ProMax.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
                    iPhone12ProMax.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
                    iPhone12ProMax.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
                    iPhone12ProMax.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12 Pro Max");
                    iPhone12ProMax.setCapability(MobileCapabilityType.APP, "");
                    try {
                        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), iPhone12ProMax);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;

                case "iOS-iPhone12Pro":
                    DesiredCapabilities iPhone12Pro = new DesiredCapabilities();
                    iPhone12Pro.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
                    iPhone12Pro.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
                    iPhone12Pro.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
                    iPhone12Pro.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12 Pro");
                    iPhone12Pro.setCapability(MobileCapabilityType.APP, "");
                    try {
                        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), iPhone12Pro);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;

                case "iOS-iPhone12":
                    DesiredCapabilities iPhone12 = new DesiredCapabilities();
                    iPhone12.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
                    iPhone12.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
                    iPhone12.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
                    iPhone12.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12");
                    iPhone12.setCapability(MobileCapabilityType.APP, "");
                    try {
                        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), iPhone12);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;

                case "iOS-iPhone11Pro":
                    DesiredCapabilities iPhone11Pro = new DesiredCapabilities();
                    iPhone11Pro.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
                    iPhone11Pro.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
                    iPhone11Pro.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
                    iPhone11Pro.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11 Pro");
                    iPhone11Pro.setCapability(MobileCapabilityType.APP, "");
                    try {
                        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), iPhone11Pro);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;


                case "iOS-iPhone11ProMax":
                    DesiredCapabilities iPhone11ProMax = new DesiredCapabilities();
                    iPhone11ProMax.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
                    iPhone11ProMax.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
                    iPhone11ProMax.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
                    iPhone11ProMax.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11 Pro Max");
                    iPhone11ProMax.setCapability(MobileCapabilityType.APP, "");
                    try {
                        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), iPhone11ProMax);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;



                case "iOS-iPhone11":
                    DesiredCapabilities iPhone11 = new DesiredCapabilities();
                    iPhone11.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
                    iPhone11.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
                    iPhone11.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
                    iPhone11.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
                    iPhone11.setCapability(MobileCapabilityType.APP, "");
                    try {
                        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), iPhone11);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;

                case "iOS-iPhoneXS":
                    DesiredCapabilities iPhoneXS = new DesiredCapabilities();
                    iPhoneXS.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
                    iPhoneXS.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
                    iPhoneXS.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
                    iPhoneXS.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone XS");
                    iPhoneXS.setCapability(MobileCapabilityType.APP, "");
                    try {
                        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), iPhoneXS);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;


                case "iOS-iPhoneXSMax":
                    DesiredCapabilities iPhoneXSMax = new DesiredCapabilities();
                    iPhoneXSMax.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
                    iPhoneXSMax.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
                    iPhoneXSMax.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
                    iPhoneXSMax.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone XS Max");
                    iPhoneXSMax.setCapability(MobileCapabilityType.APP, "");
                    try {
                        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), iPhoneXSMax);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;

                case "iOS-iPhoneXR":
                    DesiredCapabilities iPhoneXR = new DesiredCapabilities();
                    iPhoneXR.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
                    iPhoneXR.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
                    iPhoneXR.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
                    iPhoneXR.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone XR");
                    iPhoneXR.setCapability(MobileCapabilityType.APP, "");
                    try {
                        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), iPhoneXR);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;

                case "iOS-iPhoneX":
                    DesiredCapabilities iPhoneX = new DesiredCapabilities();
                    iPhoneX.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
                    iPhoneX.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
                    iPhoneX.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
                    iPhoneX.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");
                    iPhoneX.setCapability(MobileCapabilityType.APP, "");
                    try {
                        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), iPhoneX);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;

                case "iOS-iPhone8":
                    DesiredCapabilities iPhone8 = new DesiredCapabilities();
                    iPhone8.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
                    iPhone8.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
                    iPhone8.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
                    iPhone8.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
                    iPhone8.setCapability(MobileCapabilityType.APP, "");
                    try {
                        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), iPhone8);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;

                case "iOS-iPhone8Plus":
                    DesiredCapabilities iPhone8Plus = new DesiredCapabilities();
                    iPhone8Plus.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
                    iPhone8Plus.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
                    iPhone8Plus.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
                    iPhone8Plus.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8 Plus");
                    iPhone8Plus.setCapability(MobileCapabilityType.APP, "");
                    try {
                        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), iPhone8Plus);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;


                case "iOS-iPhone7":
                    DesiredCapabilities iPhone7 = new DesiredCapabilities();
                    iPhone7.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
                    iPhone7.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
                    iPhone7.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
                    iPhone7.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 7");
                    iPhone7.setCapability(MobileCapabilityType.APP, "");
                    try {
                        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), iPhone7);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;

                case "iOS-iPhone7Plus":
                    DesiredCapabilities iPhone7Plus = new DesiredCapabilities();
                    iPhone7Plus.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
                    iPhone7Plus.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
                    iPhone7Plus.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
                    iPhone7Plus.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 7 Plus");
                    iPhone7Plus.setCapability(MobileCapabilityType.APP, "");
                    try {
                        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), iPhone7Plus);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;


                    /*
                    Ipad and models
                     */

                case "iPad Pro 12.9-inch (4th generation)":
                    DesiredCapabilities iPadPro1294thGen = new DesiredCapabilities();
                    iPadPro1294thGen.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
                    iPadPro1294thGen.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
                    iPadPro1294thGen.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
                    iPadPro1294thGen.setCapability(MobileCapabilityType.DEVICE_NAME, "iPad Pro (12.9-inch) (4th generation)");
                    iPadPro1294thGen.setCapability(MobileCapabilityType.APP, "");
                    try {
                        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), iPadPro1294thGen);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;

                case "iPad Pro 11-inch (2nd generation)":
                    DesiredCapabilities iPadPro112ndGeneration = new DesiredCapabilities();
                    iPadPro112ndGeneration.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
                    iPadPro112ndGeneration.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
                    iPadPro112ndGeneration.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
                    iPadPro112ndGeneration.setCapability(MobileCapabilityType.DEVICE_NAME, "iPad Pro 11-inch (2nd generation)");
                    iPadPro112ndGeneration.setCapability(MobileCapabilityType.APP, "");
                    try {
                        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), iPadPro112ndGeneration);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;

                case "iPad Pro 12.9-inch (3rd generation)":
                    DesiredCapabilities iPadPro123rdGeneration = new DesiredCapabilities();
                    iPadPro123rdGeneration.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
                    iPadPro123rdGeneration.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
                    iPadPro123rdGeneration.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
                    iPadPro123rdGeneration.setCapability(MobileCapabilityType.DEVICE_NAME, "iPad Pro 12.9-inch (3rd generation)");
                    iPadPro123rdGeneration.setCapability(MobileCapabilityType.APP, "");
                    try {
                        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), iPadPro123rdGeneration);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;


                default:
                    throw new RuntimeException("Driver is not implemented yet!");
            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}