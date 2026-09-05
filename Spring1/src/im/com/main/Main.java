package im.com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.com.base.Student;

public class Main {
 public static void main(String[] args) {
	 String config="/in/com/config/applicationContext.xml";
	ApplicationContext context=new ClassPathXmlApplicationContext(config);
	  Student std=  (Student) context.getBean("std");
	  std.display();
}
}
