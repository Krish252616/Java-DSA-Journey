import java.util.Arrays;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        int k=0;
        int[] ans=new int[Math.min(nums1.length,nums2.length)];
        while(i<nums1.length && j<nums2.length){
            if (nums1[i] < nums2[j]) {
                i++;
            } 
            else if (nums1[i] > nums2[j]) {
                j++;
            } 
            else {

                if (k == 0 || ans[k - 1] != nums1[i]) {
                    ans[k] = nums1[i];
                    k++;
                }

                i++;
                j++;
            }
        }
        return Arrays.copyOf(ans,k);
    }
}

public class GFG0008_commonelement {
    public static void main(String[] args) {
    Solution s=new Solution();
    int[] nums1={1,2,2,1};
    int[] nums2={2,2};
    int[] ans=s.intersection(nums1,nums2);
    for(int ele : ans){
        System.out.print(ele+" ");
        }

    }
}
