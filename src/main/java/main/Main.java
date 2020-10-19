package main;

import config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.HelloService;

public class Main {
    public static void main(String[] args) {
        try(var context =new AnnotationConfigApplicationContext(Config.class)){
            HelloService service=context.getBean(HelloService.class);

            System.out.println(service.hello("Adrian"));


        }
    }
}
