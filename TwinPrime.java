import java.util.Scanner;
class TwinPrime
{
    public static boolean check(int n)
    {
        for(int x=2;x<=n/2;x++)
        {
            if(n%x==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if((n1-n2==2||n1-n2==-2)&&check(n1)&&check(n2))
        {
            System.out.println("Twin-prime pair");
        }
        else
        {
            System.out.println("Not a twin-prime pair");
        }
    }
}