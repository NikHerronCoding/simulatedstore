package com.example.restservice;

public record ItemList(Item[] items ) { 

    static String[] descriptions = {
        "Laptop - 15-inch, Intel i7, 16GB RAM, 512GB SSD",
        "Smartphone - 6.5-inch AMOLED display, 128GB storage, dual-camera",
        "Wireless Headphones - Noise-cancelling, Bluetooth 5.0, 20-hour battery life",
        "Smart Watch - Heart rate monitor, fitness tracker, notifications",
        "Gaming Console - 4K gaming, 1TB storage, multiple controller support",
        "DSLR Camera - 24MP sensor, Full HD video, interchangeable lenses",
        "Fitness Tracker - Step counter, sleep monitor, water-resistant",
        "External Hard Drive - 2TB capacity, USB 3.0, automatic backup",
        "Bluetooth Speaker - 20W output, portable, built-in microphone",
        "E-book Reader - 7-inch E-ink display, adjustable front light, weeks-long battery life"
    };

    static String[] names = {
        "Laptop",
        "Smartphone",
        "Wireless Headphones",
        "Smart Watch",
        "Gaming Console",
        "DSLR Camera",
        "Fitness Tracker",
        "External Hard Drive",
        "Bluetooth Speaker",
        "E-book Reader"
    };

    static String[] pictures = {
        "https://webobjects2.cdw.com/is/image/CDW/7063689?$product-detail$",
        "https://t-mobile.scene7.com/is/image/Tmusprod/Apple-iPhone-14-Pro-Max-Deep-Purple-frontimage",
        "https://target.scene7.com/is/image/Target/GUEST_b308c657-8aec-427b-bcbb-89a88b561fcf?wid=2301&hei=2301&fmt=pjpeg",
        "https://t-mobile.scene7.com/is/image/Tmusprod/Apple-Watch-SE-2nd-Gen-40mm-Starlight-Aluminum-Starlight-frontimage",
        "https://i5.walmartimages.com/seo/Xbox-Series-X-Video-Game-Console-Black_9f8c06f5-7953-426d-9b68-ab914839cef4.5f15be430800ce4d7c3bb5694d4ab798.jpeg?odnHeight=612&odnWidth=612&odnBg=FFFFFF",
        "https://i5.walmartimages.com/asr/27461116-26bd-4bbc-b9b0-a1f2314ff960_1.d58a5892b356f680d609fdbe164b56c8.jpeg?odnHeight=612&odnWidth=612&odnBg=FFFFFF",
        "https://i5.walmartimages.com/seo/iTech-Unisex-Sport-Smartwatch-Black-Silicone_ce336398-95b7-451c-8b8b-031a3ef52203.b383d506e1354168b903fc163cd9ecf6.jpeg?odnHeight=612&odnWidth=612&odnBg=FFFFFF",
        "https://c1.neweggimages.com/ProductImageCompressAll1280/22-234-435-01.jpg",
        "https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6507/6507301_sd.jpg;maxHeight=640;maxWidth=550",
        "http://allesebook.de/wp-content/uploads/2015/04/kindle-voyage-rahmenlos-large-schraeg-pagepress3.jpg"
    };

    static Item[] generateList(int length) {
        Item[] list = new Item[length];

        for (int i = 0; i < length; i++){
            String name = names[i];
            String description = descriptions[i];
            String picture = pictures[i];
            int quantity = (int)  Math.round((Math.random() * 100));
            double price = (double) Math.round(Math.random() * 1000);


            list[i] = new Item(i, name ,description, picture, quantity, price);
        }

        return list;
    }
}

//Item(int id, String name, String description, String picture, int quantity )