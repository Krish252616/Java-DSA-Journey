import java.util.Scanner;
public class LC704_BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements of array in sorted manner : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Target : ");
        int t=sc.nextInt();
        sc.close();
        LC704_BinarySearch obj= new LC704_BinarySearch();
        int ans=obj.BinarySearch(arr,t,n);
            System.out.println("Your targeted index is : "+ ans );
        
    }
    public int BinarySearch(int[] arr,int t,int n){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]< t){
                low=mid+1;
            }
            else if(arr[mid]>t){
                high=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
