class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] nums2 = new int[2*nums.length];   // 기존의 배열을 한번 더 저장해야 하므로 공간의 크기를 2배 크게 해준다.
        for(int i=0; i<nums.length; i++){   // 배열의 크기만큼 반복
            nums2[i] = nums2[i+nums.length] = nums[i];  // 새로운 배열에 저장
        }
        return nums2;
    }
}