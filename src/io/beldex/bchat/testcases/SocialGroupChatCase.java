package io.beldex.bchat.tescases;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.awt.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import static java.awt.event.KeyEvent.VK_0;

public class SocialGroupChatCase {
    static String registerButton = "io.beldex.bchat:id/registerButton";
    static String logoimageview = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView";
    static String messagesendimageview ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView";
    static String Moreoptions = "More options";
    static String Notificationssettings ="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[7]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView";

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

        //Create one to one contact
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
        driver.navigate().back();
        Thread.sleep(20000);

        //Create Bchat social group
        MobileElement Logo2 = (MobileElement) driver.findElementByXPath(logoimageview);
        Logo2.click();
        Thread.sleep(2000);
        MobileElement socialgroupimageview = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.ImageView");
        socialgroupimageview.click();
        Thread.sleep(40000);
        MobileElement BchatButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.GridLayout/android.widget.Button[1]");
        BchatButton.click();
        Thread.sleep(15000);

        //Check All media chat screen option for social group
        MobileElement Moreoption = (MobileElement) driver.findElementByAccessibilityId(Moreoptions);
        Moreoption.click();
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
        MobileElement Navigateupimagebutton = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
        Navigateupimagebutton.click();
        Thread.sleep(8000);

        //Check search chat screen option for social group
        MobileElement Moreoption2 = (MobileElement) driver.findElementByAccessibilityId(Moreoptions);
        Moreoption2.click();
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

        //Check add to home screen chat screen option for social group
        MobileElement Moreoption3 = (MobileElement) driver.findElementByAccessibilityId(Moreoptions);
        Moreoption3.click();
        Thread.sleep(3000);
        MobileElement Addtohomescreen = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
        Addtohomescreen.click();
        Thread.sleep(3000);
        MobileElement Addautomaticallybutton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]");
        Addautomaticallybutton.click();
        Thread.sleep(3000);

        //Check Add members chat screen option for social group
        MobileElement Moreoption4 = (MobileElement) driver.findElementByAccessibilityId(Moreoptions);
        Moreoption4.click();
        Thread.sleep(3000);
        MobileElement Addmemberstextview = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
        Addmemberstextview.click();
        Thread.sleep(5000);
        MobileElement actionIndicatorImageView = (MobileElement) driver.findElementById("io.beldex.bchat:id/actionIndicatorImageView");
        actionIndicatorImageView.click();
        Thread.sleep(3000);
        MobileElement doneButton = (MobileElement) driver.findElementByAccessibilityId("Done");
        doneButton.click();
        Thread.sleep(3000);
        MobileElement Navigateupimagebutton2 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
        Navigateupimagebutton2.click();
        Thread.sleep(3000);

        //Check mute and unmute chat screen option for social group
        MobileElement Moreoption5 = (MobileElement) driver.findElementByAccessibilityId(Moreoptions);
        Moreoption5.click();
        Thread.sleep(3000);
        MobileElement Mutenotifications = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
        Mutenotifications.click();
        Thread.sleep(5000);
        MobileElement Mutefor1hour = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
        Mutefor1hour.click();
        Thread.sleep(5000);
        MobileElement Moreoption6 = (MobileElement) driver.findElementByAccessibilityId(Moreoptions);
        Moreoption6.click();
        Thread.sleep(3000);
        MobileElement Unmute = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
        Unmute.click();
        Thread.sleep(3000);

        //Check Notification settings chat screen option for social group
        MobileElement Moreoption7 = (MobileElement) driver.findElementByAccessibilityId(Moreoptions);
        Moreoption7.click();
        Thread.sleep(3000);
        MobileElement Notificationsettingstextview = (MobileElement) driver.findElementByXPath(Notificationssettings);
        Notificationsettingstextview.click();
        Thread.sleep(3000);
        MobileElement MentionsCheckedTextView = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
        MentionsCheckedTextView.click();
        Thread.sleep(3000);
        MobileElement Moreoption8 = (MobileElement) driver.findElementByAccessibilityId(Moreoptions);
        Moreoption8.click();
        Thread.sleep(3000);
        MobileElement Notificationsettingstextview2 = (MobileElement) driver.findElementByXPath(Notificationssettings);
        Notificationsettingstextview2.click();
        Thread.sleep(3000);
        MobileElement AllCheckedTextView = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]");
        AllCheckedTextView.click();
    }
}
