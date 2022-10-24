package ru.alishev.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
       /* Music music = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        Music music2 = context.getBean("classicalMusic", Music.class);
        MusicPlayer classPlayer = new MusicPlayer(music2);
        classPlayer.playMusic();*/

        /*MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();*/
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        context.close();
    }
}
