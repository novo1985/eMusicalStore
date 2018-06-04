package com.emusicstore.dataaccessobject;

import com.emusicstore.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private List<Product> productList;
    public List<Product> getProductList() {

        Product product1 = new Product();
        product1.setProductId("p1-1239adf");
        product1.setProductName("Piano");
        product1.setProductCategory("Instrument");
        product1.setProductDescription("This is a fender star piano");
        product1.setProductPrice(19999.99);
        product1.setProductStatus("Active");
        product1.setProductCondition("new");
        product1.setUnitInStock(18);
        product1.setProductManufacturer("fender");

        Product product2 = new Product();
        product2.setProductId("p2-197r7y");
        product2.setProductName("Record1");
        product2.setProductCategory("Record");
        product2.setProductDescription("This is an awesome mix of music");
        product2.setProductPrice(19.99);
        product2.setProductStatus("Active");
        product2.setProductCondition("new");
        product2.setUnitInStock(8);
        product2.setProductManufacturer("ABC");

        Product product3 = new Product();
        product3.setProductId("p3-ahi237");
        product3.setProductName("Speaker1");
        product3.setProductCategory("Accessory");
        product3.setProductDescription("This is a Polk Shelf Speaker!");
        product3.setProductPrice(199.9);
        product3.setProductStatus("Active");
        product3.setProductCondition("new");
        product3.setUnitInStock(38);
        product3.setProductManufacturer("EPIC");

        productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        return productList;
    }

    public  Product getProductById(String productId) throws IOException{
        for(Product product: getProductList()) {
            if(product.getProductId().equals(productId)) {
                return product;
            }
        }

        throw new IOException("No product found");
    }
}
