package be.nadira.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class ArrayListTasks {
    public static void main(String[] args) {
        //nameOfList.add, nameOfList.remove(by index), nameOfList.clear, nameOfList.set(), nameOfList.size, Collections.sort(nameOfList)
        //iteration by arrayList.size not by array.length

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Volvo");
        arrayList.add("BMW");
        arrayList.add("Ford");
        System.out.println(arrayList);

        System.out.println(arrayList.get(2));//Ford
        System.out.println(arrayList.set(0, "Opel")); //Volvo
        System.out.println(arrayList.remove(1));//BMW
        System.out.println(arrayList); //[Opel, Ford]
        //   arrayList.clear();// []
        System.out.println("=======");
        System.out.println(arrayList.size());// 2
        System.out.println("=================");

        // for loop:
     /*   ArrayList<String>animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Bear");
        animals.add("Fox");
        for(int i=0; i<animals.size();i++){
            System.out.println(animals.get(i)); //Dog Cat Bear Fox*/
        System.out.println("==========================");

        //for-each:

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(125);
        numbers.add(22);
        numbers.add(633);
        for (Integer n : numbers) {
            System.out.println(n);//125 22 633
        }

        //SORT AN ARRAYLIST OF STRINGS:
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Nissan");
        cars.add("Audi");
        cars.add("Toyota");
        cars.add("Mercedes");
        Collections.sort(cars);
        for (String i : cars) {
            System.out.println(i); //Audi Mercedes Nissan Toyota
        }

        Collections.sort(numbers);
        for (Integer n : numbers)
            System.out.println(n); // 22 125 633


    }


}

