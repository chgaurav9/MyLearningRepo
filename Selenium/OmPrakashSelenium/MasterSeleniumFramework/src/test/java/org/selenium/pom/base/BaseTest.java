package org.selenium.pom.base;

import org.openqa.selenium.WebDriver;
import org.selenium.pom.factory.DriverManager;

public class BaseTest {

    protected WebDriver driver;


    public void startDriver() {
        driver = new DriverManager().initializeDriver();
    }

    public void quitDriver() {
        driver.quit();
    }
}
