package com.clipboardHealth.tests;

import com.clipboardHealth.pages.Televisions;
import com.clipboardHealth.utilities.ConfigurationReader;
import com.clipboardHealth.utilities.Driver;
import org.testng.annotations.Test;

import java.util.Set;

import static java.lang.Thread.sleep;
import static org.testng.Assert.*;
import static com.clipboardHealth.utilities.Driver.*;

public class TelevisionTests {

    Televisions televisions = new Televisions();

    @Test
    public void samsungTV() throws InterruptedException {
        // #1- Open https://www.amazon.in/.
        getDriver().get(ConfigurationReader.getProperty("amazonUrl"));

        // #2- Click on the hamburger menu in the top left corner.
        televisions.hamburgerMenuButton.click();
        String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        String actualTitle = getDriver().getTitle();
        assertEquals(actualTitle,expectedTitle,"Title did not match!");

        // #3- Scroll own and then Click on the TV, Appliances and Electronics link under Shop by Department section.
        televisions.tvAppliancesElectronicsButton.click();
        assertTrue(televisions.tvAppliancesElectronicsButton.isDisplayed(), "TV,Appliances & Electronics section was not displayed!");

        // #4- Then click on Televisions under Tv, Audio & Cameras sub section.
        televisions.televisionsButton.click();
        sleep(1000);
        String expectedTitle1="Buy the latest LED TVs, 4K TVs and Android TVs online at Best Prices in India-Amazon.in | Shop by size, price, features and more";
        String actualTitle1 = getDriver().getTitle();
        assertEquals(actualTitle1,expectedTitle1,"Title did not match!");

        // #5- Scroll down and filter the results by Brand ‘Samsung’.
        televisions.samsungCheckbox.click();
        sleep(1000);
        String expectedTitle2 = "Amazon.in";
        String actualTitle2 = getDriver().getTitle();
        assertEquals(actualTitle2,expectedTitle2,"Title did not match!");

        // #6- Sort the Samsung results with price High to Low.
        televisions.sortByFeaturedButton.click();
        televisions.priceHighToLowButton.click();

        // #7- Click on the second highest priced item (whatever that maybe at the time of automating).
        televisions.secondHighestPriceElement.click();

        // #8- Switch the Window
        String mainHandle = getDriver().getWindowHandle();
        System.out.println("main window: "+ mainHandle);

        Set<String> windHandles = getDriver().getWindowHandles();
        for (String eachTab : windHandles) {
            getDriver().switchTo().window(eachTab);
            String title=getDriver().getTitle();
            System.out.println(eachTab);
        }
        assertTrue(televisions.productTitle.isDisplayed(), "The Second Highest Price Product was not displayed!..");

        // #9- Assert that “About this item” section is present and log this section text to console/report.
        assertTrue(televisions.aboutThisItemSection.isDisplayed(),"About the Item section was not displayed!..");
        System.out.println(televisions.aboutThisItemSection.getText() + " section is present...");

        closeDriver();

    }

}
