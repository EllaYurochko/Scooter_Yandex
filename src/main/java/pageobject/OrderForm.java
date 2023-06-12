package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderForm {
    private WebDriver driver;

    public OrderForm(WebDriver driver) {
        this.driver = driver;
    }

    // заголовок формы заказа 1 "Для кого самокат"
    private final By orderHeadOne = By.xpath(".//div[@class='Order_Header__BZXOb' and text()='Для кого самокат']");

    // заголовок формы заказа 2 "Про аренду"
    private final By orderHeadTwo = By.xpath(".//div[@class='Order_Header__BZXOb' and text()='Про аренду']");

    // поле имя
    private final By firstNameInputInOrderForm = By.xpath(".//input[@placeholder='* Имя']");

    // поле Фамилия
    private final By lastNameInputInOrderForm = By.xpath(".//input[@placeholder='* Фамилия']");

    // поле Адрес
    private final By addressInputInOrderForm = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");

    // поле Станция метро
    private final By metroInputInOrderForm = By.xpath(".//input[@placeholder='* Станция метро']");

    // станция в списке
    private final By selectMetroInputInOrderForm1 = By.xpath(".//button[@value=3]");

    // поле Телефон
    private final By phoneInputInOrderForm = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

    // кнопка Далее
    private final By furtherButtonInOrderForm = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    // поле Дата
    private final By dataFieldInOrderForm = By.xpath(".//input[@placeholder='* Когда привезти самокат']");

    // выбранная дата аренды
    private final By datepickerInOrderForm = By.xpath(".//div[@class='react-datepicker__day react-datepicker__day--014 react-datepicker__day--selected']");

    // поле Срок аренды
    private final By rentalPeriodFieldInOrderForm = By.xpath(".//div[@class='Dropdown-placeholder']");

    // список выбора срока аренды
    protected final By dropdownMenuInFieldRentalPeriod = By.xpath(".//div[@class='Dropdown-menu']");

    // элементы списка аренды
    private final By dropdownOptionMenuInFieldRentalInOrderForm = By.xpath(".//div[@class='Dropdown-root Order_FilledDate__1pb8n']");

    // чек1 в поле Цвет самоката - Черныый жемчуг
    private final By blackColorScooterFieldInOrderForm = By.xpath(".//input[@id='black']");

    // чек2 в поле Цвет самоката Серый
    private final By greyColorScooterFieldInOrderFormInOrderForm = By.xpath(".//input[@id='grey']");

    //комментарий для курьера
    private final By commentForCourierInOrderForm = By.xpath(".//input[@placeholder='Комментарий для курьера']");

    public void typeFirstName(String firstName) {
        driver.findElement(firstNameInputInOrderForm).sendKeys(firstName);
    }

    public void typeLastName(String lastName) {
        driver.findElement(lastNameInputInOrderForm).sendKeys(lastName);
    }

    public void typeAddress(String address) {
        driver.findElement(addressInputInOrderForm).sendKeys(address);
    }

    public void typeMetro() {
        driver.findElement(metroInputInOrderForm).click();
    }

    public void typeSelectMetro() {
        driver.findElement(selectMetroInputInOrderForm1).click();
    }

    public void typePhone(String phone) {
        driver.findElement(phoneInputInOrderForm).sendKeys(phone);
    }

    public boolean getOrderHeadOne() {
        return driver.findElement(orderHeadOne).isDisplayed();
    }

    public boolean getOrderHeadTwo() {
        return driver.findElement(orderHeadTwo).isDisplayed();
    }

    public void typeDataFieldInOrderForm(String Data) {
        driver.findElement(dataFieldInOrderForm).sendKeys("14.06.2023");
    }

    public void typeDatetimepickerInOrderForm() {
        driver.findElement(datepickerInOrderForm).click();
    }

    public void typeRentalPeriodFieldInOrderForm() {
        driver.findElement(rentalPeriodFieldInOrderForm).click();
    }

    public void selectDropdownOptionMenuInFieldRentalInOrderForm() {
        driver.findElement(dropdownOptionMenuInFieldRentalInOrderForm).sendKeys("трое суток");
    }

    public void typeBlackColorScooterFieldInOrderForm() {
        driver.findElement(blackColorScooterFieldInOrderForm).click();
    }

    public void typeGreyColorScooterFieldInOrderFormInOrderForm() {
        driver.findElement(greyColorScooterFieldInOrderFormInOrderForm).click();
    }

    public void typeCommentForCourierInOrderForm(String CommentForCourier) {
        driver.findElement(commentForCourierInOrderForm).sendKeys("");
    }

    public CheckOrder typeFurtherButton() {
        driver.findElement(furtherButtonInOrderForm).click();
        return new CheckOrder(driver);
    }

}

// поле Дата Когда привезти самокат
// .//input[@placeholder='* Когда привезти самокат']

// поле Срок аренды
// .//div[@class='Dropdown-placeholder']

// список выбора срока
// .//div[@class='Dropdown-menu']
// .//div[@class='Dropdown-option' and text()]

//
//
// поле Цвет самоката
//

// чек1 Черныый жемчуг
// .//input[@id='black']

// чек2 Серый
// .//input[@id='grey']

//комментарий для курьера
// .//input[@placeholder='Комментарий для курьера']