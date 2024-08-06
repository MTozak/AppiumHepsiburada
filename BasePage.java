import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.util.List;

public class BasePage {
    protected AndroidDriver<AndroidElement> driver;

    public BasePage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
    }

    public AndroidElement find(By locator){
        return driver.findElement(locator);
    }


    public List<AndroidElement> findAll(By locator){
        return driver.findElements(locator);
    }

    public void click(By locator){
        find(locator).click();
    }

    public void write(By locator, String text){
        find(locator).sendKeys(text);
    }


    public Boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

}
