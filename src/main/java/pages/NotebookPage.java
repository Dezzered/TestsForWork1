package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
class NotebookPage extends BaseCatalogProductsPage {
    NotebookPage(By identifyElementLocator, WebDriver d) {
        super(identifyElementLocator, d);
    }
}
