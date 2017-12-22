package com.marvin.bundle.security.subscriber;

import com.marvin.bundle.framework.mvc.controller.event.FilterRequestEvent;
import com.marvin.component.event.dispatcher.DispatcherInterface;
import com.marvin.component.event.handler.Handler;
import com.marvin.component.event.subscriber.Subscriber;

public class RouterSubscriber extends Subscriber {

    public static final String VIEW_PARAMETER = "_view";
    
    public Handler<FilterRequestEvent> onRequest() {
        return event -> {
            Object request = event.getRequest();

        };
    };

    @Override
    public void subscribe(DispatcherInterface dispatcher) {
        dispatcher.register(FilterRequestEvent.class, onRequest());
    }
}
