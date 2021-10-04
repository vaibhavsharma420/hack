class volume_2008
{
    public void calc(int s)
    {
        System.out.println("Volume of cube is "+s*s*s);
    }
    public void calc(double r)
    {
        System.out.println("Volume of Sphere is "+(4/3.0)*3.14*r*r*r);
    }
    public void calc(int l,int b,int h)
    {
        System.out.println("Volume of cuboid is "+(l*b*h));
    }
    public static void main(String args[])
    {
        volume_2008 obj=new volume_2008();
        obj.calc(5);
        obj.calc(7.0);
        obj.calc(1,2,3);
    }
}