import java.util.Scanner;
class Q9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("MENU\n1\tTo check for a composite number\n2\tTo find the smallest digit of an integer that is input\nEnter your choice");
        int n=sc.nextInt();

        switch(n)
        {
            case 1:
            System.out.println("Enter any number");
            int b=sc.nextInt();
            int count=0;
            for(int x=1;x<=b;x++)
            {
                if(b%x==0)
                    count++;
            }
            if(count > 2)
            {
                System.out.println("Composite number");
            }
            else 
            {
                System.out.println("Prime number");
            }
            break;

            case 2:
            System.out.println("Enter any number");
            int a=sc.nextInt();
            int min=a%10;
            for(int x=a/10;x!=0;x=x/10)
            {
                int d=x%10;
                if(d<min)
                    min=d;
            }
            System.out.println("Smallest digit is "+min);
            break;

            default:
            System.out.println("Wrong input");
        }
    }
}