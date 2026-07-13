import java.util.Scanner;
import java.util.Arrays;
public class temp {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int n=arr.length;
        int ans=MissingArray(arr,n);
        System.out.print(ans);
    }
    public static int MissingArray(int[] arr,int n){
        int sum=(n*(n+1))/2;
        int arraysum=0;
        for(int i=0;i<n;i++){
            arraysum += arr[i];
        }
        return arraysum-sum;  
    }
}

    



   