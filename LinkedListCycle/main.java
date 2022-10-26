package LinkedListCycle;

public class main {
    public boolean hasCycle(Lnode head) {
        if (head == null || head.next == null){
            return false;
        }

        Lnode slowPointer = head;
        Lnode fastPointer = head;

        while(fastPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;

            if(fastPointer == slowPointer){
                return true;
            }
        }
        return false;
    }
}
