package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class RecommendPage extends BasePage {

    By quickLook = By.xpath("//body/div[@id='wrapper']/div[@id='main']/div[3]/div[1]/div[2]/div[4]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[2]");
    By recommended = By.xpath("//i[@class='fa fa-2x fa-star']");
    By closeButton= By.xpath("//span[@class='tooltipster-close ']");
    By closeImageBox = By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-closethick']");




    public void clickOnQuickLook(){
        clickThis(quickLook);
    }

    public void clickOnRecommend(){
        clickThis(recommended);
    }

    public void closeMsgBox(){
        clickThis(closeButton);
    }

    public void closeImageBox(){
        clickThis(closeImageBox);
    }
}
