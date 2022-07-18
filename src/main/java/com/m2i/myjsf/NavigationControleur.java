/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.m2i.myjsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "navigationControleur")
//@Named(value = "navigationControleur")
//@Dependent
public class NavigationControleur {
    
    @ManagedProperty (value = "#{param.pageId}")
    private String pageId;

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getPageId() {
        return pageId;
    }

    
    public NavigationControleur() {
    }
    
    public String moveToHelloPage(){
        return "hello";
    }
    
    public String goToPage(){
        if(pageId !=null){
         return pageId;   
        }
        return "home";
    }
    
}
