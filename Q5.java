import java.util.Scanner;
class Q5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ISBN number");
        long i=sc.nextLong();
        int sum=0;
        if(i>=1000000000l&&i<=9999999999l)
        {
            int x=10;
            while(i!=0)
            {
                sum+=i%10*x;
                x--;
                i=i/10;
            }
            if(sum%11==0)
            {
                System.out.println("Legal ISBN");
            }
            else
            {
                System.out.println("Illegal ISBN");
            }
        }
        else
        {
            System.out.println("Illegal ISBN CODE");
        }
    }
}