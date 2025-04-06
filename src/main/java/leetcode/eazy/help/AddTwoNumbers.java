package leetcode.eazy.help;

import java.math.BigInteger;

public class AddTwoNumbers {
    static public ListNode MyaddTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = l1;
        StringBuilder strHead= new StringBuilder();
        while (current != null) {
            strHead.append(current.val);
            current = current.next;
        }
        ListNode current1 = l2;
        StringBuilder strHead1= new StringBuilder();
        while (current1 != null) {
            strHead1.append(current1.val);
            current1 = current1.next;
        }
        strHead.reverse();
        strHead1.reverse();
        //int sumHeaders=Integer.parseInt(strHead.toString())+Integer.parseInt(strHead1.toString());
        BigInteger sumHeaders = new BigInteger(strHead.toString()).add(new BigInteger(strHead1.toString()));
        String string[] = new StringBuilder(String.valueOf(sumHeaders)).reverse().toString().split("");
        ListNode listNode = new ListNode(Integer.parseInt(string[0]));
        ListNode currents = listNode;
        for (int i = 1; i < string.length; i++) {
            currents.next = new ListNode(Integer.parseInt(string[i]));
            currents = currents.next;
        }
        return listNode;
    }
    static public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode res = dummy;
        int total = 0, carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            total = carry;

            if (l1 != null) {
                total += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                total += l2.val;
                l2 = l2.next;
            }

            int num = total % 10;//   10%10=0
            carry = total / 10;  //   10/10=1
            System.out.println();
            dummy.next = new ListNode(num);
            dummy = dummy.next;
        }

        return res.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode head1 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode heads = addTwoNumbers(head,head1);
        System.out.println(heads);

    }

}
