package com.patron.sauce.pages;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.Assert.assertEquals;

public class Common {

    private final String url = "https://www.saucedemo.com";
    public void openWebsite(){
        open(url);
    }

    public void verifyWebPage(String endpoint){
        assertEquals(url + "/" + endpoint + ".html", url());
    }
}
