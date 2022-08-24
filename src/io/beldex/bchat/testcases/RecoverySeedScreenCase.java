package io.beldex.bchat.testcases;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import static java.awt.event.KeyEvent.VK_0;

public class RecoverySeedScreenCase {
    static String registerButton = "io.beldex.bchat:id/registerButton";
    static String TextInputPlaceholder ="io.beldex.bchat:id/textinput_placeholder";
    static String ButtonNewEnter ="io.beldex.bchat:id/buttonNew_enter";
    static String SingleModeImageView ="io.beldex.bchat:id/singleModeImageView";
    static String drawer_appearance_toggle_button ="io.beldex.bchat:id/drawer_appearance_toggle_button";

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
        MobileElement textinput_placeholder = (MobileElement) driver.findElementById(TextInputPlaceholder);
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
        MobileElement buttonNew_enter = (MobileElement) driver.findElementById(ButtonNewEnter);
        buttonNew_enter.click();
        Thread.sleep(5000);
        MobileElement recoveryPhraseCopyIcon = (MobileElement) driver.findElementById("io.beldex.bchat:id/recoveryPhraseCopyIcon");
        recoveryPhraseCopyIcon.click();
        Thread.sleep(2000);
        MobileElement NextButton = (MobileElement) driver.findElementById(registerButton);
        NextButton.click();
        Thread.sleep(5000);

        MobileElement singleModeImageView = (MobileElement) driver.findElementById(SingleModeImageView);
        singleModeImageView.click();
        Thread.sleep(3000);

        //Check recovery seed page
        MobileElement RecoverySeedTextView = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.TextView");
        RecoverySeedTextView.click();
        Thread.sleep(3000);
        MobileElement seed_permission_important_confirmButton = (MobileElement) driver.findElementById("io.beldex.bchat:id/seed_permission_important_confirmButton");
        seed_permission_important_confirmButton.click();
        Thread.sleep(3000);

        //Check password text box is empty on password authentication screen
        MobileElement buttonNew_enter2 = (MobileElement) driver.findElementById(ButtonNewEnter);
        buttonNew_enter2.click();
        Thread.sleep(3000);

        //Check password text box is invalid on the password authentication screen
        MobileElement textinput_placeholder2 = (MobileElement) driver.findElementById(TextInputPlaceholder);
        textinput_placeholder2.click();
        Thread.sleep(3000);
        Robot robot3 = new Robot();
        robot3.keyPress(VK_0);
        robot3.keyRelease(VK_0);
        robot3.keyPress(VK_0);
        robot3.keyRelease(VK_0);
        Thread.sleep(3000);
        //Check Show/hide password icons on the password authentication screen
        MobileElement ShowPasswordImageButton  = (MobileElement) driver.findElementByAccessibilityId("Show password");
        ShowPasswordImageButton.click();
        Thread.sleep(3000);
        MobileElement HidePasswordImageButton = (MobileElement) driver.findElementByAccessibilityId("Show password");
        HidePasswordImageButton.click();
        Thread.sleep(3000);
        MobileElement buttonNew_enter3 = (MobileElement) driver.findElementById(ButtonNewEnter);
        buttonNew_enter3.click();
        Thread.sleep(3000);
        Robot robot4 = new Robot();
        robot4.keyPress(KeyEvent.VK_BACK_SPACE);
        robot4.keyRelease(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(1000);
        robot4.keyPress(KeyEvent.VK_BACK_SPACE);
        robot4.keyRelease(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(3000);

        //Check password text box is valid on password authentication screen
        MobileElement textinput_placeholder3 = (MobileElement) driver.findElementById(TextInputPlaceholder);
        textinput_placeholder3.click();
        Thread.sleep(3000);
        Robot robot5 = new Robot();
        robot5.keyPress(VK_0);
        robot5.keyRelease(VK_0);
        robot5.keyPress(VK_0);
        robot5.keyRelease(VK_0);
        robot5.keyPress(VK_0);
        robot5.keyRelease(VK_0);
        robot5.keyPress(VK_0);
        robot5.keyRelease(VK_0);
        Thread.sleep(3000);

        //Check copy seed option on the seed screen
        MobileElement showSeedCopyButton = (MobileElement) driver.findElementById("io.beldex.bchat:id/showSeedCopyButton");
        showSeedCopyButton.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);

        MobileElement singleModeImageView2 = (MobileElement) driver.findElementById(SingleModeImageView);
        singleModeImageView2.click();
        Thread.sleep(3000);

        //Check dark mode toggle button on the settings
        MobileElement DarkMode_drawer_appearance_toggle_button = (MobileElement) driver.findElementById(drawer_appearance_toggle_button);
        DarkMode_drawer_appearance_toggle_button.click();
        Thread.sleep(3000);

        //Check Light mode toggle button on the settings
        MobileElement LightMode_drawer_appearance_toggle_button = (MobileElement) driver.findElementById(drawer_appearance_toggle_button);
        LightMode_drawer_appearance_toggle_button.click();
    }
}
