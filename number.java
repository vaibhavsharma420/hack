import java.util.Scanner;
class number 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        double srt=(double)Math.sqrt(n);
        double crt=(double)Math.cbrt(n);
        System.out.println("Square="+(n*n));
        System.out.println("Cube="+(n*n*n));
        System.out.println("Square Root="+srt);
        System.out.println("Cube Root="+crt);
    }
}