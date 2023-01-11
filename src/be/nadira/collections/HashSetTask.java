package be.nadira.collections;

import be.nadira.CalcApp;

import java.util.HashSet;

public class HashSetTask {
    public static void main(String[] args) {

        // hashSet is a collection of items where every item is unique

        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars); // [Volvo, Mazda, Ford, BMW] no dublication

        System.out.println(cars.contains("Mazda")); //true
        System.out.println("==================");

        cars.remove("Volvo");
        System.out.println(cars);//[Mazda, Ford, BMW]
        System.out.println("===================");

     /*   cars.clear();
        System.out.println(cars); // [] */

        System.out.println(cars.size()); // 3
        System.out.println("======================");

        for (String i : cars) {
            System.out.println(i); // Mazda, Ford, BMW
        }
        System.out.println("=================");

        // Use a HashSet that stores Integer objects:

        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " was found in the set");
            } else {
                System.out.println(i + " was not found in the set");

                //1 was not found in the set
                //2 was not found in the set
                //3 was not found in the set
                //4 was found in the set   <--
                //5 was not found in the set
                //6 was not found in the set
                //7 was found in the set   <--
                //8 was not found in the set
                //9 was found in the set <--
                //10 was not found in the set

            }

        }
    }
}