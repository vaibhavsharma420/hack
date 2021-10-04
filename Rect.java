import java.util.Scanner;
class Rect
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length");
        int l=sc.nextInt();
        System.out.println("Enter Breadth");
        int b=sc.nextInt();
        int p=2*(l+b);
        int a=l*b;
        System.out.println("PERIMETER = "+p);
        System.out.println("AREA = "+a);
    }
}