import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressPage extends BasePage{

    By addAddress = By.xpath("//android.widget.TextView[@text=\'Yeni adres ekle\']");

    By clickName = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.EditText");
    By writeName = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.EditText");

    By clickSurname = By.xpath("//android.webkit.WebView[@text=\"Ödeme\"]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText");

    By writeSurname = By.xpath("//android.webkit.WebView[@text=\"Ödeme\"]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText");

    By clickPhone = By.xpath("//android.widget.EditText[@text=\'+90\']");

    By numberText = By.xpath("//android.widget.EditText[@text=\'+90\']");

    By clickHome = By.xpath("//android.widget.RadioButton[@text=\'Ev\']");

    By clickCity = By.xpath("//android.webkit.WebView[@text='Ödeme']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[7]/android.view.View/android.view.View/android.view.View/android.widget.Image");

    By selectCity = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[8]/android.view.View/android.widget.EditText");

    By clickTown = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[8]/android.view.View/android.view.View/android.view.View/android.widget.Image");

    By selectTown = By.xpath("//android.widget.TextView[@text=\'ATAŞEHİR\']");

    By clickNeighbourhood = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[7]/android.view.View/android.view.View/android.view.View/android.widget.Image");

    By selectNeighbourhood = By.xpath("//android.widget.TextView[@text=\'ATATÜRK\']");

    By addressBox = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View[1]/android.widget.EditText");

    By writeAddress = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View[1]/android.widget.EditText");

    By clickSpace = By.xpath("//android.widget.TextView[@text=\'Adres\']");

    By addressName = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[6]/android.view.View/android.widget.EditText");

    By writeAddressName = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[6]/android.view.View/android.widget.EditText");

    By selectBill = By.xpath("//android.widget.CheckBox");

    By clickIdentity = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[7]/android.view.View/android.widget.EditText");

    By writeIdentity = By.xpath("//android.webkit.WebView[@text=\'Ödeme\']/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[7]/android.view.View/android.widget.EditText");

    By saveAddress = By.xpath("//android.view.ViewGroup[@resource-id=\'com.pozitron.hepsiburada:id/content_wrapper\']/android.widget.LinearLayout");

    public AddressPage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public void addAddress() {

        click(addAddress);
    }

    public void clickName() {

        click(clickName);
    }

    public void writeName(String name) {

        write(writeName, name);
    }

    public void clickSurname() {

        click(clickSurname);
    }

    public void writeSurname(String surname) {

        write(writeSurname, surname);
    }
    public void clickPhone() {
        click(clickPhone);
    }

    public void numberTextWrite(Long number){
        WebElement numberTextWrite = driver.findElement(numberText);
        numberTextWrite.click();
        driver.getKeyboard().pressKey("5325529661");
    }

    public void clickHome() {
        click(clickHome);
    }

    public void clickCity() {
        click(clickCity);
    }

    public void swipePage(Point start, Point end, Duration duration){
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(duration,
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
    }

    public void swipePage1(Point start1, Point end1, Duration duration1){
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start1.getX(), start1.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(duration1,
                PointerInput.Origin.viewport(), end1.getX(), end1.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
    }

    public void swipePage2(Point start2, Point end2, Duration duration2){
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start2.getX(), start2.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(duration2,
                PointerInput.Origin.viewport(), end2.getX(), end2.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
    }




    public void selectCity() {
        click(selectCity);
    }


    public void clickTown() {
        click(clickTown);
    }

    public void selectTown() {
        click(selectTown);
    }

    public void clickNeighbourhood() {
        click(clickNeighbourhood);
    }

    public void selectNeighbourhood() {
        click(selectNeighbourhood);
    }


    public void addressBox() {
        click(addressBox);
    }

    public void writeAddress(String address) {
        write(writeAddress, address);

    }

    public void clickSpace(){
        click(clickSpace);
    }

    public void addressName() {
        click(addressName);
    }

    public void writeAddressName(String addressName) {
        write(writeAddressName, addressName);

    }

    public void selectBill() {
        click(selectBill);
    }

    public void clickIdentity() {
        click(clickIdentity);
    }

    public void writeIdentity(String identity) {
        write(writeIdentity, identity);

    }

    public void saveAddress() {
        click(saveAddress);
    }


}
