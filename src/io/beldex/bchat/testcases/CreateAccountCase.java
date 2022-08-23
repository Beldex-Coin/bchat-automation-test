package io.beldex.bchat.tescases;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import static java.awt.event.KeyEvent.*;

public class CreateAccountCase {
    static String registerButton = "io.beldex.bchat:id/registerButton";
    static String buttonNewenter = "io.beldex.bchat:id/buttonNew_enter";
    static String textinputplaceholder ="io.beldex.bchat:id/textinput_placeholder";
    static String reEnterPinEditTxt ="io.beldex.bchat:id/reEnterPinEditTxt";
    static String displayNameEditText ="io.beldex.bchat:id/displayNameEditText";
    static String logoimageview ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView";
    static String createPrivateChatButton = "io.beldex.bchat:id/createPrivateChatButton";
    static String inputBarEditText ="io.beldex.bchat:id/inputBarEditText";
    static String createNewPrivateButton ="io.beldex.bchat:id/createNewPrivateButton";
    static String joinPublicChatButton ="io.beldex.bchat:id/joinPublicChatButton";
    static String publicKeyEditText ="io.beldex.bchat:id/publicKeyEditText";
    static String nameEditText ="io.beldex.bchat:id/nameEditText";
    static String chatURLEditText= "io.beldex.bchat:id/chatURLEditText";
    static String Searchpeopleandgroupstextview ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView";
    static String searchBarBackButton ="io.beldex.bchat:id/searchBarBackButton";
    static String NavigateupImageButton ="Navigate up";
    static String actionIndicatorImageView ="io.beldex.bchat:id/actionIndicatorImageView";
    static String messagesendimageview ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView";

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
        Thread.sleep(8000);
        //Create Account Flow
        MobileElement CreateAccountButton = (MobileElement) driver.findElementById(registerButton);
        CreateAccountButton.click();
        Thread.sleep(10000);

        //Display name test box is empty on display name screen
        MobileElement ContinueButton = (MobileElement) driver.findElementById(registerButton);
        ContinueButton.click();
        Thread.sleep(2000);

        //Giving lengthy display name in Display name text box on display name screen
        MobileElement DisplayNameTextBox = (MobileElement) driver.findElementById(displayNameEditText);
        DisplayNameTextBox.sendKeys("sathish vishnu suresh shanmugam guna saravanan sreekanth vijay abishek raj");
        Thread.sleep(2000);
        MobileElement ContinueButton2 = (MobileElement) driver.findElementById(registerButton);
        ContinueButton2.click();
        Thread.sleep(2000);
        DisplayNameTextBox.clear();
        Thread.sleep(2000);

        //Giving valid display name in Display name text box on display name screen
        MobileElement DisplayNameTextBox2 = (MobileElement) driver.findElementById(displayNameEditText);
        DisplayNameTextBox2.sendKeys("Sathish");
        Thread.sleep(3000);
        MobileElement ContinueButton3 = (MobileElement) driver.findElementById(registerButton);
        ContinueButton3.click();
        Thread.sleep(15000);

        //Click Next button on Register Screen
        MobileElement Next = (MobileElement) driver.findElementById(registerButton);
        Next.click();
        Thread.sleep(15000);

        //Both text boxes are empty on create password screen
        MobileElement NextButton_Enter = (MobileElement) driver.findElementById("io.beldex.bchat:id/button_enter");
        NextButton_Enter.click();
        Thread.sleep(2000);
        MobileElement EnterButton = (MobileElement) driver.findElementById(buttonNewenter);
        EnterButton.click();
        Thread.sleep(3000);

        //Only re-enter text box is empty on create password screen
        MobileElement EnterPassword = (MobileElement) driver.findElementById(textinputplaceholder);
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
        MobileElement EnterButton2 = (MobileElement) driver.findElementById(buttonNewenter);
        EnterButton2.click();
        Thread.sleep(3000);

        //Only enter your password text box is empty on create password screen
        MobileElement ReEnterPassword = (MobileElement) driver.findElementById(reEnterPinEditTxt);
        ReEnterPassword.click();
        Thread.sleep(2000);
        Robot robot2 = new Robot();
        robot2.keyPress(VK_0);
        robot2.keyRelease(VK_0);
        robot2.keyPress(VK_0);
        robot2.keyRelease(VK_0);
        robot2.keyPress(VK_0);
        robot2.keyRelease(VK_0);
        robot2.keyPress(VK_0);
        robot2.keyRelease(VK_0);
        Thread.sleep(3000);
        MobileElement EnterButton3 = (MobileElement) driver.findElementById(buttonNewenter);
        EnterButton3.click();
        Thread.sleep(3000);

        //Both text boxes are different password on create password screen
        MobileElement EnterPassword3 = (MobileElement) driver.findElementById(textinputplaceholder);
        EnterPassword3.click();
        Thread.sleep(3000);
        Robot robot3 = new Robot();
        robot3.keyPress(VK_0);
        robot3.keyPress(VK_0);
        robot3.keyRelease(VK_0);
        robot3.keyPress(VK_0);
        robot3.keyRelease(VK_0);
        robot3.keyPress(VK_0);
        robot3.keyRelease(VK_0);
        robot3.keyPress(VK_0);
        robot3.keyRelease(VK_0);
        Thread.sleep(3000);
        MobileElement ReEnterPassword2 = (MobileElement) driver.findElementById(reEnterPinEditTxt);
        ReEnterPassword2.click();
        Thread.sleep(3000);
        Robot robot4 = new Robot();
        robot4.keyPress(VK_1);
        robot4.keyRelease(VK_1);
        robot4.keyRelease(VK_0);
        robot4.keyPress(VK_0);
        robot4.keyRelease(VK_0);
        robot4.keyPress(VK_0);
        robot4.keyRelease(VK_0);
        robot4.keyPress(VK_0);
        robot4.keyRelease(VK_0);
        Thread.sleep(3000);
        MobileElement EnterButton4 = (MobileElement) driver.findElementById(buttonNewenter);
        EnterButton4.click();
        Thread.sleep(3000);

        //Re-enter text box only is invalid on create password screen
        MobileElement EnterPassword4 = (MobileElement) driver.findElementById(textinputplaceholder);
        EnterPassword4.click();
        Thread.sleep(3000);
        Robot robot5 = new Robot();
        robot5.keyPress(VK_0);
        robot5.keyPress(VK_0);
        robot5.keyRelease(VK_0);
        robot5.keyPress(VK_0);
        robot5.keyRelease(VK_0);
        robot5.keyPress(VK_0);
        robot5.keyRelease(VK_0);
        robot5.keyPress(VK_0);
        robot5.keyRelease(VK_0);
        Thread.sleep(3000);
        MobileElement ReEnterPassword3 = (MobileElement) driver.findElementById(reEnterPinEditTxt);
        ReEnterPassword3.click();
        Thread.sleep(3000);
        Robot robot6 = new Robot();
        robot6.keyPress(VK_1);
        robot6.keyRelease(VK_1);
        Thread.sleep(3000);
        MobileElement EnterButton5 = (MobileElement) driver.findElementById(buttonNewenter);
        EnterButton5.click();
        Thread.sleep(3000);

        //Enter your password text box only is invalid on create password screen
        MobileElement EnterPassword5 = (MobileElement) driver.findElementById(textinputplaceholder);
        EnterPassword5.click();
        Thread.sleep(3000);
        Robot robot7 = new Robot();
        robot7.keyPress(VK_1);
        robot7.keyRelease(VK_1);
        robot7.keyPress(VK_0);
        robot7.keyRelease(VK_0);
        Thread.sleep(3000);
        MobileElement ReEnterPassword4 = (MobileElement) driver.findElementById(reEnterPinEditTxt);
        ReEnterPassword4.click();
        Thread.sleep(3000);
        Robot robot8 = new Robot();
        robot8.keyPress(VK_0);
        robot8.keyPress(VK_0);
        robot8.keyRelease(VK_0);
        robot8.keyPress(VK_0);
        robot8.keyRelease(VK_0);
        robot8.keyPress(VK_0);
        robot8.keyRelease(VK_0);
        robot8.keyPress(VK_0);
        robot8.keyRelease(VK_0);
        Thread.sleep(3000);
        MobileElement EnterButton6 = (MobileElement) driver.findElementById(buttonNewenter);
        EnterButton6.click();
        Thread.sleep(3000);

        //Both text boxes are invalid on create password screen
        MobileElement EnterPassword6 = (MobileElement) driver.findElementById(textinputplaceholder);
        EnterPassword6.click();
        Thread.sleep(3000);
        Robot robot9 = new Robot();
        robot9.keyPress(VK_1);
        robot9.keyRelease(VK_1);
        robot9.keyPress(VK_0);
        robot9.keyRelease(VK_0);
        Thread.sleep(3000);
        MobileElement ReEnterPassword5 = (MobileElement) driver.findElementById(reEnterPinEditTxt);
        ReEnterPassword5.click();
        Thread.sleep(3000);
        Robot robot10 = new Robot();
        robot10.keyPress(VK_1);
        robot10.keyRelease(VK_1);
        Thread.sleep(3000);
        MobileElement EnterButton7 = (MobileElement) driver.findElementById(buttonNewenter);
        EnterButton7.click();
        Thread.sleep(3000);

        //Both text boxes are valid on create password screen
        MobileElement EnterPassword7 = (MobileElement) driver.findElementById(textinputplaceholder);
        EnterPassword7.click();
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
        MobileElement ReEnterPassword6 = (MobileElement) driver.findElementById(reEnterPinEditTxt);
        ReEnterPassword6.click();
        Thread.sleep(3000);
        Robot robot12 = new Robot();
        robot12.keyPress(VK_0);
        robot12.keyRelease(VK_0);
        robot12.keyRelease(VK_0);
        robot12.keyPress(VK_0);
        robot12.keyRelease(VK_0);
        robot12.keyPress(VK_0);
        robot12.keyRelease(VK_0);
        robot12.keyPress(VK_0);
        robot12.keyRelease(VK_0);
        Thread.sleep(3000);
        MobileElement EnterButton8 = (MobileElement) driver.findElementById(buttonNewenter);
        EnterButton8.click();
        Thread.sleep(3000);

        //Press Next button without clicking copy icon on Recovery phrase screen
        MobileElement Nextbutton2 = (MobileElement) driver.findElementById(registerButton);
        Nextbutton2.click();
        Thread.sleep(3000);

        //Press Next button with clicking copy icon on Recovery phrase screen
        MobileElement recoveryPhraseCopyIcon = (MobileElement) driver.findElementById("io.beldex.bchat:id/recoveryPhraseCopyIcon");
        recoveryPhraseCopyIcon.click();
        Thread.sleep(2000);
        MobileElement Nextbutton3 = (MobileElement) driver.findElementById(registerButton);
        Nextbutton3.click();
        Thread.sleep(4000);

        //Create New Chat
        MobileElement Logo = (MobileElement) driver.findElementByXPath(logoimageview);
        Logo.click();
        Thread.sleep(2000);
        MobileElement NewChat = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ImageView");
        NewChat.click();
        Thread.sleep(2000);

        //Bchat id text box is empty on NewChat screen
        MobileElement CreatePrivateChatButton = (MobileElement) driver.findElementById(createPrivateChatButton);
        CreatePrivateChatButton.click();
        Thread.sleep(2000);

        //Bchat id text box is invalid on NewChat screen
        MobileElement PublicKeyText = (MobileElement) driver.findElementById(publicKeyEditText);
        PublicKeyText.sendKeys("bd047e3d1e66a52144d3e9fc8daa7af24566baa17a7c4f7ea9c3a82959c7c5620");
        Thread.sleep(2000);
        MobileElement CreatePrivateChatButton2 = (MobileElement) driver.findElementById(createPrivateChatButton);
        CreatePrivateChatButton2.click();
        Thread.sleep(2000);
        PublicKeyText.clear();
        Thread.sleep(2000);

        //Check scan qr code option on New chat screen
        MobileElement scanQRCode = (MobileElement) driver.findElementById("io.beldex.bchat:id/scanQRCode");
        scanQRCode.click();
        Thread.sleep(2000);
        MobileElement Navigateupbutton1 = (MobileElement) driver.findElementByAccessibilityId(NavigateupImageButton);
        Navigateupbutton1.click();
        Thread.sleep(2000);

        //Check Copy icon on New chat screen
        MobileElement copyButton = (MobileElement) driver.findElementById("io.beldex.bchat:id/copyButton");
        copyButton.click();
        Thread.sleep(4000);

        //Check share icon on New chat screen
        MobileElement ShareButton = (MobileElement) driver.findElementById("io.beldex.bchat:id/shareButton");
        ShareButton.click();
        Thread.sleep(2000);
        MobileElement Bchatmessenger = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.TabHost/android.widget.LinearLayout/android.widget.FrameLayout/com.android.internal.widget.ViewPager/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]");
        Bchatmessenger.click();
        Thread.sleep(2000);
        MobileElement Navigateupbutton2 = (MobileElement) driver.findElementByAccessibilityId(NavigateupImageButton);
        Navigateupbutton2.click();
        Thread.sleep(2000);

        //Bchat id text box is valid on New Chat screen
        MobileElement PublicKeyText2 = (MobileElement) driver.findElementById(publicKeyEditText);
        PublicKeyText2.sendKeys("bd047e3d1e66a52144d3e9fc8daa7af24566baa17a7c4f7ea9c3a82959c7c56200");
        Thread.sleep(2000);
        MobileElement CreatePrivateChatButton3 = (MobileElement) driver.findElementById(createPrivateChatButton);
        CreatePrivateChatButton3.click();
        Thread.sleep(2000);

        //One to One chat screen
        MobileElement InputBarEditText = (MobileElement) driver.findElementById(inputBarEditText);
        InputBarEditText.sendKeys("Hello");
        Thread.sleep(2000);
        MobileElement MessageSendimageview = (MobileElement) driver.findElementByXPath(messagesendimageview);
        MessageSendimageview.click();
        Thread.sleep(20000);
        driver.navigate().back();
        Thread.sleep(2000);

        //Choose New Secret group option on Home screen
        MobileElement Logo2 = (MobileElement) driver.findElementByXPath(logoimageview);
        Logo2.click();
        Thread.sleep(2000);
        MobileElement SecretGroup = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.ImageView");
        SecretGroup.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Giving Blank secret group name and without selecting member on New Secret Group screen
        MobileElement CreateNewPrivateButton = (MobileElement) driver.findElementById(createNewPrivateButton);
        CreateNewPrivateButton.click();
        Thread.sleep(2000);

        //Giving lengthy secret group name and without selecting member on New Secret Group screen
        MobileElement NameEditText = (MobileElement) driver.findElementById(nameEditText);
        NameEditText.sendKeys("hello hello hello hello hello hello hello hello hello hello");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement CreateNewPrivateButton2 = (MobileElement) driver.findElementById(createNewPrivateButton);
        CreateNewPrivateButton2.click();
        Thread.sleep(2000);
        NameEditText.clear();
        Thread.sleep(2000);

        //Giving blank secret group name and with selecting member on New Secret Group screen
        MobileElement ActionIndicatorImageView = (MobileElement) driver.findElementById(actionIndicatorImageView);
        ActionIndicatorImageView.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement CreateNewPrivateButton3 = (MobileElement) driver.findElementById(createNewPrivateButton);
        CreateNewPrivateButton3.click();
        Thread.sleep(2000);

        //Giving lengthy secret group name and with selecting member on New Secret Group screen
        MobileElement NameEditText2 = (MobileElement) driver.findElementById(nameEditText);
        NameEditText2.sendKeys("hello hello hello hello hello hello hello hello hello hello");
        Thread.sleep(2000);
        MobileElement ActionIndicatorImageView2 = (MobileElement) driver.findElementById(actionIndicatorImageView);
        ActionIndicatorImageView2.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement CreateNewPrivateButton4 = (MobileElement) driver.findElementById(createNewPrivateButton);
        CreateNewPrivateButton4.click();
        Thread.sleep(2000);
        NameEditText2.clear();
        Thread.sleep(2000);

        //Giving valid group name and without selecting member on New Secret Group screen
        MobileElement NameEditText3 = (MobileElement) driver.findElementById(nameEditText);
        NameEditText3.sendKeys("Team");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement CreateNewPrivateButton5 = (MobileElement) driver.findElementById(createNewPrivateButton);
        CreateNewPrivateButton5.click();
        Thread.sleep(2000);
        NameEditText3.clear();
        Thread.sleep(2000);

        //Giving lengthy secret group name and without selecting member on New Secret Group screen
        MobileElement NameEditText4 = (MobileElement) driver.findElementById(nameEditText);
        NameEditText4.sendKeys("hello hello hello hello hello hello hello hello hello hello");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement CreateNewPrivateButton6 = (MobileElement) driver.findElementById(createNewPrivateButton);
        CreateNewPrivateButton6.click();
        Thread.sleep(2000);
        NameEditText4.clear();
        Thread.sleep(2000);

        //Giving giving valid group name and with selecting member on New Secret Group screen
        MobileElement NameEditText5 = (MobileElement) driver.findElementById(nameEditText);
        NameEditText5.sendKeys("Team");
        Thread.sleep(2000);
        MobileElement ActionIndicatorImageView3 = (MobileElement) driver.findElementById(actionIndicatorImageView);
        ActionIndicatorImageView3.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement CreateNewPrivateButton7 = (MobileElement) driver.findElementById(createNewPrivateButton);
        CreateNewPrivateButton7.click();
        Thread.sleep(5000);

        //Secret group chat screen
        MobileElement InputBarEditText2 = (MobileElement) driver.findElementById(inputBarEditText);
        InputBarEditText2.sendKeys("Hello");
        Thread.sleep(2000);
        MobileElement MessageSendimageview2 = (MobileElement) driver.findElementByXPath(messagesendimageview);
        MessageSendimageview2.click();
        Thread.sleep(15000);
        driver.navigate().back();
        Thread.sleep(2000);

        //Choose social group on Home screen
        MobileElement Logo3 = (MobileElement) driver.findElementByXPath(logoimageview);
        Logo3.click();
        Thread.sleep(2000);
        MobileElement SocialGroup = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.ImageView");
        SocialGroup.click();
        Thread.sleep(2000);

        //Giving social group url text box is empty on Join social group screen
        MobileElement JoinPublicChatButton = (MobileElement) driver.findElementById(joinPublicChatButton);
        JoinPublicChatButton.click();
        Thread.sleep(2000);

        //Giving social group url text box is invalid on Join social group screen
        MobileElement ChatURLEditText = (MobileElement) driver.findElementById(chatURLEditText);
        ChatURLEditText.sendKeys("hello");
        Thread.sleep(2000);
        MobileElement JoinPublicChatButton2 = (MobileElement) driver.findElementById(joinPublicChatButton);
        JoinPublicChatButton2.click();
        Thread.sleep(2000);

        //Giving social group url is valid on Join social group screen
        MobileElement ChatURLEditText2 = (MobileElement) driver.findElementById(chatURLEditText);
        ChatURLEditText2.sendKeys("");
        Thread.sleep(2000);
        MobileElement JoinPublicChatButton3 = (MobileElement) driver.findElementById(joinPublicChatButton);
        JoinPublicChatButton3.click();
        Thread.sleep(2000);

        //Check scan qr code option on Join social group screen
        MobileElement SocialGroupscanQRCode = (MobileElement) driver.findElementById("io.beldex.bchat:id/scanQRCode");
        SocialGroupscanQRCode.click();
        Thread.sleep(2000);
        MobileElement NavigateupButton = (MobileElement) driver.findElementByAccessibilityId(NavigateupImageButton);
        NavigateupButton.click();
        Thread.sleep(5000);

        //select existing social group on Join social group screen
        MobileElement BchatSocialGroup = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.GridLayout/android.widget.Button[1]");
        BchatSocialGroup.click();
        Thread.sleep(10000);
        driver.navigate().back();
        Thread.sleep(3000);

        //Giving valid contact and Secret and social group name in Search text box on Home screen
        MobileElement searchpeopleandgroupstextview = (MobileElement) driver.findElementByXPath(Searchpeopleandgroupstextview);
        searchpeopleandgroupstextview.click();
        Thread.sleep(2000);
        Robot robot13 = new Robot();
        robot13.keyPress(VK_B);
        robot13.keyRelease(VK_B);
        robot13.keyPress(VK_C);
        robot13.keyRelease(VK_C);
        Thread.sleep(2000);
        MobileElement Bchatgroup = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
        Bchatgroup.click();
        Thread.sleep(10000);
        MobileElement NavigateupButton2 = (MobileElement) driver.findElementByAccessibilityId(NavigateupImageButton);
        NavigateupButton2.click();
        Thread.sleep(3000);
        MobileElement SearchBarBackButton = (MobileElement) driver.findElementById(searchBarBackButton);
        SearchBarBackButton.click();
        Thread.sleep(2000);

        //Giving invalid contact and Secret and social group name in Search text box on Home screen
        MobileElement searchpeopleandgroupstextview2 = (MobileElement) driver.findElementByXPath(Searchpeopleandgroupstextview);
        searchpeopleandgroupstextview2.click();
        Thread.sleep(2000);
        Robot robot14 = new Robot();
        robot14.keyPress(VK_N);
        robot14.keyRelease(VK_N);
        robot14.keyPress(VK_N);
        robot14.keyRelease(VK_N);
        Thread.sleep(2000);
        MobileElement SearchBarBackButton2 = (MobileElement) driver.findElementById(searchBarBackButton);
        SearchBarBackButton2.click();
    }
    }
