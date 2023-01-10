// 
//     public boolean isMonotonic(int[] nums) {
//         int a=0;
//         int b=0;
//         for(int i=0; i<nums.length-1; i++)    {
//            int result = nums[i] - nums[i+1];  // 나열되어 있는 수 비교
           
//             if(Math.abs(result) <= 1)  // 1이상 차이만 나지않으면 되므로 절대값으로 변환해준뒤 비교
//                 {
//                 a += 1;
//                 }
//                 else {
//                 b += 1;
//                 }       
//         }
//         if(b==0){
//         return true;
//         }
//         else{
//             return false;
//         }
        
//     }
// }
class Solution {
public boolean isMonotonic(int[] nums) {
    if (nums.length <= 1) return true;
    int m = 0, n = 0;
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] >= nums[i-1]) m++;
        if (nums[i] <= nums[i-1]) n++;
    }
    if (m == nums.length - 1) return true;
    else if (n == nums.length - 1) return true;
    else return false;
}
}