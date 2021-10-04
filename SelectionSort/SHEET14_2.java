import java.util.Scanner;
class SHEET14_2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n[]=new int[5];
        for(int x=0;x<=4;x++)
        {
            System.out.println("Enter number at index "+x);
            n[x]=sc.nextInt();
        }
        boolean unique=true;
        for(int x=0;x<=4;x++)
        {
            for(int y=x+1;y<=4;y++)
            {
                if(n[x]==n[y])
                {
                    unique=false;
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
            