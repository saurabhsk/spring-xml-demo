
//Task 3: From the constructor-injection branch of spring-xml-demo repo create a autowire-xml branch.
// For the Movie bean, delete the constructor based object injection in the bean definition file
// (beans.xml) that injects an Actor bean. Use autowire byName in the Movie bean to inject an Actor
// bean. Run the application. Create another Movie bean and try autowire byType. Run the application
// and note the exception thrown. Fix the Movie bean by removing autowire byType and using constructor
// injection instead
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
