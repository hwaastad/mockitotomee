/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mockitotomee.ejb;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.mail.Session;

/**
 *
 * @author helge
 */
@Stateless
public class BusinessBean implements BusinessBeanLocal {
    
    @Resource(name = "MailProvider")
    private Session mailSession;

    @Override
    public String sayHello() {
        return "Hello";
    }

    
}
