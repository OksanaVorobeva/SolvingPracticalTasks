package com.exampl.taskGuru.pr3;

import java.util.*;

public class HWF {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.addProduct(new Product("a", 5));
        manager.addProduct(new Product("b", 10));
        manager.getAllProduct();
        manager.sortListByProductCost();
        manager.sortListByProductName();
        manager.sortListByPrice();
    }
}

class Manager {

    private  Basket basket = new Basket();


    void addProduct(Product product) {
        basket.getProducts().add(product);
    }

    void getAllProduct() {
        int result=0;
        System.out.println(basket.getProducts());
        for (Product product : basket.getProducts()) {
            result += product.getPrice();
        }
        System.out.println(result);
    }
    void  sortListByProductName(){
        ProductNameComparator comparator = new ProductNameComparator();
        basket.getProducts().sort(comparator);
        System.out.println(basket.getProducts());
    }

    void sortListByPrice(){
        ProductCostComparator priceComparator = new ProductCostComparator();
        basket.getProducts().sort(priceComparator);
        System.out.println(basket.getProducts());
    }

    void sortListByProductCost(){
        Comparator<Product> comparator = new ProductNameComparator().thenComparing(
                new ProductCostComparator());
        basket.getProducts().sort(comparator);
        System.out.println(basket.getProducts());
    }
}

class Basket {
    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }
}

class ProductCostComparator implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}

class ProductNameComparator implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Product{" +
               "name='" + name + '\'' +
               ", price=" + price +
               '}';
    }
}

