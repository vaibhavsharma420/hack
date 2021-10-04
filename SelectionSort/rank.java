import java.util.Scanner;
class rank
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String n[]=new String[10];
        int m[]=new int[10];
        for(int x=0;x<=9;x++)
        {
            System.out.println("Enter name "+(x+1));
            n[x]=sc.next();
            System.out.println("Enter marks");
            m[x]=sc.nextInt();
        }
        for(int x=0;x<=8;x++)
        {
            int index=x;
            for(int y=x+1;y<=9;y++)
            {
                if(m[y]>m[index])
                {
                    index=y;
                }
            }
            int t=m[x];
            m[x]=m[index];
            m[index]=t;
            
            String t1=n[x];
            n[x]=n[index];
            n[index]=t1;
        }
        System.out.println("Rank\tMarks\tName");
        for(int x=0;x<=9;x++)
        {
            System.out.println((x+1)+"\t"+m[x]+"\t"+n[x]);
        }
    }
}
            
                   