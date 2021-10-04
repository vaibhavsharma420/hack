import java.util.Scanner;
class SHEET13
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n[]=new int[5];
        for(int x=0;x<=4;x++)
        {
            System.out.println("Enter number at index "+x);
            n[x]=sc.nextInt();
            for(int y=x-1;y>=0;y--)
            {
                if(n[y]==n[x]&&x>0)
                {
                    System.out.println("Duplicate Number entered, do it again");
                    x--;
                }
            }
        }
        System.out.println("OUTPUT:");
        for(int x=0;x<=4;x++)
        {
            System.out.println(n[x]);
        }
    }
}
           