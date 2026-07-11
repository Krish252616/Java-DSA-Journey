import java.util.Scanner;
import java.util.Arrays;
public class LC_217_ContainsDuplicate {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the size : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.print(ContainDuplicate(arr,n));
    }
    static boolean ContainDuplicate(int[] arr,int n){
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]==arr[i+1]) return true;
        }
        return false;
    }
}
