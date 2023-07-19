package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {
    //nationalityDropDownList, nextStepButton locators
    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    //create methods  'void selectNationality(String nationality)'

    public void selectNationality(String nationality) {
        Reporter.log("Select nationality from dropdown list" + nationalityDropDownList.toString());
        selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);
        CustomListeners.test.log(Status.PASS, "Select Nationality from DropDownList");
    }

    public void clickNextStepButton() {
        Reporter.log("click on continue button" + nextStepButton.toString());
        clickOnElement(nextStepButton);
        CustomListeners.test.log(Status.PASS, "Click on Continue Button");
    }
}
