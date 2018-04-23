package spring.aop.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {

    @Before("execution(* spring.aop.concert.Performance.perform(..))")
    public void silenceCellPhone() {
        System.out.println("Slience cell phone");
    }

    @Before("execution(* spring.aop.concert.Performance.perform(..)")
    public void takeSeats() {
        System.out.println("Taking seats");
    }
}
