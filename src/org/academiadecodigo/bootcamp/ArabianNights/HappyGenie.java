package org.academiadecodigo.bootcamp.ArabianNights;

public class HappyGenie extends Genie {

    public HappyGenie(int maximumWishes) {
        super(maximumWishes, false);
    }

    public int getRemainingWishes(){
        return getMaximumWishes() - getGrantedWishes();
    }

    @Override
    public String toString() {
        if (getGrantedWishes() == getMaximumWishes()){
            return "Happy Genie has granted all wishes he could and will not grant you anymore.";
        }
        return "Happy Genie remaining wishes " + getRemainingWishes() + " granted wishes " + getGrantedWishes() + " maximum wishes " + getMaximumWishes();
    }
}
