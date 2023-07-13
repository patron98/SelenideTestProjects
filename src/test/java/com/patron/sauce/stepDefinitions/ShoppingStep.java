package com.patron.sauce.stepDefinitions;

import com.patron.sauce.pages.CartPage;
import com.patron.sauce.pages.InventoryPage;
import io.cucumber.java.en.When;

public class ShoppingStep {
    private final InventoryPage inventoryPage = new InventoryPage();
    private final CartPage cartPage = new CartPage();

    @When("i buy a couple items with {string} {string} and {string}")
    public void buyStuff(String firstname, String lastname, String zipcode){
        inventoryPage.addToCart();
        cartPage.pressCheckoutButton();
        cartPage.fillInForm(firstname, lastname, zipcode);
        cartPage.confirmSuccess();
    }
}
