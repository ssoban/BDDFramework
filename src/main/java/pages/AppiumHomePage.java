package pages;

import com.learning.base.Base_setup_Appium;
import com.learning.base.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;
import java.util.Set;

public class AppiumHomePage extends Driver {


    public AppiumHomePage(AppiumDriver<MobileElement> appDriver) {
        super(appDriver);
    }

    @AndroidFindBy(id = "title")
    public MobileElement title;

    @AndroidFindBy(xpath = "//*[@text='Hello Default Locale, Selendroid-test-app!']")
    public MobileElement welcomeText;

    @AndroidFindBy(xpath = "//*[@text='Localization (L10n) locator test']")
    public MobileElement subtitleText;

    @AndroidFindBy(id = "buttonTest")
    public MobileElement buttonTest;

    @AndroidFindBy(id = "buttonStartWebview")
    public MobileElement startWebview;
    @AndroidFindBy(id = "startUserRegistration")
    public MobileElement startUserRegistration;
    @AndroidFindBy(id = "my_text_field")
    public MobileElement my_text_field;
    @AndroidFindBy(id = "waitingButtonTest")
    public MobileElement waitingButtonTest;
    @AndroidFindBy(id = "input_adds_check_box")
    public MobileElement input_adds_check_box;

    @AndroidFindBy(id = "visibleButtonTest")
    public MobileElement visibleButtonTest;

    @AndroidFindBy(id = "showToastButton")
    public MobileElement showToastButton;
    @AndroidFindBy(id = "showPopupWindowButton")
    public MobileElement showPopupWindowButton;

    @AndroidFindBy(id = "exceptionTestButton")
    public MobileElement exceptionTestButton;
    @AndroidFindBy(id = "exceptionTestField")
    public MobileElement exceptionTestField;

    @AndroidFindBy(id = "topLevelElementTest")
    public MobileElement topLevelElementTest;



    //Enbutton
    @AndroidFindBy(id = "message")
    public MobileElement message;
    @AndroidFindBy(id = "button1")
    public MobileElement button1;
    @AndroidFindBy(id = "button2")
    public MobileElement button2;

   // I agree
   //  No, no
 //chrome
   @AndroidFindBy(xpath = "//*[@text='Hello, can you please tell me your name?']")
   public MobileElement chrometitletext;
    @AndroidFindBy(xpath = "//*[@text='Enter your name here!']")
    public MobileElement chromeNameField;
    @AndroidFindBy(xpath = "//*[@text='Volvo']")
    public MobileElement prefereedCar;
    @AndroidFindBy(id = "text2")
    public MobileElement text2;
    @AndroidFindBy(xpath = "//*[@text='Send me your name!']")
    public MobileElement Send_me_your_name;

    @AndroidFindBy(xpath = "//*[@text='here")
    public MobileElement hereLink;



    //file logo
    @AndroidFindBy(xpath = "//*[@text='Welcome to register a new User']")
    public MobileElement  register_a_new_User;

    @AndroidFindBy(id = "inputUsername")
    public MobileElement inputUsername;
    @AndroidFindBy(id = "inputEmail")
    public MobileElement inputEmail;

    @AndroidFindBy(id = "inputPassword")
    public MobileElement inputPassword;
    @AndroidFindBy(id = "inputName")
    public MobileElement inputName;
    @AndroidFindBy(id = "text1")
    public MobileElement text1;

    @AndroidFindBy(id = "input_adds")
    public MobileElement input_adds;
    @AndroidFindBy(id = "btnRegisterUser")
    public MobileElement btnRegisterUser;

    @AndroidFindBy(id = "label_username_data")
    public MobileElement label_username_data;
    @AndroidFindBy(id = "label_password_data")
    public MobileElement label_password_data;
    @AndroidFindBy(id = "label_email_data")
    public MobileElement label_email_data;
    @AndroidFindBy(id = "label_preferedProgrammingLanguage_data")
    public MobileElement label_preferedProgrammingLanguage_data;
    @AndroidFindBy(id = "label_acceptAdds_data")
    public MobileElement label_acceptAdds_data;
    @AndroidFindBy(id = "buttonRegisterUser")
    public MobileElement buttonRegisterUser;



     //progressbar
     @AndroidFindBy(id = "progress")
     public MobileElement progress;
    @AndroidFindBy(id = "progress_number")
    public MobileElement progress_number;


    //toast message
    @AndroidFindBy(xpath = "//android.widget.Toast[@text='Hello selendroid toast!']")
    public MobileElement widget_Toast;

    //windowdismiss

    @AndroidFindBy(xpath = "//*[@text='dismiss']")
    public MobileElement dismiss;

    public void verifyTitle(){
        Assert.assertTrue(title.isDisplayed(),"Title is wrong");
    }

    public void verifyElementsOnScreen(){

        Assert.assertTrue(welcomeText.isDisplayed(),"Welcome Text is wrong");
        Assert.assertTrue(subtitleText.isDisplayed(),"Sub text is wrong");
        Assert.assertTrue(buttonTest.isDisplayed(),"button text is wrong");
        Assert.assertTrue(startWebview.isDisplayed(),"element not displayed");
        Assert.assertTrue(startUserRegistration.isDisplayed(),"element not displayed");
        Assert.assertTrue(my_text_field.isDisplayed(),"element not displayed");
        Assert.assertTrue(waitingButtonTest.isDisplayed(),"element not displayed");
        Assert.assertTrue(input_adds_check_box.isDisplayed(),"Selement not displayed");
        Assert.assertTrue(visibleButtonTest.isDisplayed(),"element not displayed");
        Assert.assertTrue(showToastButton.isDisplayed(),"element not displayed");
        Assert.assertTrue(showPopupWindowButton.isDisplayed(),"element not displayed");
        Assert.assertTrue(exceptionTestButton.isDisplayed(),"element not displayed");
        Assert.assertTrue(exceptionTestField.isDisplayed(),"element not displayed");
        Assert.assertTrue(topLevelElementTest.isDisplayed(),"element not displayed");
    }

    public void clickOnEnButton(){
        buttonTest.click();
        Assert.assertTrue(message.getText().contains("This will end the activity"),"element not displayed");
        Assert.assertTrue(button1.getText().contains("I agree"),"element not displayed");
        Assert.assertTrue(button2.getText().contains("No, no"),"element not displayed");
        button2.click();
    }


    public void  ClickOnChrome(){
        startWebview.click();
    }

    public void verifyChromeScreen() {

        Set<String> contextName = appDriver.getContextHandles();
        System.out.println(contextName);
        for (String contexts : contextName) {
            System.out.println(contexts);

            if (contextName.contains("WEBVIEW")) {
                appDriver.context("WEBVIEW");

                Assert.assertTrue(chrometitletext.isDisplayed(),"Selectable option not dispalyed");
                chromeNameField.clear();
                chromeNameField.sendKeys("syed");

                Assert.assertTrue(prefereedCar.getText().contains("volvo"),"Selectable option not dispalyed");
                prefereedCar.click();
                text2.click();
                Send_me_your_name.click();

                hereLink.click();

            }
        }

    }

    public void clickOnFile(){
        startUserRegistration.click();
    }

    public void registerNewUSer(){

        Assert.assertTrue(register_a_new_User.getText().contains("Welcome to register a new User"),"Selectable option not dispalyed");
        inputUsername.sendKeys("ssoban");
        inputEmail.sendKeys("xyz@gmail.com");
        inputPassword.sendKeys("1234");
        Assert.assertTrue(inputName.getText().contains("Mr. Burns"),"Selectable option not dispalyed");
        Assert.assertTrue(text1.getText().contains("Ruby"),"Selectable option not dispalyed");
        input_adds.click();
        btnRegisterUser.click();


    }

    public void verifyNeRegisterDetails(){
        Assert.assertTrue(label_username_data.getText().contains("ssoban"),"Selectable option not dispalyed");
        Assert.assertTrue(label_password_data.getText().contains("xyz@gmail.com\""),"Selectable option not dispalyed");
        Assert.assertTrue(label_email_data.getText().contains("1234"),"Selectable option not dispalyed");
        Assert.assertTrue(label_preferedProgrammingLanguage_data.getText().contains("Ruby"),"Selectable option not dispalyed");
        Assert.assertTrue(label_acceptAdds_data.getText().contains("true"),"Selectable option not dispalyed");
        buttonRegisterUser.click();

    }

    public void clickOnProgressBar(){
        waitingButtonTest.click();
        Assert.assertTrue(progress.isDisplayed(),"Selectable option not dispalyed");
        Assert.assertTrue(progress_number.isDisplayed(),"Selectable option not dispalyed");


    }

    public void clickOnDisplayToast(){
        showToastButton.click();
        widget_Toast.isDisplayed();
    }

    public void clickOnPopupWindow(){
        showPopupWindowButton.click();
        dismiss.click();
    }
    public void pressToThrowUnhandledException(){
        exceptionTestButton.click();
    }

    public void typeToThrowUnhandledException(){
        topLevelElementTest.sendKeys("test");
    }



}
