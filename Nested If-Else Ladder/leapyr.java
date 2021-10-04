import java.util.Scanner;
class leapyr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        int y=sc.nextInt();
        if(y%100==0)
        {
            if(y%400==0)
            {
                System.out.println("Leap Year");
            }
            else
            {
                System.out.println("Normal Year");
            }
        }
        else
        {
            if(y%4==0)
            {
                System.out.println("Leap Year");
            }
            else
            {
                System.out.println("Normal Year");
            }
        }
    }
}