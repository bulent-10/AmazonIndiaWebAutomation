package com.clipboardHealth.pages;


import com.clipboardHealth.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Televisions {

    public Televisions(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@id='nav-hamburger-menu']")
    public WebElement hamburgerMenuButton;

    @FindBy(xpath = "//*[@id='hmenu-customer-profile-right']")
    public WebElement avatarIcon;

    @FindBy(xpath = "//a[contains(@data-ref-tag,'nav_em_1_1_1_14')]")
    public WebElement tvAppliancesElectronicsButton;

    @FindBy(xpath = "//a[.='Televisions']")
    public WebElement televisionsButton;
    //(//*[.='Televisions'])[5]

    @FindBy(xpath = "//span[.='Samsung']")
    public WebElement samsungCheckbox;
    // (//*[@class='a-icon a-icon-checkbox'])[64]

    @FindBy(xpath = "//span[@class='a-button-text a-declarative']")
    public WebElement sortByFeaturedButton;

    @FindBy(xpath = "//*[@id='s-result-sort-select_2']")
    public WebElement priceHighToLowButton;

    @FindBy(xpath = "//span[.='RESULTS']")
    public WebElement results;

    @FindBy(xpath = "(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]")
    public WebElement secondHighestPriceElement;

    @FindBy(css = "span#productTitle")
    public WebElement productTitle;

    @FindBy(xpath = "//*[.=' About this item ']")
    public WebElement aboutThisItemSection;


}
