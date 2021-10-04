import java.util.Scanner;
class student
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter class");
        int c=sc.nextInt();
        if(c>=9)
        {
            if(c>=13)
            {
                System.out.println("Invalid");
            }
            else
            {
                if(c>=11)
                {
                    System.out.println("Intermidiate");
                }
                else
                {
                    System.out.println("High School");
                }
            }
        }
        else
        {
            if(c>=6)
            {
                System.out.println("Secondary");
            }
            else
            {
                if(c>=1)
                {
                    System.out.println("Primary");
                }
                else
                {
                    System.out.println("Invalid");
                }
            }
        }
    }
}