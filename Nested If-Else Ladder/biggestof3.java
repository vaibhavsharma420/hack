import java.util.Scanner;
class biggestof3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Enter third number");
        int c=sc.nextInt();
        if(b>c)
        {
            if(a>b)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(b);
            }
        }
        else
        {
            if(a>c)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(c);
            }
        }
    }
}
            
        