package StepDefinition.Scholastic;

import Pages.Scholastic.LandingPage;
import Pages.Scholastic.MyAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_lol.AN;
import org.testng.Assert;

public class CreateNewAccTaxableSD {

    LandingPage lPage = new LandingPage();
    MyAccountPage mPage = new MyAccountPage();

    @When("^I click on create an account$")
    public void clickOnCreateAccount(){
        lPage.clickOnCreateAcoount();
    }

    @And("^I select Teacher/Administrator$")
    public void selectTeacher(){
        lPage.clickOnTeacherAdmin();
    }

    @And("^I click on next1 button$")
    public void clickOnnextButton() {
        lPage.clickOnNext1Button();
    }

    @And("^I select Mr. as title$")
    public void selectTitle(){
        lPage.selectTitle();
    }

    @And("^I enter '(.+)' as first name$")
    public void enterFirstName(String name) {
        lPage.enterFirstName(name);
    }

    @And("^I enter '(.+)' as last name$")
    public void enterlastName(String name){
        lPage.enterLastName(name);
    }

    @And("^I enter '(.+)' as my email$")
    public void enterEmail(String data){
        lPage.enterEmail(data);
    }

    @And("^I enter '(.+)' as my password$")
    public void enterPassword(String data){
        lPage.enterPassword(data);
    }

    @And("^I enter '(.+)' as mobile number$")
    public void enterMobNo(String data){
        lPage.enterMobNo(data);
    }

    @And("^I checked terms and conditions$")
    public void checkBoxforTerms(){
        lPage.clickOnCheckBox();
    }

    @And("^I click on next button$")
    public void clickOnNextButton(){
        lPage.clickOnNext3Button();
    }

    @And("^I enter '(.+)' as zip code$")
    public void enterZipCode(String data){
        lPage.enterZipCode(data);
    }

    @And("^I click search button$")
    public void clickOnSearch(){
        lPage.clickOnSearch();
    }

    @And("^I select school '(.+)'$")
    public void selectSchool(String data){
        lPage.selectSchool(data);
    }

    @And("^I select '(.+)' as role$")
    public void selectTeacherByGrade(String teacher){
        lPage.selectRole(teacher);
    }
    @And("^I select 1st as Grade$")
    public void selectStudentGrade(){
        lPage.selectGrade();
    }

    @And("^I select '(.+)' as number of student$")
    public void selectNoOfStudents(String data){
        lPage.enterNumberOfStudents(data);
    }
    @And("^I select GRL as preferred reading level$")
    public void selectPreferredReadingLevel(){
        lPage.selectReadingLevel();
    }

    @And("^I click on continue to site button$")
    public void clickOnContinue(){
        lPage.clickOnContinueToSite();
    }

    @And("^I minimize bar$")
    public void minimizeBar(){
        lPage.clickOnHeader();
    }

    @Then("^I verify class same class code is present on home page as well as on My account page$")
    public void verifyClassCode(){
        Assert.assertEquals(lPage.classCodeOnHomePage(),mPage.getClassCodeFromMyacc(),"Two class codes are not same");
    }

    @Then("^I verify Teacher Name is displayed as expected$")
    public void verifyTeacherName(){
        Assert.assertEquals("Mr. ch fa",mPage.getTeacherName(),"Teacher name is not presented as expected");
    }

    @Then("^I verify School address is selected as expected$")
    public void verifySchoolAddress(){
        Assert.assertEquals("SCHOLASTIC+BOOK+CLUBS\n" +
                "568 Broadway # 2\n" +
                "New York, NY\n" +
                "10012",mPage.getSchoolAddress(),"Address is not displayed as expected ");
    }






}
