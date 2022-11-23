package ru;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class InputText {
    private final WebDriver webDriver;
    private static final String INPUT_NAME_XPATH = "//input[@aria-label='name']";
    private static final String INPUT_NUMBER_PHONE_XPATH = "//input[@type='tel']";
    private static final String INPUT_MAIL_XPATH = "//input[@aria-label='email']";
    private static final String SEARCH_BUTTON_XPATH = "//input[@class ='search-field']";
    private static final String SEARCH_BUTTON_XPATH_P = "//input[@placeholder ='Поиск']";

    public InputText(WebDriver webDriver) {
        this.webDriver =webDriver;
    }

    public void inputName(String name){
        final var inputName = webDriver.findElement(By.xpath(INPUT_NAME_XPATH));
        inputName.sendKeys(name, Keys.TAB);
    }
    public void inputMail(String mail){
        final var inputMail = webDriver.findElement(By.xpath(INPUT_MAIL_XPATH));
        inputMail.sendKeys(mail, Keys.TAB);
    }
    public void inputPhone(String numberPhone){
        final var inputPhone = webDriver.findElement(By.xpath(INPUT_NUMBER_PHONE_XPATH));
        inputPhone.sendKeys(numberPhone, Keys.ENTER);
    }
    public void inputSearchText(String searchText){
        final var inputSearchText = webDriver.findElement(By.xpath(SEARCH_BUTTON_XPATH));
        inputSearchText.sendKeys(searchText, Keys.ENTER);
    }
    public void inputSearchTextVacancy(String searchText){
        final var inputSearchText = webDriver.findElement(By.xpath(SEARCH_BUTTON_XPATH_P));
        inputSearchText.sendKeys(searchText, Keys.ENTER);
    }
}
