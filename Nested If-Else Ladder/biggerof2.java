import java.util.Scanner;
class biggerof2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first numbewr");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println(a);
        }
        else
        {
            if(a==b)
            {
                System.out.println("Equal");
            }
            else
            {
                System.out.println(b);
            }
        }
    }
}