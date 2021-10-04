import java.util.Scanner;
class Cylinder extends Circle
{
    protected int h;
    public void input()
    {
        super.input();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter h");
        h=sc.nextInt();
    }
    public double volume()
    {
        return super.area()*h;
    }
    public double area()
    {
        return (2*3.14*r*h)+(2*super.area());
    }
}