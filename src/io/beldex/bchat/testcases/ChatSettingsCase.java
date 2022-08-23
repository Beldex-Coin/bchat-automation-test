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
import static java.awt.event.KeyEvent.*;

public class ChatSettingsCase {
    static String registerButton = "io.beldex.bchat:id/registerButton";
    static String InputBarEditText = "io.beldex.bchat:id/inputBarEditText";
    static String SingleModeImageView = "io.beldex.bchat:id/singleModeImageView";
    static String MyAccountTextView ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView";
    static String ConversationViewDisplayNameTextView ="io.beldex.bchat:id/conversationViewDisplayNameTextView";
    static String EnterKeySendCheckBox ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Switch";
    static String ChatsButton ="io.beldex.bchat:id/chatsButton";

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
       /* MobileElement Logo = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView");
        Logo.click();
        Thread.sleep(2000);
        MobileElement NewChat = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ImageView");
        NewChat.click();
        Thread.sleep(2000);
        MobileElement publicKeyEditText = (MobileElement) driver.findElementById("io.beldex.bchat:id/publicKeyEditText");
        publicKeyEditText.sendKeys("bd047e3d1e66a52144d3e9fc8daa7af24566baa17a7c4f7ea9c3a82959c7c56200");
        Thread.sleep(2000);
        MobileElement createPrivateChatButton = (MobileElement) driver.findElementById("io.beldex.bchat:id/createPrivateChatButton");
        createPrivateChatButton.click();
        Thread.sleep(2000);
        MobileElement inputBarEditText = (MobileElement) driver.findElementById(InputBarEditText);
        inputBarEditText.sendKeys("Hello");
        Thread.sleep(2000);
        MobileElement SendImageView = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView");
        SendImageView.click();
        Thread.sleep(4000);
        MobileElement inputBarEditText2 = (MobileElement) driver.findElementById(InputBarEditText);
        inputBarEditText2.sendKeys("Hello");
        Thread.sleep(2000);
        MobileElement SendImageView2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView");
        SendImageView2.click();
        Thread.sleep(40000);
        driver.navigate().back();
        Thread.sleep(20000);
*/
        MobileElement singleModeImageView = (MobileElement) driver.findElementById(SingleModeImageView);
        singleModeImageView.click();
        Thread.sleep(3000);
        MobileElement myAccountTextView = (MobileElement) driver.findElementByXPath(MyAccountTextView);
        myAccountTextView.click();
        Thread.sleep(6000);

        //Check Enter key sends toggle switch is OFF inside chat settings on my account settings
       /* MobileElement chatsButton = (MobileElement) driver.findElementById(ChatsButton);
        chatsButton.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        MobileElement conversationViewDisplayNameTextView = (MobileElement) driver.findElementById(ConversationViewDisplayNameTextView);
        conversationViewDisplayNameTextView.click();
        Thread.sleep(3000);
        MobileElement inputBarEditText3 = (MobileElement) driver.findElementById(InputBarEditText);
        inputBarEditText3.click();
        Thread.sleep(2000);
        inputBarEditText3.sendKeys("Hello");
        Thread.sleep(3000);
        Robot robot3 = new Robot();
        robot3.keyPress(KeyEvent.VK_ENTER);
        robot3.keyRelease(KeyEvent.VK_ENTER);*/

        //Check Enter key sends toggle switch is ON inside chat settings on my account settings
        /*MobileElement chatsButton2 = (MobileElement) driver.findElementById(ChatsButton);
        chatsButton2.click();
        Thread.sleep(3000);
        MobileElement EnterKeySendCheckBoxON = (MobileElement) driver.findElementByXPath(EnterKeySendCheckBox);
        EnterKeySendCheckBoxON.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        MobileElement conversationViewDisplayNameTextView2 = (MobileElement) driver.findElementById(ConversationViewDisplayNameTextView);
        conversationViewDisplayNameTextView2.click();
        Thread.sleep(3000);
        MobileElement inputBarEditText4 = (MobileElement) driver.findElementById(InputBarEditText);
        inputBarEditText4.click();
        Thread.sleep(2000);
        inputBarEditText4.sendKeys("Hello");
        Thread.sleep(3000);
        Robot robot4 = new Robot();
        robot4.keyPress(KeyEvent.VK_ENTER);
        robot4.keyRelease(KeyEvent.VK_ENTER);*/

        //Check delete old messages toggle inside chat settings
        /*MobileElement chatsButton3 = (MobileElement) driver.findElementById(ChatsButton);
        chatsButton3.click();
        Thread.sleep(3000);
        MobileElement DeleteOldMessagesToggleON = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.Switch");
        DeleteOldMessagesToggleON.click();
        Thread.sleep(3000);
        MobileElement ConversationLengthLimitTextView = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.RelativeLayout/android.widget.TextView[1]");
        ConversationLengthLimitTextView.click();
        Thread.sleep(3000);
        MobileElement ConversationLengthLimitEditText = (MobileElement) driver.findElementById("android:id/edit");
        ConversationLengthLimitEditText.click();
        Thread.sleep(3000);
        Robot robot4 = new Robot();
        robot4.keyPress(KeyEvent.VK_BACK_SPACE);
        robot4.keyRelease(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(1000);
        robot4.keyPress(KeyEvent.VK_BACK_SPACE);
        robot4.keyRelease(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(1000);
        robot4.keyPress(KeyEvent.VK_BACK_SPACE);
        robot4.keyRelease(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(1000);
        robot4.keyPress(VK_1);
        robot4.keyRelease(VK_1);
        Thread.sleep(3000);
        MobileElement OKButton = (MobileElement) driver.findElementById("android:id/button1");
        OKButton.click();
        Thread.sleep(3000);
        MobileElement TrimAllConversationsNowTextView = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.RelativeLayout/android.widget.TextView");
        TrimAllConversationsNowTextView.click();
        Thread.sleep(3000);
        MobileElement delete_all_old_messages_dialog_delete = (MobileElement) driver.findElementById("io.beldex.bchat:id/delete_all_old_messages_dialog_delete");
        delete_all_old_messages_dialog_delete.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        MobileElement conversationViewDisplayNameTextView2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
        conversationViewDisplayNameTextView2.click();*/

        //check feedback option inside my account settings
        MobileElement surveyButton = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[4]");
        surveyButton.click();
        Thread.sleep(6000);
        driver.navigate().back();
        Thread.sleep(5000);

        //Check FAQ option inside my account settings
        MobileElement faqButton = (MobileElement) driver.findElementById("io.beldex.bchat:id/faqButton");
        faqButton.click();
        Thread.sleep(3000);
        /*MobileElement terms_accept = (MobileElement) driver.findElementById("com.android.chrome:id/terms_accept");
        terms_accept.click();
        Thread.sleep(3000);*/
        driver.navigate().back();
        Thread.sleep(3000);

        //Check changelog option inside my account settings
        MobileElement changeLogButton = (MobileElement) driver.findElementById("io.beldex.bchat:id/changeLogButton");
        changeLogButton.click();
        Thread.sleep(3000);
        MobileElement lblListImage = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ExpandableListView/android.widget.LinearLayout[1]/android.widget.ImageView");
        lblListImage.click();
        Thread.sleep(3000);
        lblListImage.click();
        Thread.sleep(3000);
        MobileElement lblListImage2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.ImageView");
        lblListImage2.click();
        Thread.sleep(3000);
        lblListImage2.click();
        Thread.sleep(3000);
        MobileElement lblListImage3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ExpandableListView/android.widget.LinearLayout[3]/android.widget.ImageView");
        lblListImage3.click();
        Thread.sleep(3000);
        lblListImage3.click();
        Thread.sleep(3000);
        MobileElement lblListImage4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ExpandableListView/android.widget.LinearLayout[4]/android.widget.ImageView");
        lblListImage4.click();
        Thread.sleep(3000);
        lblListImage4.click();
        Thread.sleep(3000);
        MobileElement lblListImage5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ExpandableListView/android.widget.LinearLayout[5]/android.widget.ImageView");
        lblListImage5.click();
        Thread.sleep(3000);
        lblListImage5.click();
        Thread.sleep(3000);
        MobileElement lblListImage6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ExpandableListView/android.widget.LinearLayout[6]/android.widget.ImageView");
        lblListImage6.click();
        Thread.sleep(3000);
        lblListImage6.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(6000);

        //Check clear data option on my settings
        MobileElement ClearDataTextView = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ExpandableListView/android.widget.LinearLayout[16]/android.widget.ImageView");
        ClearDataTextView.click();
        Thread.sleep(3000);
        MobileElement clearAllDataButton = (MobileElement) driver.findElementById("io.beldex.bchat:id/clearAllDataButton");
        clearAllDataButton.click();
    }
}
