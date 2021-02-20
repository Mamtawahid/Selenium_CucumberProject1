package StepDefinition.Scholastic;

import Pages.Scholastic.LandingPage;
import Pages.Scholastic.MyAccountPage;
import cucumber.api.java.en.And;

public class AddingCreditCardsSD {

    LandingPage lPage = new LandingPage();
    MyAccountPage mPage = new MyAccountPage();


    @And("^I click on My account$")
    public void clickOnMyAccount(){
        lPage.clickOnMyAcc();
    }

    @And("^I click on payment methods$")
    public void clickOnPaymentMethods(){
        lPage.clickOnPaymentMethods();
    }

    @And("^I click on add a card$")
    public void clickOnAddACard(){
        mPage.clickOnAddACard();
    }

    @And("^I enter '(.+)' as card 1$")
    public void enterCardNo(String card){
        mPage.enterCardNo(card);
    }

    @And("^I select '(.+)' as month$")
    public void selectMonth(String data){
        mPage.selectMonth(data);
    }

    @And("^I select year '(.+)' as year$")
    public void selectYear(String year){
        mPage.electYear(year);
    }

    @And("^I enter '(.+)' as security code$")
    public void enterCode(String code){
        mPage.enterSecurityCode(code);
    }

    @And("^I enter '(.+)' as first name")
    public void enterFName(String name){
        mPage.enterFirstName(name);
    }

    @And("^I enter '(.+)' as ;ast name$")
    public void enterLName(String name){
        mPage.enterLastName(name);
    }

    @And("^I enter '(.+)' as address1$")
    public void enterAdd1(String add){
        mPage.enterAdd1(add);
    }

    @And("^I enter '(.+)' as address2$")
    public void enterAdd2(String add){
        mPage.enterAdd2(add);
    }

    @And("^I enter '(.+)' as zip code$")
    public void enterZipCode(String zip){
        mPage.enterZipCode(zip);
    }

    @And("^I enter '(.+)' as cell no$")
    public void enteMobile(String mob){
        mPage.enterCell(mob);
    }

    @And("^I click save$")
    public void clickSave(){
        mPage.clickSave();
    }




}
