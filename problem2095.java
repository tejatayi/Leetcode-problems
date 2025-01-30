//2095. Delete the Middle Node of a Linked List

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}


public class problem2095 {
    
    public static ListNode deleteMiddle(ListNode head) {
        
        
        int c=-1;
        ListNode temp = head;

        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }

        if(c==0)
        return null;
        if(c==1)
        {
            head.next=null;
            return head;
        }

        if(c%2==0)
        c=(c/2)-1;
        else
        c=c/2;
        temp=head;
        while(c>0)
        {
            temp=temp.next;
            c--;
        }

        temp.next=temp.next.next;

        return head;
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
        
        int[] arr = {2,1}; 

       
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
       printList(deleteMiddle(head));

    }

}
