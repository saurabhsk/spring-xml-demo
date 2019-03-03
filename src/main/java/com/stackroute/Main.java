//Task 4: From the autowire-xml branch of spring-xml-demo repo create an aware-interfacebranch.
// Implement ApplicationContextAware, BeanFactoryAware, BeanNameAware in theMovie class and print out
// their results.
package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Movie movie = (Movie) context.getBean("movieA");
        System.out.println(movie);


       Movie movie2 = (Movie) context.getBean("movieB");
        System.out.println(movie2);
    }
}
