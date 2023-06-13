package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class OrderForm {

    private final WebDriver webDriver;
    //локатор поля ввода "Имя" на странице заказа
    private By orderNameField = By.xpath("//input[@placeholder='* Имя']");

    //локатор поля ввода "Фамилия" на странице заказа
    private By orderLastNameField = By.xpath("//input[@placeholder='* Фамилия']");

    //локатор поля "Адрес: куда привезти заказ" на странице заказа
    private By orderAddressField = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");

    //локатор поля ввода "Станция метро" на странице заказа
    private By orderMetroStationField = By.className("select-search__input");

    // локатор выпадающего списка метро на странице заказа
    private By orderMetroStationFieldFull = By.xpath("//*[@class='select-search__select']");

    //локатор поля ввода "Телефон: на него позвонит курьер" на странице заказа
    private By orderNumberPhoneField = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");

    //локатор кнопки "Далее" на странице заказа
    private By orderButtonNext = By.xpath("//button[text()='Далее']");

    // локатор поля ввода "Когда привезти самокат" на странице заказа
    private By orderTime = By.xpath("//input[@placeholder='* Когда привезти самокат']");

    //локатор для выбора даты в выпадающем календаре на странице заказа
    private By orderTimeFull = By.xpath("//div[@class='react-datepicker__day react-datepicker__day--016 react-datepicker__day--selected']");

    // локатор для поля "Срок аренды" на странице заказа
    private By orderRentalPeriod = By.xpath("//div[@class='Dropdown-placeholder']");

    //локатор выпадающего списка в поле "Срок аренды" (двое суток) на странице заказа
    private By orderRentalTwoDay = By.xpath("//div[@class='Dropdown-option'] [2]");

    //локатор выпадающего списка в поле "Срок аренды" (четверо суток) на странице заказа
    private By orderRentalFourDay = By.xpath("//div[@class='Dropdown-option'] [4]");

    // локатор чекбокса "Серая безысходность" на странице заказа
    private By checkBoxGreyColorScooter = By.xpath("//input[@id='grey']");

    // локатор чекбокса "Черный жемчуг" на странице заказа
    private By checkBoxBlackColorScooter = By.xpath("//input[@id='black']");

    // локатор кнопки "Заказать" на странице заказа
    private By orderButtonOnOrderPage = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    // локатор кнопки "Да" на странице подтверждения заказа
    private By orderConfirmationButton = By.xpath("//button[text()='Да']");

    // локатор подтверждения заказа
    private By orderConfirmation = By.xpath("//div[text()='Заказ оформлен']");

    //локатор поля ввода "Комментарий для курьера" на странице заказа
    private By orderCommentField = By.xpath("//input[@placeholder='Комментарий для курьера']");

    public OrderForm(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void enterOrderName(String text) {
        webDriver.findElement(orderNameField).sendKeys(text);
    }

    public void enterOrderLastName(String text) {
        webDriver.findElement(orderLastNameField).sendKeys(text);
    }

    public void enterOrderAddress(String text) {
        webDriver.findElement(orderAddressField).sendKeys(text);
    }

    public void enterMetroStation(String text) {
        webDriver.findElement(orderMetroStationField).sendKeys(text);
    }

    public void clickMetroStationFull() {
        webDriver.findElement(orderMetroStationFieldFull).click();
    }

    public void enterNumberPhone(String text) {
        webDriver.findElement(orderNumberPhoneField).sendKeys(text);
    }

    public void clickOrderButtonNext() {
        webDriver.findElement(orderButtonNext).click();
    }

    public void enterOrderTime(String text) {
        webDriver.findElement(orderTime).sendKeys(text, Keys.ENTER);
    }

    public void clickOrderTime() {
        webDriver.findElement(orderTimeFull).click();
    }

    public void clickOrderRentalPeriod() {
        webDriver.findElement(orderRentalPeriod).click();
    }

    public void enterOrderRentalTwoDay() {
        webDriver.findElement(orderRentalTwoDay).click();
    }

    public void enterOrderRentalFourDay() {
        webDriver.findElement(orderRentalFourDay).click();
    }

    public void clickCheckBoxGreyColorScooter() {
        webDriver.findElement(checkBoxGreyColorScooter).click();
    }

    public void clickCheckBoxBlackColorScooter() {
        webDriver.findElement(checkBoxBlackColorScooter).click();
    }

    public void enterOrderComment(String text) {
        webDriver.findElement(orderCommentField).sendKeys(text);
    }

    public void clickOrderButtonOnOrderPage() {
        webDriver.findElement(orderButtonOnOrderPage).click();
    }

    public void clickOrderConfirmationButton() {
        webDriver.findElement(orderConfirmationButton).click();
    }

    public boolean checkOrderConfirmationIsDisplayed() {
        return webDriver.findElement(orderConfirmation).isDisplayed();
    }
}
