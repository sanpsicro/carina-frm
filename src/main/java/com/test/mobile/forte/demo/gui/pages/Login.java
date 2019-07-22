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
package com.test.mobile.forte.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.test.carina.demo.gui.components.NewsItem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Login extends AbstractPage {

    @FindBy(className="searchFor")
    private ExtendedWebElement searchTextField;

    @FindBy(xpath="//input[@value='Search']")
    private ExtendedWebElement searchButton;

    @FindBy(xpath="//button[@class='btn btn-registrar']")
    public ExtendedWebElement registrarButton;


    @FindBy(xpath="//div[@class='news-item']")
    private List<NewsItem> news;

    @FindBy(xpath="(//button[@type='button'])[4]")
    private ExtendedWebElement cerrar1;

    @FindBy(xpath="(//button[@type='button'])[3]")
    private ExtendedWebElement cerrar2;

    public Login(WebDriver driver) {
        super(driver);
        setPageURL("/#/login");
    }

    public List<NewsItem> searchNews(String q) {
        searchTextField.type(q);
        searchButton.click();
        return news;
    }


    public Login quitAdvertise1() {
        cerrar1.click();
        return new Login(driver);
    }

    public Login quitAdvertise2() {
        cerrar2.click();
        return new Login(driver);
    }

    public Login registrar_BTN() {
        registrarButton.click();
        return new Login(driver);
    }

     public Registro goRegistro(){
        return new Registro(driver);

     }

}
