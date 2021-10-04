import java.util.Scanner;
class SHEET7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String n[]=new String[5];
        int m[]=new int[5];
        for(int x=0;x<=4;x++)
        {
            System.out.println("Enter name "+(x+1));
            n[x]=sc.next();
            System.out.println("Enter marks");
            m[x]=sc.nextInt();
        }
        for(int x=0;x<=3;x++)
        {
            int index=x;
            for(int y=x+1;y<=4;y++)
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
        int rank=1;
        for(int x=0;x<=4;x++)
        {
            if(x>0&&m[x]!=m[x-1])
            {
                rank++;
            }
            System.out.println(rank+"\t"+m[x]+"\t"+n[x]);
        }
    }
}
        