class Armstrong
{
    public static boolean check(int n)
    {
        int sum=0;
        for(int x=n;x!=0;x=x/10)
        {
            sum=sum+(x%10)*(x%10)*(x%10);
        }
        if(sum==n)
        {
            return true;
        }
        return false;
    }

    public static void main(String args[])
    {
        for(int x=100;x<=999;x++)
        {
            if(check(x))
            {
                System.out.println(x);
            }
        }
    }
}