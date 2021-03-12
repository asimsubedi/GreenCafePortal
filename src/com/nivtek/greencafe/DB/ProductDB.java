package com.nivtek.greencafe.DB;

import com.nivtek.greencafe.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductDB {

    private static List<Product> productsList = new ArrayList<>();

    public ProductDB() {
        populateProduct();
    }

    /**
     * This method add products to the product List
     */
    private void populateProduct() {
        // if DB is Empty
        if (productsList.size() <= 0) {
            productsList.add(
                    new Product(
                            "GC111",
                            001,
                            "The apples are red",
                            "The apples are imported from China. An apple a day keeps doctor away",
                            12.00,
                            true,
                            0.5,
                            3)
            );

            productsList.add(
                    new Product(
                            "GC109",
                            002,
                            "The mangoes are yellow and nice",
                            "The mango lassi is awesome. lets have some mango lassi.",
                            11.00,
                            false,
                            0.35,
                            4)
            );

            productsList.add(
                    new Product(
                            "GC110",
                            003,
                            "Coffee bar gives you energy",
                            "Long lasting coffee bar is awesome for long hours of work.",
                            7.00,
                            true,
                            0.35,
                            4)
            );
        }

    }

    /**
     * @param sku
     * @return Product
     */
    public Product getProduct(String sku) {
        Product foundProduct = new Product();

        for(Product product : productsList) {
            if(product.getSku().equalsIgnoreCase(sku))
                foundProduct = product;
        }

        return foundProduct;
    }

    /**
     * This method search for the product that contains searchString in sku...
     * @param searchString
     * @return Product
     */
    public Product searchProduct(String searchString) {
        Product foundProduct = null;

        for(Product product : productsList) {
            if(product.getSku().contains(searchString))
                foundProduct = product;
        }

        return foundProduct;

    }

    /**
     * @return List<Product>
     */
    public List<Product> getAllProducts() {
        return productsList;
    }
}
