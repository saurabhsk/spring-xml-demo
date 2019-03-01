package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware {

    private Actor actor1;
    private Actor actor2;
    private ApplicationContextAware applicationContextAware=null;

    public Movie(){}

    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }

   public Movie(Actor actor2){
        //this.actor1 = actor1;
        this.actor2 = actor2;
   }

    @Override
    public String toString() {
        return "Movie{" +
                "actor1=" + actor1+
               "actor2=" + actor2+
                '}';
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
          this.applicationContextAware=applicationContextAware;
    }

    public void setBeanName(String beanName) {
        System.out.println("Bean name is "+beanName);
    }
}
