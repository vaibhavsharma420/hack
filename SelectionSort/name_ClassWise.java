import java.util.Scanner;
class name_ClassWise
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String n[]=new String[10];
        int c[]=new int[10];
        for(int x=0;x<=9;x++)
        {
            System.out.println("Enter name "+(x+1));
            n[x]=sc.next();
            System.out.println("Enter class");
            c[x]=sc.nextInt();
        }
        for(int x=0;x<=8;x++)
        {
            int i=x;
            for(int y=x+1;y<=9;y++)
            {
                if(c[y]>c[i])
                {
                    i=y;
                }
            }
            int t=c[x];
            c[x]=c[i];
            c[i]=t;
            
            String nm=n[x];
            n[x]=n[i];
            n[i]=nm;
        }
        System.out.println("Class\tName");
        for(int x=0;x<=9;x++)
        {
            System.out.println(c[x]+"\t"+n[x]);
        }
    }
}