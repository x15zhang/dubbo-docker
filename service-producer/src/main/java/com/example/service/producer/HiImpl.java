package com.example.service.producer;

import com.example.service.Hello;

public class HiImpl implements Hello{
    public String hello(String name) {
        return "Hi " + name;
    }
}
