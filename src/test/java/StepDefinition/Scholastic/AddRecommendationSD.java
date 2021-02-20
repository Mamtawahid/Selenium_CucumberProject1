package StepDefinition.Scholastic;

import Pages.Scholastic.LandingPage;
import Pages.Scholastic.RecommendPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AddRecommendationSD  {

    LandingPage lPage = new LandingPage();
    RecommendPage rPage = new RecommendPage();
    MyListSD mL = new MyListSD();

    @When("^I click on sign in button$")
    public void clicksignIn(){
        lPage.clickSignIn();
    }

    @And("^I enter '(.+)' as my email for signIn$")
    public void enterEmailSignIn(String data){
        lPage.enterEmailSignIn(data);
    }

    @And("^I click on continueButton$")
    public void clickContinue(){
        lPage.clickOnContinue();
    }

    @And("^I enter '(.+)' as my password for signIn$")
    public void enterPasswordSignIn(String data){
        lPage.enterPasswordSignIn(data);
    }

    @And("^I click on signIn button$")
    public void clickOnSignIn(){
        lPage.clickOnSignInButton();
    }

    @And("^I minimize the message$")
    public void closeMsg(){
        lPage.cloceMsg();
    }

    @And("^I click on my list$")
    public void clickMyList(){
        lPage.clickMyList();
    }

    @And("^I select recommendation for students$")
    public void clickRecommend(){
        lPage.selectRecommend();
    }

    @And("^I search by '(.+)'$")
    public void searchByName(String data){
        lPage.searchByName(data);
    }


    @And("^I click on searchbutton$")
    public void clickOnsearch(){
        lPage.clickOnSearch();
    }

    @And("^I click on quick look$")
    public void clickQuickLook(){
        rPage.clickOnQuickLook();
    }

    @And("^I click on recommend$")
    public void clickOnRecommended(){
        rPage.clickOnRecommend();
    }

    @And("^I verify that the item is added on student list unde My list$")
    public void verifyRecommendation(){
        rPage.closeMsgBox();
        rPage.closeImageBox();
        lPage.clickMyList();
        lPage.selectRecommend();
        Assert.assertTrue(mL.isItemDisplayed(),"Item is not included in the list");

    }


}

