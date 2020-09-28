package org.drozdov.info;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    private final Sender sender;
    private final Receiver receiver;

    public HomeController(){
        this.receiver = new ReceiverImpl();
        this.sender = new SenderImpl(this.receiver);
    }
    @RequestMapping(value = "/")
    public String home(){
        return sender.sendMessage("Hello world!");
    }

}
