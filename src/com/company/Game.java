package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void jeu() {
        // L'utilisateur n'est pas limité en choix
        // Choix de l'utilisateur ( nombre entre 1 et 100 )

        Scanner scan = new Scanner(System.in);

        int nb = (int) (Math.random() * 101);
        int essai = 99;

            // Choix de l'utilisateur ( nombre entre 1 et 100 )
            for (int i = 0; i <= essai; i++) {
                System.out.println("Choisir un nombre entre 1 et 100 : ");

                int userchoice = scan.nextInt();

                if (userchoice == nb) {
                    System.out.println("Vous avez trouvé le bon nombre");
                    System.out.println("Vous avez trouvé le bon nombre en " + i + " coups.");
                    break;
                } else if (userchoice > nb) {
                    System.out.println("Le nombre à trouver est plus petit");
                } else if (userchoice < nb) {
                    System.out.println("Le nombre a trouver est plus grand");
                } else if (essai > 10) {
                    System.out.println("Vous avez perdu... ");
                }
            }
    }


        public static void jeuDixCoups() {

        // L'utilisateur a dix coups pour trouver le nombre
            Scanner scan = new Scanner(System.in);

            int nb = (int) (Math.random() * 101);
            int essai = 10;

            do {
                // Choix de l'utilisateur ( nombre entre 1 et 100 )
                for (int i = 0; i <= essai; i++) {
                    System.out.println("Choisir un nombre entre 1 et 100 : ");

                    int userchoice = scan.nextInt();

                    if (userchoice == nb) {
                        System.out.println("Vous avez trouvé le bon nombre");
                        System.out.println("Vous avez trouvé le bon nombre en " + i + " coups.");
                        break;
                    } else if (userchoice > nb) {
                        System.out.println("Le nombre à trouver est plus petit");
                    } else if (userchoice < nb) {
                        System.out.println("Le nombre a trouver est plus grand");
                    } else if (essai > 10) {
                        System.out.println("Vous avez perdu... ");
                    }
                }
            } while (essai >= 10);
        }
    }
