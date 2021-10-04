import java.util.Scanner;
class ascending2
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
        if(a<b&&b<c)
        {
            System.out.println(a+"<"+b+"<"+c);
        }
        else if(a<c&&c<b)
        {
            System.out.println(a+"<"+c+"<"+b);
        }
        else if(b<a&&a<c)
        {
            System.out.println(b+"<"+a+"<"+c);
        }
        else if(b<c&&c<a)
        {
            System.out.println(b+"<"+c+"<"+a);
        }
        else if(c<b&&b<a)
        {
            System.out.println(c+"<"+b+"<"+a);
        }
        else if(c<a&&a<b)
        {
            System.out.println(c+"<"+a+"<"+b);
        }
    }
}
       