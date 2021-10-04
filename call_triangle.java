
class call_triangle
{
    public static void main(String args[])
    {
        Triangle ob=new Triangle();
        ob.input(4,5,6);
        ob.area();
        ob.perimeter();
        Triangle ob2=new Triangle();
        ob2.input();
        ob2.area();
        ob2.perimeter();
    }
}