/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1=getlength(headA);
        int len2=getlength(headB);
        while(len1>len2){
            headA=headA.next;
            len1--;
        }
         while(len2>len1){
            headB=headB.next;
            len2--;
        }
        while(headA!=null && headB!=null){
            if(headA==headB){
                return  headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
    public int getlength(ListNode head){
        int len=0;
        while(head!=null){
            head=head.next;
            len++;
        }
        return len;
    }
}