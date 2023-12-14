package akshay.interview;

import akshay.dataStructure.ListNode;

/*
Given the head of a linked list, remove the nth node from the end
 of the list and return its head.

		Input: head = [1,2,3,4,5], n = 2
		Output: [1,2,3,5]
		Example 2:

		Input: head = [1], n = 1
		Output: []
		Example 3:

		Input: head = [1,2], n = 1
		Output: [1]
		*/


class NodeListProblem {
	static int length(ListNode head)
	{
		ListNode temp = head;
	  int count = 0;
	  while (temp != null) {
	    count++;
	    temp = temp.next;
	  }
	  return count;
	}
    public static ListNode removeNthFromEnd(ListNode head, int n) {
    	System.out.println("Before value:");
    	ListNode dup=head;
    	System.out.print("[");
    	  while (dup != null) {
              System.out.print(dup.val);
              dup = dup.next;
              if (dup != null) {
                  System.out.print(",");
              }
          }
        System.out.println("]");
    	int Length = length(head);
        int nodeFromBeginning = Length - n + 1;
        ListNode prev = null;
        ListNode temp = head;
        for (int i = 1; i < nodeFromBeginning; i++) {
          prev = temp;
          temp = temp.next;
        }
        if (prev == null) {
          head = head.next;
          return head;
        }
        else {
          prev.next = prev.next.next;
          return head;
        }
      }
    

        public static void main(String[] args) {
            // Create a linked list with the given input
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            // Remove the nth node from the end of the list
            int n = 3;
            head = removeNthFromEnd(head, n);

            // Print the modified list
            System.out.print("[");
            while (head != null) {
                System.out.print(head.val);
                head = head.next;
                if (head != null) {
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
    

}

