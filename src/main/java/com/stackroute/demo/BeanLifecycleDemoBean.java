package com.stackroute.demo;

public class BeanLifecycleDemoBean {

    public void customInit(){
        System.out.println("My init method called for BeanLifecycleDemoBean ");
    }

    public void customDestroy(){
        System.out.println("My destroy method called for BeanLifecycleDemoBean ");

    }
}
