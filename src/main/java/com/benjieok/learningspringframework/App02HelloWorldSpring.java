package com.benjieok.learningspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //1. launch a spring context

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2. configure the things that we spring to manage - @Configuration
        // * HelloWorldConfiguration - @Configuration
        // * name - @Bean

        //3. Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
    }
}
