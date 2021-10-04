import java.util.Scanner;
class SHEET15
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[5];
        for(int x=0;x<=4;x++)
        {
            System.out.println("Enter any number");
            n[x]=sc.nextInt();
        }

        for(int x=0;x<=3;x++)
        {
            int index=x;
            for(int y=x+1;y<=4;y++)
            {
                if(Math.abs(n[y])>Math.abs(n[index]))
                {
                    index=y;
                }
            }

            int t=n[x];
            n[x]=n[index];
            n[index]=t;

        }
        System.out.println("Output-:");
        for(int x=0;x<=4;x++)
        {
            System.out.println(n[x]);
        }
    }
}
