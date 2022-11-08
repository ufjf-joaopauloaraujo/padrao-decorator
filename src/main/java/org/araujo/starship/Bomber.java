package org.araujo.starship;

public class Bomber extends Starship {

    @Override
    public String shoot() {
        return super.shootWeapon("cannons");
    }
}
