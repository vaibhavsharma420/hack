import java.util.Scanner;
class formulae
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A: ");
        double a=sc.nextDouble();
        System.out.print("Enter B: ");
        double b=sc.nextDouble();
        System.out.print("Enter C: ");
        double c=sc.nextDouble();
        double z=Math.pow(a,b)+Math.sqrt(c);
        System.out.println("Z="+z);
    }
}