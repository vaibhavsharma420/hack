import java.util.Scanner;
class equal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Enter third number");
        int c=sc.nextInt();
        String eq=a==b?(b==c?"Equal":"Not Equal"):"Not Equal";
        System.out.println("Numbers are "+eq);
    }
}