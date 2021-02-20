package StepDefinition.Scholastic;

import Pages.Scholastic.LandingPage;
import cucumber.api.java.en.And;

public class CreateAccUsingSchoolSD {

    LandingPage lPage = new LandingPage();




    @And("^I select '(.+)' as school state$")
    public void selectState(String name){
        lPage.selectState(name);
    }

    @And("^I select New York as school city$")
    public void selectCity(){
        lPage.selectCity();
    }

    @And("^I click on search button$")
    public void clickOnsearch(){
        lPage.clickOnSearchButton();
    }
}
