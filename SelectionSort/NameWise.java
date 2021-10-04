import java.util.Scanner;
class NameWise
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String n[]=new String[50];
        for(int x=0;x<=9;x++)
        {
            System.out.println("Enter name "+(x+1));
            n[x]=sc.next();
        }
        for(int x=0;x<=8;x++)
        {
            int i=x;
            for(int y=x+1;y<=9;y++)
            {
                if(n[y].compareToIgnoreCase(n[i])<0)
                {
                    i=y;
                }
            }
            String nm=n[x];
            n[x]=n[i];
            n[i]=nm;
        }
        System.out.println("ALPHABETICAL ORDER:");
        for(int x=0;x<=9;x++)
        {
            System.out.println(n[x]);
        }
    }
}
