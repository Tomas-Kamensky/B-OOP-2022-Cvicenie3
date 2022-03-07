package sk.stuba.fei.uim.oop.auto;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Random;
import java.util.Scanner;

public class Auto {
    private Scanner scanner;
    private Random random;

    public Auto(){
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    public void nacitaj(){
        String meno = scanner.nextLine();
        System.out.println("Nacital som: "+meno);

        int nahodneCislo = random.nextInt(101); //nahodne cislo od 0 do 100
    }
}
