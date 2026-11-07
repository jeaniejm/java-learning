package com.ch01;

public class BusinessCard {
    public static void main(String[] args) {
        textBlock();
    }

    public static void textBlock() {
        String card = """
                +-----------+
                | Jane Doe  |
                +-----------+
                """;
        System.out.println(card);
    }

    public static void learnString() {
        double total = 12.5;
        String message = String.format("Total: £%.2f", total);
        System.out.println(message);
        System.out.printf("Total: £%.2f%n", total);
    }

    public static void businessCard() {
        System.out.println("+----------------------------------------+");
        System.out.println("|                                        |");
        System.out.println("|               JEANIE                   |");
        System.out.println("|           Software Engineer            |");
        System.out.println("|                                        |");
        System.out.println("|       Email:\tjane@example.com         |");
        System.out.println("|       Github:\tgithub.com/janedoe       |");
        System.out.println("|      Motto: \"Break it, then fix it.\"   |");
        System.out.println("|     Loves: indie films & small dogs    |");
        System.out.println("|                                        |");
        System.out.println("+----------------------------------------+");
        System.out.println("\n[ Jeanie | QA -> Dev | Java 25 ]\n");
    }
}

