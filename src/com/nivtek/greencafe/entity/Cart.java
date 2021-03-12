package com.nivtek.greencafe.entity;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private static List<Product> productsInCart = new ArrayList<Product>();

    /**
     * This method adds product to the cart
     * @param productSKU
     */
    public boolean addToCart(String productSKU){

        return false;
    }

    /**
     * This method removes product from cart
     * @param productSKU
     * @return
     */
    public boolean removeFromCart(String productSKU) {

        return false;
    }

    /**
     * This method returns the list of items in the cart
     * @return List<Product> products list in the cart
     */
    public List<Product> getCart(){

        return productsInCart;
    }
}
