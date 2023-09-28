package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ProductService refProdService = new ProductService();
        refProdService.addProduct(new Product("Mouse", "Electronic", "Table", 2022));
        refProdService.addProduct(new Product("Keyboard", "Electronic", "Desk", 2023));
        refProdService.addProduct(new Product("Monitor", "Electronic", "Office", 2021));
        refProdService.addProduct(new Product("Laptop", "Electronic", "Home", 2022));
        refProdService.addProduct(new Product("Headphones", "Electronic", "Bedroom", 2023));
        refProdService.addProduct(new Product("Chair", "Furniture", "Living Room", 2021));
        refProdService.addProduct(new Product("Sofa", "Furniture", "Family Room", 2022));
        refProdService.addProduct(new Product("Table", "Furniture", "Dining Room", 2023));
        refProdService.addProduct(new Product("Refrigerator", "Appliance", "Kitchen", 2021));
        refProdService.addProduct(new Product("Washing Machine", "Appliance", "Laundry Room", 2022));
        refProdService.addProduct(new Product("Toaster", "Appliance", "Kitchen", 2023));
        refProdService.addProduct(new Product("Bicycle", "Sports", "Garage", 2021));
        refProdService.addProduct(new Product("Treadmill", "Sports", "Home Gym", 2022));
        refProdService.addProduct(new Product("Basketball", "Sports", "Backyard", 2023));
        refProdService.addProduct(new Product("Book", "Books", "Library", 2021));
        refProdService.addProduct(new Product("DVD", "Movies", "Entertainment Center", 2022));
        refProdService.addProduct(new Product("Painting", "Art", "Living Room", 2023));
        refProdService.addProduct(new Product("Plant", "Home Decor", "Sunroom", 2021));
        refProdService.addProduct(new Product("Candle", "Home Decor", "Bedroom", 2022));
        refProdService.addProduct(new Product("Coffee Maker", "Kitchen Appliances", "Kitchen", 2023));
        refProdService.addProduct(new Product("Vacuum Cleaner", "Home Appliances", "Living Room", 2021));
        refProdService.addProduct(new Product("Gaming Console", "Electronics", "Game Room", 2022));
        refProdService.addProduct(new Product("Speakers", "Audio", "Home Theater", 2023));
        refProdService.addProduct(new Product("Hiking Boots", "Footwear", "Closet", 2021));
        refProdService.addProduct(new Product("Backpack", "Outdoor Gear", "Entryway", 2022));
        refProdService.addProduct(new Product("Tennis Racket", "Sports Equipment", "Garage", 2023));
        refProdService.addProduct(new Product("Dumbbells", "Fitness Equipment", "Basement", 2021));
        refProdService.addProduct(new Product("Swimsuit", "Swimwear", "Closet", 2022));
        refProdService.addProduct(new Product("Fishing Rod", "Outdoor Gear", "Garage", 2023));
        refProdService.addProduct(new Product("Puzzle", "Games", "Living Room", 2021));
        refProdService.addProduct(new Product("Telescope", "Astronomy", "Balcony", 2022));
        refProdService.addProduct(new Product("Cookware Set", "Kitchenware", "Kitchen", 2023));
        refProdService.addProduct(new Product("Guitar", "Musical Instruments", "Music Room", 2021));
        refProdService.addProduct(new Product("Microphone", "Audio Equipment", "Recording Studio", 2022));
        refProdService.addProduct(new Product("Sunglasses", "Eyewear", "Bedroom", 2023));
        refProdService.addProduct(new Product("BBQ Grill", "Outdoor Cooking", "Patio", 2021));
        refProdService.addProduct(new Product("Car", "Automobile", "Garage", 2022));
        refProdService.addProduct(new Product("Bicycle Helmet", "Cycling Gear", "Closet", 2023));
        refProdService.addProduct(new Product("Board Game", "Games", "Living Room", 2021));
        refProdService.addProduct(new Product("Kettle", "Kitchen Appliances", "Kitchen", 2022));
        refProdService.addProduct(new Product("Tool Set", "Tools", "Workshop", 2023));
        refProdService.addProduct(new Product("Desk Lamp", "Lighting", "Home Office", 2021));
        refProdService.addProduct(new Product("Smartphone", "Electronics", "Bedside Table", 2022));
        refProdService.addProduct(new Product("Earrings", "Jewelry", "Jewelry Box", 2023));
        refProdService.addProduct(new Product("Sneakers", "Footwear", "Closet", 2021));
        refProdService.addProduct(new Product("Fitness Tracker", "Wearable Tech", "Bedroom", 2022));
        refProdService.addProduct(new Product("Printer", "Office Equipment", "Home Office", 2023));

        List<Product> products = refProdService.getAllProduct();
        for(Product p: products){
            System.out.println(p);
        }
        System.out.println("============================================");


        Product p = refProdService.getSpecifiedProduct("Printer");
        System.out.println(p);
    }
}
