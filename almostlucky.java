import java.util.Scanner;
public class almostlucky
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]={4,7,47,74,447,474,477,747,774};
        boolean check=false;
        for(int x=0;x<=8;x++)
        {
            if(n%ar[x]==0)
            {
                System.out.println("YES");
                check=true;
                break;
            }
        }
        if(check==false)
        {
            boolean flag=true;
            for(int x=n;x!=0;x=x/10)
            {
                int d=x%10;
                if(d!=4&&d!=7)
                {
                    System.out.println("NO");
                    flag=false;
                    break;
                }
            }
            if(flag==true)
            System.out.println("YES");
        }
    }
}