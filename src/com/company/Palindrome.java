package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Palindrome {

    public static void jeu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer un chiffre ou un mot pour verifier si c'est un palindrome : ");

        String choixUser, reverse = "";
        choixUser = scan.nextLine();
        int length = choixUser.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + choixUser.charAt(i);
        if (choixUser.equals(reverse))
            System.out.println("C'est un un palindrome");
        else
            System.out.println("Ce n'est pas un palindrome");
    }
}
