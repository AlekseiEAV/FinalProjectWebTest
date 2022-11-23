package ru;

import org.openqa.selenium.WebDriver;

public class Page {
    private final WebDriver webDriver;
    private static final String MAIN_PAGE = "https://skillfactory.ru/";
    private static final String BLOG_PAGE = "https://blog.skillfactory.ru/";
    public Page(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void goMain(){
        webDriver.get(MAIN_PAGE);
    }
    public void goBlog(){
        webDriver.get(BLOG_PAGE);
    }

}
