import java.util.Scanner;

public class LC283_MoveZero{
    public static void movezero(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
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
        movezero(arr);
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        movezero(arr);
    }
}