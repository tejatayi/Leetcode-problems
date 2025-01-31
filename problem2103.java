//2130. Maximum Twin Sum of a Linked List

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}


public class problem2103 {
    
    public static int pairSum(ListNode head) {
        
        int max = -1;
        int length=0;
        int c=1;
        ListNode p1= head;
        while (p1!=null) {
            length++;
            p1=p1.next;
        }
        p1=head;
        ListNode p2 = head;
        while(c<=length/2 && p2!=null)
        {   

            c++;
            p2=p2.next;
        }
       
        p2 = reverseList(p2);

      

        while(p1!=null && p2!=null)
        {
           
            max=Math.max(max, (p1.val+p2.val));
            p1=p1.next;
            p2=p2.next;
        }

        System.out.println("max :" + max);
        return max;
    }
 
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
        
        int[] arr = {1,100000}; 

       
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
       System.out.println(pairSum(head));

    }

}
