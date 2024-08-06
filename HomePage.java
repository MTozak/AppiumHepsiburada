import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    By clickSearchBox = By.id("com.pozitron.hepsiburada:id/etSearchBox");
    By clickHomePage = By.id("com.pozitron.hepsiburada:id/menuItemAccountFakeView");
    By writeProductName = By.id("com.pozitron.hepsiburada:id/etSearchBox");
    By selectProductText = By.xpath("//android.widget.TextView[@text='iphone 11']");

    public HomePage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }


    public void clickHomePage() {
        click(clickHomePage);
    }

    public void clickSearchBox() {
        click(clickSearchBox);
    }

    public void writeProductName(String phoneName){
        write(writeProductName, phoneName);
    }
    // writeProductName('iphone 11');

    public void selectProductText() {
        click(selectProductText);
    }


}
