package Sortings;
import java.util.Scanner;
public class Selectionsort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the sizr of array : ");
       int n=sc.nextInt();
        int[] arr=new int[n];
       System.out.println("Enter the element of array : ");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       sc.close();
       print(arr);
        for(int i=0;i<arr.length-1;i++){
            int min=Integer.MAX_VALUE;
            int mindx=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    mindx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }
        print(arr);
    }
}
