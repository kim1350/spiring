package ru.alishev.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("doing my init");
    }
    @PreDestroy
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
