public class LC283_MoveZero{
    public static void main(String[] args) {
        int[] arr={1,5,3,5,0,4,0,0};
        int numofzero = 0;
        MoveZero(arr,numofzero);
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
    static void MoveZero(int[] arr, int numofzero){
        for(int i=0;i<arr.length;i++){
            int j=0;
            if(arr[i] != 0){
                arr[j]=arr[i];
                j++;
            }
            else{
                numofzero++;
            }
        }
        int i=arr.length-1;
        while(numofzero>0){
            arr[i]=0;
            i--;
            numofzero--;
        }        
    }
}