package com.nivtek.greencafe.app;

import com.nivtek.greencafe.entity.Cart;
import com.nivtek.greencafe.entity.Product;
import com.nivtek.greencafe.service.SearchService;

public class CartUI {
    private int cartChoice = 0;
    private SearchService searchService = new SearchService();
    private UIOperations uiOperation = new UIOperations();

    private Cart cart = new Cart();
    private Product product = new Product();

    /**
     * This method displays the Shopping Menu allows user to
     * 1. view cart
     * 2. add to cart
     * 3. remove from cart
     */
    private void displayShoppingMenu() {
        System.out.println(
                uiOperation.getUI_SEPARATOR()
                        + "Choose to [1] view cart [2] Add to Cart [3] Remove from cart [0]Main Menu"
                        + uiOperation.getUI_SEPARATOR());
    }

    public void cartMenuOperations() {

        do{
            displayShoppingMenu();
            cartChoice = uiOperation.getUserChoice();

            switch (cartChoice) {
                case 1:
                    System.out.println(".. items in cart ..");
                    //displayCart();
                    break;

                case 2:
                    System.out.println(".. add items in cart ..");
                    // addToCart(sku);
                    break;

                case 3:
                    System.out.println(".. removing item in cart .. ");
                    // removeFromCart(sku);
                    break;

                default:
                    cartChoice = 0;
                    System.out.println(".. EXIT from Cart back to .. \n .. MAIN MENU .. ");
                    break;
            }

        } while (cartChoice != 0);

    }


}
