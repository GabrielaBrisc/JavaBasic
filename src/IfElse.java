import java.util.Random;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
//        //Flow control (conditionale)
//        //if else - evalueaza conditii si bifurca codul in functie de rezultat
//        System.out.println("pornim radio");
//        boolean piesa_faina = false; //invat calc daca piesa e faina sau nu
//        // daca piesa e faina, dau radioul mai tare
//        if (piesa_faina == true){
//            System.out.println("dau mai tare radioul");
//            System.out.println("incep sa fredonez piesa");
//        }
//        System.out.println("Oprim radioul");
//
//        //alta situatie
//        System.out.println("pornim alta frecventa radio");
//        boolean piesa_faina1 = true; //invat calc daca piesa e faina sau nu
//        // daca piesa e faina, dau radioul mai tare
//        if (piesa_faina1 == true){
//            System.out.println("dau mai tare radioul");
//            System.out.println("incep sa fredonez piesa");
//        }
//        System.out.println("Oprim radioul");

        //if else
//        int nr = 0;
//        if (nr % 2 == 0){
//            System.out.println("par");
//        }else {
//            System.out.println("Impar");
//        }
//
//        if (nr > 0){
//            System.out.println("Pozitiv");
//        } else{
//            System.out.println("Negativ");
//        }

       // if, else if, else
        // luam date de la tastaura
//        Scanner sc = new Scanner(System.in); // o var cu tipul de date scanner
//        System.out.println("introdu ora:");
//        int ora = sc.nextInt();
//        if (ora <0) {
//            System.out.println("Ora invalida");
//        }else if (ora <= 11){
//            System.out.println("Neata!");
//        }else if (ora <= 18){
//            System.out.println("Ziua buna!");
//        }else if (ora <= 21){
//            System.out.println("buna seara!");
//        }else if (ora <= 24){
//            System.out.println("Noapte buna!!");
//        }else {
//            System.out.println("ora invalida");
//        }


        //tema: viteza unei masini
        // <0 viteza invalida, 0 stationeaza
        //<=50 localitate
        //<= 90 drum judetean

        //flow ctr
        //switch - se fol cand stim valorile posibile
        Scanner sc = new Scanner(System.in);
        System.out.println("alege optiunea");
        int optiunea = sc.nextInt();
        switch (optiunea) {
            case 0:
                System.out.println("meniu anterior");
                break;
            case 1:
                System.out.println("ro");
                break;
            case 2:
                System.out.println("eng");
                break;
            default:
                System.out.println("optiune invalida");
        }

    } // inchid functia main
} // inchide clasa
