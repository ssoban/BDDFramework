package pages;

import com.learning.base.Base_setup_Appium;
import com.learning.base.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AppiumHomePage extends Driver {


    public AppiumHomePage(AppiumDriver<MobileElement> appDriver) {
        super(appDriver);
    }

    @AndroidFindBy(id = "com")
    public MobileElement registerfree;

    public void scrollToExactElement(String str) {
        ((AndroidDriver) appDriver).findElementByAndroidUIAutomator( "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + str + "\").instance(0))").click(); }


    public void click_Signup_btn(){

        registerfree.click();
        System.out.println("Registration page is going to open");

    }

}
