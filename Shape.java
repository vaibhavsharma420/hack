class Shape
{
    public void polygon(int a,char ch)
    {
        for(int x=1;x<=a;x++)
        {
            for(int y=1;y<=a;y++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void polygon(int a,int b)
    {
        for(int x=1;x<=b;x++)
        {
            for(int y=1;y<=a;y++)
            {
                System.out.print("@");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void polygon()
    {
        for(int x=1;x<=3;x++)
        {
            for(int y=1;y<=x;y++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Shape ob=new Shape();
        ob.polygon(3,'A');        
        ob.polygon(4,2);
        ob.polygon();
    }
}
            