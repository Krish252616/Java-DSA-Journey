package Sortings;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={3,54,3,2,6,7,4,6,45,3,53,57,3,63};
        int n=arr.length;
        for(int i=0; i<n; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
