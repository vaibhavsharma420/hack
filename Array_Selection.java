import java.util.Scanner;
class Array_Selection
{
    public static void sort(int ar[])
    {
        int l=ar.length;
        for(int x=0;x<=l-2;x++)
        {
            int i=x;
            for(int y=x+1;y<=l-1;x++)
            {
                if(ar[y]<ar[i])
                {
                    i=y;
                }
                int t=ar[x];
                ar[x]=ar[i];
                ar[i]=t;
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