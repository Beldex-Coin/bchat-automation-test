package io.beldex.bchat.tescases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.awt.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static java.awt.event.KeyEvent.VK_0;

public class OneToOneChatCase {
    static String registerButton = "io.beldex.bchat:id/registerButton";
    static String logoimageview ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView";
    static String messagesendimageview ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView";
    static String Moreoptions = "More options";

    //Appium Session settings to Connect with Android emulator
    public static void main(String[] args) throws MalformedURLException, InterruptedException, AWTException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        File Directory = new File("location");
        File Apk = new File(Directory, "Bchat-1.1.1-armeabi-v7a.apk");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.APP, Apk.getAbsolutePath());
        capabilities.setCapability("appWaitActivity", "*");
        capabilities.setCapability("noReset", "True");
        AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(10000);

        //Create Account Flow
        MobileElement CreateAccountButton = (MobileElement) driver.findElementById(registerButton);
        CreateAccountButton.click();
        Thread.sleep(10000);
        MobileElement DisplayNameTextBox = (MobileElement) driver.findElementById("io.beldex.bchat:id/displayNameEditText");
        DisplayNameTextBox.sendKeys("sat");
        Thread.sleep(3000);
        MobileElement ContinueButton = (MobileElement) driver.findElementById(registerButton);
        ContinueButton.click();
        Thread.sleep(15000);
        MobileElement Next = (MobileElement) driver.findElementById(registerButton);
        Next.click();
        Thread.sleep(20000);
        MobileElement EnterPassword = (MobileElement) driver.findElementById("io.beldex.bchat:id/textinput_placeholder");
        EnterPassword.click();
        Thread.sleep(3000);
        Robot robot = new Robot();
        robot.keyPress(VK_0);
        robot.keyRelease(VK_0);
        robot.keyPress(VK_0);
        robot.keyRelease(VK_0);
        robot.keyPress(VK_0);
        robot.keyRelease(VK_0);
        robot.keyPress(VK_0);
        robot.keyRelease(VK_0);
        Thread.sleep(3000);
        MobileElement ReEnterPassword = (MobileElement) driver.findElementById("io.beldex.bchat:id/reEnterPinEditTxt");
        ReEnterPassword.click();
        Thread.sleep(3000);
        Robot robot2 = new Robot();
        robot2.keyPress(VK_0);
        robot2.keyRelease(VK_0);
        robot2.keyRelease(VK_0);
        robot2.keyPress(VK_0);
        robot2.keyRelease(VK_0);
        robot2.keyPress(VK_0);
        robot2.keyRelease(VK_0);
        robot2.keyRelease(VK_0);
        robot2.keyPress(VK_0);
        robot2.keyRelease(VK_0);
        Thread.sleep(3000);
        MobileElement buttonNewenter = (MobileElement) driver.findElementById("io.beldex.bchat:id/buttonNew_enter");
        buttonNewenter.click();
        Thread.sleep(5000);
        MobileElement recoveryPhraseCopyIcon = (MobileElement) driver.findElementById("io.beldex.bchat:id/recoveryPhraseCopyIcon");
        recoveryPhraseCopyIcon.click();
        Thread.sleep(2000);
        MobileElement Nextbutton = (MobileElement) driver.findElementById(registerButton);
        Nextbutton.click();
        Thread.sleep(4000);

        //one to one contact chat page
        MobileElement Logo = (MobileElement) driver.findElementByXPath(logoimageview);
        Logo.click();
        Thread.sleep(2000);
        MobileElement NewChat = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ImageView");
        NewChat.click();
        Thread.sleep(2000);
        MobileElement publicKeytext = (MobileElement) driver.findElementById("io.beldex.bchat:id/publicKeyEditText");
        publicKeytext.sendKeys("bd047e3d1e66a52144d3e9fc8daa7af24566baa17a7c4f7ea9c3a82959c7c56200");
        Thread.sleep(2000);
        MobileElement createPrivatebutton = (MobileElement) driver.findElementById("io.beldex.bchat:id/createPrivateChatButton");
        createPrivatebutton.click();
        Thread.sleep(2000);
        MobileElement inputBarEditText = (MobileElement) driver.findElementById("io.beldex.bchat:id/inputBarEditText");
        inputBarEditText.sendKeys("Hello");
        Thread.sleep(2000);
        MobileElement Sendimageview = (MobileElement) driver.findElementByXPath(messagesendimageview);
        Sendimageview.click();
        Thread.sleep(40000);

        //Check whether Audio message sent or not
        MobileElement Audiomicicon = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView");
        AndroidTouchAction touch = new AndroidTouchAction(driver);
        LongPressOptions Longpress = new LongPressOptions();
        Longpress.withDuration(Duration.ofSeconds(5)).withElement(ElementOption.element(Audiomicicon));
        touch.longPress(Longpress).release().perform();
        Thread.sleep(4000);
        MobileElement Continuebutton = (MobileElement) driver.findElementById("android:id/button1");
        Continuebutton.click();
        Thread.sleep(3000);
        MobileElement permissionallowbutton = (MobileElement) driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
        permissionallowbutton.click();
        Thread.sleep(3000);
        MobileElement Audiomicicon2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView");
        AndroidTouchAction touch2 = new AndroidTouchAction(driver);
        LongPressOptions Longpress2 = new LongPressOptions();
        Longpress2.withDuration(Duration.ofSeconds(5)).withElement(ElementOption.element(Audiomicicon2));
        touch2.longPress(Longpress2).release().perform();
        Thread.sleep(4000);

        //block and unblock contact on chat screen
        MobileElement Moreoption = (MobileElement) driver.findElementByAccessibilityId(Moreoptions);
        Moreoption.click();
        Thread.sleep(3000);
        MobileElement block = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
        block.click();
        Thread.sleep(3000);
        MobileElement blockbutton = (MobileElement) driver.findElementById("android:id/button1");
        blockbutton.click();
        Thread.sleep(3000);
        MobileElement unblockButton = (MobileElement) driver.findElementById("io.beldex.bchat:id/unblockButton");
        unblockButton.click();
        Thread.sleep(3000);
        MobileElement inputBarEditText2 = (MobileElement) driver.findElementById("io.beldex.bchat:id/inputBarEditText");
        inputBarEditText2.sendKeys("Hello");
        Thread.sleep(2000);
        MobileElement Sendimageview2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView");
        Sendimageview2.click();
        Thread.sleep(3000);

        //check attachments on chat screen
        MobileElement attachimageview = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView");
        attachimageview.click();
        Thread.sleep(2000);

        //check whether send image or not
        MobileElement cameraimageview = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout");
        cameraimageview.click();
        Thread.sleep(2000);
        MobileElement Continuebutton2 = (MobileElement) driver.findElementById("android:id/button1");
        Continuebutton2.click();
        Thread.sleep(2000);
        MobileElement permissionallowbutton2 = (MobileElement) driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
        permissionallowbutton2.click();
        Thread.sleep(2000);
        MobileElement cameracapturebutton = (MobileElement) driver.findElementById("io.beldex.bchat:id/camera_capture_button");
        cameracapturebutton.click();
        Thread.sleep(3000);
        MobileElement mediasendsendbutton = (MobileElement) driver.findElementByAccessibilityId("Send");
        mediasendsendbutton.click();
        Thread.sleep(3000);

        //All media chat screen options for one to one contact
        MobileElement Moreoption2 = (MobileElement) driver.findElementByAccessibilityId(Moreoptions);
        Moreoption2.click();
        Thread.sleep(3000);
        MobileElement Allmedia = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
        Allmedia.click();
        Thread.sleep(3000);
        MobileElement Documents = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"Documents\"]/android.widget.TextView");
        Documents.click();
        Thread.sleep(3000);
        MobileElement Media = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"Media\"]/android.widget.TextView");
        Media.click();
        Thread.sleep(3000);
        MobileElement Navigateup = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
        Navigateup.click();
        Thread.sleep(5000);

        //Search chat screen options for one to one contact
        MobileElement Moreoption3 = (MobileElement) driver.findElementByAccessibilityId(Moreoptions);
        Moreoption3.click();
        Thread.sleep(5000);
        MobileElement Search = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
        Search.click();
        Thread.sleep(3000);
        MobileElement searchtext = (MobileElement) driver.findElementById("io.beldex.bchat:id/search_src_text");
        searchtext.sendKeys("He");
        Thread.sleep(5000);
        MobileElement Collapse = (MobileElement) driver.findElementByAccessibilityId("Collapse");
        Collapse.click();
        Thread.sleep(3000);

        //Add to home screen chat screen options for one to one contact
        MobileElement Moreoption4 = (MobileElement) driver.findElementByAccessibilityId(Moreoptions);
        Moreoption4.click();
        Thread.sleep(3000);
        MobileElement Addtohomescreen = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
        Addtohomescreen.click();
        Thread.sleep(3000);
        MobileElement Addautomaticallybutton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]");
        Addautomaticallybutton.click();
        Thread.sleep(3000);

        //Disappearing messages chat screen options for one to one contact
        /*MobileElement Moreoption5 = (MobileElement) driver.findElementByAccessibilityId(Moreoptions);
        Moreoption5.click();
        Thread.sleep(3000);
        MobileElement Disappearingmessages = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
        Disappearingmessages.click();
        Thread.sleep(5000);
        MobileElement expirationnumberpicker = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"Disappearing messages\"))"));
        expirationnumberpicker.click();
        Thread.sleep(5000);
        MobileElement Okbutton = (MobileElement) driver.findElementById("android:id/button1");
        Okbutton.click();*/

        //Mute and Unmute chat screen options for one to one contact
        MobileElement Moreoption6 = (MobileElement) driver.findElementByAccessibilityId(Moreoptions);
        Moreoption6.click();
        Thread.sleep(3000);
        MobileElement Mutenotifications = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
        Mutenotifications.click();
        Thread.sleep(3000);
        MobileElement Mutefor1hour = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
        Mutefor1hour.click();
        Thread.sleep(3000);
        MobileElement Moreoption7 = (MobileElement) driver.findElementByAccessibilityId(Moreoptions);
        Moreoption7.click();
        Thread.sleep(3000);
        MobileElement Unmute = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
        Unmute.click();
    }
}
