package org.araujo.playable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayableTest {

    @Test
    void validateMarine() {
        Playable p = new Marine();
        assertEquals("Moving Marine...", p.move());
        assertEquals("Marine shoots with machine gun...", p.shoot());
    }

    @Test
    void validatePilot() {
        Playable p = new Pilot();
        assertEquals("Moving Pilot...", p.move());
        assertEquals("Pilot shoots with pistol...", p.shoot());
    }
}