import java.util.Scanner;
class decrease
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        for(int x=0;x<=9;x++)
        {
            System.out.println("Enter number at index "+(x+1));
            ar[x]=sc.nextInt();
        }
        for(int x=0;x<=8;x++)
        {
            int index=x;
            for(int y=x+1;y<=9;y++)
            {
                if(ar[y]>ar[index])
                {
                    index=y;
                }
            }
            int t=ar[x];
            ar[x]=ar[index];
            ar[index]=t;
        }
        System.out.println("Sorted Array:");
        for(int x=0;x<=9;x++)
        {
            System.out.println(ar[x]);
        }
    }
}