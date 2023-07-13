package com.patron.automationTestingOnline.pages;

import static com.codeborne.selenide.Selenide.open;

public class Common {

    public void openWebsite(){
        String url = "https://automationintesting.online/";
        open(url);
    }
}
