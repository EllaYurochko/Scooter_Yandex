package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.MainPage;
import pageobjects.OrderForm;

@RunWith(Parameterized.class)

public class OrderScooterTest {
    WebDriver webDriver;

    private final String name;
    private final String lastName;
    private final String address;
    private final String metroStation;
    private final String numberPhone;
    private final String time;
    private final String comment;


    public OrderScooterTest(String name, String lastName, String address, String metroStation, String numberPhone, String time, String comment) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.metroStation = metroStation;
        this.numberPhone = numberPhone;
        this.time = time;
        this.comment = comment;

    }

    @Parameterized.Parameters
    public static Object[][] getOrderData() {
        return new Object[][]{
                {"Элла", "Элла", "ул. Яснополянская, д.7, кв. 98", "Рязанский проспект", "79853967227", "22.06.2023", "захватите, пож., поесть что-нибудь"},
                {"СЕМЕН", "петров-сидоров", "Зеленоград", "Динамо", "79998887766", "13.07.2023", "не,я передумал, не надо мне ваших самокатов"},
                {"АнгелинаАнгелина", "Коломникова", "корпус 2014, кв. 101", "Речной вокзал", "79111111111", "01.01.01", ""},
                {"Яя", "СноваЯ", "Кремль", "Лубянка", "12345678998", "14.06.2023", "захватите, пож., поесть что-нибудь"},
        };
    }


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
        mainPage.clickOrderButtonOnMiddlePage();
        orderPage.enterOrderName(name);
        orderPage.enterOrderLastName(lastName);
        orderPage.enterOrderAddress(address);
        orderPage.enterMetroStation(metroStation);
        orderPage.clickMetroStationFull();
        orderPage.enterNumberPhone(numberPhone);
        orderPage.clickOrderButtonNext();
        orderPage.enterOrderTime(time);
        orderPage.clickOrderRentalPeriod();
        orderPage.enterOrderRentalTwoDay();
        orderPage.clickCheckBoxGreyColorScooter();
        orderPage.enterOrderComment(comment);
        orderPage.clickOrderButtonOnOrderPage();
        orderPage.clickOrderConfirmationButton();
        boolean isDisplayed = orderPage.checkOrderConfirmationIsDisplayed();
        Assert.assertTrue("Confirmation is not displayed", isDisplayed);
    }

//    @Test
//    public void shouldBeOrderScooterOnButtonPageHeaderWithFullFieldTest() {
//        OrderForm orderPage = new OrderForm(webDriver);
//        MainPage mainPage = new MainPage(webDriver);
//        mainPage.open();
//        mainPage.clickButtonCookies();
//        mainPage.clickOrderButton();
//        orderPage.enterOrderName("Иван");
//        orderPage.enterOrderLastName("Тихонов");
//        orderPage.enterOrderAddress("Зеленоград");
//        orderPage.enterMetroStation("Динамо");
//        orderPage.clickMetroStationFull();
//        orderPage.enterNumberPhone("79998887766");
//        orderPage.clickOrderButtonNext();
//        orderPage.enterOrderTime("13.07.2023");
//        orderPage.clickOrderRentalPeriod();
//        orderPage.enterOrderRentalTwoDay();
//        orderPage.clickCheckBoxGreyColorScooter();
//        orderPage.enterOrderComment("захватите, пож., поесть что-нибудь");
//        orderPage.clickOrderButtonOnOrderPage();
//        orderPage.clickOrderConfirmationButton();
//        boolean isDisplayed = orderPage.checkOrderConfirmationIsDisplayed();
//        Assert.assertTrue("Confirmation is not displayed", isDisplayed);
//    }
//
//    @Test
//    public void shouldBeOrderScooterOnMiddlePageButtonWithRequiredFieldTest() {
//        OrderForm orderPage = new OrderForm(webDriver);
//        MainPage mainPage = new MainPage(webDriver);
//        mainPage.open();
//        mainPage.clickButtonCookies();
//        mainPage.clickOrderButtonOnMiddlePage();
//        orderPage.enterOrderName("Ангелина");
//        orderPage.enterOrderLastName("Коломникова");
//        orderPage.enterOrderAddress("Зеленоград, корпус 2014, кв. 101");
//        orderPage.enterMetroStation("Речной вокзал");
//        orderPage.clickMetroStationFull();
//        orderPage.enterNumberPhone("79111111111");
//        orderPage.clickOrderButtonNext();
//        orderPage.enterOrderTime("01.08.2023");
//        orderPage.clickOrderRentalPeriod();
//        orderPage.enterOrderRentalTwoDay();
//        orderPage.enterOrderComment("");
//        orderPage.clickOrderButtonOnOrderPage();
//        orderPage.clickOrderConfirmationButton();
//        boolean isDisplayed = orderPage.checkOrderConfirmationIsDisplayed();
//        Assert.assertTrue("Confirmation is not displayed", isDisplayed);
//    }
//
//    @Test
//    public void shouldBeOrderScooterOnMiddlePageButtonWithFullFieldTest() {
//        OrderForm orderPage = new OrderForm(webDriver);
//        MainPage mainPage = new MainPage(webDriver);
//        mainPage.open();
//        mainPage.clickButtonCookies();
//        mainPage.clickOrderButtonOnMiddlePage();
//        orderPage.enterOrderName("Яя");
//        orderPage.enterOrderLastName("СноваЯ");
//        orderPage.enterOrderAddress("Кремль");
//        orderPage.enterMetroStation("Лубянка");
//        orderPage.clickMetroStationFull();
//        orderPage.enterNumberPhone("12345678991");
//        orderPage.clickOrderButtonNext();
//        orderPage.enterOrderTime("16.06.2023");
//        orderPage.clickOrderRentalPeriod();
//        orderPage.enterOrderRentalFourDay();
//        orderPage.clickCheckBoxBlackColorScooter();
//        orderPage.clickOrderButtonOnOrderPage();
//        orderPage.clickOrderConfirmationButton();
//        boolean isDisplayed = orderPage.checkOrderConfirmationIsDisplayed();
//        Assert.assertTrue("Confirmation is not displayed", isDisplayed);
//    }

    @After
    public void tearDown() {
        // Закрыть браузер
        webDriver.quit();
    }
}
