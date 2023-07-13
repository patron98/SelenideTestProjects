package com.patron.candy.pages;

import static com.codeborne.selenide.Selenide.open;

public class Common {

    public void openWebsite(){
        String url = "https://candymapper.com/";
        open(url);
    }
}
