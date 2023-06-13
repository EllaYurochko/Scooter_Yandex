package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.MainPage;
import pageobjects.OrderForm;

public class OrderScooterTest {
    WebDriver webDriver;

    @Before
    public void setupAll() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        WebDriverManager.firefoxdriver().setup();
        webDriver = new FirefoxDriver();
    }

    @Test
    public void shouldBeOrderScooterOnButtonPageHeaderWithRequiredFieldTest() {
        OrderForm orderPage = new OrderForm(webDriver);
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickButtonCookies();
        mainPage.clickOrderButton();
        orderPage.enterOrderName("Элла");
        orderPage.enterOrderLastName("Элла");
        orderPage.enterOrderAddress("ул. Яснополянская, д.7, кв. 98");
        orderPage.enterMetroStation("Рязанский проспект");
        orderPage.clickMetroStationFull();
        orderPage.enterNumberPhone("79853967227");
        orderPage.clickOrderButtonNext();
        orderPage.enterOrderTime("22.06.2023");
        orderPage.clickOrderRentalPeriod();
        orderPage.enterOrderRentalFourDay();
        orderPage.clickOrderButtonOnOrderPage();
        orderPage.clickOrderConfirmationButton();
        boolean isDisplayed = orderPage.checkOrderConfirmationIsDisplayed();
        Assert.assertTrue("Confirmation is not displayed", isDisplayed);
    }

    @Test
    public void shouldBeOrderScooterOnButtonPageHeaderWithFullFieldTest() {
        OrderForm orderPage = new OrderForm(webDriver);
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickButtonCookies();
        mainPage.clickOrderButton();
        orderPage.enterOrderName("Иван");
        orderPage.enterOrderLastName("Тихонов");
        orderPage.enterOrderAddress("Зеленоград");
        orderPage.enterMetroStation("Динамо");
        orderPage.clickMetroStationFull();
        orderPage.enterNumberPhone("79998887766");
        orderPage.clickOrderButtonNext();
        orderPage.enterOrderTime("13.07.2023");
        orderPage.clickOrderRentalPeriod();
        orderPage.enterOrderRentalTwoDay();
        orderPage.clickCheckBoxGreyColorScooter();
        orderPage.enterOrderComment("захватите, пож., поесть что-нибудь");
        orderPage.clickOrderButtonOnOrderPage();
        orderPage.clickOrderConfirmationButton();
        boolean isDisplayed = orderPage.checkOrderConfirmationIsDisplayed();
        Assert.assertTrue("Confirmation is not displayed", isDisplayed);
    }

    @Test
    public void shouldBeOrderScooterOnMiddlePageButtonWithRequiredFieldTest() {
        OrderForm orderPage = new OrderForm(webDriver);
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickButtonCookies();
        mainPage.clickOrderButtonOnMiddlePage();
        orderPage.enterOrderName("Ангелина");
        orderPage.enterOrderLastName("Коломникова");
        orderPage.enterOrderAddress("Зеленоград, корпус 2014, кв. 101");
        orderPage.enterMetroStation("Речной вокзал");
        orderPage.clickMetroStationFull();
        orderPage.enterNumberPhone("79111111111");
        orderPage.clickOrderButtonNext();
        orderPage.enterOrderTime("01.08.2023");
        orderPage.clickOrderRentalPeriod();
        orderPage.enterOrderRentalTwoDay();
        orderPage.enterOrderComment("");
        orderPage.clickOrderButtonOnOrderPage();
        orderPage.clickOrderConfirmationButton();
        boolean isDisplayed = orderPage.checkOrderConfirmationIsDisplayed();
        Assert.assertTrue("Confirmation is not displayed", isDisplayed);
    }

    @Test
    public void shouldBeOrderScooterOnMiddlePageButtonWithFullFieldTest() {
        OrderForm orderPage = new OrderForm(webDriver);
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickButtonCookies();
        mainPage.clickOrderButtonOnMiddlePage();
        orderPage.enterOrderName("Яя");
        orderPage.enterOrderLastName("СноваЯ");
        orderPage.enterOrderAddress("Кремль");
        orderPage.enterMetroStation("Лубянка");
        orderPage.clickMetroStationFull();
        orderPage.enterNumberPhone("12345678991");
        orderPage.clickOrderButtonNext();
        orderPage.enterOrderTime("16.06.2023");
        orderPage.clickOrderRentalPeriod();
        orderPage.enterOrderRentalFourDay();
        orderPage.clickCheckBoxBlackColorScooter();
        orderPage.clickOrderButtonOnOrderPage();
        orderPage.clickOrderConfirmationButton();
        boolean isDisplayed = orderPage.checkOrderConfirmationIsDisplayed();
        Assert.assertTrue("Confirmation is not displayed", isDisplayed);
    }

    @After
    public void tearDown() {
        // Закрыть браузер
        webDriver.quit();
    }
}
