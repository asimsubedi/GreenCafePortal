package com.nivtek.greencafe.service;

import com.nivtek.greencafe.DAO.ProductDAO;
import com.nivtek.greencafe.entity.Product;

import java.util.List;

public class SearchService {

    private ProductDAO productDAO = new ProductDAO();


    /**
     * This method returns the product when sku is passed.
     * @param sku
     * @return Product
     */
    public Product getProduct(String sku){
        if(sku.length() > 3){
            return productDAO.getProduct(sku);
        } else{
            return null;
        }
    }

    /**
     * This method returns the List of products when sku is passed.
     * @param searchString
     * @return Product
     */
    public Product searchProduct(String searchString) {
        return productDAO.searchProduct(searchString);
    }

    /**
     * This method returns the list of all products in our db.
     * @return List<Product>
     */
    public List<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }
}
