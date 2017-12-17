package com.mycompany.application.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.application.msg.MessageSay;

public class XmlApplication {
	
	public static void main(String[] args){
		 ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
		 MessageSay message = context.getBean(MessageSay.class);
		 message.say();
	}

}
