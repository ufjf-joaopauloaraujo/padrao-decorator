package org.araujo.playable;

public class Marine implements Playable {
    @Override
    public String move() {
        return "Moving Marine...";
    }

    @Override
    public String shoot() {
        return "Marine shoots with machine gun...";
    }
}
