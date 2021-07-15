package MembersuiteMobile.Pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class AllLocators extends BasePage{

    @FindBy(className="XCUIElementTypeTextField")
    public MobileElement username;

    @FindBy(className ="XCUIElementTypeSecureTextField")
    public MobileElement password;

    @FindBy(name = "Sign In")
    public MobileElement signIn;



}
