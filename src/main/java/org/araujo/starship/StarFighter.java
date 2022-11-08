package org.araujo.starship;

public class StarFighter extends Starship {

    @Override
    public String shoot() {
        return super.shootWeapon("lasers");
    }
}
