import java.util.Scanner;
class Q7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        for(int x=0;x<=9;x++)
        {
            System.out.println("Enter any number");
            ar[x]=sc.nextInt();
        }
        for(int x=0;x<=9;x++)
        {
            for(int y=0;y<=8;y++)
            {
                if(ar[y]<ar[y+1])
                {
                    int t=ar[y];
                    ar[y]=ar[y+1];
                    ar[y+1]=t;
                }
            }
        }
        for(int x=0;x<=9;x++)
        {
            System.out.println(ar[x]);
        }
    }
}