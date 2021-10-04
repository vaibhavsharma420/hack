class poly
{
    public void polygon()
    {
        for(int x=0;x<=9;x++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    public void polygon(int x)
    {
        for(int y=1;y<=x;y++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    public void polygon(int m,char ch)
    {
        for(int y=1;y<=m;y++)
        {
            System.out.print(ch);
        }
    }
    public static void main(String args[])
    {
        poly ob=new poly();
        ob.polygon();
        for(char a='A';a<='D';a++)
        {
            for(char b='A';b<=a;b++)
            {
                System.out.print(a);
            }
            System.out.println();
        }
        ob.polygon(6);
    }
}