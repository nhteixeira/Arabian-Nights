package org.academiadecodigo.bootcamp.ArabianNights;

public class Demon extends Genie {

    private boolean isSacrificed;

    public Demon(int maximumWishes) {
        super(maximumWishes, true);
    }

    public boolean isSacrificed() {
        return isSacrificed;
    }

    public void sacrifice(){
        isSacrificed = true;
    }

    @Override
    public boolean askForWish(){
        if(!isSacrificed){
            incrementGrantedWishes();
            System.out.println("Wish granted.");
            return true;
        }
        System.out.println("This demon has been sacrificed and can't grant more wishes.");
        return false;
    }

    @Override
    public String toString() {
        return "Demon granted wishes " + getGrantedWishes() + " maximum wishes " + getMaximumWishes();
    }
}

