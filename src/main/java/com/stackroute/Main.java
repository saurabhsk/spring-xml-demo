//Task 2: From the master branch of spring-xml-demo repo create a constructor-injectionbranch.
// Add constructor to the Actor class to initialize with name and gender, and ageCreate three beans of
// type Actor in the bean definition file.  Use constructor-based injection in the bean definition file
// (beans.xml) to inject property values in each of the three beans via name, index, and type respectively.
// For the Movie bean, use constructor based object injection in the bean definition file (beans.xml) to
// inject an Actor bean. In the Main class, look up Movie bean using ApplicationContext and print out Author
// information. Use the same ApplicationContext to again look up the same Movie bean. Print out the equality
// result of the two Movie beans. System.out.println(beanA==beanB); Change the scope of the Movie bean
// in beans.xml to prototype and run the application again. Note the output. Replace id of the Movie bean
// with name having two values, like this:
//<bean name=”MovieA, MovieB” ........> Update the code in Main to get the Movie bean by its two different
// name.
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


        Movie movie1 = (Movie) context.getBean("movieB");
        if(movie.equals(movie1));{
            System.out.println(movie==movie1);
        }
        Movie movie2 = (Movie) context.getBean("movieB");
        System.out.println(movie2);
    }
}
