package be.nadira.collections;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        //HASHSET IS BASED ON HASHTABLE DATA STRUCTURE
        //no dublicates IN HASHSET, if dublicate than gives FALSE
        //IN CASE OF HASHSET insertion order is not preserved!!!
        HashSet hashSet = new HashSet<>();
        hashSet.add("Belgium");
        hashSet.add("Antwerp");
        hashSet.add("antwerp");
        hashSet.add(123);
        hashSet.add(null);
        hashSet.add(123);
        System.out.println(hashSet);
        System.out.println(hashSet.add("Belgium"));
        //RESULT:[null, Belgium, Antwerp, antwerp, 123]
        //false
        System.out.println("-----------------");

        //LINKED HASHSET IS A CHILD OF HASH SET:
        //LINKED HASHSET IS BASED ON THE COMBINATION OF LINKEDLIST & HASHTABLE DATA STRUCTURE
        //insertion order is preserved

        LinkedHashSet linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("java");
        linkedHashSet.add("algorithm");
        linkedHashSet.add("byte");
        linkedHashSet.add(null);
        linkedHashSet.add(1222);
        linkedHashSet.add(1222);
        System.out.println(linkedHashSet);//result: [java, algorithm, byte, null, 1222]
        //order is preserved!!!
        System.out.println("_________________");

        //SortedSet is a child of SET interface
        // we use when we need Object first, last, sorted headSet <Obj
        // tailSet >=Obj
       SortedSet sortedSetOfCountries = new TreeSet();
        sortedSetOfCountries.add("Australia");
        sortedSetOfCountries.add("USA");
        sortedSetOfCountries.add("Germany");
        sortedSetOfCountries.add("Russia");
        sortedSetOfCountries.add("Slovenia");


        System.out.println(sortedSetOfCountries);//result:[Australia, Germany, Russia, Slovenia, USA]

        System.out.println(sortedSetOfCountries.first());//result:Australia
        System.out.println(sortedSetOfCountries.last());// USA

        System.out.println(sortedSetOfCountries.headSet("Slovenia"));//[Australia,Germany, Russia]
        System.out.println(sortedSetOfCountries.tailSet("Russia"));//[Russia, Slovenia, USA]

        System.out.println(sortedSetOfCountries.subSet("Australia", "Russia"));//[Australia, Germany]
        System.out.println(sortedSetOfCountries.comparator());//null because of natural sorting order

        System.out.println("_________________");

        //TreeSet based on balance tree data structures, no dublicates also
        //insertion order is not preserved, it is based on sorting order of objects
        //heterogeneous objects are not allowed - we get : Class cast excepiton
        //null insertion is not possible "add null= mag niet!!! NullPointerException

        TreeSet treeSet = new TreeSet<>();
        treeSet.add("America");
        treeSet.add("Belgium");
        treeSet.add("Greece");
        treeSet.add("Denmark");
        treeSet.add("Vietnam");

        System.out.println(treeSet);//result: [America, Belgium, Denmark, Greece, Vietnam]

        // treeSet.add(123);
        // treeSet.add(null); MAG NIET!!!
        System.out.println("_______________");

        Scanner kbd = new Scanner(System.in);
        System.out.println("enter words: ");
        NavigableSet<String> words = new TreeSet<>();
        while (words.size() < 3) {
            String word = kbd.next();
            words.add(word);

        }
        words.forEach(System.out::println);

//in case of Navigable we can also print out: first, last etc
        System.out.println(words.first());
        System.out.println(words.last());


    }






    }




