package com.mycompany.wris.client;

import com.google.gwt.user.client.ui.Label;

public class NewComponentWidget extends Label {
    
    public static final String CLASSNAME = "newcomponent";
    
    public NewComponentWidget() {
        // setText("NewComponentWidget sets the text via NewComponentConnector using NewComponentState");
        setStyleName(CLASSNAME);
    }
    
}
