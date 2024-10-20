package com.example.demo.music;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MusicPlayer {

    private Music music;
    private List<Music> musics = new ArrayList<>();
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic(){
        music.getSound();
    }

}
