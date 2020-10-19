package aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {

    @Before("execution(* service.HelloService.hello(..))")
    public void before(){
        System.out.println("A");

    }
}
