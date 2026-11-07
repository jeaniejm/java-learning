package com.ch05;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int MAX;
        final int MAX_ATTEMPT = 10;
        int bestScore = Integer.MAX_VALUE;

        System.out.println("=== Guess the secret number ===");

        String playAgain;
        do {
            do {
                System.out.println("Difficulty? (easy, medium, hard)");
                String difficulty = scanner.nextLine().trim().toLowerCase();

                MAX = switch (difficulty) {
                    case "easy" -> 50;
                    case "medium" -> 100;
                    case "hard" -> 1000;
                    default -> -1;
                };
            } while (MAX < 0);


            int secret = random.nextInt(1, MAX + 1);
            int attempts = 0;
            boolean won = false;

            System.out.printf("%nSecret number is between 1 and %d, you have %d tries.%n", MAX, MAX_ATTEMPT);

            while (attempts < MAX_ATTEMPT) {
                System.out.printf("%nYour guess: ");
                int guess = Integer.parseInt(scanner.nextLine().trim());

                if (guess < 1 || guess > MAX) {
                    System.out.printf("Please guess in between 1 and %d", MAX);
                    continue;
                }

                attempts++;

                if (guess < secret && (secret - guess) <= 5) {
                    System.out.println("So Close! Go higher!");
                } else if (guess > secret && (guess - secret) <= 5) {
                    System.out.println("So Close! Go lower!");
                } else if (guess < secret) {
                    System.out.println("Go higher!");
                } else if (guess > secret) {
                    System.out.println("Go lower!");
                } else {
                    won = true;
                    System.out.printf("You guessed it! Secret number is %d!", secret);
                    break;
                }
            }

            System.out.printf("%nPlay again? (y/n) ");
            playAgain = scanner.nextLine().trim();

            if (won) {
                System.out.printf("Got it in %d attempts!", attempts);

                if (attempts < bestScore) {
                    bestScore = attempts;
                    System.out.println("New best score!");
                }
            } else {
                System.out.printf("Out of tries! Secret number was %d!", secret);
            }

            if (bestScore != MAX_ATTEMPT) {
                System.out.printf("Best Score so far: %d", bestScore);
            }

        } while (playAgain.equalsIgnoreCase("y"));
        scanner.close();
    }
}
