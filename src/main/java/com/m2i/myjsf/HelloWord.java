
package com.m2i.myjsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWord {
    @ManagedProperty(value = "#{messageBean}")
    private Message messageBean;
    
    private String message;
    
    public HelloWord() {
        message = "Hello from bean";
    }
     public String getMessage() {
        if (messageBean != null) {
            message = messageBean.getMessage();
        }
        
        return message;
    }
      
    public void setMessageBean(Message message) {
        this.messageBean = message;
    }
    
}














