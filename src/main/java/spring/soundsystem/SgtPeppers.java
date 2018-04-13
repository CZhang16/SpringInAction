package spring.soundsystem;

import org.springframework.stereotype.Component;

import javax.inject.Named;

//@Named("lonelyHeartsClub") 与下条功能大致相同
//@Component("lonelyHeartsClub")
@Component
public class SgtPeppers implements CompactDisc {

    public void play() {
        System.out.println("Sgtpeppers");
    }
}
