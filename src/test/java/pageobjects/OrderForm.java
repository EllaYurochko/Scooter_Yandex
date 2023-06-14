package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class OrderForm {

    private final WebDriver webDriver;
    //локатор поля ввода "Имя" на странице заказа
    private final By orderNameField = By.xpath("//input[@placeholder='* Имя']");

    //локатор поля ввода "Фамилия" на странице заказа
    private final By orderLastNameField = By.xpath("//input[@placeholder='* Фамилия']");

    //локатор поля "Адрес: куда привезти заказ" на странице заказа
    private final By orderAddressField = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");

    //локатор поля ввода "Станция метро" на странице заказа
    private final By orderMetroStationField = By.className("select-search__input");

    // локатор выпадающего списка метро на странице заказа
    private final By orderMetroStationFieldFull = By.xpath("//*[@class='select-search__select']");

    //локатор поля ввода "Телефон: на него позвонит курьер" на странице заказа
    private final By orderNumberPhoneField = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");

    //локатор кнопки "Далее" на странице заказа
    private final By orderButtonNext = By.xpath("//button[text()='Далее']");

    // локатор поля ввода "Когда привезти самокат" на странице заказа
    private final By orderTime = By.xpath("//input[@placeholder='* Когда привезти самокат']");

    //локатор для выбора даты в выпадающем календаре на странице заказа
    private final By orderTimeFull = By.xpath("//div[@class='react-datepicker__day react-datepicker__day--016 react-datepicker__day--selected']");

    // локатор для поля "Срок аренды" на странице заказа
    private final By orderRentalPeriod = By.xpath("//div[@class='Dropdown-placeholder']");

    //локатор выпадающего списка в поле "Срок аренды" (двое суток) на странице заказа
    private final By orderRentalTwoDay = By.xpath("//div[@class='Dropdown-option'] [2]");

    //локатор выпадающего списка в поле "Срок аренды" (четверо суток) на странице заказа
    private final By orderRentalFourDay = By.xpath("//div[@class='Dropdown-option'] [4]");

    // локатор чекбокса "Серая безысходность" на странице заказа
    private final By checkBoxGreyColorScooter = By.xpath("//input[@id='grey']");

    // локатор чекбокса "Черный жемчуг" на странице заказа
    private final By checkBoxBlackColorScooter = By.xpath("//input[@id='black']");

    // локатор кнопки "Заказать" на странице заказа
    private final By orderButtonOnOrderPage = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    // локатор кнопки "Да" на странице подтверждения заказа
    private final By orderConfirmationButton = By.xpath("//button[text()='Да']");

    // локатор подтверждения заказа
    private final By orderConfirmation = By.xpath("//div[text()='Заказ оформлен']");

    //локатор поля ввода "Комментарий для курьера" на странице заказа
    private final By orderCommentField = By.xpath("//input[@placeholder='Комментарий для курьера']");

    public OrderForm(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void enterOrderName(String name) {
        webDriver.findElement(orderNameField).sendKeys(name);
    }

    public void enterOrderLastName(String lastName) {
        webDriver.findElement(orderLastNameField).sendKeys(lastName);
    }

    public void enterOrderAddress(String address) {
        webDriver.findElement(orderAddressField).sendKeys(address);
    }

    public void enterMetroStation(String metroStation) {
        webDriver.findElement(orderMetroStationField).sendKeys(metroStation);
    }

    public void clickMetroStationFull() {
        webDriver.findElement(orderMetroStationFieldFull).click();
    }

    public void enterNumberPhone(String numberPhone) {
        webDriver.findElement(orderNumberPhoneField).sendKeys(numberPhone);
    }

    public void clickOrderButtonNext() {
        webDriver.findElement(orderButtonNext).click();
    }

    public void enterOrderTime(String time) {
        webDriver.findElement(orderTime).sendKeys(time, Keys.ENTER);
    }

//    public void clickOrderTime() {
//        webDriver.findElement(orderTimeFull).click();
//    }

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

    public void enterOrderComment(String comment) {
        webDriver.findElement(orderCommentField).sendKeys(comment);
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
