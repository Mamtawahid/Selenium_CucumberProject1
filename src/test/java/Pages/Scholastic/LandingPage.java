package Pages.Scholastic;


import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.ImeNotAvailableException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingPage extends BasePage {

    By createAnAcoount = By.linkText("Create an Account");

    By teacherAdmin = By.xpath("//label[@for='acccountTeacther']");

    By nextButton = By.id("linkChooseAcount");

    By selectTitle = By.xpath("//div[@class='selected-option input-select profile-title required']");
    By selectMr = By.xpath("//span[contains(text(),'Mr.')]");

    By firstName = By.id("dwfrm_profile_customer_firstname");
    By lastName = By.id("dwfrm_profile_customer_lastname");

    By email = By.id("dwfrm_profile_customer_email");

    By password = By.id("dwfrm_profile_login_password");

    By mobileNumber = By.id("dwfrm_profile_customer_phone");

    By checkBox = By.id("dwfrm_registration_termsofuseteacher");

    By nextButton2 = By.xpath("//button[contains(text(),'NEXT')]");

    By zipCode = By.id("dwfrm_myschool_schoolzip");

    By searchButton= By.xpath("//div[@class='align-center']//button[@id='button-search']");

    By selecectSchool = By.id("dwfrm_searchschool_schoolvalue");

    By selectSchoolName = By.xpath("//span[text()='scholastic+book+clubs']");

    By next = By.xpath("//button[contains(text(),'NEXT')]");

    By role = By.id("//select[@id='dwfrm_myrole_primaryrole']");
    By teacherGrade = By.xpath("//option[contains(text(),'Teacher (by Grade)')]");
    By grade = By.xpath("//div[contains(text(),'Select Grade')]");
    By studentGrade = By.xpath("//span[contains(text(),'1st Grade')]");

    By numberOfStudents = By.id("dwfrm_myrole_students");
    By next4 = By.xpath("//button[contains(text(),'NEXT')]");
    By preferredReadingLevel = By.xpath("//div[contains(text(),'Select Type')]");
    By guidedReadingLevel = By.xpath("//span[contains(text(),'Guided Reading Level (GRL)')]");
    By continueToSite = By.xpath("//button[contains(text(),'CONTINUE TO SITE')]");
    By buttonUp = By.xpath("//div[@class='notification-tab']//span[@class='notification-chevron fa fa-chevron-up']");
    By classCodeonHomePage = By.xpath("//div[contains(text(),'ZYB3M')]");

    By state = By.id("dwfrm_myschool_accountstates");
    By city = By.id("dwfrm_myschool_schoolcity");
    By selectCity = By.xpath("//span[@id='ui-id-16151']");
    By search = By.id("button-search");

    By signIn = By.linkText("Sign In");
    By frameId = By.id("iframeMyScholastic");
    By emailSignIn = By.id("signin-email-input");
    By continueButton = By.id("signin-email-submit-button");
    By passwordSignIn = By.id("signin-password-input");
    By signInButton = By.id("signin-password-submit-button");
    By close = By.xpath("//body/div[@id='tooltipster-470063']/div[1]/div[1]/div[1]/span[2]");
    By myList = By.linkText("My Lists");
    By recommend = By.xpath("//li[@class='recommend']");
    By searchname = By.id("q");
    By searchButtonName = By.xpath("//button[@type='submit']//i[@class='fa fa-search']");

    By myAccount = By.xpath("//a[@class='user-account toggle-item']");
    By paymentMethods = By.xpath("//a[contains(text(),'Payment Methods')]");



    public void clickOnCreateAcoount(){
        clickThis(createAnAcoount);
    }

    public void clickOnTeacherAdmin(){
        clickThis(teacherAdmin);
    }

    public void clickOnNext1Button () {
        clickThis(nextButton);
    }

    public void selectTitle(){
        clickThis(selectTitle);
        clickThis(selectMr);
    }

    public void enterFirstName(String fName) {
        type(firstName, fName);
    }

    public void enterLastName(String lName){
        type(lastName,lName);
    }

    public void enterEmail(String emailAdd){
        type(email, emailAdd);
    }

    public void enterPassword(String pass){
        type(password,pass);
    }

    public void enterMobNo(String mobNo){
        type(mobileNumber,mobNo);
    }

    public void clickOnCheckBox(){
        clickThis(checkBox);
    }

    public void clickOnNextButton2(){
        clickThis(nextButton2);
    }

    public void enterZipCode(String zip){
        type(zipCode,zip);
    }

    public void clickOnSearch(){
        clickThis(searchButton);
    }

    public void selectSchool(String name) {
        clickThis(selecectSchool);
        type(selecectSchool, "Scholastic+");
        List<WebElement> names = findElementsUsingFluentWait(selectSchoolName);
        for (WebElement element : names) {
            if (name.equalsIgnoreCase(element.getText())) {
                element.click();
                break;
            }

        }
    }

    public void clickOnNext3Button(){
        clickThis(next);
    }

    public void selectRole(String tRole){
        selectFromDropdownUsingVisibleText(role,tRole);
    }

    public void selectGrade(){
        clickThis(grade);
        clickThis(studentGrade);
    }

    public void enterNumberOfStudents(String number){
        clickThis(numberOfStudents);
        type(numberOfStudents,number);
    }

    public void clickOnNext4(){
        clickThis(next4);
    }

    public void selectReadingLevel(){
        clickThis(preferredReadingLevel);
        clickThis(guidedReadingLevel);
    }

    public void clickOnContinueToSite(){
        clickThis(continueToSite);
    }

    public void clickOnHeader(){

        clickThis(buttonUp);

    }

    public String classCodeOnHomePage(){
        return textFromElement(classCodeonHomePage);

    }

    public void selectState(String name){
        selectFromDropdownUsingVisibleText(state, name);
    }

    public void selectCity(){
        clickThis(city);
        clickThis(selectCity);
    }

    public void clickOnSearchButton(){
        clickThis(search);
    }

    public void clickSignIn(){
        clickThis(signIn);
    }

    public void cloceMsg(){
        clickThis(close);
    }

    public void clickMyList(){
        clickThis(myList);
    }

    public void selectRecommend(){
        clickThis(recommend);
    }

    public void searchByName(String name){
        type(searchname,name);

    }

    public void clickSearch(){
        clickThis(searchButtonName);
    }

    public void enterEmailSignIn(String email){
        switchToFrame(frameId);
        type(emailSignIn, email);

    }

    public void clickOnContinue()throws ImeNotAvailableException {
        //switchToFrame(frameId);
        clickThis(continueButton);

    }

    public void enterPasswordSignIn(String pass){
        //switchToFrame(frameId);
        type(passwordSignIn,pass);

    }

    public void clickOnSignInButton(){
       // switchToFrame(frameId);
        clickThis(signInButton);
    }

    public void clickOnMyAcc(){
        clickThis(myAccount);
    }

    public void clickOnPaymentMethods(){
        clickThis(paymentMethods);
    }






}
