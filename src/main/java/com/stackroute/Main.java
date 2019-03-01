//Task 1:Create a Maven project and add required dependency of spring-context5.1.4.RELEASECreate a Main
// class in package com.stackroute and two Spring Beans –  Movie, and Actor in package com.stackroute.domain.
// Actor has two String properties, name and gender, and an age property of type int.
// An Actor can be initialized with the three properties via the corresponding setter methods.
// Use property based injection in the bean definition file (beans.xml) Movie “has a” Actor that can be
// initialized via the corresponding setter method. Use property based object injection in the bean
// definition file (beans.xml) The Main class looks up Movie bean via three ways to print out actor
// information: 1.Using XmlBeanFactory2.Using Spring 3.2 BeanDefinitionRegistry and BeanDefinitionReader3.
// Using ApplicationContextCr
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

        //xmlBeanFactory method
        Resource resource = new ClassPathResource("beans.xml");
        XmlBeanFactory factory = new XmlBeanFactory(resource);

        Actor actor= (Actor) factory.getBean("act");
        System.out.println(actor);

        //ApplicationContext Method

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Actor actor1 = (Actor) context.getBean("act");
        System.out.println(actor1);

        //BeanDefinitionRegistry Method

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(new ClassPathResource("beans.xml"));

        Actor actor2 = (Actor)beanFactory.getBean("act");
        System.out.println(actor2);


    }
}
