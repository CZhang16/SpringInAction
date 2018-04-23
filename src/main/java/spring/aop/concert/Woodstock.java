package spring.aop.concert;


import org.springframework.stereotype.Component;

@Component
public class Woodstock implements Performance {
    public void perform() {
        System.out.println("wooodStock perform");
    }
}
