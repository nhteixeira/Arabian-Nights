package org.academiadecodigo.bootcamp.ArabianNights;

public class Genie {
    private int grantedWishes;
    private int maximumWishes;
    private boolean isDemon;

    public Genie(int maximumWishes, boolean isDemon) {
        this.maximumWishes = maximumWishes;
        this.isDemon = isDemon;
        this.grantedWishes = 0;
    }

    public int getGrantedWishes() {
        return grantedWishes;
    }

    public void incrementGrantedWishes() {
        grantedWishes++;
    }

    public int getMaximumWishes() {
        return maximumWishes;
    }

    public boolean isDemon() {
        return isDemon;
    }

    public boolean askForWish(){
        if(grantedWishes < maximumWishes){
            grantedWishes++;
            System.out.println("Wish granted.");
            return true;
        }
        System.out.println("This genie can't grant more wishes.");
        return false;
    }
}


