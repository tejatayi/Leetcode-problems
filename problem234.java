//234. Palindrome Linked List


import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        if(count==1)
        return true;

        int mid = (count / 2) + 1;
        Stack<Integer> stack = new Stack<>();
        boolean fl = count % 2 == 0;
        count = 0;
        temp = head;  // Reset temp to the start of the list
        while (temp != null) {
            count++;
            if (!fl && mid == count ) {          // if count is odd and middle number
    
                    continue;
            }
            if (count < mid) {
                stack.push(temp.val);
            }
            else
            {
                if (stack.peek() == temp.val) 
                {
                    stack.pop();
                } 
                if (stack.isEmpty() && temp.next==null)
                return true;
                if(temp.next==null && (!stack.isEmpty()))
                return false;

            }
            temp = temp.next;
        }

        return true;
    }
}

public class problem234 {
    public static void main(String[] args) {
        // Test case: Convert array to linked list
        int[] array = {1, 2,2,1}; // Example array
        ListNode head = arrayToList(array);

        // Create solution object and test the isPalindrome function
        Solution solution = new Solution();
        boolean result = solution.isPalindrome(head);
        System.out.println("Is Palindrome: " + result); // Expected output: true
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
