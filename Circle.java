import java.util.Scanner;
class Circle
{
    protected int r;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter r");
        r=sc.nextInt();
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