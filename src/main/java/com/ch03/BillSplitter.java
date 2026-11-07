package com.ch03;

import java.util.Scanner;

public class BillSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bill total: ");
        double bill = scanner.nextDouble();

        System.out.println("Tip percentage: ");
        double tipPercent = scanner.nextDouble();

        System.out.println("Number of people: ");
        int people = scanner.nextInt();

        double tip = bill * tipPercent / 100;
        double total = bill + tip;
        double perPerson = total / people;
        double perPersonRounded = Math.ceil(perPerson * 100) / 100;
        double leftover = perPersonRounded * people - total;

        System.out.printf("Tip: £%.2f%n", tip);
        System.out.printf("Total:   £%.2f%n", total);
        System.out.printf("Each pays:   £%.2f%n", perPersonRounded);
        System.out.printf("Extra tip from rounding: £%.2f%n", leftover);

        scanner.close();
    }
}
