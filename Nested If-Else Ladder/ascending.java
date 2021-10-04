import java.util.Scanner;
class ascending
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        System.out.println("Enter 3rd number");
        int c=sc.nextInt();
        if(a<b)
        {
            if(b<c)
            {
                System.out.println(a+"<"+b+"<"+c);
            }
            else
            {
                if(a<c)
                {
                    System.out.println(a+"<"+c+"<"+b);
                }
                else
                {
                    System.out.println(c+"<"+a+"<"+b);
                }
            }
        }
        else
        {
            if(a<c)
            {
                System.out.println(b+"<"+a+"<"+c);
            }
            else
            {
                if(b<c)
                {
                    System.out.println(b+"<"+c+"<"+a);
                }
                else
                {
                    System.out.println(c+"<"+b+"<"+a);
                }
            }
        }
    }
}