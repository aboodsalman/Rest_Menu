package com.example.rest_menu;

import java.util.ArrayList;
import java.util.List;

public class ProductMockupDA {
    private ArrayList<Product> products = new ArrayList<>();

    public ProductMockupDA(){
        products.add(new Product("Tea", "Hot Drinks", 6));
        products.add(new Product("Americano", "Hot Drinks", 6));
        products.add(new Product("Nescafe", "Hot Drinks", 10));
        products.add(new Product("Anise", "Hot Drinks", 8));
        products.add(new Product("Spanish Latte", "Hot Drinks", 12));
        products.add(new Product("Chai Latte", "Hot Drinks", 12));
        products.add(new Product("Matcha Latte", "Hot Drinks", 14));
        products.add(new Product("Hot Chocolate", "Hot Drinks", 10));

        products.add(new Product("Iced Tea", "Cold Drinks", 8));
        products.add(new Product("Iced Coffee", "Cold Drinks", 10));
        products.add(new Product("Coca Cola", "Cold Drinks", 5));
        products.add(new Product("Diet Cola", "Cold Drinks", 5));
        products.add(new Product("Fanta", "Cold Drinks", 5));
        products.add(new Product("Sprite", "Cold Drinks", 5));
        products.add(new Product("Pepsi", "Cold Drinks", 5));
        products.add(new Product("Milk Shake Oreo", "Cold Drinks", 12));
        products.add(new Product("Milk Shake Caramel", "Cold Drinks", 12));
        products.add(new Product("Milk Shake Lotus", "Cold Drinks", 12));
        products.add(new Product("Milk Shake Strawberry", "Cold Drinks", 12));
        products.add(new Product("Mango Smoothie", "Cold Drinks", 10));
        products.add(new Product("Mojito", "Cold Drinks", 10));
        products.add(new Product("Lemonade", "Cold Drinks", 10));

        products.add(new Product("Shawarma", "Sandwiches", 18));
        products.add(new Product("Oil and Thyme", "Sandwiches", 5));
        products.add(new Product("Sausage", "Sandwiches", 8));
        products.add(new Product("Burger", "Sandwiches", 20));
        products.add(new Product("Potato", "Sandwiches", 9));
        products.add(new Product("Potato with Cheese", "Sandwiches", 12));
        products.add(new Product("Chicken", "Sandwiches", 16));
        products.add(new Product("Pastrami", "Sandwiches", 8));

        products.add(new Product("Mexican Rice", "Rice Meals", 18));
        products.add(new Product("Fried Rice", "Rice Meals", 15));
        products.add(new Product("Chicken Fried Rice", "Rice Meals", 20));
        products.add(new Product("Egg Fried Rice", "Rice Meals", 18));
        products.add(new Product("Kimchi Fried Risotto", "Rice Meals", 20));
        products.add(new Product("Risotto", "Rice Meals", 20));
        products.add(new Product("Mushroom Risotto", "Rice Meals", 22));
        products.add(new Product("Vegetable Risotto", "Rice Meals", 22));
        products.add(new Product("Biryani", "Rice Meals", 20));
        products.add(new Product("Paella", "Rice Meals", 22));
        products.add(new Product("Red Beans and Rice", "Rice Meals", 20));
        products.add(new Product("Chicken Curry", "Rice Meals", 25));
        products.add(new Product("Maqluba", "Rice Meals", 22));

        products.add(new Product("Kunafa", "Sweets", 8));
        products.add(new Product("Chocolate Cake", "Sweets", 6));
        products.add(new Product("Peda", "Sweets", 6));
        products.add(new Product("Jalebi", "Sweets", 8));
        products.add(new Product("Kulfi", "Sweets", 8));
        products.add(new Product("Modak", "Sweets", 5));
        products.add(new Product("Ghevar", "Sweets", 12));
        products.add(new Product("Payasam", "Sweets", 10));
        products.add(new Product("Mysore Pak", "Sweets", 6));
        products.add(new Product("Rasgulla", "Sweets", 8));
    }
    public String[] getTypes(){
        String[] types = {"Hot Drinks", "Cold Drinks", "Sandwiches", "Rice Meals", "Sweets"};
        return types;
    }

    public ArrayList<Product> getProductsByType(String type){
        ArrayList<Product> p = new ArrayList<>();
        for(int i=0; i<products.size(); i++){
            if(products.get(i).getType().equals(type)) p.add(products.get(i));
        }
        return p;
    }
}
