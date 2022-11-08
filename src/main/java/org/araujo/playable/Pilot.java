package org.araujo.playable;

public class Pilot implements Playable {
    @Override
    public String move() {
        return "Moving Pilot...";
    }

    @Override
    public String shoot() {
        return "Pilot shoots with pistol...";
    }
}
