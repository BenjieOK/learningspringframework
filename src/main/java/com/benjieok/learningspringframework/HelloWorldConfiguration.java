package com.benjieok.learningspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age){};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public  String name (){
        return "BenjieOK";
    }

    @Bean
    public  int age (){
        return 14;
    }

    @Bean
    public Person person(){
        return new Person("judah", 13);
    }


}
