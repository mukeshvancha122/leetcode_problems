package dsa;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}
public class ReverseLinkedList {
    public static void main(String[] args) {
         ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

       

        // Print reversed list: 3 -> 2 -> 1
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
