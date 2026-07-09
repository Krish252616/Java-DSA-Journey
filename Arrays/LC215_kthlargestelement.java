import java.util.Arrays;
public class LC215_kthlargestelement{
    public static void main(String[] args) {
        int[] arr={3,2,3,1,2,4,5,5,6};
        Arrays.sort(arr);
        int k=4;
        int n=arr.length;
            System.out.print(arr[n-k]);
    }
}