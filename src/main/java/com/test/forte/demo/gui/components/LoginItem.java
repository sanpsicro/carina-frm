/*
 * Copyright 2013-2019 QAPROSOFT (http://qaprosoft.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.test.forte.demo.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.test.carina.demo.gui.pages.HomePage;
import com.test.carina.demo.gui.pages.NewsPage;
import com.test.forte.demo.gui.pages.Login;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginItem extends AbstractUIObject {

    @FindBy(xpath="./a")
    public ExtendedWebElement titleLink;

    @FindBy(xpath="(//button[@type='button'])[4]")
    public ExtendedWebElement cerrar1;

    @FindBy(xpath="(//button[@type='button'])[3]")
    public ExtendedWebElement cerrar2;




    public LoginItem(WebDriver driver, SearchContext sc) {
        super(driver, sc);
    }

    public String readTitle() {
        return titleLink.getElement().getText();
    }


    public Login quitAdvertise1() {
        cerrar1.click();
        return new Login(driver);
    }

    public Login quitAdvertise2() {
        cerrar2.click();
        return new Login(driver);
    }




}
