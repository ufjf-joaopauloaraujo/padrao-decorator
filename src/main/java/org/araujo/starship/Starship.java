package org.araujo.starship;

import org.araujo.playable.Playable;

public abstract class Starship {

    private static final String NO_CREW_MEMBER = "No crew member!";

    private Playable crewMember;
    private boolean inFlight = false;

    public boolean isInFlight() {
        return inFlight;
    }

    public final String takeOff() {
        if (crewMember == null) {
            return NO_CREW_MEMBER;
        }
        if (inFlight) {
            return "Ship already in flight!";
        }
        inFlight = true;
        return "Ship taking off...";
    }

    public final String land() {
        if (crewMember == null) {
            return NO_CREW_MEMBER;
        }
        if (!inFlight) {
            return "Ship is already on the ground!";
        }
        inFlight = false;
        return "Ship landing...";
    }

    public final boolean enter(Playable p) {
        if (crewMember != null) {
            return false;
        }
        crewMember = p;
        return true;
    }

    public final Playable exit() {
        Playable c = crewMember;
        crewMember = null;
        return c;
    }

    protected String shootWeapon(String weapon) {
        if (crewMember == null) {
            return NO_CREW_MEMBER;
        }
        return String.format("Shooting %s...", weapon);
    }

    public abstract String shoot();
}
