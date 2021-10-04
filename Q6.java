import java.util.Scanner;
class Q6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any word");
        String w=sc.next().toUpperCase();
        int x;
        for(x=0;x<=w.length();x++)
        {
            char ch=w.charAt(x);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                break;
            }
        }
        System.out.println(w.substring(x)+w.substring(0,x)+"AY");
    }
}