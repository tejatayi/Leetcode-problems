//328. Odd Even Linked List



class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class problem328 {

    public static ListNode oddEvenList(ListNode head) {
    
        if(head == null)
        return null;


        int c=1;
        ListNode odd ;
        ListNode even;
        odd=null; even=null;
        ListNode temp = head;
        ListNode oddp=odd, evenp=even;
        while(temp!=null)
        {
            if(c%2!=0)
            {
                if(odd==null)
                {
                    odd = new ListNode(temp.val);
                    oddp=odd;
                }
                else{
                    
                    ListNode t = new ListNode(temp.val);
                    oddp.next=t;
                    oddp=t;
                }
            }
            else{
                if(even==null)
                {
                    even = new ListNode(temp.val);
                    evenp=even;
                }
                else{
                    ListNode t = new ListNode(temp.val);
                    evenp.next=t;
                    evenp=t;
                }
            }
            temp=temp.next;
            c++;
        }

        head=odd;
        oddp.next=even;
    
        printList(head);

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
        
        int[] arr = {2,1,3,5,6,4,7}; 

       
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
       printList(oddEvenList(head));

    }
    }

   

    

