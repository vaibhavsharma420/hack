import java.util.Scanner;
public class boyschatrooms
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char ar[]={'h','e','l','l','o'};
        int l=s.length();
        s=s.toLowerCase();
        boolean check=true;
        for(int x=0;x<=4;x++)
        {
            char temp=ar[x];
            int index=s.indexOf(temp);
            if(index!=-1)
            {
                s=s.substring(index+1);
            }
            else
            {
                System.out.println("NO");
                check=false;
                break;
            }
        }
        if(check==true)
        System.out.println("YES");
    }
}