package io.beldex.bchat.tescases;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.awt.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import static java.awt.event.KeyEvent.*;
import static java.awt.event.KeyEvent.VK_T;

public class SettingsOptionsCase {
    static String registerButton = "io.beldex.bchat:id/registerButton";
    static String SingleModeImageView = "io.beldex.bchat:id/singleModeImageView";
    static String Permission_Allow_foreground_only_button = "com.android.permissioncontroller:id/permission_allow_foreground_only_button";
    static String BChatMessengerOption = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.TabHost/android.widget.LinearLayout/android.widget.FrameLayout/com.android.internal.widget.ViewPager/android.widget.RelativeLayout/com.android.internal.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView";
    static String NameTextView ="io.beldex.bchat:id/nameTextView";
    static String sendImageView ="Send";
    static String NavigateButton ="Navigate up";

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
        MobileElement textinput_placeholder = (MobileElement) driver.findElementById("io.beldex.bchat:id/textinput_placeholder");
        textinput_placeholder.click();
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
        MobileElement reEnterPinEditTxt = (MobileElement) driver.findElementById("io.beldex.bchat:id/reEnterPinEditTxt");
        reEnterPinEditTxt.click();
        Thread.sleep(3000);
        Robot robot2 = new Robot();
        robot2.keyPress(VK_0);
        robot2.keyRelease(VK_0);
        robot2.keyPress(VK_0);
        robot2.keyRelease(VK_0);
        robot2.keyPress(VK_0);
        robot2.keyRelease(VK_0);
        robot2.keyPress(VK_0);
        robot2.keyRelease(VK_0);
        robot2.keyPress(VK_0);
        robot2.keyRelease(VK_0);
        Thread.sleep(3000);
        MobileElement buttonNew_enter = (MobileElement) driver.findElementById("io.beldex.bchat:id/buttonNew_enter");
        buttonNew_enter.click();
        Thread.sleep(5000);
        MobileElement recoveryPhraseCopyIcon = (MobileElement) driver.findElementById("io.beldex.bchat:id/recoveryPhraseCopyIcon");
        recoveryPhraseCopyIcon.click();
        Thread.sleep(2000);
        MobileElement NextButton = (MobileElement) driver.findElementById(registerButton);
        NextButton.click();
        Thread.sleep(4000);

        //one to one contact creation
        MobileElement Logo = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView");
        Logo.click();
        Thread.sleep(2000);
        MobileElement NewChat = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ImageView");
        NewChat.click();
        Thread.sleep(2000);
        MobileElement publicKeyText = (MobileElement) driver.findElementById("io.beldex.bchat:id/publicKeyEditText");
        publicKeyText.sendKeys("bd047e3d1e66a52144d3e9fc8daa7af24566baa17a7c4f7ea9c3a82959c7c56200");
        Thread.sleep(2000);
        MobileElement createPrivateButton = (MobileElement) driver.findElementById("io.beldex.bchat:id/createPrivateChatButton");
        createPrivateButton.click();
        Thread.sleep(2000);
        MobileElement inputBarEditText = (MobileElement) driver.findElementById( "io.beldex.bchat:id/inputBarEditText");
        inputBarEditText.sendKeys("Hello");
        Thread.sleep(2000);
        MobileElement SendImageView = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView");
        SendImageView.click();
        Thread.sleep(40000);
        driver.navigate().back();
        Thread.sleep(20000);

        //check scan QR code option inside settings
        MobileElement singleModeImageView = (MobileElement) driver.findElementById(SingleModeImageView);
        singleModeImageView.click();
        Thread.sleep(3000);
        MobileElement drawer_qrcode_img = (MobileElement) driver.findElementById("io.beldex.bchat:id/drawer_qrcode_img");
        drawer_qrcode_img.click();
        Thread.sleep(3000);
        MobileElement shareButton = (MobileElement) driver.findElementById("io.beldex.bchat:id/shareButton");
        shareButton.click();
        Thread.sleep(4000);
        MobileElement BChatMessenger = (MobileElement) driver.findElementByXPath(BChatMessengerOption);
        BChatMessenger.click();
        Thread.sleep(3000);
        MobileElement nameTextView = (MobileElement) driver.findElementById(NameTextView);
        nameTextView.click();
        Thread.sleep(3000);
        /*MobileElement ok = (MobileElement) driver.findElementById("android:id/ok");
        ok.click();
        Thread.sleep(3000);*/
        MobileElement SendImageView2 = (MobileElement) driver.findElementByAccessibilityId(sendImageView);
        SendImageView2.click();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(3000);
        MobileElement singleModeImageView2 = (MobileElement) driver.findElementById(SingleModeImageView);
        singleModeImageView2.click();
        Thread.sleep(3000);
        MobileElement drawer_qrcode_img2 = (MobileElement) driver.findElementById("io.beldex.bchat:id/drawer_qrcode_img");
        drawer_qrcode_img2.click();
        Thread.sleep(3000);
        MobileElement scanButton = (MobileElement) driver.findElementById("io.beldex.bchat:id/scanButton");
        scanButton.click();
        Thread.sleep(3000);
        MobileElement grantCameraAccessButton = (MobileElement) driver.findElementById("io.beldex.bchat:id/grantCameraAccessButton");
        grantCameraAccessButton.click();
        Thread.sleep(3000);
        MobileElement permission_allow_foreground_only_button = (MobileElement) driver.findElementById(Permission_Allow_foreground_only_button);
        permission_allow_foreground_only_button.click();
        Thread.sleep(3000);
        MobileElement NavigateUpButton = (MobileElement) driver.findElementByAccessibilityId(NavigateButton);
        NavigateUpButton.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);

        //Check whether profile photo is uploaded or not in my account settings option
        MobileElement singleModeImageView3 = (MobileElement) driver.findElementById(SingleModeImageView);
        singleModeImageView3.click();
        Thread.sleep(3000);
        MobileElement MyAccountTextView = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
        MyAccountTextView.click();
        Thread.sleep(3000);
        MobileElement largeSingleModeImageView = (MobileElement) driver.findElementById("io.beldex.bchat:id/largeSingleModeImageView");
        largeSingleModeImageView.click();
        Thread.sleep(3000);
        MobileElement permission_allow_foreground_only_button2 = (MobileElement) driver.findElementById(Permission_Allow_foreground_only_button);
        permission_allow_foreground_only_button2.click();
        Thread.sleep(3000);
        MobileElement CameraImageView = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.TabHost/android.widget.LinearLayout/android.widget.FrameLayout/com.android.internal.widget.ViewPager/android.widget.RelativeLayout/com.android.internal.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView");
        CameraImageView.click();
        Thread.sleep(3000);
        MobileElement shutter_button = (MobileElement) driver.findElementByAccessibilityId("Shutter");
        shutter_button.click();
        Thread.sleep(3000);
        MobileElement done_button = (MobileElement) driver.findElementByAccessibilityId("Done");
        done_button.click();
        Thread.sleep(3000);
        MobileElement crop_image_menu_crop = (MobileElement) driver.findElementById("io.beldex.bchat:id/crop_image_menu_crop");
        crop_image_menu_crop.click();
        Thread.sleep(3000);

        //Check whether public address copied or not on the my account settings screen
        MobileElement publicKeyTextView = (MobileElement) driver.findElementById("io.beldex.bchat:id/publicKeyTextView");
        publicKeyTextView.click();
        Thread.sleep(3000);

        //Check whether beldex address copied or not on the my account settings screen
        MobileElement beldexAddressTextView = (MobileElement) driver.findElementById("io.beldex.bchat:id/beldexAddressTextView");
        beldexAddressTextView.click();
        Thread.sleep(3000);

        //Check profile name edited or not on the my account settings screen
        MobileElement displayNameTitleTextView = (MobileElement) driver.findElementById("io.beldex.bchat:id/displayNameTitleTextView");
        displayNameTitleTextView.click();
        Thread.sleep(3000);
        Robot robot3 = new Robot();
        robot3.keyPress(VK_T);
        robot3.keyRelease(VK_T);
        robot3.keyPress(VK_E);
        robot3.keyRelease(VK_E);
        robot3.keyPress(VK_S);
        robot3.keyRelease(VK_S);
        robot3.keyPress(VK_T);
        robot3.keyRelease(VK_T);
        Thread.sleep(3000);
        MobileElement applyButton = (MobileElement) driver.findElementByAccessibilityId("Apply");
        applyButton.click();
        Thread.sleep(3000);

        //Check QR share option on my account settings
        MobileElement qrCodeButton = (MobileElement) driver.findElementById("io.beldex.bchat:id/qrCodeButton");
        qrCodeButton.click();
        Thread.sleep(3000);
        MobileElement qrCodeShareButton = (MobileElement) driver.findElementById("io.beldex.bchat:id/qrCodeShareButton");
        qrCodeShareButton.click();
        Thread.sleep(3000);
        MobileElement BChatMessenger2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.TabHost/android.widget.LinearLayout/android.widget.FrameLayout/com.android.internal.widget.ViewPager/android.widget.RelativeLayout/com.android.internal.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView");
        BChatMessenger2.click();
        Thread.sleep(3000);
        MobileElement nameTextView2 = (MobileElement) driver.findElementById(NameTextView);
        nameTextView2.click();
        Thread.sleep(3000);
        MobileElement SendImageView3 = (MobileElement) driver.findElementByAccessibilityId(sendImageView);
        SendImageView3.click();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);
        MobileElement profileButton = (MobileElement) driver.findElementById("io.beldex.bchat:id/profileButton");
        profileButton.click();
        Thread.sleep(3000);

        //Check hops option on my account settings
        MobileElement HopsTextView = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView");
        HopsTextView.click();
        Thread.sleep(3000);
        MobileElement NavigateUpButton2 = (MobileElement) driver.findElementByAccessibilityId(NavigateButton);
        NavigateUpButton2.click();
    }
}
