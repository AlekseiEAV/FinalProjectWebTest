package ru;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public record ButtonClick(WebDriver webDriver) {
    private static final String SEARCH_ICON_XPATH = "//div[@class='header-search']";
    public void clickButtonPage(String textButton){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), '"+ textButton +"')]")));
        final var clickButton = webDriver.findElement(By.xpath("//a[contains(text(), '"+ textButton +"')]"));
        clickButton.click();
    }
    public void clickButtonPageUp(String textButton){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), '"+ textButton +"')]")));
        final var clickButton = webDriver.findElement(By.xpath("//a[contains(text(), '"+ textButton +"')]"));
        clickButton.sendKeys(Keys.PAGE_UP);
        clickButton.click();
    }
    public void goToButtonMenu(String textButton){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), '"+ textButton +"')]")));
        Actions actions = new Actions(webDriver);
        final var moveTo = webDriver.findElement(By.xpath("//a[contains(text(), '"+ textButton +"')]"));
        actions.moveToElement(moveTo);
        actions.perform();
    }
    public void goToElementFromMenu(String textButton){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), '"+ textButton +"')]")));
        final var clickButton = webDriver.findElement(By.xpath("//span[contains(text(), '"+ textButton +"')]"));
        clickButton.click();
    }
    public void goToElementSearchIcon(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SEARCH_ICON_XPATH)));
        final var clickButton = webDriver.findElement(By.xpath(SEARCH_ICON_XPATH));
        clickButton.click();
    }


}
