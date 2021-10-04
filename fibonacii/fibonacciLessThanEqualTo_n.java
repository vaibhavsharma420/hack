import java.util.Scanner;
class fibonacciLessThanEqualTo_n
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        if(a<=n)
        {
            System.out.println(a);
        }
        if(b<=n)
        {
            System.out.println(b);
        }
        int c=a+b;
        while(c<=n)
        {
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
        }
    }
}