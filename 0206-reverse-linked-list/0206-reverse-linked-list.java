/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        //teen pointer bnaenge 
       ListNode prev =  null;
       ListNode current = head ;
       ListNode next = null;
       while(current != null){
        //1.sbse pehle current ke next ko next pe daal denge . so that 1->2->3 1 ka baki ke element se connection ban jae
        next = current.next;
        //2. current ko uske previous pe shift karenge (first itteration me null ho jaega ) 
        current.next = prev;
        //3. previous ko current pe shift karenge pehle
        prev = current;
        //4. fir current ko next pe shift karenge
        current = next;
       }
       //esa krte krte last me previous last element pe shift ho jaega , aur usko retrun kr denge.
       return prev;
    }
}