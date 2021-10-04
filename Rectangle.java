import java.util.Scanner;
class Rectangle
{
    int l,b;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth");
        l=sc.nextInt();
        b=sc.nextInt();
    }
    public void input(int x,int y)
    {
        l=x;b=y;
    }
    public void area()
    {
        System.out.println("Area = "+l*b);
    }
    public void perimeter()
    {
        System.out.println("Perimeter = "+2*(l+b));
    }
}

