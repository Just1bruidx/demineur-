package com.company;

import javax.print.DocFlavor;
import java.util.Scanner;

public class RemplirTableau {

    public static void tableau() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Combien de tableaux : ");
        int nbTableaux = scan.nextInt();
        System.out.println("Combien de nombres par tableaux : ");
        int nbNombres = scan.nextInt();

        System.out.println("Entrer une serie de " + nbNombres + " nombres compris entre 1 et 10 : " );

        Scanner scanner = new Scanner(System.in);
        String nombresUser = scanner.nextLine();

        
        String[] parts = nombresUser.split(" ");
        for (int i = 0; i < nbNombres; i++) {
            String part1 = parts[i];

            System.out.println(part1);
        }

        /*

        System.out.println("ENTREZ 5 CHIFFRES" );
        String[] suite = scan.nextLine().split(" ");
        for(String suites : suite) {
            System.out.println(suites);
        }


        String[] parts = str.split(" ");
        for (int i = 0; i >= nbTableaux ; i++) {
            String chiffresUser = parts[i];
            System.out.println(chiffresUser);

        }


        String[] nombres = nombresUser.split(" ", 5);
        System.out.println(nombres);

        String nombres1 = nombres[0];
        String part2 = nombres[1];
        String part3 = nombres[3];
        String part4 = nombres[4];
        String part5 = nombres[5];
        System.out.println(nombres1 + part2 + part3 + part4 + part5);

         */



    }
}
