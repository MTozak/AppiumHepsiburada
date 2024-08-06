import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MainTest extends Hepsiburada {

    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;
    InformationPage informationPage;
    AddressPage addressPage;
    CardPage cardPage;

    @Test
    @Order(1)
    public void searchProduct() throws InterruptedException {
        homePage = new HomePage(driver);

        Thread.sleep(10000);
        homePage.clickHomePage();
        Thread.sleep(6000);
        homePage.clickSearchBox();
        homePage.writeProductName("iphone 11");
        homePage.selectProductText();
    }

    @Test
    @Order(2)
    public void selectProduct() throws InterruptedException {
        productsPage = new ProductsPage(driver);

        Thread.sleep(10000);
        productsPage.selectProduct(0);
    }

    @Test
    @Order(3)
    public void addProductToCart() throws InterruptedException{
        productDetailPage = new ProductDetailPage(driver);

        Thread.sleep(6000);
        productDetailPage.addToCart();
        Thread.sleep(10000);
        productDetailPage.goToCart();
    }

    @Test
    @Order(4)
    public void goToCart() throws InterruptedException {
        cartPage = new CartPage(driver);

        Thread.sleep(12000);
        cartPage.increaseCount();
        cartPage.finish();
    }

    @Test
    @Order(5)
    public void continueWithoutMembership() throws InterruptedException {
        informationPage = new InformationPage(driver);

        Thread.sleep(12000);
        informationPage.continueWithoutMembership();
        Thread.sleep(10000);
        informationPage.clickEmail();
        Thread.sleep(10000);
        informationPage.writeEmail("test38@v.co");
        informationPage.continueButton();
    }

    @Test
    @Order(6)
    public void finishShopping() throws InterruptedException {
        Thread.sleep(10000);
        cartPage = new CartPage(driver);
        cartPage.finish2();
    }

    @Test
    @Order(7)
    public void addAddress() throws InterruptedException {
        addressPage = new AddressPage(driver);

        Thread.sleep(12000);
        addressPage.addAddress();
        Thread.sleep(6000);
        addressPage.clickName();
        Thread.sleep(6000);
        addressPage.writeName("test");
        Thread.sleep(6000);
        addressPage.clickSurname();
        Thread.sleep(6000);
        addressPage.writeSurname("test1");
        Thread.sleep(6000);
        addressPage.clickPhone();
        Thread.sleep(6000);
        addressPage.numberTextWrite(Long.parseLong("5325529661"));
        Thread.sleep(6000);
        addressPage.clickHome();
        Thread.sleep(6000);
        Point start = new Point(591, 2492);
        Point end = new Point(638, 615);
        Duration duration = Duration.ofMillis(1000);
        addressPage.swipePage(start, end, duration);
        addressPage.clickCity();
        Thread.sleep(6000);
        addressPage.selectCity();
        Thread.sleep(6000);
        addressPage.clickTown();
        Thread.sleep(6000);
        addressPage.selectTown();
        Thread.sleep(6000);

        Point start1 = new Point(591, 2492);
        Point end1 = new Point(638, 615);
        Duration duration1 = Duration.ofMillis(1000);
        addressPage.swipePage1(start1, end1, duration1);

        addressPage.clickNeighbourhood();
        Thread.sleep(6000);
        addressPage.selectNeighbourhood();
        Thread.sleep(6000);

        Point start2 = new Point(591, 2492);
        Point end2 = new Point(638, 615);
        Duration duration2 = Duration.ofMillis(1000);
        addressPage.swipePage1(start2, end2, duration2);

        addressPage.addressBox();
        Thread.sleep(10000);
        addressPage.writeAddress("iQuality mah. Edirne cad. No:22 Daire:3");
        Thread.sleep(10000);
        addressPage.clickSpace();
        addressPage.addressName();
        Thread.sleep(10000);
        addressPage.writeAddressName("Ev");
        Thread.sleep(10000);
        addressPage.clickIdentity();
        Thread.sleep(10000);
        addressPage.writeIdentity("57499229894");
        Thread.sleep(10000);
        addressPage.saveAddress();
    }

    @Test
    @Order(8)
    public void addCard() throws InterruptedException {
        cardPage = new CardPage(driver);

        Thread.sleep(10000);
        cardPage.cardInformation();
        Thread.sleep(10000);
        cardPage.clickCardNumber();
        Thread.sleep(10000);
        cardPage.writeCardNumber("4355084355084358");
        Thread.sleep(10000);
        cardPage.clickCardYear();
        Thread.sleep(10000);
        cardPage.writeCardYear("1226");
        Thread.sleep(10000);
        cardPage.clickCvv();
        Thread.sleep(10000);
        cardPage.writeCvv("000");
        Thread.sleep(10000);
        cardPage.clickNameSurname();
        Thread.sleep(10000);
        cardPage.writeNameSurname("Test Test1");
        Thread.sleep(10000);
        cardPage.clickContinueButton();
    }
}
