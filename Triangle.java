class Triangle
{
    public double area(int a,int b,int c)
    {
        double s=(a+b+c)/2.0;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public int perimeter(int a,int b,int c)
    {
        return a+b+c;
    }
}
        