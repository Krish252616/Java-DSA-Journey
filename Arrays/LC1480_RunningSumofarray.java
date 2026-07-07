import java.util.Scanner;
public class LC1480_RunningSumofarray{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        sc.close();
        

        LC1480_RunningSumofarray obj=new LC1480_RunningSumofarray();
        int[] ans=obj.runsum(arr);
        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }
    public int[] runsum(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }
}