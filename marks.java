import java.util.Scanner;
class marks
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks in Physics");
        int p=sc.nextInt();
        System.out.println("Enter marks in Chemistry");
        int c=sc.nextInt();
        System.out.println("Enter marks in Maths");
        int m=sc.nextInt();
        int t=p+c+m;
        double av=t/3.0;
        System.out.println("Total="+t);
        System.out.println("Average="+av);
    }
}