package org.araujo.starship;

import org.araujo.playable.Marine;
import org.araujo.playable.Pilot;
import org.araujo.playable.Playable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StarshipTest {

    @Test
    void validateStarshipWithoutCrewMembers() {
        Starship starfighter = new StarFighter();

        assertEquals("No crew member!", starfighter.takeOff());
        assertEquals("No crew member!", starfighter.land());
        assertEquals("No crew member!", starfighter.shoot());

        Starship bomber = new Bomber();

        assertEquals("No crew member!", bomber.takeOff());
        assertEquals("No crew member!", bomber.land());
        assertEquals("No crew member!", bomber.shoot());
    }

    @Test
    void validateStarshipShooting() {
        Starship starfighter = new StarFighter();
        Playable pilot1 = new Pilot();

        starfighter.enter(pilot1);
        assertEquals("Shooting lasers...", starfighter.shoot());

        Starship bomber = new Bomber();
        Playable pilot2 = new Pilot();

        bomber.enter(pilot2);
        assertEquals("Shooting cannons...", bomber.shoot());

        assertEquals(pilot1, starfighter.exit());
        assertEquals(pilot2, bomber.exit());

        assertEquals("No crew member!", starfighter.shoot());
        assertEquals("No crew member!", bomber.shoot());
    }

    @Test
    void validateStarshipInFlightConditions() {
        Starship starfighter = new StarFighter();
        Playable pilot = new Pilot();

        assertFalse(starfighter.isInFlight());
        starfighter.enter(pilot);

        assertEquals("Ship taking off...", starfighter.takeOff());
        assertEquals("Ship already in flight!", starfighter.takeOff());
        assertTrue(starfighter.isInFlight());

        assertEquals("Ship landing...", starfighter.land());
        assertEquals("Ship is already on the ground!", starfighter.land());
        assertFalse(starfighter.isInFlight());
    }

    @Test
    void validateStarshipEnterExit() {
        Starship bomber = new Bomber();
        Playable pilot1 = new Marine();
        Playable pilot2 = new Pilot();

        assertTrue(bomber.enter(pilot1));
        assertFalse(bomber.enter(pilot2));

        assertEquals(pilot1, bomber.exit());
        assertNull(bomber.exit());
    }
}