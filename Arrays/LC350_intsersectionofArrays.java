import java.util.Arrays;
class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        int k=0;
        int[] ans=new int[Math.min(nums1.length,nums2.length)];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i]==nums2[j]){
                ans[k]=nums1[i];
                j++;
                i++;
                k++;
            }
        }
        return Arrays.copyOf(ans,k);
    }
}
public class LC350_intsersectionofArrays {
    public static void main(String[] args) {
        int[] nums1={1,1,2,4,2,1,3,4,2,1,4,3};
        int[] nums2={2,1,4,2,3,4,6,3,2,1,1,5,5,3,2};
        Intersect s=new Intersect();
        int[] ans=s.intersect(nums1, nums2);
        for(int ele : ans){
            System.out.print(ele+" ");
        }

    }
    
}
