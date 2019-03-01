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
