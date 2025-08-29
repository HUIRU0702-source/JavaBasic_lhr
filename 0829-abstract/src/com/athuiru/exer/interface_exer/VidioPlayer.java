package com.athuiru.exer.interface_exer;

public class VidioPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("video play...");
    }

    @Override
    public void pause() {
        System.out.println("video play...");
    }

    @Override
    public void stop() {
        System.out.println("vidio play...");
    }
}
