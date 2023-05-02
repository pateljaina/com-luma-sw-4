package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage extends Utility {
    By WomenMenuOption = By.xpath("//span[contains(text(),'Women')]");
    By mouseHoverOnTopMenuOption = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By jacketsOption = By.xpath("//a[@id='ui-id-11']");
    By sortProductNameInDropDownOption = By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]");
    By menMenuOption = By.xpath("//span[normalize-space()='Men']");
    By mouseHoverOnBottomsMenuOption = By.xpath("//a[@id='ui-id-18']");
    By pantsOption = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By mouseHoverOnProductNameOption = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By mouseHoverAndClickOnProductNameOption = By.xpath("//div[@class='swatch-option text'])[1]");
    By mouseHoverAndClickOnColourNameOption = By.xpath("//div[@class='swatch-option color'])[1]");
    By mouseHoverAndClickOnAddToCartOption = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    By addedToYourShoppingCartMethodText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartOption = By.xpath("//a[normalize-space()='shopping cart']");
    By shoppingCartTextMethod = By.xpath("//span[@class='base']");

    By pantTextMethod = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");

    By sizeTextMethod = By.xpath("//dd[contains(text(),'32')]");

    By colourTextMethod = By.xpath("//dd[contains(text(),'Black')]");

    By mouseHoverOnGearOption = By.xpath("//span[normalize-space()='Gear']");

    By mouseHoverGearAndClickOption = By.xpath("(//span[normalize-space()='Gear']");
    By duffleBagOption = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By quantityOption = By.xpath("//input[@id='qty']");
    By overNightDuffleText = By.xpath("//span[@class='base']");
    By youAddedText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By cartOption = By.xpath("//a[normalize-space()='shopping cart']");
    By qtyText = By.xpath("//input[@title='Qty']");
    By nightDuffleText = By.xpath("//span[@class='base']");
    By priceText = By.xpath("//span[@class='cart-price']//span)[2]");
    By qtyOption = By.xpath("//input[@id='qty']");
    By shopCartOption = By.xpath("//a[normalize-space()='shopping cart']");
    By priceTextMethod = By.xpath("/span[@class='cart-price']//span)[2]");

    public void mouseHoverOnGearMenuAndClicksOnBagsOption() {
        mouseHoverToElementAndClick(mouseHoverAndClickOnAddToCartOption);
    }

    public void clickODuffleBagOption() {
        clickOnElement(duffleBagOption);
    }

    public String verifyOvernightDuffleText() {
        return getTextFromElement(overNightDuffleText);
    }

    public void quantitySpaceOption() {
        clickOnElement(quantityOption);
        sendTextToElement(quantityOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(quantityOption, "3"); // Type in the new text
    }

    public String verifyYouAddedOvernightDuffleToYourShoppingCartText() {
        return getTextFromElement(youAddedText);
    }

    public void clickOnShoppingCartLinkOption() {
        clickOnElement(cartOption);
    }

    public String verifyOvernightDuffleTextMethod() {
        return getTextFromElement(nightDuffleText);
    }

    public String verifyQuantityText() {
        return getTextFromElement(qtyText);
    }

    public String verifyProductPrice() {
        return getTextFromElement(priceText);
    }

    public void quantityUpdateText() {
        clickOnElement(qtyOption);
        sendTextToElement(qtyOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(qtyOption, "5"); // Type in the new text
    }

    public void clickOnShoppingCartButtonOption() {
        clickOnElement(shopCartOption);
    }

    public String verifyUpdatedPriceText() {
        return getTextFromElement(priceTextMethod);
    }

    public void mouseHoverOnWomenMenuTab() {
        mouseHoverToElement(WomenMenuOption);
    }

    public void mouseHoverOnWomenTopMenuOption() {
        mouseHoverToElement(mouseHoverOnTopMenuOption);
    }

    public void setJacketsOption() {
        clickOnElement(jacketsOption);
    }

    public void productSortByProductName(String product) {
        selectByVisibleTextFromDropDown(sortProductNameInDropDownOption, product);
    }

    public void mouseHoverOnMenMenuTab() {
        mouseHoverToElement(menMenuOption);
    }

    public void mouseHoverOnMenBottomsMenuOption() {
        mouseHoverToElement(mouseHoverOnBottomsMenuOption);
    }

    public void setPantsOption() {
        clickOnElement(pantsOption);
    }

    public void mouseHoverOnMenPantsProductNameOption() {
        mouseHoverToElement(mouseHoverOnProductNameOption);
    }

    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnSizeOption(String pant) {
        mouseHoverToElementAndClick(mouseHoverAndClickOnProductNameOption);
    }

    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnColourOption(String pant) {
        mouseHoverToElementAndClick(mouseHoverAndClickOnProductNameOption);
    }

    public void mouseHoverOnProductNameCronusYogaPantAndClicksOnAddToCartOption() {
        mouseHoverToElementAndClick(mouseHoverAndClickOnAddToCartOption);
    }

    public String youAddedCronusYogaPantToYourShoppingCartMethodTextMethodText() {
        return getTextFromElement(addedToYourShoppingCartMethodText);
    }

    public void clickOnShoppingCartOption() {
        clickOnElement(pantsOption);
    }

    public String shoppingCartText() {
        return getTextFromElement(shoppingCartTextMethod);
    }

    public String cronusPantText() {
        return getTextFromElement(pantTextMethod);
    }

    public String verifySizeText() {
        return getTextFromElement(sizeTextMethod);
    }

    public String verifyColourOfPantText() {
        return getTextFromElement(colourTextMethod);
    }

    public void mouseHoverOnGearMenuOption() {
        mouseHoverToElement(mouseHoverOnGearOption);
    }
}
