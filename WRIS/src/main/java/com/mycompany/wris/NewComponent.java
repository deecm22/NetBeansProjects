package com.mycompany.wris;

import com.mycompany.wris.client.NewComponentClientRpc;
import com.mycompany.wris.client.NewComponentServerRpc;
import com.mycompany.wris.client.NewComponentState;
import com.vaadin.shared.MouseEventDetails;
import com.vaadin.ui.AbstractComponent;

public class NewComponent extends AbstractComponent {
    
    private NewComponentServerRpc rpc = new NewComponentServerRpc() {
        private int clickCount = 0;
        
        public void clicked(MouseEventDetails mouseDetails) {
            // nag every 5:th click using RPC
            if (++clickCount % 5 == 0) {
                getRpcProxy(NewComponentClientRpc.class).alert(
                        "Ok, that's enough!");
            }
            // update shared state
            getState().text = "You have clicked " + clickCount + " times";
        }
    };
    
    public NewComponent() {
        registerRpc(rpc);
    }
    
    @Override
    public NewComponentState getState() {
        return (NewComponentState) super.getState();
    }
}
