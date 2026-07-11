import java.util.Scanner;
public class LC35_SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements of array in sorted manner : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the targated value : ");
        int t = sc.nextInt();
        sc.close();
        LC35_SearchInsertPosition obj= new LC35_SearchInsertPosition();
        int ans=obj.SearchInsert(arr, n, t);
        System.out.print(ans);
    }
    public int SearchInsert(int[] arr,int n,int t){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<t) low=mid+1;
            else if(arr[mid]>t) high=mid-1;
            else return mid;
        }
        return low;
    }
}
