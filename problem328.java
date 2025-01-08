//328. Odd Even Linked List


import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class problem328 {

    public static ListNode oddEvenList(ListNode head) {
    
        ListNode oddpointer= head;
        ListNode evenpointer=head.next; 
        ListNode current = head;
        int counter=1;   
        while(current!=null)
        {
            
            if(counter%2==1)
            {
                evenpointer.next=current.next;
                ListNode temp = current.next;
                oddpointer.next=current;
                current.next=evenpointer;
                current=temp;
                counter++;
                oddpointer=oddpointer.next;      // pointing to the end of odd pointer
                evenpointer=evenpointer.next;    // pointing to the end of even pointer
            }
            if(current.next==null && counter%2==1)   // final node case if it is a odd index
            {
                current.next=oddpointer.next;
                oddpointer.next=current;
                evenpointer.next=null;
                current=evenpointer;
            }
            
        }

        return head;
    }


    public static void main(String[] args) {
        // Test case: Convert array to linked list
        int[] array = {1,2,3,4,5,6,7}; // Example array
        ListNode head = arrayToList(array);

        // Create solution object and test the isPalindrome function
    
    
       oddEvenList(head);
        while(head!=null)
        {
            System.out.print(head.val+"->");
            head= head.next;

        }
    }

   

    // Function to convert array to linked list
    public static ListNode arrayToList(int[] array) {
        if (array.length == 0) return null;
        ListNode head = new ListNode(array[0]);
        ListNode current = head;
        for (int i = 1; i < array.length; i++) {
            current.next = new ListNode(array[i]);
            current = current.next;
        }
        return head;
    }
}