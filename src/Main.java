import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a^b;
        System.out.println("a^b="+a);//a=4=100
                               //b=5=101
                               //a=a^b=001=1
        b=a^b;
        System.out.println("a^b="+b);//a=001
                              //b=101
                             //  b=a^b=100=4
        a=a^b;
        System.out.println("a^b="+a);//a=001
                              //b=100
                              //a=a^b=101=5

        System.out.println("after swapping two numbers a and b "+a+" "+b);//a=5, b=4
    }
}
