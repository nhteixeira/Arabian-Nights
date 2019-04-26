package org.academiadecodigo.bootcamp.ArabianNights;

import java.util.Objects;

public class Lamp {
    private int maximumGenies;
    private int invokedGenies;
    private int rechargeCounter;


    public Lamp(int maximumGenies) {
        this.maximumGenies = maximumGenies;
        this.invokedGenies = 0;
        this.rechargeCounter = 0;
    }

    public int getMaximumGenies() {
        System.out.println("Maximum number of genies in this lamp: " + maximumGenies);
        return maximumGenies;
    }

    public int getInvokedGenies() {
        System.out.println("Invoked genies from this lamp: " + invokedGenies);
        return invokedGenies;
    }

    public Genie rubLamp() {
        if (invokedGenies < maximumGenies) {
            invokedGenies++;
            if (invokedGenies % 2 == 0) {
                System.out.println("Lamp invoked a happy genie.");
                return new HappyGenie(4);
            } else {
                System.out.println("Lamp invoked a grumpy genie.");
                return new GrumpyGenie();
            }
        }
        System.out.println("This lamp can't invoke more genies. A demon has been invoked instead.");
        return new Demon(2);
    }

    public void sacrificeDemon(Genie genie){
        if(!genie.isDemon()) {
            System.out.println("Can't sacrifice a genie.");
        } else {
            if(((Demon)genie).isSacrificed()){
                System.out.println("This demon has already been sacrificed.");
            } else {
                invokedGenies = 0;
                rechargeCounter++;
                ((Demon)genie).sacrifice();
                System.out.println("Demon sacrificed.");
                System.out.println("Lamp has been recharged, you can summon " + maximumGenies + " genies again.");
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lamp lamp = (Lamp) o;
        return maximumGenies == lamp.maximumGenies &&
                invokedGenies == lamp.invokedGenies &&
                rechargeCounter == lamp.rechargeCounter;
    }
}
