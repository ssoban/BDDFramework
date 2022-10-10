package com.learning.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class Base_setup_Appium {

    //DesiredCapabilities capabilities = new DesiredCapabilities();
    DesiredCapabilities cap = new DesiredCapabilities();
    public static AppiumDriver<MobileElement> appDriver;

    protected String appiumPort="4723";
    protected String serverIp="0.0.0.0";


    public void initDriver() throws InterruptedException{
        System.out.println("Inside initDriver method");

        cap.setCapability("platformName", "Android");
        cap.setCapability("deviceName", "POCO F1");
        cap.setCapability("NEW_COMMAND_TIMEOUT", "4000");
        cap.setCapability("appPackage", "");
        cap.setCapability("appActivity","");
        cap.setCapability("autoGrantPermissions", true);
        cap.setCapability("noReset", true);
        cap.setCapability(MobileCapabilityType.ACCEPT_INSECURE_CERTS,true);
        cap.setCapability("setWebContentsDebuggingEnabled", true);

        String serverUrl = "http://" + serverIp + ":" + appiumPort + "/wd/hub";

        try{
            System.out.println("Argument to driver object : " + serverUrl);
            appDriver = new AndroidDriver<>(new URL(serverUrl), cap);
            Thread.sleep(10000);
            appDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        }
        catch (NullPointerException | MalformedURLException ex) {
            throw new RuntimeException("appium driver could not be initialised for device ");
        }
        System.out.println("Driver in initdriver is : "+appDriver);
    }



    public void tearDown(){
        appDriver.quit();
    }

}