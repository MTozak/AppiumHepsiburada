import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class ProductsPage extends BasePage{

    By productsOptions = By.xpath("//android.widget.TextView[@text='Kapasite']");
    By selectProduct = By.xpath("(//android.view.ViewGroup[@resource-id='com.pozitron.hepsiburada:id/clProductBoxBottom\'])");

    public ProductsPage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(productsOptions);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<AndroidElement> getAllProducts(){
        return findAll(selectProduct);
    }
}


