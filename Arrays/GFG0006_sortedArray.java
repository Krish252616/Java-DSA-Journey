import java.util.Scanner;
public class GFG0006_sortedArray {
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
        GFG0006_sortedArray obj=new GFG0006_sortedArray();
        boolean ans=obj.sort(arr);
        System.out.println(ans);    
    }
    public boolean sort(int[] arr){
        for(int i = 0; i<arr.length;i++){
        if(arr[i]<arr[i+1]){
            return true;
            }
        }
    return false;
    }
}
