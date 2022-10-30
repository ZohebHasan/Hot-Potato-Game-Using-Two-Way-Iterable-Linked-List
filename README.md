@ Author - Zoheb Hasan
DoublyLinkedList class was used to implement the circle of players. Thus, DoublyLinkedListIterator was used to simulate the passes,  
and remove method to reflect the elimination of players. It has been implemented as the
playWithDoublyLinkedList(int, int) you can see in HotPotato.java.

The Idea of the game: 
There are N people, numbered 1 to N, who are sitting in a circle. Starting at person 1, a hot potato is
passed. After M passes, the person holding the hot potato is eliminated, and the circle is reduced by 1 in
size (i.e., there is no empty spot left after the elimination of a player). The game continues with the person
who was sitting after the eliminated player picking up the hot potato. The last remaining player wins. So,
if the game starts with N = 5 and M = 0, the players are eliminated immediately in the order 1, 2, 3, 4,
and player 5 wins. If the game starts with N = 5 and M = 1, then the players are eliminated in the order
2, 4, 1, 5, and players 3 wins.

The game was implemented with both doubly linked list and linked list, where the hot potato being
passed around can be thought as the “iteration” on that list. 
