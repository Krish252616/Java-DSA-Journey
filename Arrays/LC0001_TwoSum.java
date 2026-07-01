/*
Problem : Two Sum
LeetCode : 1
Difficulty : Easy
*/

public class LC0001_TwoSum {
    public static void main(String[] args) {
        int[] nums={1,4,2,4,5,2,6};
        int target= 8;
        int[] ans= twoSum(nums,target);
        System.out.println(ans[0]+ " "+ ans[1]);
    }
    
    public static int[] twoSum(int[] nums, int target) {
       for (int i = 0; i < nums.length; i++) {
    for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
            return new int[]{i, j};
            
    }
}
    }
    return null;
}
}


