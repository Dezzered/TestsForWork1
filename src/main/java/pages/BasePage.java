package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

abstract public class BasePage {
    private final WebDriver driver;
    private By identifyElementLocator = By.cssSelector(".schema-header__title"); //TODO Зачем этот параметр, если он нигде не используется?

    public By getIdentifyElementLocator() {
        return identifyElementLocator;
    }

    //private final By BASE_PAGE_TITLE = By.cssSelector(".schema-header__title");

    protected BasePage(By identifyElementLocator, WebDriver d) {
        this.driver = d;
        this.identifyElementLocator = identifyElementLocator;
    }

    //TODO Это лучше вернуть, а поле сделать private
    public WebDriver getDriver() {
        return driver;
    }

    public abstract boolean isPageOpened(); /*{
        switch (identifyElementLocator) {
            case By.className("asd"): Assert.assertTrue(driver.findElement(BASE_PAGE_TITLE).getText().contains("Велосипеды"));
                break;
            *//*case "VideoCardPage" :Assert.assertTrue(driver.findElement(BASE_PAGE_TITLE).getText().contains("Видеокарты"));
                break;
            case "HeadphonesPage" : Assert.assertTrue(driver.findElement(BASE_PAGE_TITLE).getText().contains("Наушники и гарнитуры"));
                break;
            case "StrollersPage" : Assert.assertTrue(driver.findElement(BASE_PAGE_TITLE).getText().contains("Детские коляски"));
                break;
            case "MobilePage" : Assert.assertTrue(driver.findElement(BASE_PAGE_TITLE).getText().contains("Мобильные телефоны"));
                break;
            case "NotebookPage" : Assert.assertTrue(driver.findElement(BASE_PAGE_TITLE).getText().contains("Ноутбуки"));
                break;
            case "PhotoPage" : Assert.assertTrue(driver.findElement(BASE_PAGE_TITLE).getText().contains("Фотоаппараты"));
                break;
            case "MotorOilPage" : Assert.assertTrue(driver.findElement(BASE_PAGE_TITLE).getText().contains("Моторные масла"));
                break;
            case "TabletPcPage" : Assert.assertTrue(driver.findElement(BASE_PAGE_TITLE).getText().contains("Планшеты"));
                break;
            case "TiresPage" : Assert.assertTrue(driver.findElement(BASE_PAGE_TITLE).getText().contains("Автомобильные шины"));
                break;
            case "SmartWatchPage" : Assert.assertTrue(driver.findElement(BASE_PAGE_TITLE).getText().contains("Умные часы и браслеты"));
                break;
        }*//*
        return identifyElementLocator;
    }*/
}
