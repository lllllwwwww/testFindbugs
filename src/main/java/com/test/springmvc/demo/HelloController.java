package com.test.springmvc.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.springmvc.entity.User;
import com.test.springmvc.inter.Say;

@Controller
@RequestMapping("/mvc")
public class HelloController {
	private Say user;
	public Say getUser() {
		return user;
	}
	public void setUser(Say user) {
		this.user = user;
	}
	@SuppressWarnings("deprecation")
	@RequestMapping("/hello")
     public String hello(){
		String name="Leborn.James";
		String[] names=name.split(".");
		Resource userXML=new ClassPathResource("entity.xml");
		BeanFactory fatory=new XmlBeanFactory(userXML);
		if(user!=null||"".equals(user)){
			return "hello";
		}else{
			user.sayYourself();
			return "";
		}
    	
     }
}
