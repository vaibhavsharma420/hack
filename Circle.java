import java.util.Scanner;
class Circle
{
    double r;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        r=sc.nextDouble();
    }
    public void input(double x)
    {
        r=x;
    }
    public double area()
    {
        return 3.14*r*r;
    }
    public double circumference()
    {
        return 2*3.14*r;
    }
}
    