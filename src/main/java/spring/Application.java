package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.aop.concert.Woodstock;

public class Application {

    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        Woodstock woodstock = context.getBean(Woodstock.class);
        woodstock.perform();
    }

}
