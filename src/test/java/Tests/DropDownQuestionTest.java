package Tests;
import static org.hamcrest.CoreMatchers.is;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.MainPage;

public class DropDownQuestionTest {

    WebDriver webDriver;
    @Before
    public void setupAll() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        WebDriverManager.firefoxdriver().setup();
        webDriver = new FirefoxDriver();
    }

    @Test
    public void shouldBeOpenDropDownOneQuestionTest() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickButtonCookies();
        mainPage.clickDropDownOneQuestion();
        String textOneDropDown = mainPage.getTextDropDownOneQuestion();
        MatcherAssert.assertThat("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", is(textOneDropDown));
    }

    @Test
    public void shouldBeOpenDropDownTwoQuestionTest() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickButtonCookies();
        mainPage.clickDropDownTwoQuestion();
        String textTwoDropDown = mainPage.getTextDropDownTwoQuestion();
        MatcherAssert.assertThat("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", is(textTwoDropDown));
    }

    @Test
    public void shouldBeOpenDropDownThreeQuestionTest() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickButtonCookies();
        mainPage.clickDropDownThreeQuestion();
        String textThreeDropDown = mainPage.getTextDropDownThreeQuestion();
        MatcherAssert.assertThat("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", is(textThreeDropDown));
    }

    @Test
    public void shouldBeOpenDropDownFourQuestionTest() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickButtonCookies();
        mainPage.clickDropDownFourQuestion();
        String textFourDropDown = mainPage.getTextDropDownFourQuestion();
        MatcherAssert.assertThat("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", is(textFourDropDown));
    }

    @Test
    public void shouldBeOpenDropDownFiveQuestionTest() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickButtonCookies();
        mainPage.clickDropDownFiveQuestion();
        String textFiveDropDown = mainPage.getTextDropDownFiveQuestion();
        MatcherAssert.assertThat("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", is(textFiveDropDown));
    }

    @Test
    public void shouldBeOpenDropDownSixQuestionTest() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickButtonCookies();
        mainPage.clickDropDownSixQuestion();
        String textSixDropDown = mainPage.getTextDropDownSixQuestion();
        MatcherAssert.assertThat("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", is(textSixDropDown));
    }

    @Test
    public void shouldBeOpenDropDownSevenQuestionTest() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickButtonCookies();
        mainPage.clickDropDownSevenQuestion();
        String textSevenDropDown = mainPage.getTextDropDownSevenQuestion();
        MatcherAssert.assertThat("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", is(textSevenDropDown));
    }

    @Test
    public void shouldBeOpenDropDownEightQuestionTest() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickButtonCookies();
        mainPage.clickDropDownEightQuestion();
        String textEightDropDown = mainPage.getTextDropDownEightQuestion();
        MatcherAssert.assertThat("Да, обязательно. Всем самокатов! И Москве, и Московской области.", is(textEightDropDown));
    }

    @After
    public void tearDown() {
        // Закрыть браузер
        webDriver.quit();
    }
}