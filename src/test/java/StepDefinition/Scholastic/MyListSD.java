package StepDefinition.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class MyListSD extends BasePage {
    By listedItem= By.xpath("//img[@title='Harry Potter and the Goblet of Fire'");


   public boolean isItemDisplayed(){

      return isElementDisplayed(listedItem);
   }
}
