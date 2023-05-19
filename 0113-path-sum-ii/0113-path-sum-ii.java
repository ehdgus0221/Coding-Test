/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
    
        public void dfs(TreeNode node, List<Integer> path, int remainingSum) {
        
        // null이면 반환
        if (node == null) return;
            
        // 현재 노드 값을 경로에 추가
        path.add(node.val);

        // !node.left && !node.right : 리프 노드인지 확인
        // leftSum == node.val: 남은 합이 있는지 확인 - node.val == 0
        // 두 조건이 모두 참이면 경로 중 하나를 찾습니다.
        if (node.left == null && node.right == null && remainingSum == node.val) ans.add(new ArrayList<>(path));

        // 업데이트된 나머지 합계로 왼쪽 하위 트리를 탐색합니다.
        // 왼쪽 하위 트리가 nullptr인지 여부를 확인할 필요가 없습니다.
        // 이 함수의 첫 번째 줄에서 처리할 때
        this.dfs(node.left, path, remainingSum - node.val);

        // 업데이트된 나머지 합계로 오른쪽 하위 트리를 탐색합니다.
        // 오른쪽 하위 트리가 nullptr인지 여부를 확인할 필요가 없습니다.
        // 이 함수의 첫 번째 줄에서 처리할 때
        this.dfs(node.right, path, remainingSum - node.val);
            
        // 백트래팅
        path.remove(path.size() - 1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> path = new ArrayList<Integer>();
        dfs(root, path, targetSum);
        return ans;
    }
}
