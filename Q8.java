class Q8
{
    double series(double n)
    {
        double sum=0;
        for(int x=1;x<=n;x++)
        {
            sum+=1.0/x;
        }
        return sum;
    }
    double series(double a,double n)
    {
        double sum=0;
        for(int x=1,y=1,z=2;x<=n;x++,y+=3,z+=3)
        {
            sum+=y/Math.pow(a,z);
        }
        return sum;
    }
}