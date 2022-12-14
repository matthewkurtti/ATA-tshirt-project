package com.ata;

import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner;
//import javax.annotation.Nullable;

//import java.util.ArrayList;
//import java.util.Array;

/**
 * The ShopRunner class is the main entry point for the application.
 * It encapsulates a Menu, providing it with a Scanner configured
 * with System.in to allow the menu to read from standard in.
 * When the application starts, the menu's greet and show methods are called.
 */
public class ShopRunner {
    /**
     * Main entry point to the application.
     * Asks the menu's greeting to be printed to standard out by calling its greet method.
     * Asks the menu to be shown by calling its show method.
     * @param args Command line arguments to the application
     */
    public static void main(String[] args) {
        String[] productNames = {"Crew Neck", "V-Neck", "Polo", "Boat Neck", "Tank Top"};
        double[] productPrices = {20.00, 20.00, 25.50, 30.25, 15.75};
        Shop shop = new Shop(productNames, productPrices);
        Cart cart = new Cart();
        
        Menu menu = new Menu(new Scanner(new InputStreamReader(System.in, Charset.forName("UTF-8"))), shop, cart);

        menu.greet();
        menu.executeMenu();
    }
}
