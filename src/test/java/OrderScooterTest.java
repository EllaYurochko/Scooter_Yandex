import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import pageobject.MainPage;
import pageobject.OrderForm;

public class OrderScooterTest extends BasePageTest {
    @Test
    public void shouldBeOrderScooterOnButtonPageHeaderWithRequiredFieldTest() {
        OrderForm orderPage = new OrderForm(webDriver);
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickOrderButton();
        orderPage.enterOrderName("Мария");
        orderPage.enterOrderLastName("Иванова");
        orderPage.enterOrderAddress("Вавилова д.4 кв.2");
        orderPage.enterMetroStation("Лубянка");
        orderPage.clickMetroStationFull();
        orderPage.enterNumberPhone("79267778522");
        orderPage.clickOrderButtonNext();
        orderPage.enterOrderTime("16.09.2022");
        orderPage.clickOrderTime();
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
        mainPage.clickOrderButton();
        orderPage.enterOrderName("Игорь");
        orderPage.enterOrderLastName("Петров");
        orderPage.enterOrderAddress("Москва");
        orderPage.enterMetroStation("Борисово");
        orderPage.clickMetroStationFull();
        orderPage.enterNumberPhone("11111111111");
        orderPage.clickOrderButtonNext();
        orderPage.enterOrderTime("16.09.2022");
        orderPage.clickOrderTime();
        orderPage.clickOrderRentalPeriod();
        orderPage.enterOrderRentalTwoDay();
        orderPage.clickCheckBoxGreyColorScooter();
        orderPage.enterOrderComment("связываться по номеру +71231235522");
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
        orderPage.enterOrderName("Иван");
        orderPage.enterOrderLastName("Смирнов");
        orderPage.enterOrderAddress("Центральная 7");
        orderPage.enterMetroStation("Полянка");
        orderPage.clickMetroStationFull();
        orderPage.enterNumberPhone("00000000000");
        orderPage.clickOrderButtonNext();
        orderPage.enterOrderTime("16.09.2022");
        orderPage.clickOrderTime();
        orderPage.clickOrderRentalPeriod();
        orderPage.enterOrderRentalTwoDay();
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
        orderPage.enterOrderName("Алексей");
        orderPage.enterOrderLastName("Смит");
        orderPage.enterOrderAddress("Моховая 1");
        orderPage.enterMetroStation("Речной вокзал");
        orderPage.clickMetroStationFull();
        orderPage.enterNumberPhone("12345678899");
        orderPage.clickOrderButtonNext();
        orderPage.enterOrderTime("16.09.2022");
        orderPage.clickOrderTime();
        orderPage.clickOrderRentalPeriod();
        orderPage.enterOrderRentalFourDay();
        orderPage.clickCheckBoxBlackColorScooter();
        orderPage.enterOrderComment("в домофон не звонить");
        orderPage.clickOrderButtonOnOrderPage();
        orderPage.clickOrderConfirmationButton();
        boolean isDisplayed = orderPage.checkOrderConfirmationIsDisplayed();
        Assert.assertTrue("Confirmation is not displayed", isDisplayed);
    }
}
