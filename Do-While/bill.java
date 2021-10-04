import java.util.Scanner;
class bill
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        char ch;
        int c=0;
        int i=0;
        do
        {
            c++;
            int t=c;
            System.out.println("Enter price of item "+c);
            int p=sc.nextInt();
            System.out.println("Enter quantity");
            int q=sc.nextInt();
            sum=sum+(p*q);
            i=i+q;
            System.out.println("More Item?(Y-Yes/N-No)");
            ch=sc.next().charAt(0);
        }
        while(ch=='Y'||ch=='y');
        System.out.println("Bill="+sum);
        System.out.println(i+" Items Purchased");
    }
}