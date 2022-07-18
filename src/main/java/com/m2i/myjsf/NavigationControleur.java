/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.m2i.myjsf;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "navigationControleur")
//@Named(value = "navigationControleur")
//@Dependent
public class NavigationControleur {

    
    public NavigationControleur() {
    }
    
    public String moveToHelloPage(){
        return "hello";
    }
    
}
