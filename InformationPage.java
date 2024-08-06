import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InformationPage extends BasePage {

    By continueWithoutMembership = By.xpath("//android.widget.TextView[@text=\'Üye olmadan devam et\']");
    By clickEmail = By.xpath("//android.widget.EditText");
    By writeEmail = By.xpath("//android.widget.EditText");
    By continueButton = By.xpath("//android.widget.Button[@text=\'Devam et\']");



    public InformationPage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public void continueWithoutMembership() {

        click(continueWithoutMembership);
    }

    public void clickEmail() {

        click(clickEmail);
    }


    public void writeEmail(String email) {

        write(writeEmail, email);
    }

    public void continueButton() {

        click(continueButton);
    }






}
