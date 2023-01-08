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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();  // list1 과 list2를 합쳐서 저장하기 위한 변수 
        ListNode tail = head;  // list1 과 list2를 합쳐서 저장하기 위한 변수 
        while (list1 != null || list2 != null) { // 둘 다 null 값이 나오기 전까지 실행
           if (list1 == null || (list2 != null && list2.val < list1.val)) {
               tail.next = list2;
               tail = tail.next;
               list2 = list2.next;
           } else {
               tail.next = list1;
               tail = tail.next;
               list1 = list1.next;
           } 
        }
        return head.next;
    }
}