package io.beldex.bchat.tescases;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.awt.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import static java.awt.event.KeyEvent.VK_0;
import static java.awt.event.KeyEvent.VK_1;

public class ChangePasswordScreenCase {
    static String registerButton = "io.beldex.bchat:id/registerButton";
    static String TextInput_placeholder = "io.beldex.bchat:id/textinput_placeholder";
    static String NewPasswordEditTxt = "io.beldex.bchat:id/newPasswordEditTxt";
    static String ButtonNewEnter = "io.beldex.bchat:id/buttonNew_enter";

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

        MobileElement singleModeImageView = (MobileElement) driver.findElementById("io.beldex.bchat:id/singleModeImageView");
        singleModeImageView.click();
        Thread.sleep(3000);
        MobileElement MyAccountTextView = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
        MyAccountTextView.click();
        Thread.sleep(3000);

        //Check AppLock option on my account settings screen
        MobileElement appLockButton = (MobileElement) driver.findElementById("io.beldex.bchat:id/appLockButton");
        appLockButton.click();
        Thread.sleep(3000);
        MobileElement changePassword = (MobileElement) driver.findElementById("io.beldex.bchat:id/changePassword");
        changePassword.click();
        Thread.sleep(3000);

        //Check both old and new password text boxes are empty on change password screen
        /*MobileElement button_enter = (MobileElement) driver.findElementById("io.beldex.bchat:id/button_enter");
        button_enter.click();
        Thread.sleep(2000);
        MobileElement buttonNew_enter2 = (MobileElement) driver.findElementById(ButtonNewEnter);
        buttonNew_enter2.click();
        Thread.sleep(3000);*/


        //Check both old and new password text boxes are same on change password screen
        /*MobileElement textinput_placeholder2 = (MobileElement) driver.findElementById(TextInput_placeholder);
        textinput_placeholder2.click();
        Thread.sleep(3000);
        Robot robot3 = new Robot();
        robot3.keyPress(VK_0);
        robot3.keyRelease(VK_0);
        robot3.keyPress(VK_0);
        robot3.keyRelease(VK_0);
        robot3.keyPress(VK_0);
        robot3.keyRelease(VK_0);
        robot3.keyPress(VK_0);
        robot3.keyRelease(VK_0);
        Thread.sleep(3000);
        MobileElement newPasswordEditTxt = (MobileElement) driver.findElementById(NewPasswordEditTxt);
        newPasswordEditTxt.click();
        Thread.sleep(3000);
        Robot robot4 = new Robot();
        robot4.keyPress(VK_0);
        robot4.keyRelease(VK_0);
        robot4.keyPress(VK_0);
        robot4.keyRelease(VK_0);
        robot4.keyPress(VK_0);
        robot4.keyRelease(VK_0);
        robot4.keyPress(VK_0);
        robot4.keyRelease(VK_0);
        Thread.sleep(3000);
        MobileElement buttonNew_enter3 = (MobileElement) driver.findElementById(ButtonNewEnter);
        buttonNew_enter3.click();
        Thread.sleep(3000);*/

        //Check new password text box is only empty on change password screen
        /*MobileElement textinput_placeholder3 = (MobileElement) driver.findElementById(TextInput_placeholder);
        textinput_placeholder3.click();
        Thread.sleep(3000);
        Robot robot3 = new Robot();
        robot3.keyPress(VK_0);
        robot3.keyRelease(VK_0);
        robot3.keyPress(VK_0);
        robot3.keyRelease(VK_0);
        robot3.keyPress(VK_0);
        robot3.keyRelease(VK_0);
        robot3.keyPress(VK_0);
        robot3.keyRelease(VK_0);
        Thread.sleep(3000);
        MobileElement buttonNew_enter4 = (MobileElement) driver.findElementById(ButtonNewEnter);
        buttonNew_enter4.click();
        Thread.sleep(3000);*/

        //Check old password text box is only empty on change the password screen
       /* MobileElement newPasswordEditTxt2 = (MobileElement) driver.findElementById(NewPasswordEditTxt);
        newPasswordEditTxt2.click();
        Thread.sleep(3000);
        Robot robot4 = new Robot();
        robot4.keyPress(VK_0);
        robot4.keyRelease(VK_0);
        robot4.keyPress(VK_0);
        robot4.keyRelease(VK_0);
        robot4.keyPress(VK_0);
        robot4.keyRelease(VK_0);
        robot4.keyPress(VK_0);
        robot4.keyRelease(VK_0);
        Thread.sleep(3000);
        MobileElement buttonNew_enter5 = (MobileElement) driver.findElementById(ButtonNewEnter);
        buttonNew_enter5.click();
        Thread.sleep(3000);

        //Check old password text box is invalid and new password text box is valid on the change password screen
        MobileElement textinput_placeholder4 = (MobileElement) driver.findElementById(TextInput_placeholder);
        textinput_placeholder4.click();
        Thread.sleep(3000);
        Robot robot5 = new Robot();
        robot5.keyPress(VK_0);
        robot5.keyRelease(VK_0);
        robot5.keyPress(VK_0);
        robot5.keyRelease(VK_0);
        Thread.sleep(3000);
        MobileElement newPasswordEditTxt3 = (MobileElement) driver.findElementById(NewPasswordEditTxt);
        newPasswordEditTxt3.click();
        Thread.sleep(3000);
        Robot robot6 = new Robot();
        robot6.keyPress(VK_0);
        robot6.keyRelease(VK_0);
        robot6.keyPress(VK_0);
        robot6.keyRelease(VK_0);
        robot6.keyPress(VK_0);
        robot6.keyRelease(VK_0);
        robot6.keyPress(VK_0);
        robot6.keyRelease(VK_0);
        Thread.sleep(3000);
        MobileElement buttonNew_enter6 = (MobileElement) driver.findElementById(ButtonNewEnter);
        buttonNew_enter6.click();
        Thread.sleep(3000);

        //Check old password text box is valid and new password text box is invalid on the change password screen
        MobileElement textinput_placeholder5 = (MobileElement) driver.findElementById(TextInput_placeholder);
        textinput_placeholder5.click();
        Thread.sleep(3000);
        Robot robot7 = new Robot();
        robot7.keyPress(VK_0);
        robot7.keyRelease(VK_0);
        robot7.keyPress(VK_0);
        robot7.keyRelease(VK_0);
        robot7.keyPress(VK_0);
        robot7.keyRelease(VK_0);
        robot7.keyPress(VK_0);
        robot7.keyRelease(VK_0);
        Thread.sleep(3000);
        MobileElement newPasswordEditTxt4 = (MobileElement) driver.findElementById(NewPasswordEditTxt);
        newPasswordEditTxt4.click();
        Thread.sleep(3000);
        Robot robot8 = new Robot();
        robot8.keyPress(VK_0);
        robot8.keyRelease(VK_0);
        robot8.keyPress(VK_0);
        robot8.keyRelease(VK_0);
        Thread.sleep(3000);
        MobileElement buttonNew_enter7 = (MobileElement) driver.findElementById(ButtonNewEnter);
        buttonNew_enter7.click();
        Thread.sleep(3000);

        //Check old password text box is invalid and new password text box is invalid on the change password screen
        MobileElement textinput_placeholder6 = (MobileElement) driver.findElementById(TextInput_placeholder);
        textinput_placeholder6.click();
        Thread.sleep(3000);
        Robot robot9 = new Robot();
        robot9.keyPress(VK_0);
        robot9.keyRelease(VK_0);
        robot9.keyPress(VK_0);
        robot9.keyRelease(VK_0);
        Thread.sleep(3000);
        MobileElement newPasswordEditTxt5 = (MobileElement) driver.findElementById(NewPasswordEditTxt);
        newPasswordEditTxt5.click();
        Thread.sleep(3000);
        Robot robot10 = new Robot();
        robot10.keyPress(VK_0);
        robot10.keyRelease(VK_0);
        robot10.keyPress(VK_0);
        robot10.keyRelease(VK_0);
        Thread.sleep(3000);
        MobileElement buttonNew_enter8 = (MobileElement) driver.findElementById(ButtonNewEnter);
        buttonNew_enter8.click();
        Thread.sleep(3000);*/

        //Check both old and new password text boxes are valid on change password screen
        MobileElement textinput_placeholder7 = (MobileElement) driver.findElementById(TextInput_placeholder);
        textinput_placeholder7.click();
        Thread.sleep(3000);
        Robot robot11 = new Robot();
        robot11.keyPress(VK_0);
        robot11.keyRelease(VK_0);
        robot11.keyPress(VK_0);
        robot11.keyRelease(VK_0);
        robot11.keyPress(VK_0);
        robot11.keyRelease(VK_0);
        robot11.keyPress(VK_0);
        robot11.keyRelease(VK_0);
        Thread.sleep(3000);
        MobileElement newPasswordEditTxt6 = (MobileElement) driver.findElementById(NewPasswordEditTxt);
        newPasswordEditTxt6.click();
        Thread.sleep(3000);
        Robot robot12 = new Robot();
        robot12.keyPress(VK_1);
        robot12.keyRelease(VK_1);
        robot12.keyPress(VK_1);
        robot12.keyRelease(VK_1);
        robot12.keyPress(VK_1);
        robot12.keyRelease(VK_1);
        robot12.keyPress(VK_1);
        robot12.keyRelease(VK_1);
        Thread.sleep(3000);
        MobileElement buttonNew_enter8 = (MobileElement) driver.findElementById(ButtonNewEnter);
        buttonNew_enter8.click();
        Thread.sleep(3000);
    }
}
