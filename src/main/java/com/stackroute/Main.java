//Task 6: From the bean-lifecycle branch of spring-xml-demo repo create a bean-post-processor branch.
// Add a BeanPostProcessorDemoBean class in com.stackroute.demo that implements BeanPostProcessorOverride
// the required methods to print out messages. Define BeanLifecycleDemoBean as a bean in beans.xml.
// Run the application and observe the result
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
    }
}
