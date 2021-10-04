import java.util.Scanner;
public class choo 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        int T=sc.nextInt();
        for(int x=0;x<T;x++)
        {
            long c=sc.nextLong();
            long n=sc.nextLong();
            long pr=n*(n-1)/2;
            if(((n*(n+1))/2)>c)
                System.out.println(c);
            else
            {
                long sum=(c-pr)/n;
                System.out.println(c-((sum*n)+pr));
            }
        }
    }
}