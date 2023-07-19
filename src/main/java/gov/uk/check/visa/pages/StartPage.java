package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class StartPage extends Utility {
    //startNowButton locatores and create method 'void clickStartNow()'
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Accept additional cookies']")
    WebElement acceptAllCookies;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/main[1]/div[2]/div[1]/article[1]/section[1]/a[1]")
    WebElement startButton;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"global-cookie-message\"]/div[1]/div/div[2]/button[1]")
    WebElement acceptCookies;


    public void clickOnStartButton() {
        Reporter.log("Accept all cookies" + acceptAllCookies.toString());
        clickOnElement(acceptAllCookies);
        Reporter.log("Click on Start button" + startButton.toString());
        clickOnElement(startButton);
        CustomListeners.test.log(Status.PASS, "Click on start button");
    }
}