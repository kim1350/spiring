package ru.alishev.spring;

import org.springframework.stereotype.Component;

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
    @Override
    public String getSong() {
        return "Hungarian Rhaps";
    }

}
