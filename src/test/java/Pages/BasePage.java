package Pages;

import DriverWrapper.Web;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class BasePage {

    Alert alert;

    public WebElement findElementUsingFluentWait(final By locator) {
        Wait fWait = new FluentWait(Web.getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoAlertPresentException.class)
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class)
                .withMessage("Element is not found after 30 seconds of wait");

        WebElement element = (WebElement) fWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
        return element;
    }

    public List<WebElement> findElementsUsingFluentWait(By locator) {
        Wait fWait = new FluentWait(Web.getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoAlertPresentException.class)
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementClickInterceptedException.class)
                .withMessage("Element is not found after 30 seconds of wait");

        List <WebElement> elements = (List<WebElement>) fWait.until(new Function<WebDriver, List<WebElement>>() {
            public List<WebElement> apply(WebDriver driver) {
                return driver.findElements(locator);
            }
        });
        return elements;

    }

    public void type(By locator, String data) {
        findElementUsingFluentWait(locator).sendKeys(data);
    }

    public void clickThis(By locator) {
        findElementUsingFluentWait(locator).click();
    }

    public boolean isElementDisplayed(By locator) {
        return findElementUsingFluentWait(locator).isDisplayed();
    }

    /**
     * select any value form any dropdown (locator, String)
     *
     * WebElement date = driver.findElement(By.id("month"));
     * Select dateDropdown = new Select(date);
     * dateDropdown.selectByVisibleText("Feb");
     *
     */
    public void selectFromDropdownUsingVisibleText(By locator, String data) {
        WebElement dropdownElement = findElementUsingFluentWait(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(data);
    }

    public String getWebpageTitle() {
        return Web.getDriver().getTitle();
    }

    public void scrollDown(int pixelsDown) {
        // String pixelsDownStr = String.valueOf(pixelsDown);
        JavascriptExecutor js = (JavascriptExecutor)Web.getDriver();
        js.executeScript("scrollBy(0,"+pixelsDown+");");
    }

    public Set<String> getAllWindowHandles() {
        return Web.getDriver().getWindowHandles();
    }

    public String getCurrentWindowHandle() {
        return Web.getDriver().getWindowHandle();
    }

    public void switchToNewWindow(String handle) {
        Web.getDriver().switchTo().window(handle);
    }

    // method to switch to a frame using id
    public void switchToFrame(String frameId) {
        Web.getDriver().switchTo().frame(frameId);
    }

    // method to switch to a frame using id
    public void switchToFrame(By locator) {
        WebElement myFrame = findElementUsingFluentWait(locator);
        Web.getDriver().switchTo().frame(myFrame);
    }

    public void switchToAlert() {
        alert = Web.getDriver().switchTo().alert();
    }

    public void clickPositiveOnAlert() {
        alert.accept();
    }

    public void clickNegativeOnAlert() {
        alert.dismiss();
    }

    public void typeOnAlert(String data) {
        alert.sendKeys(data);
    }

    public void moveToElement(By locator){
        Actions act = new Actions(Web.getDriver());
        act.moveToElement(findElementUsingFluentWait(locator)).build().perform();

    }

    public String textFromElement(By locator){
        return findElementUsingFluentWait(locator).getText();
    }



    public void clearText(By locator){
        findElementUsingFluentWait(locator).clear();
    }


}
