import java.util.Scanner;
public class LC1752_CheckSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the element of array : ");
        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        LC1752_CheckSortedArray obj=new LC1752_CheckSortedArray();
        boolean ans=obj.checksort(arr);
        System.out.println("Sort Status :"+" "+ans);
    }
    public boolean checksort(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
        if(arr[i]>arr[(i+1) % arr.length]){
            count++;
            }
        if(count > 1){
            return false;
        }
        }
        return true;
    }
}