package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyAccountPage extends BasePage {

    By classCode = By.xpath("//span[text()='ZYB3M']");

    By teacherName = By.xpath("//body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/span[1]");

    By schoolAddress = By.xpath("//body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/span[1]");

    By addACard = By.xpath("//a[text()='Add a Card']");

    By cardNo = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_number_d0fxebxmkzws");

    By selectMonth = By.xpath("//div[@class='form-row month label-removed required']");
    By monthText = By.xpath("//div[@class='selection-list visible']/div/ul/li/span[starts-with(text(),'')]");
    By selectExpiredYear = By.xpath("//div[@class='form-row year label-removed required']");
    By yeartext = By.xpath("//div[@class='selection-list visible']/div/ul/li/span[starts-with(text(),'')]");

    By securityCode = By.id("dwfrm_billing_paymentMethods_creditCard_cvn");
    By firstName = By.id("dwfrm_billing_billingAddress_addressFields_firstName");
    By lastName = By.id("dwfrm_billing_billingAddress_addressFields_lastName");

    By address1 = By.id("dwfrm_billing_billingAddress_addressFields_address1");
    By address2 = By.id("dwfrm_billing_billingAddress_addressFields_address2");
    By zipCode = By.id("dwfrm_billing_billingAddress_addressFields_postal");

    By cellNo = By.id("dwfrm_billing_billingAddress_addressFields_phone");

    By save = By.id("applyBtn");



    public String getClassCodeFromMyacc(){
        return textFromElement(classCode);
    }

    public String getTeacherName(){
        return textFromElement(teacherName);

    }

    public String getSchoolAddress(){
        return textFromElement(schoolAddress);
    }

    public void clickOnAddACard(){
        clickThis(addACard);
    }

    public void enterCardNo(String card){
        type(cardNo,card);
    }


    public void selectMonth(String month) {
        scrollDown(200);
        clickThis(selectMonth);
        List<WebElement> months = findElementsUsingFluentWait(monthText);
        for (WebElement exMontn: months){
            if (month.equals(exMontn.getText())){
                exMontn.click();
            }
        }
    }

    public void electYear(String year){
        clickThis(selectExpiredYear);
        List<WebElement> years = findElementsUsingFluentWait(yeartext);

        for (WebElement exYear : years){
            if (year.equals(exYear.getText())){
                exYear.click();
            }
        }
    }

    public void enterSecurityCode(String code){

        scrollDown(200);
        type(securityCode,code);
    }

    public void enterFirstName(String name){
        type(firstName,name);
    }

    public void enterLastName(String name){
        type(lastName,name);
    }
    public void enterAdd1(String add){
        type(address1, add);

    }
    public void enterAdd2(String add){
        type(address2, add);

    }

    public void enterZipCode(String zip){
        type(zipCode,zip);
    }

    public void enterCell(String cell){
        type(cellNo,cell);
    }

    public void clickSave(){
        clickThis(save);
    }





}
