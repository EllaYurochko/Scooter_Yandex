import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.CheckOrder;
import pageobject.MainPage;
import pageobject.OrderForm;

import java.util.List;
import java.util.Random;


public class OrderTest {

    @Test
    public void testOrder() {
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage mainPage = new MainPage(driver);
        OrderForm orderForm = new OrderForm(driver);
        mainPage.clickCookieButton();
        mainPage.checkOrderButtonHeaderEnabled();
        mainPage.clickOrderButtonHeader();
        orderForm.getOrderHeadOne();
        orderForm.typeFirstName("Имя");
        orderForm.typeLastName("Фамилия");
        orderForm.typeAddress("Адрес");
        orderForm.typeMetro();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement metroList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='select-search__select']")));
        List<WebElement> metroStations = metroList.findElements(By.xpath("//li[@class='select-search__row']"));
        Random random = new Random();
        WebElement randomMetroStation;
        randomMetroStation = metroStations.get(random.nextInt(metroStations.size()));
        randomMetroStation.click();
        wait.until(ExpectedConditions.invisibilityOf(metroList));
        orderForm.typePhone("79853967227");
        CheckOrder checkOrder = orderForm.typeFurtherButton();
        orderForm.getOrderHeadTwo();
        orderForm.typeDataFieldInOrderForm("22.06.2023");
        orderForm.typeDatetimepickerInOrderForm();
        orderForm.typeRentalPeriodFieldInOrderForm();
        //wait = new WebDriverWait(driver, 10);
        orderForm.selectDropdownOptionMenuInFieldRentalInOrderForm();
        //WebElement rentalPeriodList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Dropdown-menu']")));
//        List<WebElement> rentalPeriods = rentalPeriodList.findElements(By.xpath("//li[@class='select-search__row']"));
//        WebElement randomRentalPeriod = rentalPeriods.get(new Random().nextInt(rentalPeriods.size()));
//        Кликнуть на выбранном сроке аренды
//        randomRentalPeriod.click();

        // Дождаться закрытия списка сроков аренды
      //  wait.until(ExpectedConditions.invisibilityOf(rentalPeriodList));


    }


}
