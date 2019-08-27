package com.example.service.consumer;

import com.example.service.Greetings;
import com.example.service.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@ImportResource({"classpath:services.xml"})
@RestController
@RequestMapping(value = "/con")
public class Application {

    @Autowired
    private ApplicationContext context;

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }

    @GetMapping("/greetings")
    public String greetings(@RequestParam(required = true) String name){
        Greetings greetingService = (Greetings)context.getBean("greetingService");
        String result = greetingService.say(name);
        return result;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(required = true) String name){
        Hello helloService = (Hello)context.getBean("helloService");
        String result = helloService.hello(name);
        return result;
    }

    @GetMapping("/hi")
    public String hi(@RequestParam(required = true) String name){
        Hello hiService = (Hello)context.getBean("hiService");
        String result = hiService.hello(name);
        return result;
    }


}
