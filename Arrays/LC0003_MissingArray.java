public class LC0003_MissingArray {
    public static void main(String[] args) {
         int[] arr={0,1};
         int ans= missingnum(arr);
         System.out.print(ans);
    }
    static int missingnum(int[] arr){
        int n= arr.length;
        int sum= (n*(n+1))/2;
        int arraysum=0;
        int result;
        for(int i=0;i<arr.length;i++){
            arraysum = arraysum+ arr[i];
        }
        return sum-arraysum;
    }
}
