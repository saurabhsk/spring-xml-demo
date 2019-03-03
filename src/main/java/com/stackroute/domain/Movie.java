package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements InitializingBean, DisposableBean {

    private Actor actor1;

    public Movie(){}

    public void setActor1(Actor actor1) {

        this.actor1 = actor1;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "actor1=" + actor1+
                '}';
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean Init method is called");
    }

    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy method is called");
    }
}
