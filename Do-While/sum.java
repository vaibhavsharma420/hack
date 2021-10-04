import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n;
        do
        {
            System.out.println("Enter any number");
            n=sc.nextInt();
            sum=sum+n;
        }
        while(n!=0);
        System.out.println("Sum="+sum);
        }
    }
    
