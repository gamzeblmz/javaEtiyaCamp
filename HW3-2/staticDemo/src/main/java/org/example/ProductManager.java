package org.example;

public class ProductManager {
    public void add(Product product) {
        ProductValidator productValidator = new ProductValidator();
//        if(productValidator.isValid(product)){
//            System.out.println("eklendi.");
//        }else {
//            System.out.println("ürün bilgileri gecersizdir.");
//        }

        // static ifadesi nesnenin örneğini bir kez olusturur
        if (ProductValidator.isValid(product)) {
            System.out.println("eklendi.");
        } else {
            System.out.println("ürün bilgileri gecersizdir.");
        }

    }
}
