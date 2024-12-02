package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utilities.Utility;
import org.openqa.selenium.By;

public class MyAccountPage extends Utility {

    By logoutButton=By.xpath("//a[normalize-space()='Log out']");

    /**
     * This method will click on logout button
     */
    public void clickOnLogoutButton(){
        clickOnElement(logoutButton);
    }
}
