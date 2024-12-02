package com.tricentis.demowebshop.testsuite;

import com.tricentis.demowebshop.pages.MenuPage;
import com.tricentis.demowebshop.tasebase.TestBase;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    MenuPage menuPage = new MenuPage();

    @Test
    public void verifyPageNavigation() {
        menuPage.selectMenu("Books");
    }
}
