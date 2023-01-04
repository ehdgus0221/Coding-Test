class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // 더미 리스트 생성
        ListNode curr = dummy; // 포인터 초기화
        int carry = 0; // 0으로 초기화
        // l1, l2가 null에 도달하지 않거나, 모두 null일때까지 while문 진행
		// 목록에 추가
        while(l1 != null || l2 != null || carry == 1){
            int sum = 0; 
            if(l1 != null){ // l1을 추가하고 이동
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){ // l2을 추가하고 이동
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry; // carry값이 있으면 sum에 더함
            carry = sum/10; // carry를 얻으면, 10 이상의 carry를 얻기위해 사용
            ListNode node = new ListNode(sum % 10); // 모듈화하여 얻을 값은 새 노드값, 리스트에 추가
            curr.next = node; // curr을 얻게되는 경우 curr은 새 노드를 가리킨다.
            curr = curr.next; // 항상 curr 업데이트
        }
        return dummy.next; // 더미값인 bcz를 반환한다.
    }
}