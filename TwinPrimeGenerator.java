class TwinPrimeGenerator
{
    public static boolean check(int n)
    {
        for(int x=2;x<=n/2;x++)
        {
            if(n%x==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        for(int x=10;x<=97;x++)
        {
            int n1=x;
            int n2=x+2;
            if(check(n1)&&check(n2))
            {
                System.out.println(n1+"\t"+n2);
            }
        }
    }
}