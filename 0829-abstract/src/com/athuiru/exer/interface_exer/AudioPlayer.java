package com.athuiru.exer.interface_exer;

public class AudioPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("audio play...");
    }

    @Override
    public void pause() {
        System.out.println("audio pause...");
    }

    @Override
    public void stop() {
        System.out.println("audio stop...");
    }
}
