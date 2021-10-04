class Call
{
    public static void main(String args[])
    {
        Circle c=new Circle();
        c.input();
        System.out.println("Area ="+c.area());;
        System.out.println("Circumference ="+c.circumference());
        System.out.println();
        Cone d=new Cone();
        d.input();
        System.out.println("Volume ="+d.volume());
        System.out.println("Area ="+d.area());;
        System.out.println();
        Cylinder e=new Cylinder();
        e.input();
        System.out.println("Volume ="+e.volume());
        System.out.println("Area ="+e.area());
    }
}