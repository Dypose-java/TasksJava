package code_me.habr.task2;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

 class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode current = listNode;

        return null;
    }

     }
    class Main{
        public static void main(String[] args) {
           ListNode listNode = new ListNode(2);
           listNode.next = new ListNode(4);
           listNode.next.next = new ListNode(6);

            ListNode listNode1 = new ListNode(5);
            listNode1.next = new ListNode(6);
            listNode1.next.next = new ListNode(4);
           /*ListNode current = listNode;
           while (current!=null){
               System.out.println(current.val);
               current=current.next;
           }*/
            ListNode dummyHead = new ListNode(0);
            ListNode res = dummyHead;
            int total = 0,carry = 0;

           while (listNode1!=null||listNode!=null||carry!=0){
               total=carry;
               if (listNode!=null){
                   total+=listNode.val;
                   listNode=listNode.next;
               }
               if (listNode1!=null){
                   total+=listNode1.val;
                   listNode1=listNode1.next;
               }
               int num =total%10;
               carry =total/10;
               dummyHead.next = new ListNode(num);
               System.out.println();
           }
            System.out.println();
        }
    }
