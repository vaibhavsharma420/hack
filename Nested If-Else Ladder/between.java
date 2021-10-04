import java.util.Scanner;
class between
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b=sc.nextInt();
        System.out.println("Enter 3rd Number");
        int c=sc.nextInt();
        if(b>c)
        {
            if(a>b)
            {
                System.out.println(b);
            }
            else
            {
                if(c>a)
                {
                    System.out.println(c);
                }
                else
                {
                    System.out.println(a);
                }
            }
        }
        else
        {
            if(a>c)
            {
                System.out.println(c);
            }
            else
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
        }
    }
}
        