//Task 5: From the aware-interface branch of spring-xml-demo repo create a bean-lifecyclebranch.
// Add a BeanLifecycleDemoBean class in com.stackroute.demo that implements InitializingBean and DisposableBean.
// Override the required methods to print out messages. Define BeanLifecycleDemoBean as a bean in beans.xml.
// Run the application and observe the result.
// Add two methods customInit() and customDestroy() to the  BeanLifecycleDemoBeanclass and print out
// custom messages. In the BeanLifecycleDemoBean bean definition, in beans.xml, set the customInit()and
// customDestroy() methods to be called.Run the application.
package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        context.registerShutdownHook();
        Movie movie = (Movie) context.getBean("movieA");
        System.out.println(movie);

        BeanLifecycleDemoBean bean= (BeanLifecycleDemoBean) context.getBean("BeanLifecycleDemoBean");
    }
}
