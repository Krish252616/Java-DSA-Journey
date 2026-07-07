package Sortings;
/*
time Comeplexity=O(n)
 */
public class BubbleSort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={4,2,6,3,6,2,6,3,8,9,4};
        int n=arr.length;
        print(arr);
        for(int i=0;i<n-1;i++){
            int swaps=0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;
                }
            }
           if(swaps==0) break;
        }
        print(arr);
    }
}
