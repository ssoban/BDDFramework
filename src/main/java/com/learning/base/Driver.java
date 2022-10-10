package com.learning.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Driver {
    public AppiumDriver<MobileElement> appDriver;

    public Driver(AppiumDriver<MobileElement> appDriver) {
        this.appDriver = appDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appDriver), this);
    }
}