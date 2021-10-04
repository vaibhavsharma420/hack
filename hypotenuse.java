import java.util.Scanner;
class hypotenuse 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Perpendicular");
        int p=sc.nextInt();
        System.out.println("Enter Base");
        int b=sc.nextInt();
        double h=(double)Math.sqrt(Math.pow(b,2)+Math.pow(p,2));
        System.out.println("Hypotenuse is "+h);
    }
}