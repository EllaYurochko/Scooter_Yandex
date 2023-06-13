package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    // локатор кнопки "Заказать" в заголовке главной страницы
    private By orderButton = By.xpath("//button[@class='Button_Button__ra12g']");

    //локатор кнопки "Заказать" в середине главной страницы
    private By orderButtonOnMiddlePage = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //локатор выпадающего списка вопроса "Сколько это стоит и как оплатить?"
    private By dropDownOneQuestion = By.xpath("(//div[@class='accordion__heading'])[1]");

    //локатор текста в первом выпадающем списке
    private By textDropDownOneQuestion = By.xpath("//*[@id='accordion__panel-0']/p");

    //локатор выпадающего списка вопроса "Хочу сразу несколько самокатов! Так можно?"
    private By dropDownTwoQuestion = By.xpath("(//div[@class='accordion__heading'])[2]");

    //локатор текста во втором выпадающем списке
    private By textDropDownTwoQuestion = By.xpath("//*[@id='accordion__panel-1']/p");

    //локатор выпадающего списка вопроса "Как рассчитывается время аренды?"
    private By dropDownThreeQuestion = By.xpath("(//div[@class='accordion__heading'])[3]");

    //локатор текста в третьем выпадающем списке
    private By textDropDownThreeQuestion = By.xpath("//*[@id='accordion__panel-2']/p");

    //локатор выпадающего списка вопроса "Можно ли заказать самокат прямо на сегодня?"
    private By dropDownFourQuestion = By.xpath("(//div[@class='accordion__heading'])[4]");

    //локатор текста в четвертом выпадающем списке
    private By textDropDownFourQuestion = By.xpath("//*[@id='accordion__panel-3']/p");

    //локатор выпадающего списка вопроса "Можно ли продлить заказ или вернуть самокат раньше?"
    private By dropDownFiveQuestion = By.xpath("(//div[@class='accordion__heading'])[5]");

    //локатор текста в пятом выпадающем списке
    private By textDropDownFiveQuestion = By.xpath("//*[@id='accordion__panel-4']/p");

    //локатор выпадающего списка вопроса "Вы привозите зарядку вместе с самокатом?"
    private By dropDownSixQuestion = By.xpath("(//div[@class='accordion__heading'])[6]");

    //локатор текста в шестом выпадающем списке
    private By textDropDownSixQuestion = By.xpath("//*[@id='accordion__panel-5']/p");

    //локатор выпадающего списка вопроса "Можно ли отменить заказ?"
    private By dropDownSevenQuestion = By.xpath("(//div[@class='accordion__heading'])[7]");

    //локатор текста в седьмом выпадающем списке
    private By textDropDownSevenQuestion = By.xpath("//*[@id='accordion__panel-6']/p");

    //локатор выпадающего списка вопроса "Я жизу за МКАДом, привезёте?"
    private By dropDownEightQuestion = By.xpath("(//div[@class='accordion__heading'])[8]");

    //локатор текста в восьмом выпадающем списке
    private By textDropDownEightuestion = By.xpath("//*[@id='accordion__panel-7']/p");

    // локатор кнопки куков "да все привыкли"
    private By buttonCookies = By.id("rcc-confirm-button");

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void open() {
        webDriver.get("https://qa-scooter.praktikum-services.ru/");
    }

    public void clickOrderButton() {
        webDriver.findElement(orderButton).click();
    }

    public void clickOrderButtonOnMiddlePage() {
        webDriver.findElement(orderButtonOnMiddlePage).click();
    }

    public void clickDropDownOneQuestion() {
        webDriver.findElement(dropDownOneQuestion).click();
    }

    public String getTextDropDownOneQuestion() {
        return webDriver.findElement(textDropDownOneQuestion).getText();
    }

    public void clickDropDownTwoQuestion() {
        webDriver.findElement(dropDownTwoQuestion).click();
    }

    public String getTextDropDownTwoQuestion() {
        return webDriver.findElement(textDropDownTwoQuestion).getText();
    }

    public void clickDropDownThreeQuestion() {
        webDriver.findElement(dropDownThreeQuestion).click();
    }

    public String getTextDropDownThreeQuestion() {
        return webDriver.findElement(textDropDownThreeQuestion).getText();
    }

    public void clickDropDownFourQuestion() {
        webDriver.findElement(dropDownFourQuestion).click();
    }

    public String getTextDropDownFourQuestion() {
        return webDriver.findElement(textDropDownFourQuestion).getText();
    }

    public void clickDropDownFiveQuestion() {
        webDriver.findElement(dropDownFiveQuestion).click();
    }

    public String getTextDropDownFiveQuestion() {
        return webDriver.findElement(textDropDownFiveQuestion).getText();
    }

    public void clickDropDownSixQuestion() {
        webDriver.findElement(dropDownSixQuestion).click();
    }

    public String getTextDropDownSixQuestion() {
        return webDriver.findElement(textDropDownSixQuestion).getText();
    }

    public void clickDropDownSevenQuestion() {
        webDriver.findElement(dropDownSevenQuestion).click();
    }

    public String getTextDropDownSevenQuestion() {
        return webDriver.findElement(textDropDownSevenQuestion).getText();
    }

    public void clickDropDownEightQuestion() {
        webDriver.findElement(dropDownEightQuestion).click();
    }

    public String getTextDropDownEightQuestion() {
        return webDriver.findElement(textDropDownEightuestion).getText();
    }

    public void clickButtonCookies() {
        webDriver.findElement(buttonCookies).click();
    }
}