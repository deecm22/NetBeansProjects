package com.mycompany.wris.client;

import com.mycompany.wris.NewComponent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.vaadin.client.MouseEventDetailsBuilder;
import com.vaadin.client.communication.RpcProxy;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.MouseEventDetails;
import com.vaadin.shared.ui.Connect;

@Connect(NewComponent.class)
public class NewComponentConnector extends AbstractComponentConnector {
    
    private NewComponentServerRpc rpc = RpcProxy.create(NewComponentServerRpc.class, this);
    
    public NewComponentConnector() {
        registerRpc(NewComponentClientRpc.class, new NewComponentClientRpc() {
            public void alert(String message) {
                // TODO: Do something useful
                Window.alert(message);
            }
        });

        // TODO: ServerRpc usage example, do something useful instead
        getWidget().addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                final MouseEventDetails mouseDetails = MouseEventDetailsBuilder
                        .buildMouseEventDetails(event.getNativeEvent(),
                                getWidget().getElement());
                rpc.clicked(mouseDetails);
            }
        });
    }
    
    @Override
    public NewComponentWidget getWidget() {
        return (NewComponentWidget) super.getWidget();
    }
    
    @Override
    public NewComponentState getState() {
        return (NewComponentState) super.getState();
    }
    
    @Override
    public void onStateChanged(StateChangeEvent stateChangeEvent) {
        super.onStateChanged(stateChangeEvent);

        // TODO: do something useful
        final String text = getState().text;
        getWidget().setText(text);
    }
}
