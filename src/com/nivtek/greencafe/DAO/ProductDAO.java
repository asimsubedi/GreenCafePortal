package com.nivtek.greencafe.DAO;

import com.nivtek.greencafe.DB.ProductDB;
import com.nivtek.greencafe.entity.Product;

import java.util.List;

public class ProductDAO {

    private ProductDB productDB = new ProductDB();

    /**
     * This method calls the DB to return the product with given sku.
     * @param sku
     * @return Product
     */
    public Product getProduct(String sku){

        return productDB.getProduct(sku);
    }

    /**
     * This method calls the DB to return the product that contains string in sku.
     * @param searchString
     * @return Product
     */
    public Product searchProduct(String searchString) {
        return productDB.searchProduct(searchString);
    }

    /**
     * @return List of Products
     */
    public List<Product> getAllProducts() {
        return productDB.getAllProducts();
    }
}
