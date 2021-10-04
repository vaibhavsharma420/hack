import java.util.Scanner;
class Array_bubble
{
    public static void sort(int ar[])
    {
        int l=ar.length;
        for(int x=0;x<=l-1;x++)
        {
            for(int y=0;y<=l-2-x;y++)
            {
                if(ar[y]>ar[y+1])
                {
                    int t=ar[y];
                    ar[y]=ar[y+1];
                    ar[y+1]=t;
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[5]; 
        for(int x=0;x<=4;x++)
        {
            System.out.println("Enter number at index "+x);
            n[x]=sc.nextInt();
        }
        for(int x=0;x<=4;x++)
        {
            System.out.print(n[x]+"\t");
        }
        System.out.println();
        sort(n);
        for(int x=0;x<=4;x++)
        {
            System.out.print(n[x]+"\t");
        }
    }
}