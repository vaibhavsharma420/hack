import java.util.Scanner;
class grades
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks");
        int m=sc.nextInt();
        if(m>=60)
        {
            if(m>=80)
            {
                if(m>100)
                {
                    System.out.println("Invalid");
                }
                else
                {
                    System.out.println("A-Grade");
                }
            }
            else
            {
                System.out.println("B-Grade");
            }
        }
        else
        {
            if(m>=40)
            {
                System.out.println("C-Grade");
            }
            else
            {
                if(m>=0)
                {
                    System.out.println("F-Grade");
                }
                else
                {
                    System.out.println("Invalid");
                }
            }
        }
    }
}