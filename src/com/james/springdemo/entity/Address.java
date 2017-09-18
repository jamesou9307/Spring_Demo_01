package com.james.springdemo.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Address {

ApplicationContext context=new ClassPathXmlApplicationContext();
ApplicationContext applicationContext1= new FileSystemXmlApplicationContext();
}
