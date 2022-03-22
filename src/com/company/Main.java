package com.company;

import java.util.Scanner;

public class Main {
    /**
     * Test Examples with Input and desired output:
     * N - 2
     * S - 2
     * E - 2
     * O - 2
     * EEOO - 3
     * SONE - 4
     * NENESONO - 7
     * SSEEEOOONN - 6
     * SONNNEESSSSOOONN - 17
     * SONNNEESSSSOOONNEEESON - 17
     * SSSSSNNNNNOOOOOEEEEENNNNNSSSSSEEEEEOOOOO - 21
     * NSNSNSNSNSNSNSNSNSNSNSNSNSNSNS - 2
     * nseo - Java.util.InputMismatchException: Your input cannot contain characters other than N,S,E,O
     * N E - Java.util.InputMismatchException: Your input cannot contain characters other than N,S,E,O
     * NDEON - Java.util.InputMismatchException: Your input cannot contain characters other than N,S,E,O
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PokemonCatcher pc = new PokemonCatcher();
        pc.move(scanner.nextLine());
        System.out.println(pc.getPokemonCount());
        scanner.close();

    }
}
