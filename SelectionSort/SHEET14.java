import java.util.Scanner;
class SHEET14
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n[]=new int[5];
        boolean unique=true;
        for(int x=0;x<=4;x++)
        {
            System.out.println("Enter number at index "+x);
            n[x]=sc.nextInt();
            for(int y=x-1;y>=0;y--)
            {
                if(n[y]==n[x])
                {
                    unique=false;
                    break;
                }
            }
        }
        if(unique==false)
        {
            System.out.println("Not Unique");
        }
        else
        {
            System.out.println("Unique");
        }
    }
}