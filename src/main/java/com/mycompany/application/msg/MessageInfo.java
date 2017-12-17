package com.mycompany.application.msg;

import org.springframework.stereotype.Component;

import com.mycompany.application.intf.MessageService;

@Component("messsage")
public class MessageInfo implements MessageService {

	public String getMessage() {
		return "Hello World";
	}

}
