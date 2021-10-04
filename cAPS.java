import java.util.Scanner;
public class cAPS
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.equals(s.toUpperCase()))
        {
            System.out.println(s.toLowerCase());
        }
        else if(Character.isLowerCase(s.charAt(0)) && s.substring(1).equals(s.substring(1).toUpperCase()))
        {
            System.out.println(Character.toUpperCase(s.charAt(0))+s.substring(1).toLowerCase());
        }
        else
        {
            System.out.println(s);
        }
    }
}