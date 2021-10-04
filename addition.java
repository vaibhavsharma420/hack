import java.util.Scanner;
public class addition
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       int l=s.length();
       String ease="";
       for(char x='1';x<='3';x++)
       {
           for(int y=0;y<l;y++)
           {
               char ch=s.charAt(y);
               if(ch==x)
               {
                   ease+=x+"+";
               }
           }
       }
       int len=ease.length();
       System.out.println(ease.substring(0,l));
    }
}