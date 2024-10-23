package com.jsp.springioc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.jsp.springioc.configuration")
@Configuration // is used to specify the source of bean definition to ioc container(if ioc is not available to the create the object , when the class is not annotate with the @Component)
public class ConfigClass {
@Bean("dog")   
//bean is used to third party
public Dog getDogObj() {
return new Dog();
}
}