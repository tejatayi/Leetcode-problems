//206. Reverse Linked List



class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}


public class problem206 {
    
    public static ListNode reverseList(ListNode head) {
        
        ListNode curr = head;
        ListNode nex = head.next;
        ListNode prev= null;

        while(nex!=null)
        {
            curr.next= prev;
            prev=curr;
            curr=nex;
            nex=curr.next;
        }
        curr.next=prev;
        

        return curr;
    }


    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5}; 

       
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
       printList(reverseList(head));

    }

}
