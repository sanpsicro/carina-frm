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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Registro extends AbstractPage {

    //textbox
    @FindBy(xpath="//input[@name='nombre']")
    public ExtendedWebElement TXT_nombre;

    @FindBy(xpath="//input[@name='apellidoPaterno']")
    public ExtendedWebElement TXT_apellidoPaterno;


    @FindBy(xpath="//input[@name='apellidoMaterno']")
    public ExtendedWebElement TXT_apellidoMaterno;

    @FindBy(xpath="//input[@name='folioINE']")
    public ExtendedWebElement TXT_folioINE;

    @FindBy(xpath="(//*//label[@class='m-radio']//span[following::input])[1]")
    public ExtendedWebElement RDO_nacionalidad;

    @FindBy(xpath="//input[@name='curp']")
    public ExtendedWebElement TXT_curp;


    //select

    @FindBy(xpath="//select[@formcontrolname='estado']")
    public ExtendedWebElement CBO_estado;

    @FindBy(xpath="//select[@formcontrolname='municipio']")
    public ExtendedWebElement CBO_municipio;
    @FindBy(xpath="//select[@formcontrolname='ciudad']")
    public ExtendedWebElement CBO_ciudad;
    @FindBy(xpath="//select[@formcontrolname='colonia']")
    public ExtendedWebElement CBO_colonia;




    //text

    @FindBy(xpath="//input[@formcontrolname='calle']")
    public ExtendedWebElement TXT_calle;

    @FindBy(xpath="//input[@formcontrolname='numeroExterior']")
    public ExtendedWebElement TXT_numeroExterior;

    @FindBy(xpath="//input[@formcontrolname='numeroInterior']")
    public ExtendedWebElement TXT_numeroInterior;

    @FindBy(xpath="//input[@formcontrolname='cruzamientos']")
    public ExtendedWebElement TXT_cruzamientos;

    @FindBy(xpath="//input[@formcontrolname='codigoPostal']")
    public ExtendedWebElement TXT_codigoPostal;

    @FindBy(xpath="//input[@formcontrolname='correoElectronico']")
    public ExtendedWebElement TXT_correoElectronico;

    @FindBy(xpath="//input[@formcontrolname='confirmarCorreo']")
    public ExtendedWebElement TXT_confirmarCorreo;

    @FindBy(xpath="//input[@formcontrolname='telefono']")
    public ExtendedWebElement TXT_telefono;


    @FindBy(xpath="//textarea[@name='referencia']")
    public ExtendedWebElement TXT_referencia;

    //radio

    @FindBy(xpath="(//*//label[@class='m-radio']//span[following::input])[3]")
    public ExtendedWebElement RDO_tipoTelefono;


    //button
    @FindBy(xpath="//button[@class='btn btn-principal']")
    public ExtendedWebElement BTN_registrar;

    @FindBy(xpath="//div[@class='rc-anchor-content']//span[@class='recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox']//div[@class='recaptcha-checkbox-border']")
    public ExtendedWebElement captcha;

    public Registro(WebDriver driver) {
        super(driver);
        setPageURL("/#/login");
    }





    public Registro setText(ExtendedWebElement element, String value) {
        element.type(value);
        return new Registro(driver);
    }

    public Registro click_(ExtendedWebElement element) {
        element.click();
        return new Registro(driver);
    }

    public Registro selectText(ExtendedWebElement element, String value) {
        element.select(value);
        return new Registro(driver);
    }

    public Registro selectRadio(ExtendedWebElement element, int value) {
        element.select(value);
        return new Registro(driver);
    }
}
