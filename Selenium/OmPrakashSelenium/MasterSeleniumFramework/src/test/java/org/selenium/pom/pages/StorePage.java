package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.pom.base.BasePage;

public class StorePage extends BasePage {

    private final By searchField = By.id("woocommerce-product-search-field-0");
    private final By searchButton = By.xpath("//*[text()='Search']");
    private final By title = By.cssSelector(".woocommerce-products-header__title.page-title");

    public StorePage(WebDriver driver) {
        super(driver);
    }

    public StorePage enterTextInSearchField(String text) {
        driver.findElement(searchField).sendKeys(text);
        return this;
    }

    public StorePage search(String text) {
        enterTextInSearchField(text).clickSearchButton();
        return this;
    }

    public StorePage clickSearchButton() {
        driver.findElement(searchButton).click();

        return this;
    }

    public String getTitle() {
       return driver.findElement(title).getText();
    }

    private By getAddToCartButtonElement(String productName){
        return By.cssSelector("a[aria-label='Add “"+ productName +"” to your cart']");
    }

    public void clickAddToCartButton(String productName) {
        By addToCartButton = getAddToCartButtonElement(productName);

        driver.findElement(addToCartButton).click();
    }


}
