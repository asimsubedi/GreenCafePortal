package com.nivtek.greencafe.app;

import com.nivtek.greencafe.entity.Product;

import java.util.Scanner;

public class UIOperations {

    private Scanner scanner = new Scanner(System.in);
    private final String UI_SEPARATOR = "\n---------------------------\n";

    public String getUI_SEPARATOR() {
        return UI_SEPARATOR;
    }

    /**
     * This method gets userChoice i.e. 1..4 in green cafe app
     * @return int
     */
    public int getUserChoice() {
        System.out.println("Enter Your Choice:");
        return scanner.nextInt();
    }

    /**
     * This method gets the input text from user and returns that text.
     * @param searchItem
     * @return String from userInput
     */
    public String getTextFromUser(String searchItem) {
        System.out.println("Enter " + searchItem + " : ");
        scanner.nextLine();
        String textFromUser = scanner.nextLine();
        return textFromUser;
    }

    /**
     * This is a helper method to print the product properties on console.
     *
     * @param product
     * @param displayAll
     */
    public void printResult(Product product, boolean displayAll) {
        if (displayAll) System.out.println(
                UI_SEPARATOR
                        + product.getSku() + " - "
                        + product.getId()
                        + " - $" + product.getPrice() + " - " + product.getWeight() + "oz "
                        + UI_SEPARATOR
                        + product.getShortDescription()
                        + UI_SEPARATOR + product.getLongDescription() + " - "
                        + product.getRating() + "* - AVAILABILITY " + product.isAvailability()
        );
        else System.out.println(
                product.getSku() + "-" + product.getShortDescription()
        );
    }
}
