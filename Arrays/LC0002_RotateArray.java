/*
Problem : Rotate Array
LeetCode : 2
Difficulty : Medium

Time Complexity : O(1)
Space Complexity : O(n)
*/
public class LC0002_RotateArray {
    public static void main(String[] args) {
        int[] nums={1,4,2,4,5,2,6};
        int d = 3;
        RotateArray(nums, d);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
    public static void RotateArray(int[] nums, int d) {
        int n = nums.length;
        d %= n;
        reverse(nums,0,n-1);
        reverse(nums,0,d-1);
        reverse(nums,d,n-1);
    }
    public static void reverse(int[] nums,int i,int j){
        while(i < j){
         int temp = nums[i];
         nums[i]=nums[j];
         nums[j]=temp;
         i++;
         j--;
        }
    }
}