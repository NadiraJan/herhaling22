package be.nadira.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTask {
    public static void main(String[] args) {

        Deque<Person> people = new ArrayDeque<>();
        people.addFirst(new Person("Jan", true));
        people.addLast(new Person("Vahni", false));
        people.addFirst(new Person("Kwame", true));
        people.addLast(new Person("Fatiah", false));
        people.addFirst(new Person("Seungho", true));
        people.addLast(new Person("Liselot", false));

        while (people.size()>0){
            System.out.println("Matching:");
            System.out.println(people.pollFirst() + "with " + people.pollLast());

            // result: Matching:
            //Person{name='Seungho', male=true}with Person{name='Liselot', male=false}
            //Matching:
            //Person{name='Kwame', male=true}with Person{name='Fatiah', male=false}
            //Matching:
            //Person{name='Jan', male=true}with Person{name='Vahni', male=false}

        }

    }
}
