import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pojistovna pojistovna = new Pojistovna();

        int vyber = 0;
        while (vyber != 4) {
            System.out.println("--------------------\nEvidence pojištěných\n--------------------");
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
            vyber = parseInt(sc.nextLine());


            if (vyber == 1) {
                pojistovna.vytvorPojisteneho();
            } else if (vyber == 2) {
                pojistovna.vypisVsechnyPojistence();
            } else if (vyber == 3) {
                pojistovna.vyhledejPojistence();
            } else if ((vyber < 1) || (vyber > 4)) {
                System.out.println("Špatná volba");
            } else System.out.println("Ukončení aplikace...");
        }
    }
}
