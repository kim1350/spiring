package ru.alishev.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("doing my init");
    }

    public void doMyDest(){
        System.out.println("do my destruction");
    }
    private List<String> songs = new ArrayList<>();
    {
        songs.add("Classical Music1");
        songs.add("Classical Music2");
        songs.add("Classical Music3");
    }
    @Override
    public List<String> getSong() {
        return songs;
    }

}
