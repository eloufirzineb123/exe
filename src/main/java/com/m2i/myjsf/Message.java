/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.m2i.myjsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author elouf
 */
@ManagedBean(name = "messageBean")
@RequestScoped
public class Message {
    private String message;

    /**
     * Creates a new instance of Message
     */
    public Message() {
        message ="Message from new bean ";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
