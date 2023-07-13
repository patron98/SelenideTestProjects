package com.patron.sauce.pages;

import org.openqa.selenium.By;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;


public class InventoryPage {

    private final By shoppingCart = byClassName("shopping_cart_link");
    private final By buyButtonBackPack = byId("add-to-cart-sauce-labs-backpack");
    private final By buyButtonBikeLight = byId("add-to-cart-sauce-labs-bike-light");
    private final By buyButtonTShirt = byId("add-to-cart-sauce-labs-bolt-t-shirt");

    public void addToCart(){
        Set<By> buyButtons = Stream.of(buyButtonTShirt, buyButtonBackPack,buyButtonBikeLight)
                .collect(Collectors.toSet());
        for (By button : buyButtons){
            $(button).click();
        }
        $(shoppingCart).click();
    }
}
