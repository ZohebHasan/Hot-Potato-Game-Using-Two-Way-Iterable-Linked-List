// Author - Zoheb Hasan - 114687894 - CSE214 HW1 - Fall 2022
package cse214hw1;
import java.util.LinkedList;

 public class HotPotato {
     public static DoublyLinkedList<Integer> playWithDoublyLinkedList(int numberOfPlayers, int lengthOfPass) {
         DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
         DoublyLinkedList<Integer> result = new DoublyLinkedList<>();
         for (int i = 1; i <= numberOfPlayers; i++) {
             list.add(i);
         }
         TwoWayListIterator<Integer> it = list.iterator();
         int size = list.size();
         int index = 0;
         while (size != 1) {
             for (int i = 1; i <= lengthOfPass; i++) {
                 if (it.hasNext() && index < list.size() - 1) {
                     it.next();
                     index++;
                 } else {
                     while (it.hasPrevious()) {
                         it.previous();
                     }
                     index = 0;
                 }
             }
             if (it.hasNext() && index < list.size() - 1) {
                 int player = it.next();
                 result.add(player);
                 list.remove(index);
             } else {
                 TwoWayListIterator<Integer> temp = list.iterator();
                 for (int i = 0; i != list.size() - 1; i++) {
                     temp.next();
                 }
                 int player = temp.next();
                 result.add(player);
                 list.remove(index);
                 while (it.hasPrevious()) {
                     it.previous();
                     index = 0;
                 }
             }
             size--;
         }
         result.add(it.next());
         return result;
     }

     public static LinkedList<Integer> playWithLinkedList(int numberOfPlayers, int lengthOfPass) {
         LinkedList<Integer> list2 = new LinkedList<>();
         LinkedList<Integer> result = new LinkedList<>();
         for (int i = 1; i <= numberOfPlayers; i++) {
             list2.add(i);
         }
         int index = 0;
         while (list2.size() != 1) {
             for (int i = 1; i <= lengthOfPass; i++) {
                 if (index < list2.size() - 1) index++;
                 else index = 0;
             }
             if (index < list2.size() - 1) {
                 result.add(list2.get(index));
                 list2.remove(index);
             } else {
                 result.add(list2.get(index));
                 list2.remove(index);
                 index = 0;
             }
         }
         result.add(list2.get(0));
         return result;
     }

     public static void main(String[] args) {
         System.out.println(playWithDoublyLinkedList(5, 0)); // should print [1,2,3,4,5]
         System.out.println(playWithLinkedList(5, 1)); // should print [2, 4, 1, 5, 3]
     }
 }
