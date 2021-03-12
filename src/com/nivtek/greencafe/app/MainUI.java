package com.nivtek.greencafe.app;

import com.nivtek.greencafe.entity.Product;
import com.nivtek.greencafe.service.SearchService;

import java.util.Scanner;

public class MainUI {

    private int choice = 0;
    private SearchService searchService = new SearchService();
    private UIOperations uiOperation = new UIOperations();
    private Product product = new Product();

    /**
     * This Method displays menu to perform operations like
     * 1. Display All Products
     * 2. search product by sku
     * 3. Search product by keyword
     * 4. start shopping
     */
    private void displayMainMenu() {
        System.out.print(uiOperation.getUI_SEPARATOR() + ":: GREEN CAFE PORTAL ::" + uiOperation.getUI_SEPARATOR()
                + "Menu:\n[1] Display All Products | "
                + "[2] Search Product by SKU | "
                + "[3] Search Product by keyword\n"
                + "[4] Start Shopping | "
                + "[0] EXIT" + uiOperation.getUI_SEPARATOR());
    }

    public void mainMenuOperations() {

        do {
            displayMainMenu();
            choice = uiOperation.getUserChoice();

            switch (choice) {
                case 1:
                    displayAllProducts();
                    break;

                case 2:
                    String sku = uiOperation.getTextFromUser("sku");
                    searchWithSKU(sku);
                    break;

                case 3:
                    String keyword = uiOperation.getTextFromUser("keyword");
                    searchWithString(keyword);
                    break;

                case 4:
                    System.out.println(".. Starting shopping .. ");
                    CartUI cartUI = new CartUI();
                    cartUI.cartMenuOperations();
                    break;

                case 0:
                    System.out.println(".. exiting green portal app .. BYE");
                    System.exit(0);
                    break;

                default:
                    System.err.println("WRONG CHOICE!");
                    break;
            }

        } while (choice != 0);
    }

    /**
     * This Method displays all products available in store
     */
    public void displayAllProducts() {
        searchService.getAllProducts().forEach(product1 -> uiOperation.printResult(product1, false));
    }

    /**
     * This method search for the product with entered sku
     *
     * @param sku
     */
    public void searchWithSKU(String sku) {
        System.out.println(".. searching with sku ..");
        product = searchService.getProduct(sku);
        uiOperation.printResult(product, true);

    }

    /**
     * This method search Product with input keyword
     *
     * @param keyword
     */
    public void searchWithString(String keyword) {
        System.out.println(".. searching with keyword ..");
        product = searchService.searchProduct(keyword);
        uiOperation.printResult(product, false);
    }

}
