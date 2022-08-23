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

public class SocialGroupHomeScreenBottomOptions {
    static String registerButton = "io.beldex.bchat:id/registerButton";
    static String logoimageview = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView";
    static String messagesendimageview ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView";
    static String conversationViewDisplayNameTextView = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout";

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

        //Create Bchat social group
        MobileElement Logo = (MobileElement) driver.findElementByXPath(logoimageview);
        Logo.click();
        Thread.sleep(2000);
        MobileElement socialgroupimageview = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.ImageView");
        socialgroupimageview.click();
        Thread.sleep(40000);
        MobileElement BchatButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.GridLayout/android.widget.Button[1]");
        BchatButton.click();
        Thread.sleep(15000);
        driver.navigate().back();
        Thread.sleep(3000);

        //Check pin and unpin home screen bottom option for secret group
        MobileElement bchatconversationView = (MobileElement) driver.findElementByXPath(conversationViewDisplayNameTextView);
        AndroidTouchAction touch = new AndroidTouchAction(driver);
        LongPressOptions Longpress = new LongPressOptions();
        Longpress.withDuration(Duration.ofSeconds(1)).withElement(ElementOption.element(bchatconversationView));
        touch.longPress(Longpress).release().perform();
        Thread.sleep(4000);
        MobileElement pinTextView = (MobileElement) driver.findElementById("io.beldex.bchat:id/pinTextView");
        pinTextView.click();
        Thread.sleep(3000);
        MobileElement bchatconversationView2 = (MobileElement) driver.findElementByXPath(conversationViewDisplayNameTextView);
        AndroidTouchAction touch2 = new AndroidTouchAction(driver);
        LongPressOptions Longpress2 = new LongPressOptions();
        Longpress2.withDuration(Duration.ofSeconds(1)).withElement(ElementOption.element(bchatconversationView2));
        touch2.longPress(Longpress2).release().perform();
        Thread.sleep(4000);
        MobileElement unpinTextView = (MobileElement) driver.findElementById("io.beldex.bchat:id/unpinTextView");
        unpinTextView.click();
        Thread.sleep(3000);

        //Check mute and unmute notifications home screen bottom option for social group
        MobileElement bchatconversationView3 = (MobileElement) driver.findElementByXPath(conversationViewDisplayNameTextView);
        AndroidTouchAction touch3 = new AndroidTouchAction(driver);
        LongPressOptions Longpress3 = new LongPressOptions();
        Longpress3.withDuration(Duration.ofSeconds(1)).withElement(ElementOption.element(bchatconversationView3));
        touch3.longPress(Longpress3).release().perform();
        Thread.sleep(4000);
        MobileElement muteNotificationsTextView = (MobileElement) driver.findElementById("io.beldex.bchat:id/muteNotificationsTextView");
        muteNotificationsTextView.click();
        Thread.sleep(3000);
        MobileElement Mutefor1hour = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
        Mutefor1hour.click();
        Thread.sleep(3000);
        MobileElement bchatconversationView4 = (MobileElement) driver.findElementByXPath(conversationViewDisplayNameTextView);
        bchatconversationView4.click();
        Thread.sleep(4000);
        MobileElement Navigateupimagebutton = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
        Navigateupimagebutton.click();
        Thread.sleep(3000);
        MobileElement bchatconversationView5 = (MobileElement) driver.findElementByXPath(conversationViewDisplayNameTextView);
        AndroidTouchAction touch4 = new AndroidTouchAction(driver);
        LongPressOptions Longpress4 = new LongPressOptions();
        Longpress4.withDuration(Duration.ofSeconds(1)).withElement(ElementOption.element(bchatconversationView5));
        touch4.longPress(Longpress4).release().perform();
        Thread.sleep(4000);
        MobileElement unMuteNotificationsTextView = (MobileElement) driver.findElementById("io.beldex.bchat:id/unMuteNotificationsTextView");
        unMuteNotificationsTextView.click();
        Thread.sleep(3000);
        MobileElement bchatconversationView6 = (MobileElement) driver.findElementByXPath(conversationViewDisplayNameTextView);
        bchatconversationView6.click();
        Thread.sleep(3000);
        MobileElement Navigateupimagebutton2 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
        Navigateupimagebutton2.click();
        Thread.sleep(3000);

        //Check Notifications settings home screen bottom option for social group
        MobileElement bchatconversationView7 = (MobileElement) driver.findElementByXPath(conversationViewDisplayNameTextView);
        AndroidTouchAction touch5 = new AndroidTouchAction(driver);
        LongPressOptions Longpress5 = new LongPressOptions();
        Longpress5.withDuration(Duration.ofSeconds(1)).withElement(ElementOption.element(bchatconversationView7));
        touch5.longPress(Longpress5).release().perform();
        Thread.sleep(4000);
        MobileElement notificationsTextView = (MobileElement) driver.findElementById("io.beldex.bchat:id/notificationsTextView");
        notificationsTextView.click();
        Thread.sleep(3000);
        MobileElement MentionsCheckedTextView = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
        MentionsCheckedTextView.click();
        Thread.sleep(3000);
        MobileElement bchatconversationView8 = (MobileElement) driver.findElementByXPath(conversationViewDisplayNameTextView);
        AndroidTouchAction touch6 = new AndroidTouchAction(driver);
        LongPressOptions Longpress6 = new LongPressOptions();
        Longpress6.withDuration(Duration.ofSeconds(1)).withElement(ElementOption.element(bchatconversationView8));
        touch6.longPress(Longpress6).release().perform();
        Thread.sleep(4000);
        MobileElement notificationsTextView2 = (MobileElement) driver.findElementById("io.beldex.bchat:id/notificationsTextView");
        notificationsTextView2.click();
        Thread.sleep(3000);
        MobileElement AllCheckedTextView = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]");
        AllCheckedTextView.click();
        Thread.sleep(3000);

        //Check MarkAll as read home screen bottom option for social group
        MobileElement bchatconversationView9 = (MobileElement) driver.findElementByXPath(conversationViewDisplayNameTextView);
        AndroidTouchAction touch7 = new AndroidTouchAction(driver);
        LongPressOptions Longpress7 = new LongPressOptions();
        Longpress7.withDuration(Duration.ofSeconds(1)).withElement(ElementOption.element(bchatconversationView9));
        touch7.longPress(Longpress7).release().perform();
        Thread.sleep(4000);
        MobileElement markAllAsReadTextView = (MobileElement) driver.findElementById("io.beldex.bchat:id/markAllAsReadTextView");
        markAllAsReadTextView.click();
        Thread.sleep(3000);

        //Check delete home screen bottom option for social group
        MobileElement bchatconversationView10 = (MobileElement) driver.findElementByXPath(conversationViewDisplayNameTextView);
        AndroidTouchAction touch8 = new AndroidTouchAction(driver);
        LongPressOptions Longpress8 = new LongPressOptions();
        Longpress8.withDuration(Duration.ofSeconds(1)).withElement(ElementOption.element(bchatconversationView10));
        touch8.longPress(Longpress8).release().perform();
        Thread.sleep(4000);
        MobileElement deleteTextView = (MobileElement) driver.findElementById("io.beldex.bchat:id/deleteTextView");
        deleteTextView.click();
        Thread.sleep(3000);
        MobileElement Yesbutton = (MobileElement) driver.findElementById("android:id/button1");
        Yesbutton.click();
    }
}
