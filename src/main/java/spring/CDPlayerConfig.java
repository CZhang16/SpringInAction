package spring;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import spring.soundsystem.CDPlayer;
import spring.soundsystem.CompactDisc;
import spring.soundsystem.MediaPlayer;
import spring.soundsystem.SgtPeppers;

@Configurable
//@ComponentScan("spring.soundsystem")
//@ComponentScan(basePackages = ("soundsystem", "vidio"))
//@ComponentScan(basePackageClasses = CompactDisc.class)类所在的包为基础包
@Import(Config.class)//引用其他java配置
//@ImportResource("wenjianming.xml")//引用xml配置
public class CDPlayerConfig {

    @Bean(name = "lonelyHeartsClubBand")//不使用name属性时，bean名为方法名
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }
    @Bean//构造器中sgtPeppers()方法不会实际调用，spring会拦截此方法使用容器中的bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }
    /*@Bean
    public MediaPlayer anOtherCdPlayer(CompactDisc disc) {
        return new CDPlayer(disc);
    }*/


}
