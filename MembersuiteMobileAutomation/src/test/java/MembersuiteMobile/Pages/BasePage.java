package MembersuiteMobile.Pages;

import MembersuiteMobile.Utilities.Driver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()), this);
    }

    Actions actions = new Actions(Driver.get());







}
