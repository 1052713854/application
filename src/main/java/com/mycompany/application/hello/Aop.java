package com.mycompany.application.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.application.impl.PersonImpl;
import com.mycompany.application.intf.PersonIntf;

public class Aop {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop.xml");  
        PersonImpl bean = (PersonImpl) ctx.getBean("personImpl");
        bean.save("hujunxin");
	}

}
