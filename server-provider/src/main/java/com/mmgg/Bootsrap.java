package com.mmgg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Bootsrap {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/dubbo-server.xml");
        context.start();
        System.in.read();

    }
}
