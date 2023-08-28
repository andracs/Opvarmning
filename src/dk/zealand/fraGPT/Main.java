package dk.zealand.fraGPT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AverageCalculator averageCalculator = new AverageCalculator();

        System.out.println("Hej med dig!");

        while (true) {
            System.out.print("Indtast et tal (eller 'q' for at afslutte): ");
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                averageCalculator.addNumber(input);
                System.out.println("Gennemsnittet af de indtastede tal er " + (int) Math.round(averageCalculator.getAverage()));
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("q")) {
                    break;
                } else {
                    System.out.println("Ugyldigt input. Prøv igen.");
                }
            }
        }

        System.out.println("Programmet er afsluttet.");
    }
}
