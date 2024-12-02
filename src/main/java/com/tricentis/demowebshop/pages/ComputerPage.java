package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utilities.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {
    //Find locators
    By desktop=By.xpath("//img[@title='Show products in category Desktops']");

    /**
     * This method will click on Desktop
     */
    public void clickOnDesktop(){
        clickOnElement(desktop);
    }



}
