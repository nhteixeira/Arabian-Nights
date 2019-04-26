package org.academiadecodigo.bootcamp.ArabianNights;

public class Main {

    public static void main(String[] args) {
        Lamp lamp1 = new Lamp(2);
        Lamp lamp2 = new Lamp(5);

        Genie genie1 = lamp1.rubLamp();
        Genie genie2 = lamp1.rubLamp();
        Genie genie3 = lamp1.rubLamp();

        genie1.askForWish();
        genie1.askForWish();

        genie2.askForWish();
        genie2.askForWish();
        genie2.askForWish();
        genie2.askForWish();
        genie2.askForWish();


        lamp1.sacrificeDemon(genie3);
        lamp1.sacrificeDemon(genie3);

        Genie genie4 = lamp1.rubLamp();
        Genie genie5 = lamp1.rubLamp();
        Genie genie6 = lamp1.rubLamp();

        genie3.askForWish();

        System.out.println(genie1);
        System.out.println(genie2);
        System.out.println(genie3);
        System.out.println(genie4);
        System.out.println(genie5);
        System.out.println(genie6);

        String[] array = new String[2];
        System.out.println(array.length);


    }
}
