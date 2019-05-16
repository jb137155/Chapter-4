package retail;

import money.Wallet;

import java.util.Scanner;



public class Gift_Shop {
    private static Wallet wallet1 = new Wallet();

    public static void displayGiftShop() {
        int choice;
        boolean quit = true;
        Scanner input = new Scanner(System.in);
        while (quit) {
            displayMenu();
        }

    }
    public static void displayMenu(){
        final Scanner in = new Scanner(System.in);
        System.out.println("What would you like to buy from the Gift_shop." + wallet1.getTotalWallet() + "\n$25 Backpack - \n$10Glasses - " +
                "\n$20 Shirt - \n$15 Hat - \n$5 Pencil - \n$10 mug - \n$8 keychain - \n$5 bracelet - \n$7 book - \n$10 Teddy bear");
        System.out.println("");
        String text = in.nextLine();
        String msg = "";
        int[] giftItems = {25, 10, 20, 15, 5, 10, 8, 5, 7, 10};
        String[] items = {"Backpack", "Glasses", "Shirt", "Hat", "Pencil", "mug", "keychain", "bracelet", "book", "Teddy bear",};


        for(int i =0; i<=giftItems.length-1; i++)
            if (text.equals(items[i])) {
                System.out.println("It costs $" + giftItems[i]);
                wallet1.setWallet(giftItems[i]);
            }


        }
    }




