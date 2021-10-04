class call_circle
{
    public static void main(String args[])
    {
        Circle ob=new Circle();
        ob.input();
        System.out.println("Area="+ob.area());
        System.out.println("Circumference="+ob.circumference());
        Circle ob2=new Circle();
        ob2.input(3);
        System.out.println("Area="+ob2.area());
        System.out.println("Circumference="+ob2.circumference());
    }
}
        