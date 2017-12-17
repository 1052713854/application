package com.mycompany.application.msg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mycompany.application.intf.MessageService;

@Component
public class MessageSay {
	
	@Autowired
//    @Qualifier(value="message")
	private MessageService message;
	
	public void say(){
		String msg = message.getMessage();
		System.out.println(msg);
	}

}
