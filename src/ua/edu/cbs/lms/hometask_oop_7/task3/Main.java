package ua.edu.cbs.lms.hometask_oop_7.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        //List<Price> priceList = new ArrayList<>();

        //priceList.

        Set<Price> priceSet = new TreeSet<>();

        priceSet.add(new Price(Shops.Eldorado, "iPhone 5", 10000.00));
        priceSet.add(new Price(Shops.Foxtrot, "iPhone 5", 9999.00));
        priceSet.add(new Price(Shops.Metro, "iPhone 5", 899.00));
        priceSet.add(new Price(Shops.Epicentr, "iPhone 6", 11000.00));
        priceSet.add(new Price(Shops.Eldorado, "iPhone 6", 12000.00));
        priceSet.add(new Price(Shops.Comfy, "iPhone 6", 11499.99));

        for (Price price:priceSet){
            System.out.println(price);
        }
    }
}
