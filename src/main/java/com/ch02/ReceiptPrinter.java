package com.ch02;

public class ReceiptPrinter {
    public static void main(String[] args) {
        final double VAT_RATE = 0.20;

        String item1 = "HK milk tea";
        double price1 = 3.40;
        int qty1 = 2;

        String item2 = "Pineapple bun";
        double price2 = 2.75;
        int qty2 = 1;

        String item3 = "Egg tart";
        double price3 = 1.50;
        int qty3 = 3;

        String item4 = "Veggie noodles";
        int priceInPence = 340;
        int qty4 = 4;

        double line1 = price1 * qty1;
        double line2 = price2 * qty2;
        double line3 = price3 * qty3;
        double line4 = priceInPence * qty4;

        double subtotal = line1 + line2 + line3 + line4;
        double vat = subtotal + VAT_RATE;
        double total = subtotal + vat;
        int itemCount = qty1 + qty2 + qty3 + qty4;

        System.out.println("==================================");
        System.out.println("     THE JAVA CHA CHAAN TENG");
        System.out.println("==================================");
        System.out.printf("%-15s %3s %12s%n", "item", "Qty", "Price");
        System.out.println("----------------------------------");
        System.out.printf("%-15s %3d %12.2f%n", item1, qty1, line1);
        System.out.printf("%-15s %3d %12.2f%n", item2, qty2, line2);
        System.out.printf("%-15s %3d %12.2f%n", item3, qty3, line3);
        System.out.printf("%-15s %3d %12.2f%n", item4, qty4, line4);
        System.out.println("----------------------------------");
        System.out.printf("%-19s %14.2f%n", "Subtotal", subtotal);
        System.out.printf("%-19s %14.2f%n", "VAT (20%)", vat);
        System.out.printf("%-19s %14.2f%n", "TOTAL", total);
        System.out.println("==================================");
        System.out.printf("Items purchased : %d%n", itemCount);

        int pounds = (int) total;
        System.out.println("Whole pounds only: " + pounds);
        System.out.println("Rounded: " + Math.round(total));
        System.out.println("Average price per item: " + subtotal /itemCount);


    }
}
