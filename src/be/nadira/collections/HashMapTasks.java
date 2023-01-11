package be.nadira.collections;

import java.util.HashMap;

public class HashMapTasks {
    public static void main(String[] args) {
        //HashMap store items in key/value pairs, you can access them by an index
        //of another type (String). One object is used as a key(index) to another
        //object(value). it can stores different type:
        //String key and Integer values, or the same types, like String key, and String values:

        HashMap<String, String> capitalCities = new HashMap<String,String>();//ONE TYPE STRING
        //to add items instead of add we use put() method:

        capitalCities.put("England","London");// String, String
        capitalCities.put("Belgium", "Brussels");
        capitalCities.put("Russia","Moscow");
        System.out.println(capitalCities);// {Belgium=Brussels, England=London, Russia=Moscow}

        //To access value we use get() and refer to its key:
        capitalCities.get("England"); // key is "England"
        System.out.println(capitalCities.get("England"));// London

        //To remove an ite, use the remove() and refer to the key:
        capitalCities.remove("England");
        System.out.println(capitalCities.remove("England"));//null

        //also to remove all items, use clear() method:
      /*  capitalCities.clear();
        System.out.println(capitalCities);// {} empty*/

        System.out.println(capitalCities.clone());//{Belgium=Brussels, Russia=Moscow}

        // to find how many items there are , use size() method:
        capitalCities.size();
        System.out.println(capitalCities.size());// 2

        //Loop through a HashMap:
        for(String i: capitalCities.keySet()){
            System.out.println(i); // Belgium  Russia
            System.out.println("===============");

                    }
        for(String i: capitalCities.values()){
            System.out.println(i);  //Brussels Moscow
            System.out.println("=========================");
        }

        for(String i: capitalCities.keySet()){
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
            //key: Belgium value: Brussels
            //key: Russia value: Moscow
        }
        System.out.println("========================");

        //String & Integer:

        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("Angie", 28);
        people.put("John", 44);
        people.put("Steve", 32);
        people.put("Angie", 28); // no dublication the last is removed in the result


        for(String i: people.keySet()){
            System.out.println("key: " + i + "value: " + people.get(i));

            //result: key: Angievalue: 28
            //        key: Stevevalue: 32
            //        key: Johnvalue:  44   //by age
        }



    }
}
