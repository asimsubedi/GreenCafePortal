package com.nivtek.greencafe.entity;

import java.util.Objects;

public class Product {

    private String sku;
    private int id;
    private String shortDescription;
    private String longDescription;

    private double price;
    private boolean availability;
    private double weight;
    private int rating;

    public Product() {
    }

    public Product(String sku, int id, String shortDescription, String longDescription, double price, boolean availability, double weight, int rating) {
        this.sku = sku;
        this.id = id;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.price = price;
        this.availability = availability;
        this.weight = weight;
        this.rating = rating;
    }

    public String getSku() {
        return sku;
    }

    public int getId() {
        return id;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public double getWeight() {
        return weight;
    }

    public int getRating() {
        return rating;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Double.compare(product.price, price) == 0 && availability == product.availability && Double.compare(product.weight, weight) == 0 && rating == product.rating && Objects.equals(sku, product.sku) && Objects.equals(shortDescription, product.shortDescription) && Objects.equals(longDescription, product.longDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku, id, shortDescription, longDescription, price, availability, weight, rating);
    }

    @Override
    public String toString() {
        return "Product{" +
                "sku='" + sku + '\'' +
                ", id=" + id +
                ", shortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", price=" + price +
                ", availability=" + availability +
                ", weight=" + weight +
                ", rating=" + rating +
                '}';
    }
}
