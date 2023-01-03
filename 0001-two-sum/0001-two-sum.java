// Hash Table을 사용하여 계산을 최소화 시킨다.
// target 값에서 각 자리의 key값을 순서대로 빼면서 뺀 결과값이 다른 key값에 있으면 반복문 종료
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i < nums.length; i++) map.put(nums[i], i);
            for(int i1 = 0; i1 < nums.length; i1++){
                Integer i2 = map.get(target - nums[i1]);
                if (i2 != null && i1 != i2) return new int[]{i1, i2};
        }
        throw new IllegalArgumentException("No Result");
    }
}
public class Test {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        Solution sol = new Solution();
        int[] result = sol.twoSum(nums, 9);
        System.out.println(result[0] + ", " + result[1]);
    }
}