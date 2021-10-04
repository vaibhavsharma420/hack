import java.util.Scanner;
class fibonaccinterms
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a+"\n"+b);
        int x=1;
        while(x<=n-2)
        {
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c);
            x++;
        }
    }
}