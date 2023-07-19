package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ReasonForTravelPage extends Utility {
    //nextStepButton, reasonForVisitList locators

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement reasonForAustralia;

    @CacheLookup
    @FindBy(id = "response-1")
    WebElement reasonForChile;

    @CacheLookup
    @FindBy(id = "response-4")
    WebElement reasonForColombia;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    //create methods  'void selectReasonForVisit(String reason and  'void clickNextStepButton()'

    public void selectReasonForAustralia() {
        Reporter.log("Select reason  for Australia" + reasonForAustralia.toString());
        clickOnElement(reasonForAustralia);
        CustomListeners.test.log(Status.PASS, "Select reason  for Australia");
    }

    public void selectReasonForChile() {
        Reporter.log("Select reason  for Chile" + reasonForChile.toString());
        clickOnElement(reasonForChile);
        CustomListeners.test.log(Status.PASS, "Select reason  for Chile");
    }

    public void selectReasonForColombia() {
        Reporter.log("Select reason  for Chile" + reasonForColombia.toString());
        clickOnElement(reasonForColombia);
        CustomListeners.test.log(Status.PASS, "Select reason  for Chile");
    }

    public void clickContinueButton() {
        Reporter.log("Click on Continue button" + continueButton.toString());
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "Click on Continue button");
    }
}
