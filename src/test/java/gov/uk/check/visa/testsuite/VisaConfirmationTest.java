package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends BaseTest {

    DurationOfStayPage durationOfStayPage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    SelectNationalityPage selectNationalityPage;
    StartPage startPage;
    WorkTypePage workTypePage;

    @BeforeMethod
    public void init() {
        durationOfStayPage = new DurationOfStayPage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
        reasonForTravelPage = new ReasonForTravelPage();
        resultPage = new ResultPage();
        selectNationalityPage = new SelectNationalityPage();
        startPage = new StartPage();
        workTypePage = new WorkTypePage();
    }

    //extent report Create Smoke.xml(Test-1), Sanity.xml(Test-1,3) and regression.xml(Test-1,2,3)

    @Test(groups = {"Smoke", "Sanity", "Regression"})
    public void anAustralianComingToUKForTourism() {
        //Click on start button
        startPage.clickOnStartButton();

        //	Select a Nationality 'Australia'
        selectNationalityPage.selectNationality("Australia");

        //	Click on Continue button
        selectNationalityPage.clickNextStepButton();

        //	Select reason 'Tourism'
        reasonForTravelPage.selectReasonForAustralia();

        // 	Click on Continue button
        reasonForTravelPage.clickContinueButton();

        // 	verify result 'You will not need a visa to come to the UK'
        resultPage.confirmResultTourism("You will not need a visa to come to the UK");
    }

    @Test(groups = {"Regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() {
        //	Click on start button
        startPage.clickOnStartButton();

        //	Select a Nationality 'Chile'
        selectNationalityPage.selectNationality("Chile");

        //	Click on Continue button
        selectNationalityPage.clickNextStepButton();

        //	Select reason 'Work, academic visit or business'
        reasonForTravelPage.selectReasonForChile();

        //	Click on Continue button
        reasonForTravelPage.clickContinueButton();

        //	Select intendent to stay for 'longer than 6 months'
        durationOfStayPage.selectLengthOfStay("longer than 6 months");

        //	Click on Continue button
        durationOfStayPage.clickNextStepButton();

        //	Select have planning to work for 'Health and care professional'
        workTypePage.selectJobType("Health and care professional");

        //	Click on Continue button
        workTypePage.clickNextStepButton();

        //	verify result 'You need a visa to work in health and care'
        resultPage.confirmResultHealthcare("You need a visa to work in health and care");
    }

    @Test(groups = {"Sanity", "Regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card() {
        //	Click on start button
        startPage.clickOnStartButton();

        //	Select a Nationality 'Colombia'
        selectNationalityPage.selectNationality("Colombia");

        //	Click on Continue button
        selectNationalityPage.clickNextStepButton();

        //	Select reason 'Join partner or family for a long stay'
        reasonForTravelPage.selectReasonForColombia();

        //	Click on Continue button
        reasonForTravelPage.clickContinueButton();

        //	Select state My partner of family member have uk immigration status 'yes'


        //	Click on Continue button

        //	verify result 'You’ll need a visa to join your family or partner in the UK'
        resultPage.confirmResultFamilyStay("You may need a visa");
    }

}
