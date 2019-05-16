package retail;

import money.Wallet;

import java.util.Scanner;

public class Concessions {
    private static Wallet wallet1 = new Wallet();

    public static void displayConcessionsMenu() {
        int choice;
        boolean quit = true;
        Scanner input = new Scanner(System.in);
        while (quit) {
            displayMenu();
        }
    }

    public static void displayMenu() {
        final Scanner in = new Scanner(System.in);
        System.out.println("What would you like to buy from the Concessions." + wallet1.getTotalWallet() + "\n$3 Hot dog - \n$4 Nachos - " +
                "\n$5 Hamburger - \n$2 Pop - \n$3 Corn dog");
        System.out.println("");
        String text = in.nextLine();
        String msg = "";
        int[] concessionItems = {3, 4, 5, 2, 3,};
        String[] items = {"Hot dog", "Nachos", "Hamburger", "Pop", "Corn dog"};


        for (int i = 0; i <= concessionItems.length-1; i++) {
            if (text.equals(items[i])) {
                wallet1.setWallet(concessionItems[i]);
                System.out.println("It costs $" + concessionItems[i]);
                wallet1.setWallet(concessionItems[i]);
            }
        }

    }
}




