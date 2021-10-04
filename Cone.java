import java.util.Scanner;
class Cone extends Circle
{
    protected int h;
    protected double l;
    public void input()
    {
        super.input();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter h");
        h=sc.nextInt();
        l=Math.sqrt(h*h+r*r);
    }
    public double volume()
    {
        return (super.area()*h)/3;
    }
    public double area()
    {
        return 3.14*r*l+super.area();
    }
}