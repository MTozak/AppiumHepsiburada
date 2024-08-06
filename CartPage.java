import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    By increaseProductCount = By.xpath("//android.view.View[@content-desc=\'Ürünü Arttır\']/android.widget.Image");
    By finishShopping = By.xpath("//android.widget.Button[@text=\'Alışverişi tamamla\']");
    public CartPage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public void increaseCount() {
        click(increaseProductCount);
    }

    public void finish() {
        click(finishShopping);
    }

    public void finish2() {
        click(finishShopping);
    }


}
