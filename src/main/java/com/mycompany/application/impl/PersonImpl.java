package com.mycompany.application.impl;

import org.springframework.stereotype.Component;

import com.mycompany.application.intf.PersonIntf;

@Component
public class PersonImpl{

	public void save(String name) {
		System.out.println("我是save方法");
//		throw new RuntimeException();
	}

}
