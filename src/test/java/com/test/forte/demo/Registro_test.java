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
package com.test.forte.demo;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.dataprovider.annotations.XlsDataSourceParameters;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestTag;
import com.test.carina.demo.gui.components.FooterMenu;
import com.test.carina.demo.gui.components.NewsItem;
import com.test.carina.demo.gui.components.compare.ModelSpecs;
import com.test.carina.demo.gui.components.compare.ModelSpecs.SpecType;
import com.test.carina.demo.gui.pages.*;
import com.test.forte.demo.gui.pages.Login;
import com.test.forte.demo.gui.pages.Registro;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.List;

/**
 * This sample shows how create Web test.
 *
 * @author qpsdemo
 */
public class Registro_test extends AbstractTest {


    @Test(description = "JIRA#AUTO-0012")
    @MethodOwner(owner = "walook")
    public void testLoginSucces(){
        Login loginPage  = new Login(getDriver());
        loginPage.open();

        loginPage.quitAdvertise1();
        loginPage.quitAdvertise2();
        loginPage.registrar_BTN();

        Registro registroPage = loginPage.goRegistro();

        registroPage.setText(registroPage.TXT_nombre,"nombre");
        registroPage.setText(registroPage.TXT_apellidoPaterno,"aPaterno");
        registroPage.setText(registroPage.TXT_apellidoMaterno,"aMaterno");
        registroPage.setText(registroPage.TXT_folioINE,"234234234234");
        registroPage.setText(registroPage.TXT_curp,"SAPS77868807B");


        registroPage.click_(registroPage.RDO_nacionalidad);

        registroPage.selectText(registroPage.CBO_estado,"Yucatán");

        registroPage.selectText(registroPage.CBO_municipio,"Mérida");
        registroPage.selectText(registroPage.CBO_ciudad,"Mérida");
        registroPage.selectText(registroPage.CBO_colonia,"Merida Centro");


        registroPage.setText(registroPage.TXT_calle,"calle 1");
        registroPage.setText(registroPage.TXT_numeroExterior,"22");
        registroPage.setText(registroPage.TXT_numeroInterior,"12");
        registroPage.setText(registroPage.TXT_cruzamientos,"56 y 58");
        registroPage.setText(registroPage.TXT_codigoPostal,"97200");
        registroPage.setText(registroPage.TXT_referencia,"referencia texto");

        registroPage.setText(registroPage.TXT_correoElectronico,"correo@correo.com");
        registroPage.setText(registroPage.TXT_confirmarCorreo,"correo@correo.com");
        registroPage.setText(registroPage.TXT_telefono,"5565545346");
        registroPage.click_(registroPage.RDO_tipoTelefono);

      //  registroPage.click_(registroPage.captcha);

        registroPage.click_(registroPage.BTN_registrar);




    }

}
