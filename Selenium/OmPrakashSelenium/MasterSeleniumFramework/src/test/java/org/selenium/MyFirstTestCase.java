package org.selenium;

import org.openqa.selenium.By;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.pages.HomePage;
import org.selenium.pom.pages.StorePage;
import org.testng.Assert;
import org.testng.annotations.*;

public class MyFirstTestCase extends BaseTest {


    @Test()
    public void guestCheckoutUsingDirectBankTransfer() throws InterruptedException {


        driver.get("https://askomdch.com");

        HomePage homePage = new HomePage(driver);
        StorePage storePage = homePage.clickStoreMenuLink();
        storePage.search("Blue");
        Assert.assertEquals("Search results: “Blue”", storePage.getTitle());
        storePage.clickAddToCartButton("Blue Shoes");

        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[title='View cart']")).click();
        Assert.assertEquals(
                "Blue Shoes", driver.findElement(By.cssSelector("td[class='product-name'] a")).getText());

        driver.findElement(By.cssSelector(".checkout-button.button.alt.wc-forward")).click();

        driver.findElement(By.cssSelector("#billing_first_name")).sendKeys("Gaurav");
        driver.findElement(By.cssSelector("#billing_last_name")).sendKeys("Chaudhary");
        driver.findElement(By.cssSelector("#billing_address_1")).sendKeys("Tower 12");
        driver.findElement(By.cssSelector("#billing_city")).sendKeys("Pune");
        driver.findElement(By.cssSelector("#billing_postcode")).sendKeys("94188");
        driver.findElement(By.cssSelector("#billing_email")).sendKeys("jghjgj@gmail.com");
        driver.findElement(By.cssSelector("#place_order")).click();
        Thread.sleep(1000);
        Assert.assertEquals(

                "Thank you. Your order has been received.", driver.findElement(By.xpath("//*[text()='Thank you. Your order has been received.']")).getText()
        );


    }

    @Test(dependsOnMethods = "guestCheckoutUsingDirectBankTransfer")
    public void loginAndCheckoutCheckoutUsingDirectBankTransfer() throws InterruptedException {

        driver.get("https://askomdch.com");
        driver.findElement(By.cssSelector("#menu-item-1227 > a")).click();
        driver.findElement(By.id("woocommerce-product-search-field-0")).sendKeys("Blue");
        driver.findElement(By.xpath("//*[text()='Search']")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.cssSelector(".woocommerce-products-header__title.page-title")).getText());
        Assert.assertEquals(
                "Search results: “Blue”", driver.findElement(By.cssSelector(".woocommerce-products-header__title.page-title")).getText()

        );
        driver.findElement(By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[title='View cart']")).click();
        Assert.assertEquals(
                "Blue Shoes", driver.findElement(By.cssSelector("td[class='product-name'] a")).getText());

        driver.findElement(By.cssSelector(".checkout-button.button.alt.wc-forward")).click();
        driver.findElement(By.cssSelector(".showlogin")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#username")).sendKeys("himani@gmail.com");
        driver.findElement(By.cssSelector("#username")).sendKeys("himani");
        driver.findElement(By.cssSelector("button[value='Login']")).click();


        driver.findElement(By.cssSelector("#billing_first_name")).sendKeys("Gaurav");
        driver.findElement(By.cssSelector("#billing_last_name")).sendKeys("Chaudhary");
        driver.findElement(By.cssSelector("#billing_address_1")).sendKeys("Tower 12");
        driver.findElement(By.cssSelector("#billing_city")).sendKeys("Pune");
        driver.findElement(By.cssSelector("#billing_postcode")).sendKeys("94188");
        driver.findElement(By.cssSelector("#billing_email")).sendKeys("jghjgj@gmail.com");
        driver.findElement(By.cssSelector("#place_order")).click();
        Thread.sleep(1000);
        Assert.assertEquals(

                "Thank you. Your order has been received.", driver.findElement(By.xpath("//*[text()='Thank you. Your order has been received.']")).getText()
        );

    }


}
