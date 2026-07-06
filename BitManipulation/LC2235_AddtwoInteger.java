package BitManipulation;
import java.util.Scanner;
public class LC2235_AddtwoInteger {
    public static void main(String[] args) {
         int Num1;
        int Num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num1");
        Num1=sc.nextInt();

        System.out.println("Enter Num2");
        Num2=sc.nextInt();

        sc.close();

        int Ans = Add(Num1, Num2);
        System.out.println("Answer = " + Ans);
    }
    static int Add(int Num1, int Num2){
        return Num1+Num2;
    }

}
