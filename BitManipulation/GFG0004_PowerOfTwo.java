class Solution{
    int n;
    public boolean display(int n){
       return n > 0 && (n&(n-1)) == 0; 
    }
}
public class GFG0004_PowerOfTwo {
    public static void main(String[] args) {
    Solution s=new Solution();
        System.out.println(s.display(16));
    }
}
