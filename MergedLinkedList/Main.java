package MergedLinkedList;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1,  new ListNode(2,new ListNode(4)));
        ListNode list2 = new ListNode(1,new ListNode(3,new ListNode(4)));

        ListNode newhead = new ListNode();

        ListNode tail = new ListNode();

        tail = newhead;
        ListNode bob = new ListNode(10);

        tail.next = bob;

        System.out.println(newhead.next);

    }

    static ListNode mergedList(ListNode list1, ListNode list2){
       // 1 -- 2 -- 4
        //1 -- 3 --4

        // create the first node of new merged linked list to start

        ListNode head = new ListNode();
        ListNode temp = head;


        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
            }
           temp = temp.next;
        }

        if(list1 != null){
            temp.next = list1;
        }else{
            temp.next = list2;
        }

        return head.next;
    }
}
