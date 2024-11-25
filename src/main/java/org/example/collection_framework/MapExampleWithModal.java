package org.example.collection_framework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExampleWithModal
{
    public static void main(String[] args)
    {

        Map<String, ArrayList<Product>> productMap = new HashMap<>();
        Product product1 = new Product(1001, "puma blue jean", "jean");
        Product product2 = new Product(1002, "puma black jean", "jean");
        ArrayList<Product> productArrayListJean = new ArrayList<>();
        productArrayListJean.add(product1);
        productArrayListJean.add(product2);
        productMap.put("jeans",productArrayListJean);
        ArrayList<Product> getJeansList = productMap.get("jeans");
        System.out.println("getJeansList "+getJeansList);
        getJeansList.forEach(product -> {
            System.out.println(product.productName);
            System.out.println(product.productType);
        });
        System.out.println(" map iterate ");

        productMap.forEach((key, value) -> {
            System.out.println(" key "+key+", value "+value);
            value.forEach(product -> {
                System.out.println(product.productName);
            });
        });
        for (Product product : getJeansList) {
            System.out.println(product);
        }

        Map<Integer, String> stringMap = new HashMap<>();
        stringMap.put(1,"vakul");
        stringMap.put(2,"ashish");
        for (Map.Entry<Integer, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        for(Map.Entry<Integer, String> map : stringMap.entrySet())
        {

        }
        Map<String , TestInterface> testInterfaceMap = new HashMap<>();
        TestInterface testInterface = new TestInterface() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        testInterfaceMap.put("101", testInterface);
    }
}

class Product
{
    int id;
    String productName;
    String productType;

    public Product(int id, String productName, String productType)
    {
        this.id = id;
        this.productName = productName;
        this.productType = productType;
    }

}
