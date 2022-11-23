package ru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public record AssertText(WebDriver webDriver) {
    private final static String ERROR_COURSES_XPATH = "//p[@class='t-form__errorbox-item']";

    public String getErrorCoursesXpath() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ERROR_COURSES_XPATH)));
        return webDriver.findElement(By.xpath(ERROR_COURSES_XPATH)).getText();
    }
    public String getActiveTextPageH1(String textResult){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[contains(text(), '"+ textResult +"')]")));
        return webDriver.findElement(By.xpath("//h1[contains(text(), '"+ textResult +"')]")).getText();
    }
    public String getActiveTextPageSpan(String textResult){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), '"+ textResult +"')]")));
        return webDriver.findElement(By.xpath("//span[contains(text(), '"+ textResult +"')]")).getText();
    }
    public String getActiveTextPageDiv(String textResult){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), '"+ textResult +"')]")));
        return webDriver.findElement(By.xpath("//div[contains(text(),'"+textResult+"')]")).getText();
    }
    public String getActiveTextPageLi(String textResult){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(), '"+ textResult +"')]")));
        return webDriver.findElement(By.xpath("//li[contains(text(), '"+ textResult +"')]")).getText();
    }
    public String getActiveTextPageA(String textResult){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), '"+ textResult +"')]")));
        return webDriver.findElement(By.xpath("//a[contains(text(), '"+ textResult +"')]")).getText();
    }
}
