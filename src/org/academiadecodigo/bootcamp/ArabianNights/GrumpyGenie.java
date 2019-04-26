package org.academiadecodigo.bootcamp.ArabianNights;

public class GrumpyGenie extends Genie {

    public GrumpyGenie() {
        super(1, false);
    }

    @Override
    public String toString() {
        if (getGrantedWishes() == 1){
            return "Grumpy Genie has granted 1 wish and will not grant you anymore.";
        }
        return "Grumpy Genie remaining wishes: " + 1 + ". Granted wishes: " + getGrantedWishes() + ". Maximum wishes: " + getMaximumWishes() + ".";
    }
}
