package sk.stuba.fei.uim.oop;


import sk.stuba.fei.uim.oop.auto.Auto;
import sk.stuba.fei.uim.oop.utility.KeyboardInput;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Auto auto = new Auto();
        auto.nacitaj();






        int vek = ZKlavesnice.readInt("Zadajte vek: ");
        System.out.println("vek zklavesnice: " + vek);
        System.out.println("-----------------------");

        int vek2 = KeyboardInput.readInt("Zadajte vek",2);
        System.out.println("vek keyboardinput: " + vek2);
        System.out.println("-----------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadajte vek: ");
        int vek3 = scanner.nextInt();
        System.out.println("vek scanner: " + vek3);
        System.out.println("-----------------------");
    }
}
