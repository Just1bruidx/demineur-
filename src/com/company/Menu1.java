package com.company;

import java.util.Scanner;

class Menu {

        public static void choixUser() {

            Scanner scan = new Scanner(System.in);
            System.out.println("A quel jeu souhaite tu jouer aujourd'hui? ");
            System.out.println("");
            System.out.println(" 1 - Trouver un nombre au hasard");
            System.out.println(" 2 - Palindrome ");
            System.out.println(" 3 - Démineur ");
            System.out.println(" 4 - Remplir tableau ");
            System.out.println(" 5 - Quitter ");
            System.out.println("");
            int userChoice = scan.nextInt();
            System.out.println("");

            switch (userChoice) {
                case 1 :
                    com.company.Menu.choixUserNumber();
                case 2 :
                    Palindrome.jeu();
                case 3 :
                    break;
                case 4 :
                    RemplirTableau.tableau();
                case 5 :
                    break;
            }
        }

        public static void choixUserNumber() {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Quel mode de jeu ? ");
            System.out.println("");
            System.out.println(" 1 - Avoir 10 essais pour réussir à deviner le nombre");
            System.out.println(" 2 - Jouer jusqu'à trouver le nombre");
            System.out.println(" 3 - Quitter ");
            System.out.println("");

            int userChoiceNumber = scanner.nextInt();
            System.out.println("");

            switch (userChoiceNumber) {
                case 1 :
                    Game.jeuDixCoups();
                case 2 :
                    Game.jeu();
                case 3 :
                    com.company.Menu.choixUser();
            }
        }
    }

