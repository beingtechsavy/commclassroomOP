package methods;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Sum();
    }
    static void Sum(){
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int sum=num1+num2;
        System.out.println("the sum of a and b is "+sum);
    }
}
