import java.util.ArrayList;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class Pojistovna {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Pojisteny> pojistenci = new ArrayList<>();


    public void vytvorPojisteneho() {   //Vytvoření nového pojištěnce uživatelem
        System.out.println("Zadejte jméno pojištěného:");
        String jmeno = sc.nextLine();
        System.out.println("Zadejte příjmení:");
        String prijmeni = sc.nextLine();
        System.out.println("Zadejte telefonní číslo:");
        int tel = parseInt(sc.nextLine());
        System.out.println("Zadejte věk:");
        int vek = parseInt(sc.nextLine());

        //Vytvoření objektu pojištěnce + přidání do Arraylistu
        Pojisteny pojisteny = new Pojisteny(jmeno, prijmeni, vek, tel);
        pridejPojistence(pojisteny);
        System.out.println("Data byla uložena. Pokračujte libovolnou klávesou...");
    }

    public void pridejPojistence(Pojisteny pojisteny) {
        pojistenci.add(pojisteny);
    }

    public void vypisVsechnyPojistence() {
        for (Pojisteny pojistenec : pojistenci) {
            System.out.println(pojistenec.getJmeno() + " " + pojistenec.getPrijmeni() + " " + pojistenec.getTel() + " " + pojistenec.getVek());
        }
    }

    public void vyhledejPojistence() {
        System.out.println("Zadejte jméno pojištěného:");
        String vyhledavaneJmeno = sc.nextLine();
        System.out.println("Zadejte příjmení pojištěného:");
        String vyhledavanePrijmeni = sc.nextLine();
        for (int i = 0; i < pojistenci.size(); i++) {
            if ((pojistenci.get(i).getJmeno().equals(vyhledavaneJmeno)) && (pojistenci.get(i).getPrijmeni().equals(vyhledavanePrijmeni))) {
                System.out.println(pojistenci.get(i).getJmeno() + " " + pojistenci.get(i).getPrijmeni() + " " + pojistenci.get(i).getTel() + " " + pojistenci.get(i).getVek());
            } else System.out.println("Níkdo s tímto jménem v této databázi neexistuje");
        }
    }
}
