package be.nadira.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuTask {
    //Queue extends Collection Interface is used to hold elements to be processed
    //in FIFO First In First Out order.

    public static void main(String[] args) {

       /* Queue<Burgerorder> burgerOrders = new LinkedList<>();
        burgerOrders.add(new Burgerorder("Vegan Chicken Nuggets", 15));
        burgerOrders.add(new Burgerorder("Chicken Nuggets", 13));
        burgerOrders.add(new Burgerorder("Big Bacon", 1));
        burgerOrders.add(new Burgerorder("Mc Flurry", 12));
        burgerOrders.add(new Burgerorder("Belgian Fries", 15));

        while(burgerOrders.size()>0){
            System.out.println(burgerOrders.poll()); //result: insertion order is preserved
        }*/

        // if we change to PriorityQueue:


        Queue<Burgerorder> burgerOrders = new PriorityQueue<>();
        burgerOrders.add(new Burgerorder("Vegan Chicken Nuggets", 15));
        burgerOrders.add(new Burgerorder("Chicken Nuggets", 13));
        burgerOrders.add(new Burgerorder("Big Bacon", 1));
        burgerOrders.add(new Burgerorder("Mc Flurry", 12));
        burgerOrders.add(new Burgerorder("Belgian Fries", 15));

        while (burgerOrders.size()>0){
            System.out.println(burgerOrders.poll()); //exception cannot be cast to class java.lang.Comparable

            // that is why in class Burgerorder have to implement Comparable!!!
            //after Comparable we got by number from small to big
        }
    }
}
