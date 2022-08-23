package io.beldex.bchat.tescases;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import static java.awt.event.KeyEvent.VK_0;

public class SignInCase {
    static String restoreButton = "io.beldex.bchat:id/restoreButton";
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

        //Check Terms and conditions options on the splash screen
        MobileElement TermsandCondtionsTxt = (MobileElement) driver.findElementById("io.beldex.bchat:id/TermsandCondtionsTxt");
        TermsandCondtionsTxt.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(2000);

        //SignIn Flow
        MobileElement SignInButton = (MobileElement) driver.findElementById(restoreButton);
        SignInButton.click();
        Thread.sleep(2000);

        //Seed text box is empty on restore from seed screen
        MobileElement NextButton = (MobileElement) driver.findElementById(restoreButton);
        NextButton.click();
        Thread.sleep(2000);

        //seed text box is invalid on restore from seed screen
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        //Set the String to Enter
        StringSelection stringSelection = new StringSelection("assorted legion roles chlorine slower oozed towel spout afloat vitals tribal idiom fight soil cool zebra festival nomad dullness unhappy pencil orphans syllabus tipsy");
        //Copy the String to Clipboard
        clipboard.setContents(stringSelection, null);
        Thread.sleep(2000);
        MobileElement recoveryPhrasePasteIcon = (MobileElement) driver.findElementById("io.beldex.bchat:id/recoveryPhrasePasteIcon");
        recoveryPhrasePasteIcon.click();
        Thread.sleep(2000);
        MobileElement mnemonicEditText = (MobileElement) driver.findElementById("io.beldex.bchat:id/mnemonicEditText");
        mnemonicEditText.click();
        Thread.sleep(2000);
        MobileElement NextButton2 = (MobileElement) driver.findElementById(restoreButton);
        NextButton2.click();
        Thread.sleep(2000);
        MobileElement clearButton = (MobileElement) driver.findElementById("io.beldex.bchat:id/clearButton");
        clearButton.click();
        Thread.sleep(2000);

        //Seed text box is valid on restore from seed screen
        Clipboard clipboard2 = Toolkit.getDefaultToolkit().getSystemClipboard();
        //Set the String to Enter
        StringSelection stringSelection2 = new StringSelection("assorted legion roles chlorine slower oozed towel spout afloat vitals tribal idiom fight soil cool zebra festival nomad dullness unhappy pencil orphans syllabus tipsy orphans");
        //Copy the String to Clipboard
        clipboard2.setContents(stringSelection2, null);
        Thread.sleep(2000);
        MobileElement recoveryPhrasePasteIcon2 = (MobileElement) driver.findElementById("io.beldex.bchat:id/recoveryPhrasePasteIcon");
        recoveryPhrasePasteIcon2.click();
        Thread.sleep(2000);
        MobileElement NextButton3 = (MobileElement) driver.findElementById(restoreButton);
        NextButton3.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Display name text box is empty on restore from seed screen
        MobileElement restoreSeedRestoreButton = (MobileElement) driver.findElementById("io.beldex.bchat:id/restoreSeedRestoreButton");
        restoreSeedRestoreButton.click();
        Thread.sleep(2000);

        //Display name text box having lengthy display name on restore from seed screen
        MobileElement restoreSeedWalletName = (MobileElement) driver.findElementById("io.beldex.bchat:id/restoreSeedWalletName");
        restoreSeedWalletName.sendKeys("assorted legion roles chlorine slower oozed towel spout afloat vitals tribal idiom fight soil cool zebra festival");
        Thread.sleep(2000);
        MobileElement restoreSeedRestoreButton2 = (MobileElement) driver.findElementById("io.beldex.bchat:id/restoreSeedRestoreButton");
        restoreSeedRestoreButton2.click();
        Thread.sleep(2000);
        restoreSeedWalletName.clear();
        Thread.sleep(2000);

        //Display name text box having valid name on restore from seed screen
        MobileElement restoreSeedWalletName2 = (MobileElement) driver.findElementById("io.beldex.bchat:id/restoreSeedWalletName");
        restoreSeedWalletName2.sendKeys("sat");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement restoreSeedRestoreButton3 = (MobileElement) driver.findElementById("io.beldex.bchat:id/restoreSeedRestoreButton");
        restoreSeedRestoreButton3.click();
        Thread.sleep(8000);
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
        MobileElement buttonNew_enter = (MobileElement) driver.findElementById("io.beldex.bchat:id/buttonNew_enter");
        buttonNew_enter.click();
    }
}
