package com.ch04;

import java.util.Scanner;

public class TicketPricer {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Age: ");
        int age = Integer.parseInt(scanner.nextLine().trim());

        System.out.println("Day (MON-SUN): ");
        String day = scanner.nextLine().trim().toUpperCase();

        System.out.print("Student? (y/n): " );
        boolean isStudent = scanner.nextLine().trim().equalsIgnoreCase("y");

        if (age <= 0 || age > 120) {
            System.out.println("That doesn't look like a real age.");
            return;
        }

        double basePrice = switch (day) {
            case "SAT", "SUN" -> 12.00;
            case "MON", "WED", "THUR", "FRI" -> 9.50;
            case "TUE" -> 6.00;
            default -> -1;
        };

        if (basePrice < 0) {
            System.out.println("Unknown day: " + day);
            return;
        }

        double price;
        String reason;

        if (age < 3) {
            price = 0;
            reason = "Under 3s go free";
        } else if (age < 16) {
            price = basePrice * 0.5;
            reason = "Under 16s pay half";
        } else if (age > 65) {
            price = basePrice * 0.7;
            reason = "Over 65s pay 70%";
        } else {
            price = basePrice;
            reason = "Standard price";
        }

        if (isStudent && (price - 2) >= 4) {
            price = price - 2;
            reason += " + student discount";
        }

        String dayType = basePrice == 12.00 ? "weekend" : "weekday";

        System.out.printf("%nBase %s price: £%.2f%n", dayType, basePrice);
        System.out.println("Applied: " + reason);
        System.out.printf("You pay: £%.2f%n", price);

        scanner.close();
    }
}
