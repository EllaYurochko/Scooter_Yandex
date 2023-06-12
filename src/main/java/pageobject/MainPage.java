package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    // кнопка куки
    private final By cookieButton = By.xpath(".//button[@id='rcc-confirm-button']");

    // кнопка Заказать вверхк экрана
    private final By orderButtonHeader = By.xpath(".//button[@class='Button_Button__ra12g']");

    // Кнопка заказать внизу формы
    private final By orderButtonTwo = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    // поле Вопрос в аккордеоне
    private final By accordionQuestion = By.xpath(".//div[@id='accordion__heading-0']");

    // поле Ответ в аккордеоне
    private final By accordionAnswer = By.xpath(".//div[@id='accordion__panel-0']");


    public boolean checkOrderButtonHeaderEnabled() {
        return driver.findElement(orderButtonHeader).isEnabled();
    }

    public void clickCookieButton(){
        driver.findElement(cookieButton).click();
    }

    public void clickAccordionQuestion() {
        driver.findElement(accordionQuestion).click();
    }

    public void clickAccordionAnswer() {
        driver.findElement(accordionAnswer).click();
    }

    public boolean checkOrderButtonTwoEnabled() {
        return driver.findElement(orderButtonTwo).isEnabled();
    }

    public void clickOrderButtonHeader() {
        driver.findElement(orderButtonHeader).click();
        new OrderForm(driver);
    }

}
