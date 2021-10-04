
import java.util.Scanner;
class Triangle
{
    double a,b,c;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sides of the triangle");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
    }
    public void input(double x,double y,double z)
    {
        a=x;
        b=y;
        c=z;
    }
    public void area()
    {
        double s=(double)(a+b+c)/2.0;
        double ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area="+ar);
    }
    public void perimeter()
    {
        System.out.println("Perimeter="+(a+b+c));
    }
}
