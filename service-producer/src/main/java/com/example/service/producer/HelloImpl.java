package com.example.service.producer;

import com.example.service.Hello;

public class HelloImpl implements Hello{
    public String hello(String name) {
        return "Hello " + name;
    }
}

