package com.athuiru.exer.interface_exer;

import org.junit.Test;

public class InterfaceTest {
    @Test
    public void test() {
        startPlayback(new AudioPlayer());
        startPlayback(new VidioPlayer());
    }

    private void startPlayback(Playable media) {
        media.play();
    }
}
