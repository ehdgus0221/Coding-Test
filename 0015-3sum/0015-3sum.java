class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
   Set<List<Integer>> result = new HashSet<>();  // 정렬이 되어있기에 순서가 다르지 않다.
    if(nums == null || nums.length < 3){return new ArrayList<>(result);}

    Arrays.sort(nums); // 오름차순으로 정렬, Class 내에 기본적으로 구현되어있는 Comparable Interface의 compareTo 메서드를 기준으로 하기 때문에 오름차순으로 정렬된다.
        
    for (int i = 0; i < nums.length-2; i++) {

       int j = i+1;
       int k = nums.length-1;
       while (j<k){
           int sum = nums[i]+nums[j]+nums[k];
           if(sum == 0){
               result.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
           }else if(sum < 0){   // 값을 올려야하기 때문에 왼쪽 포인터 이동
               j++;
           }else if(sum > 0) {  // 값을 내려야하기 때문에 오른쪽 포인터 이동
               k--;
           }
       }
    }
    return new ArrayList<>(result);
}
}