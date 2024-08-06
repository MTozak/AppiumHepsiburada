import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CardPage  extends BasePage{

    By cardInformation = By.xpath("//android.widget.TextView[@text=\'Kart bilgilerini gir\']");

    By clickCardNumber = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");

    By writeCardNumber = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");

    By clickCardYear = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText");

    By writeCardYear = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText");

    By clickCvv = By.xpath("//android.view.View[@text=\'CVC / CVV\']");

    By writeCvv = By.xpath("//android.view.View[@text=\'CVC / CVV\']");

    By clickNameSurname = By.xpath("//android.view.View[@text=\'İsim Soyisim\']");

    By writeNameSurname = By.xpath("//android.view.View[@text=\'İsim Soyisim\']");

    By clickContinueButton = By.xpath("//android.widget.Button[@text=\'Devam et\']");



    public CardPage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }
    public void cardInformation() {
        click(cardInformation);
    }

    public void clickCardNumber() {
        click(clickCardNumber);
    }

    public void writeCardNumber(String cardNumber) {
        write(writeCardNumber, cardNumber);

    }

    public void clickCardYear() {
        click(clickCardYear);
    }

    public void writeCardYear(String cardYear) {
        write(writeCardYear, cardYear);

    }

    public void clickCvv() {
        click(clickCvv);
    }

    public void writeCvv(String cvv) {
        write(writeCvv, cvv);

    }

    public void clickNameSurname() {
        click(clickNameSurname);
    }

    public void writeNameSurname(String nameSurname) {
        write(writeNameSurname, nameSurname);

    }

    public void clickContinueButton() {
        click(clickContinueButton);
    }
}
