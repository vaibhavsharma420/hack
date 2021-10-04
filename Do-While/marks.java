import java.util.Scanner;
class marks
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m;
        int c1=0,c2=0,c3=0;
        int ch;
        do
        {
            c1++;
            System.out.println("Enter marks of student "+c1);
            m=sc.nextInt();
            if(m>=85)
            {
                c2++;
            }
            if(m<40)
            {
                c3++;
            }
            System.out.println("More Students?(1-Yes/0-No)");
            ch=sc.nextInt();
        }while(ch!=0);
        double avg1=c2/(double)c1*100.0;
        double avg2=c3/(double)c1*100.0;
        System.out.println(avg1+"% got 85 or more than 85 marks");
        System.out.println(avg2+"% got less than 40 marks");
    }
}
