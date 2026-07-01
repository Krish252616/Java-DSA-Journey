public class LC0005_SortColors{
    public static void main(String[] args) {
         int[] arr={0,1,0,2,1,2,0,0,2,0,0,1,1,1,0,2,0,2,1};
        LC0005_SortColors obj= new LC0005_SortColors();
        obj.segregatearray(arr);
        for(int i : arr ){
            System.out.print(i+" ");
        }
}
    void segregatearray(int[] arr){
    int numofzeros=0;
    int numofones=0;
    int numoftwos=0;
    for(int ele : arr){
        if(ele == 0){
            numofzeros++;
        }
        else if(ele == 1){
            numofones++;
        } else {
            numoftwos++;
        }
            
        }
    int i=0;
    while (numofzeros > 0) {
        arr[i]=0;
        i++;
        numofzeros--;
        }
     while (numofones > 0) {
        arr[i]=1;
        i++;
        numofones--;
        }
    while (numoftwos > 0) {
        arr[i]=2;
        i++;
        numoftwos--;
        }

    }

}
