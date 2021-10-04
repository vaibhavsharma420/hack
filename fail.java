import java.util.Scanner;
class fail
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks");
        int m=sc.nextInt();
        System.out.println(m>=40?"Pass":"Fail");
    }
}
    