public class LC1929_ConcentrationArray {
    public static void main(String[] args) {
    int[] nums={1,4,2,4,5,2,6};
    LC1929_ConcentrationArray obj = new LC1929_ConcentrationArray();
    int[] ans = obj.getConcatenation(nums);
    for(int i : ans){
    System.out.print(i + " ");
    }
    }
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*n];
        for(int i=0;i<2*n;i++){
            if(i < n){
            ans[i]=nums[i];
            }
            else{
                ans[i]=nums[i-n];
            }
        }
        return ans;
}
}

