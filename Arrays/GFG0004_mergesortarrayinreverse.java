public class GFG0004_mergesortarrayinreverse {
    public static void main(String[] args) {
        int[] a={1,2,5,7,9};
        int[] b={3,4,6,8,10};
        int[] c=new int[a.length+b.length];
        int m=a.length, n=b.length, p=c.length;
        reversemerge(a,b,c,m,n,p);
        for(int ele : c){
            System.out.print(ele+" ");
     
       }
    }
    public static void reversemerge(int[] a, int[] b,int[] c, int m, int n, int p){
        int i=m-1, j=n-1, k=p-1;
        while(i >= 0 && j >=0){
            if(a[i] > b[j]){
                c[k] = a[i];
                i--;
                k--;
            }
            else{
                c[k] = b[j];
                j--;
                k--;
            }
        }
        if(i == 0){
            while(j >= 0){
                c[k]=b[j];
                j--;
                k--;
            }
        }
        else{
            while(i >=0){
                c[k]=a[i];
                k--;
                i--;
            }
        }
       }
}
