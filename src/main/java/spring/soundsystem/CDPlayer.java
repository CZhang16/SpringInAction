package spring.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }
    //@Inject 与Autowired 注解功能相似
   /* @Autowired(required = true) //required 默认为true为false时没有bean注入时不会报错，但要注意空指针问题,同时多个bean满足时会有异常
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }*/


    public void play() {
        cd.play();
    }
}
