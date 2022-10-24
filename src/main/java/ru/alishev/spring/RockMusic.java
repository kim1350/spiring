package ru.alishev.spring;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> songs = new ArrayList<>();
    {
        songs.add("Rock Music1");
        songs.add("Rock Music2");
        songs.add("Rock Music3");
    }
    @Override
    public List<String> getSong() {
        return songs;
    }
}
