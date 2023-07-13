package com.patron.theInternetApp.pages;

import static com.codeborne.selenide.Selenide.open;

public class Common {

    public void openWebsite(){
        String url = "https://the-internet.herokuapp.com/";
        open(url);
    }
}
