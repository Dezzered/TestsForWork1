package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
class PhotoPage extends BaseCatalogProductsPage {
    PhotoPage(By identifyElementLocator, WebDriver d) {
        super(identifyElementLocator, d);
    }
}
