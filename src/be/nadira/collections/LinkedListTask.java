package be.nadira.collections;

import java.util.LinkedList;

public class LinkedListTask {
    public static void main(String[] args) {

        //linkedList stores its items in containers and each container has a ling
        // to the next container in the list.Linked list use to manipulate data
        // in arrayList items stored in array if not
        //enough array than created new one and old one will be removed,
        //use arrayList for storing and accessing data

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(552);
        linkedList.add(22);
        linkedList.add(152);
        System.out.println(linkedList); // 552 22 152

        //methods in LinkedList:
        //addFirst(), addLast(); removeFirst(), removeLast(), getFirst(), getLast().

        linkedList.addFirst(555);
        System.out.println(linkedList);//[555, 552, 22, 152]
        linkedList.addLast(134);
        System.out.println(linkedList);//[555, 552, 22, 152, 134]
        linkedList.removeFirst();
        System.out.println(linkedList);//[552, 22, 152, 134]
        linkedList.removeLast();
        System.out.println(linkedList);//[552, 22, 152]

        System.out.println(linkedList.getFirst());//552
        System.out.println(linkedList.getLast());//152

    }
}
