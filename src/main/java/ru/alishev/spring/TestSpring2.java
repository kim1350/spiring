package ru.alishev.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
      /*  //Music music =  context.getBean("musicBean", Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comp = firstMusicPlayer == secondMusicPlayer;

        System.out.println(comp);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume(10);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());
       // System.out.println(musicPlayer.getName());
       // System.out.println(musicPlayer.getVolume());*/
        context.close();
    }
}
