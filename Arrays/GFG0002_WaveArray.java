public class GFG0002_WaveArray {
    public static void main(String[] args) {
        int[] arr={1,4,2,4,5,3,5,7,4};
        WaveArray(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
  static void WaveArray(int[] arr){
    for(int i=0;i < arr.length; i+=2){
        if(i==arr.length-1) break;
        int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
    }
    
  }
}
